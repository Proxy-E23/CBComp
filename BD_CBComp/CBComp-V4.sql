-- Eliminar la base de datos si ya existe (Opcional)
IF EXISTS (SELECT * FROM sys.databases WHERE name = 'CBComp')
BEGIN
    DROP DATABASE CBComp;
END
GO

-- Crear la base de datos y usarla
CREATE DATABASE CBComp;
GO
USE CBComp;
GO

-- Crear tablas
CREATE TABLE Tipo_equipo
(
    ID_tipo int NOT NULL IDENTITY PRIMARY KEY,
    Tipo_equipo varchar(15) NOT NULL
);
GO

CREATE TABLE Marca
(
    ID_marca int NOT NULL IDENTITY PRIMARY KEY,
    Marca varchar(10) NOT NULL
);
GO

CREATE TABLE Ubicacion
(
    ID_U int NOT NULL IDENTITY PRIMARY KEY,
    Ubicacion varchar(25) NOT NULL
);
GO

CREATE TABLE Area
(
    ID_A int NOT NULL IDENTITY PRIMARY KEY,
    Area varchar(25) NOT NULL
);
GO

CREATE TABLE Fichas
(
    Ficha int NOT NULL PRIMARY KEY,
    Usuario varchar(50) NOT NULL
);
GO

CREATE TABLE Users
(
    Nickname varchar(20) NOT NULL PRIMARY KEY,
    Pass varchar(10) NOT NULL,
    Pregunta varchar(50) NOT NULL,
    Respuesta varchar(20) NOT NULL,
    Nombre varchar(20) NOT NULL,
    Apellido varchar(20) NOT NULL,
    Nivel int NOT NULL
);
GO

CREATE TABLE Bienes
(
    ID_equipo int NOT NULL IDENTITY PRIMARY KEY,
    Inventario varchar(20) NOT NULL,
    Tipo_equipo int NOT NULL FOREIGN KEY REFERENCES Tipo_equipo(ID_tipo),
    Marca int NOT NULL FOREIGN KEY REFERENCES Marca(ID_marca),
    Modelo varchar(20) NOT NULL,
    Num_serie varchar(20) NOT NULL,
    Ficha int NOT NULL FOREIGN KEY REFERENCES Fichas(Ficha),
    Ubicacion int NOT NULL FOREIGN KEY REFERENCES Ubicacion(ID_U),
    Area int NOT NULL FOREIGN KEY REFERENCES Area(ID_A),
    Fecha varchar(10) NOT NULL,
    Propiedad varchar(10) NOT NULL,
    Estado varchar(20) NOT NULL,
    Observaciones varchar(500) NOT NULL
);
GO

-- Consultas
SELECT * FROM Users ORDER BY Nivel;
SELECT * FROM Bienes;
SELECT * FROM Marca;
SELECT * FROM Tipo_equipo;
SELECT * FROM Ubicacion;
SELECT * FROM Area;
SELECT * FROM Fichas ORDER BY Usuario;
SELECT * FROM Bienes;

-- Consulta combinada
SELECT
    Bienes.ID_equipo AS Registro,
    Bienes.Inventario,
    Tipo_equipo.Tipo_equipo AS Descriptivo,
    Marca.Marca,
    Bienes.Modelo,
    Bienes.Num_serie AS Serie,
    Fichas.Ficha,
    Fichas.Usuario,
    Ubicacion.Ubicacion,
    Area.Area,
    CONVERT(VARCHAR(10), Bienes.Fecha, 103) AS Fecha,
    Bienes.Propiedad,
    Bienes.Estado,
    Bienes.Observaciones
FROM Bienes
INNER JOIN Tipo_equipo ON Bienes.Tipo_equipo = Tipo_equipo.ID_tipo
INNER JOIN Marca ON Bienes.Marca = Marca.ID_marca
INNER JOIN Ubicacion ON Bienes.Ubicacion = Ubicacion.ID_U
INNER JOIN Area ON Bienes.Area = Area.ID_A
INNER JOIN Fichas ON Bienes.Ficha = Fichas.Ficha
WHERE Bienes.Num_serie LIKE '%'
ORDER BY Registro;

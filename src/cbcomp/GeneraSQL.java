package cbcomp;

import java.sql.*;

/**
 * @author Erick Alejandro Trujillo Ortiz
 */
public class GeneraSQL {

    String SQL;
    private ResultSet rs;
    private Statement s;

    public String Login(String usuario, String contraseña) {

        SQL = "SELECT *FROM Users where Nickname = '" + usuario + "' and Pass= '" + contraseña + "'";

        return SQL;
    }

    public String agregarBien(String inventario, int tipoeq, int marca, String modelo, String serie, int ficha, int ubic,
            int area, String fecha, String propiedad, String estado, String obser) {

        SQL = "INSERT INTO Bienes values ('" + inventario + "', " + tipoeq + ", " + marca + ", '" + modelo + "', '" + serie
                + "', " + ficha + ", " + ubic + ", "
                + " " + area + ", '" + fecha + "', '" + propiedad + "', '" + estado + "', '" + obser + "')";

        return SQL;
    }
    
    public String agregarUser(String nom, String ap, String user, String pass, String preg, String resp, int nivel) {

    SQL = "INSERT INTO Users (Nickname, Pass, Pregunta, Respuesta, Nombre, Apellido, Nivel) "
        + "VALUES ('" + user + "', '" + pass + "', '" + preg + "', '" + resp + "', '" + nom + "', '" + ap + "', " + nivel + ")";

    return SQL;
}


    // public String agregarUser(String nom, String ap, String user, String pass, String preg, String resp, int nivel) {
    //SQL = "INSERT INTO Users values ('" + nom + "', '" + ap + "', '" + user + "', '" + pass + "', '" + preg + "', '" + resp + "'," + nivel + ")";
    //  return SQL;
    //}

    public String agregarMarca(String Marca) {

        SQL = "INSERT INTO Marca values ('" + Marca + "')";

        return SQL;
    }

    public String agregarU(String UA) {

        SQL = "INSERT INTO Ubicacion values ('" + UA + "')";

        return SQL;
    }

    public String agregarA(String UA) {

        SQL = "INSERT INTO Area values ('" + UA + "')";

        return SQL;
    }

    public String agregarTipoE(String TipoE) {

        SQL = "INSERT INTO Tipo_equipo values ('" + TipoE + "')";

        return SQL;
    }

    public String agregarFicha(int ficha, String nombre) {

        SQL = "INSERT INTO Fichas values (" + ficha + ", '" + nombre + "')";

        return SQL;
    }

    public String eliminarBien(int Serie) {

        SQL = "DELETE FROM Bienes where ID_equipo = " + Serie + " ";

        return SQL;
    }

    public String eliminaMarca(int id) {

        SQL = "DELETE FROM Marca where ID_marca = " + id + " ";
        return SQL;
    }

    public String eliminarU(int id) {

        SQL = "DELETE FROM Ubicacion where ID_U = " + id + " ";

        return SQL;
    }

    public String eliminarA(int id) {

        SQL = "DELETE FROM Area where ID_A = " + id + " ";

        return SQL;
    }

    public String eliminartipoE(int id) {

        SQL = "DELETE FROM Tipo_equipo where ID_tipo = " + id + " ";

        return SQL;
    }

    public String eliminarFicha(int ficha) {

        SQL = "DELETE FROM Fichas where Ficha = " + ficha + " ";

        return SQL;
    }
    
        public String eliminarUser(String nick) {

        SQL = "DELETE FROM Users where Nickname = '" + nick + "' ";

        return SQL;
    }

    public String actualizarBien(String inventario, int tipoeq, int marca, String modelo, String serie, int ficha,
            int ubic, int area, String fecha, String propiedad, String estado, String obser) {

        SQL = "UPDATE Bienes SET Inventario= '" + inventario + "', Tipo_equipo= " + tipoeq + ", Marca= " + marca
                + ", Modelo= '" + modelo + "', Num_serie= '" + serie + "',"
                + " Ficha= " + ficha + ", Ubicacion= " + ubic + ", Area= " + area
                + ", Fecha= '" + fecha + "', Propiedad= '" + propiedad + "',"
                + " Estado= '" + estado + "', Observaciones= '" + obser
                + "' WHERE Num_serie= '" + serie + "' ";

        return SQL;

    }

    public String actualizarMarca(int id, String Marca) {

        SQL = "UPDATE Marca SET Marca='" + Marca + "' WHERE ID_marca= " + id + "";

        return SQL;

    }

    public String actualizarTipo(int id, String tipo) {

        SQL = "UPDATE Tipo_equipo SET Tipo_equipo= '" + tipo + "' WHERE ID_tipo= " + id + " ";

        return SQL;

    }

    public String actualizarU(int id, String u) {

        SQL = "UPDATE Ubicacion SET Ubicacion='" + u + "' WHERE ID_U= " + id + " ";

        return SQL;

    }

    public String actualizarA(int id, String a) {

        SQL = "UPDATE Area SET Area='" + a + "' WHERE ID_A= " + id + " ";

        return SQL;
    }

    public String actualizarFicha(int ficha, String nombre) {

        SQL = "UPDATE Fichas SET Usuario='" + nombre + "' WHERE Ficha= " + ficha + " ";

        return SQL;
    }

    public String actualizarUser(String Nickname, String Pass, String Pregunta, String Respuesta, String Nombre, String Apellido) {

        SQL = "UPDATE Users SET Pass='" + Pass + "', Pregunta='" + Pregunta + "', Respuesta= '" + Respuesta + "', Nombre= '" + Nombre + "',"
                + " Apellido ='" + Apellido + "', Nivel='" + main.acces + "' WHERE Nickname= '" + Nickname + "' ";

        return SQL;
    }
    
       public String actualizarUser2(String Nickname, String Pass, String Pregunta, String Respuesta, String Nombre, String Apellido, int nivel) {

        SQL = "UPDATE Users SET Pass='" + Pass + "', Pregunta='" + Pregunta + "', Respuesta= '" + Respuesta + "', Nombre= '" + Nombre + "',"
                + " Apellido ='" + Apellido + "', Nivel='" + nivel + "' WHERE Nickname= '" + Nickname + "' ";

        return SQL;
    }

    public ResultSet comboTipo() throws SQLException {

        s = ConexionBD.con.createStatement();

        rs = s.executeQuery("SELECT *FROM Tipo_equipo ");
        return rs;
    }

    public ResultSet comboMarca() throws SQLException {

        s = ConexionBD.con.createStatement();

        rs = s.executeQuery("SELECT *FROM Marca ");
        return rs;
    }

    public ResultSet comboU() throws SQLException {

        s = ConexionBD.con.createStatement();

        rs = s.executeQuery("SELECT *FROM Ubicacion ");
        return rs;
    }

    public ResultSet comboA() throws SQLException {

        s = ConexionBD.con.createStatement();

        rs = s.executeQuery("SELECT *FROM Area ");
        return rs;
    }

    public ResultSet tablaBienes(String serie) throws SQLException {

        s = ConexionBD.con.createStatement();
        rs = s.executeQuery("select ID_equipo, Inventario, Tipo_equipo.Tipo_equipo, Marca.marca, Modelo, "
                + "Num_serie, Fichas.Ficha, Fichas.Usuario, Ubicacion.Ubicacion, Area.Area, Convert(varchar(10), Fecha, 103) As Fecha, "
                + "Propiedad, Estado, Observaciones "
                + "from Bienes, Tipo_equipo, Marca, Ubicacion, Area, Fichas "
                + "where Tipo_equipo.ID_tipo=Bienes.Tipo_equipo and marca.id_marca = Bienes.Marca and Ubicacion.ID_U= Bienes.Ubicacion "
                + "and Area.ID_A= Bienes.Area and Fichas.Ficha= Bienes.Ficha and  Num_serie LIKE '" + serie + "%' order by ID_equipo");
        return rs;
    }

    public ResultSet tablaMarca() throws SQLException {

        s = ConexionBD.con.createStatement();
        rs = s.executeQuery("SELECT *FROM Marca");

        return rs;
    }

    public ResultSet tablaU() throws SQLException {

        s = ConexionBD.con.createStatement();
        rs = s.executeQuery("SELECT *FROM Ubicacion");

        return rs;
    }

    public ResultSet tablaA() throws SQLException {

        s = ConexionBD.con.createStatement();
        rs = s.executeQuery("SELECT *FROM Area");

        return rs;
    }

    public ResultSet tablaTipoE() throws SQLException {

        s = ConexionBD.con.createStatement();
        rs = s.executeQuery("SELECT *FROM Tipo_equipo");

        return rs;
    }

    public ResultSet tablaFicha() throws SQLException {

        s = ConexionBD.con.createStatement();
        rs = s.executeQuery("SELECT *FROM Fichas order by Usuario");

        return rs;
    }
    
        public ResultSet tablaUser(String Nomb) throws SQLException {

        s = ConexionBD.con.createStatement();
        rs = s.executeQuery("SELECT *FROM Users Where Nombre LIKE '"+Nomb+"%' order by Nivel");

        return rs;
    }

    public String buscarTipoE(String TipoE) {

        SQL = "SELECT *FROM Tipo_equipo WHERE Tipo_equipo= '" + TipoE + "' ";

        return SQL;
    }

    public String buscarBien(String serie) {

        SQL = "SELECT *FROM Bienes WHERE Num_serie= '" + serie + "' ";

        return SQL;
    }

    public String buscarMarca(String marca) {

        SQL = "SELECT *FROM Marca WHERE Marca= '" + marca + "' ";

        return SQL;
    }

    public String buscarU(String U) {

        SQL = "SELECT *FROM Ubicacion WHERE Ubicacion= '" + U + "' ";

        return SQL;
    }

    public String buscarA(String A) {

        SQL = "SELECT *FROM Area WHERE Area= '" + A + "' ";

        return SQL;
    }
        public String buscarUser(String nick) {

        SQL = "SELECT *FROM Users WHERE Nickname= '" + nick + "' ";

        return SQL;
    }

    public String buscarUsuario(String ficha) {

        SQL = "SELECT *FROM Fichas WHERE Ficha LIKE '" + ficha + "%' ";

        return SQL;
    }

    public ResultSet comboTipolike(String tipo) throws SQLException {

        s = ConexionBD.con.createStatement();

        rs = s.executeQuery("SELECT *From Tipo_equipo where Tipo_equipo like '" + tipo + "%' ");
        return rs;
    }
}

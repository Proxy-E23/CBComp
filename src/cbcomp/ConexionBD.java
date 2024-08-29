package cbcomp;

import java.sql.*;

public class ConexionBD {

    public static Connection con = null;

    // Corregir la cadena de conexión
    static String url = "jdbc:sqlserver://localhost:1433;databaseName=CBComp";
    static String user = "admin_cbcomp";
    static String pass = "@admCBComp";

    public void CONEXION() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String controlador = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Class.forName(controlador).newInstance();
    }

    public static void abrirConexion() {
        try {
            // Crear conexión usando la URL, usuario y contraseña
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa!");

        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());

            javax.swing.JOptionPane.showMessageDialog(null, "Error de Conexión"
                    + "\nNo hay conexión con la base de datos", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);

            System.exit(0);
        }
    }

    public static void cerrarConexion() {
        try {
            if (con != null) {
                con.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Message:: " + e.getMessage());
            System.out.println("Cause:: " + e.getCause());
        }
    }
}

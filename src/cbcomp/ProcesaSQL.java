package cbcomp;

import java.sql.*;

/**
 * @author Erick Alejandro Trujillo Ortiz
 */

public class ProcesaSQL {

    public int Actualizar(String SQL) {
        int resultado;

        try {
            Statement instruccion;
            instruccion = ConexionBD.con.createStatement();
            resultado = instruccion.executeUpdate(SQL);

            return resultado;

        } catch (SQLException e) {

            javax.swing.JOptionPane.showMessageDialog(null, "Error:"
                    + "\nSQLException: " + e.getMessage()
                    + "\nSQLState: " + e.getSQLState()
                    + "\nVendorError: " + e.getErrorCode()
                    + "\nSi el error persiste o desconoce la causa comuniquese con el administrador",
                    "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            resultado = 0;
            return resultado;
        }
    }

    public ResultSet Consultar(String SQL) {
        ResultSet resultado;

        try {
            Statement instruccion;
            instruccion = (Statement) ConexionBD.con.createStatement();
            resultado = instruccion.executeQuery(SQL);

            return resultado;
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "SQLE xception: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
            resultado = null;
            return resultado;
        }

    }

    public boolean session(String SQL) {
        boolean valor = false;
        int n = 0;
        ResultSet resultado;

        try {
            Statement instruccion;
            instruccion = (Statement) ConexionBD.con.createStatement();
            resultado = instruccion.executeQuery(SQL);
            while (resultado.next()) {
                n++;
            }
            if (n > 0) {
                valor = true;
            } else {
                valor = false;
            }
            System.out.println(valor);

        } catch (SQLException e) {

        }
        System.out.println(SQL);
        return valor;
    }

}

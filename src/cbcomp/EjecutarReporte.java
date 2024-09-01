package cbcomp;

import java.sql.*;
import java.util.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/*
 * @author Proxy-E23
 */
public class EjecutarReporte {

    public static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String url = "jdbc:sqlserver://localhost:1433;databaseName=CBComp";
    static String user = "admin_cbcomp";
    static String pass = "@admCBComp";
    public static Connection CONEXION;

    //Iniciar la conexión
    static {
        try {
            Class.forName(DRIVER);
            CONEXION = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void reporteinventario() {
        
        generarReporte("reportegeneral.jasper", "Reporte General", new HashMap<>());
    }

    public void reportecorto() {
        
        generarReporte("reportespecifico.jasper", "Reporte Corto", new HashMap<>());
    }

    public void reportexfecha(String fecha1, String fecha2) {

        Map<String, Object> param = new HashMap<>();
        param.put("fecha1", fecha1);
        param.put("fecha2", fecha2);
        generarReporte("reportexfecha.jasper", "Reporte por Fechas", param);

    }

    public void reportexuser(String usuario) {
        
        Map<String, Object> param = new HashMap<>();
        param.put("user", usuario);
        generarReporte("reportexuser.jasper", "Reporte por Usuarios", param);
    }

    public void reportexficha(int ficha) {
        
        Map<String, Object> param = new HashMap<>();
        param.put("Ficha", ficha);
        generarReporte("reportexficha.jasper", "Reporte por Ficha", param);
    }

    public void reportexinventario(String inventario) {
        
        Map<String, Object> param = new HashMap<>();
        param.put("invent", inventario);
        generarReporte("reportexinvetario.jasper", "Reporte por Inventario", param);
    }

    public void reportextipo(int tipo) {
        
        Map<String, Object> param = new HashMap<>();
        param.put("tipo", tipo);
        generarReporte("reportextipo.jasper", "Reporte por Tipo de Equipo", param);
    }

    public void reportexubicacion(int U) {
        
        Map<String, Object> param = new HashMap<>();
        param.put("U", U);
        generarReporte("reportexubicacion.jasper", "Reporte por Ubicación", param);
    }

    public void reportexarea(int A) {
        
        Map<String, Object> param = new HashMap<>();
        param.put("A", A);
        generarReporte("reportexarea.jasper", "Reporte por Área", param);
    }

    private void generarReporte(String template, String titulo, Map<String, Object> param) {

        try {
            Class.forName(DRIVER);
            JasperReport reporte = (JasperReport) JRLoader.loadObject(template);
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, param, CONEXION);

            if (jasperPrint.getPages().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(null, "Los datos proporcionados no\nexisten en la base de datos.");
            } else {
                JasperViewer visor = new JasperViewer(jasperPrint, false);
                visor.setTitle(titulo);
                visor.setVisible(true);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

}

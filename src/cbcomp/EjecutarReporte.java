package cbcomp;

import java.sql.*;
import java.util.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 * @author Erick Alejandro Trujillo Ortiz
 */
public class EjecutarReporte {

    public static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String url = "jdbc:sqlserver://localhost:1433;databaseName=CBComp";
    String user = "admin_cbcomp";
    String pass = "@admCBComp";
    public static Connection CONEXION;

    public void reporteinventario() {
        try {
            Class.forName(DRIVER);

            CONEXION = DriverManager.getConnection(url, user, pass);

            String template = "reportegeneral.jasper";
            JasperReport reporte = (JasperReport) JRLoader.loadObject(template);

            Map<String, Object> param = new HashMap<>();
            JasperPrint jasperprint = JasperFillManager.fillReport(reporte, param, CONEXION);

            JasperViewer visor = new JasperViewer(jasperprint, false);
            visor.setTitle("Reporte General");
            visor.setVisible(true);

        } catch (ClassNotFoundException | SQLException | JRException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public void reportecorto() {

        try {
            Class.forName(DRIVER);
            CONEXION = DriverManager.getConnection(url, user, pass);

            String template = "reportespecifico.jasper";
            JasperReport reporte;
            reporte = null;
            reporte = (JasperReport) JRLoader.loadObject(template);

            Map param = new HashMap();
            JasperPrint jasperprint = JasperFillManager.fillReport(reporte, param, CONEXION);

            JasperViewer visor = new JasperViewer(jasperprint, false);
            visor.setTitle("Reporte General");
            visor.setVisible(true);

        } catch (ClassNotFoundException | SQLException | JRException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);

        }
    }

    public void reportexfecha(String fecha1, String fecha2) {

        try {
            Class.forName(DRIVER);
            CONEXION = DriverManager.getConnection(url, user, pass);

            String template = "reportexfecha.jasper";
            JasperReport reporte;
            reporte = null;
            reporte = (JasperReport) JRLoader.loadObject(template);

            Map param = new HashMap();
            param.put("fecha1", fecha1);
            param.put("fecha2", fecha2);

            JasperPrint jasperprint = JasperFillManager.fillReport(reporte, param, CONEXION);

            JasperViewer visor = new JasperViewer(jasperprint, false);
            visor.setTitle("Reporte por Fechas");
            visor.setVisible(true);

        } catch (ClassNotFoundException | SQLException | JRException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);

        }
    }

    public void reportexuser(String usuario) {

        try {
            Class.forName(DRIVER);
            CONEXION = DriverManager.getConnection(url, user, pass);

            String template = "reportexuser.jasper";
            JasperReport reporte;
            reporte = null;
            reporte = (JasperReport) JRLoader.loadObject(template);

            Map param = new HashMap();
            param.put("user", usuario);

            JasperPrint jasperprint = JasperFillManager.fillReport(reporte, param, CONEXION);

            JasperViewer visor = new JasperViewer(jasperprint, false);
            visor.setTitle("Reporte por Usuarios");
            visor.setVisible(true);

        } catch (ClassNotFoundException | SQLException | JRException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);

        }
    }

    public void reportexficha(int ficha) {

        try {
            Class.forName(DRIVER);
            CONEXION = DriverManager.getConnection(url, user, pass);

            String template = "reportexficha.jasper";
            JasperReport reporte;
            reporte = null;
            reporte = (JasperReport) JRLoader.loadObject(template);

            Map param = new HashMap();
            param.put("Ficha", ficha);

            JasperPrint jasperprint = JasperFillManager.fillReport(reporte, param, CONEXION);

            JasperViewer visor = new JasperViewer(jasperprint, false);
            visor.setTitle("Reporte por Ficha");
            visor.setVisible(true);

        } catch (ClassNotFoundException | SQLException | JRException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);

        }
    }

    public void reportexinventario(String inventario) {

        try {
            Class.forName(DRIVER);
            CONEXION = DriverManager.getConnection(url, user, pass);

            String template = "reportexinvetario.jasper";
            JasperReport reporte;
            reporte = null;
            reporte = (JasperReport) JRLoader.loadObject(template);

            Map param = new HashMap();
            param.put("invent", inventario);

            JasperPrint jasperprint = JasperFillManager.fillReport(reporte, param, CONEXION);

            JasperViewer visor = new JasperViewer(jasperprint, false);
            visor.setTitle("Reporte por Inventario");
            visor.setVisible(true);

        } catch (ClassNotFoundException | SQLException | JRException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);

        }
    }

    public void reportextipo(int tipo) {

        try {
            Class.forName(DRIVER);
            CONEXION = DriverManager.getConnection(url, user, pass);

            String template = "reportextipo.jasper";
            JasperReport reporte;
            reporte = null;
            reporte = (JasperReport) JRLoader.loadObject(template);

            Map param = new HashMap();
            param.put("tipo", tipo);

            JasperPrint jasperprint = JasperFillManager.fillReport(reporte, param, CONEXION);

            JasperViewer visor = new JasperViewer(jasperprint, false);
            visor.setTitle("Reporte por Tipo de Equipo");
            visor.setVisible(true);

        } catch (ClassNotFoundException | SQLException | JRException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);

        }
    }

    public void reportexubicacion(int U) {

        try {
            Class.forName(DRIVER);
            CONEXION = DriverManager.getConnection(url, user, pass);

            String template = "reportexubicacion.jasper";
            JasperReport reporte;
            reporte = null;
            reporte = (JasperReport) JRLoader.loadObject(template);

            Map param = new HashMap();
            param.put("U", U);

            JasperPrint jasperprint = JasperFillManager.fillReport(reporte, param, CONEXION);

            JasperViewer visor = new JasperViewer(jasperprint, false);
            visor.setTitle("Reporte por Ubicacion");
            visor.setVisible(true);

        } catch (ClassNotFoundException | SQLException | JRException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);

        }
    }

    public void reportexarea(int A) {

        try {
            Class.forName(DRIVER);
            CONEXION = DriverManager.getConnection(url, user, pass);

            String template = "reportexarea.jasper";
            JasperReport reporte;
            reporte = null;
            reporte = (JasperReport) JRLoader.loadObject(template);

            Map param = new HashMap();
            param.put("A", A);

            JasperPrint jasperprint = JasperFillManager.fillReport(reporte, param, CONEXION);

            JasperViewer visor = new JasperViewer(jasperprint, false);
            visor.setTitle("Reporte por Ubicacion");
            visor.setVisible(true);

        } catch (ClassNotFoundException | SQLException | JRException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);

        }
    }
}

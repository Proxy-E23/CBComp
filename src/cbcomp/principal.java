package cbcomp;

import java.awt.*;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 * @author Erick Alejandro Trujillo Ortiz
 */
public class principal extends javax.swing.JFrame {

    public principal() {
        initComponents();
        setLocationRelativeTo(null);

    }

    private ResultSet rs;
    DefaultTableModel jTABLE = new DefaultTableModel();
    variables ctrl = new variables();
    EjecutarReporte report = new EjecutarReporte();

    private int x, y;
    int acceso = Integer.parseInt(main.acces);

    ResultSet rscarga;
    GeneraSQL GS = new GeneraSQL();
    ProcesaSQL PD = new ProcesaSQL();
    main vg = new main();
    String SQLGenerado;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable(jTABLE);
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jmenu_adminCuenta = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/PACK_IMG/pc_ico.png")).getImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Control de Bienes");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/cerrar.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/minimizar.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))))
                .addContainerGap())
        );

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/exit_.png"))); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);

        jTABLE.addColumn("ID Registro");
        jTABLE.addColumn("Inventario");
        jTABLE.addColumn("Descriptivo");
        jTABLE.addColumn("Marca");
        jTABLE.addColumn("Modelo");
        jTABLE.addColumn("Num. Serie");
        jTABLE.addColumn("Ficha");
        jTABLE.addColumn("Usuario");
        jTABLE.addColumn("Ubicacion");
        jTABLE.addColumn("Area");
        jTABLE.addColumn("Fecha");
        jTABLE.addColumn("Propiedad");
        jTABLE.addColumn("Estatus");
        jTABLE.addColumn("Observaciones");
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);
        cargarTabla();

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/reporte.png"))); // NOI18N
        jButton1.setText("Reporte de todo el inventario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(51, 51, 51));

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Control");

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setText("Altas, Bajas y Modificacioes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Administracion");

        jMenuItem6.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem6.setText("Catalogos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Reportes");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        jMenu1.setText("Secion");

        jMenu2.setText("Cuenta");

        jmenu_adminCuenta.setText("Adiministrar cuenta");
        jmenu_adminCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenu_adminCuentaActionPerformed(evt);
            }
        });
        jMenu2.add(jmenu_adminCuenta);

        jMenuItem2.setText("Administrador");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenu1.add(jMenu2);

        jMenuItem8.setText("Cerrar Secion");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        System.exit(0);

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        setExtendedState(log.CROSSHAIR_CURSOR);

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        this.dispose();

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Venta_controlbienes().setVisible(true);
            }
        });

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

        this.dispose();

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new vent_catal().setVisible(true);
            }
        });
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

        x = evt.getX();
        y = evt.getY();

    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged

        Point ubicacion = MouseInfo.getPointerInfo().getLocation();
        setLocation(ubicacion.x - x, ubicacion.y - y);

    }//GEN-LAST:event_jPanel2MouseDragged

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed

        System.exit(0);
        ConexionBD.cerrarConexion();

    }//GEN-LAST:event_btn_salirActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed

        this.dispose();

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Reportes().setVisible(true);
            }
        });

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed

        this.dispose();

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new log().setVisible(true);
            }
        });

        ConexionBD.cerrarConexion();

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked

    }//GEN-LAST:event_jTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        report.reporteinventario();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jmenu_adminCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenu_adminCuentaActionPerformed

        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new log2().setVisible(true);
            }
        });

    }//GEN-LAST:event_jmenu_adminCuentaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        if (acceso == 0) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new administrador_user().setVisible(true);
                }
            });

            this.dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Usted no cuenta con los permisos suficientes para acceder a este modulo",
                    "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void cargarTabla() {
        jTABLE.setRowCount(0);
        try {
            rs = GS.tablaBienes("");
            while (rs.next()) {
                Object[] fila = new Object[14];
                for (int j = 0; j < 14; j++) {
                    fila[j] = rs.getObject(j + 1);
                }
                jTABLE.addRow(fila);
            }

        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JMenuItem jmenu_adminCuenta;
    // End of variables declaration//GEN-END:variables
}

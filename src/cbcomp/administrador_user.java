package cbcomp;

import java.awt.HeadlessException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/*
 * @author Erick Alejandro Trujillo Ortiz
 */
public class administrador_user extends javax.swing.JFrame {

    public administrador_user() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    int x, y;
    String user, pass, preg, resp, nom, ap;

    int rs, nivel;
    ResultSet rscarga;
    GeneraSQL GS = new GeneraSQL();
    ProcesaSQL PD = new ProcesaSQL();
    String SQLGenerado;
    DefaultTableModel jTABLE = new DefaultTableModel();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        btn_back = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cnb_preg = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        txt_nom = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_ap = new javax.swing.JTextField();
        btn_modificar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cnb_nivel = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable(jTABLE);
        btn_delete = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        txt_resp = new javax.swing.JPasswordField();
        btn_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
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
        jLabel1.setText("Crear Usuario del Sistema");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setText("Nombre de Usuario:");

        txt_user.setEditable(false);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Contraseña: ");

        txt_pass.setText("Erick");

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/back_.png"))); // NOI18N
        btn_back.setText("Volver");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Seleccione una pregunta de Seguridad:");

        cnb_preg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una pregunta de Seguridad", "¿Nombre de la primer mascota?", "¿Cual fue tu heroe de la infancia?", "¿A que edad terminaste la universidad?", "¿A que edad tuviste tu primer beso?" }));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Nombre:");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Apellidos:");

        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/modificar_.png"))); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        jLabel14.setText("Nivel de Acceso");

        cnb_nivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione 1", "Administrador (Control Total)", "Guardar, Modificar, Eliminar", "Guardar, Modificar", "Guardar", "Guest (Solo visualizar)" }));
        cnb_nivel.setOpaque(false);

        jScrollPane1.setAutoscrolls(true);

        jTABLE.addColumn("Nombre");
        jTABLE.addColumn("Apellido");
        jTABLE.addColumn("Nombre Usuario");
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);
        cargarTabla();

        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/delete_.png"))); // NOI18N
        btn_delete.setText("Eliminar");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/save_.png"))); // NOI18N
        btn_save.setText("Guardar");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        txt_resp.setText("Micaela");

        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/limpiar.png"))); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_resp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_ap, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cnb_preg, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txt_user)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(10, 10, 10)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txt_pass)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cnb_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_save)
                                .addGap(18, 18, 18)
                                .addComponent(btn_modificar)
                                .addGap(10, 10, 10)
                                .addComponent(btn_limpiar)
                                .addGap(10, 10, 10)
                                .addComponent(btn_delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_back)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnb_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnb_preg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed

        this.dispose();

        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new principal().setVisible(true);
            }
        });
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed

        nom = this.txt_nom.getText();
        ap = this.txt_ap.getText();
        user = this.txt_user.getText();
        pass = this.txt_pass.getText();
        preg = this.cnb_preg.getSelectedItem().toString();
        resp = this.txt_resp.getText();
        nivel = this.cnb_nivel.getSelectedIndex()-1;

        SQLGenerado = (GS.actualizarUser2(user, pass, preg, resp, nom, ap, nivel));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {

            javax.swing.JOptionPane.showMessageDialog(null, "Datos Modoficados correctamente ", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            cargarTabla();
            
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Los datos no pudieron ser"
                    + " modificados", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked

        this.btn_save.setEnabled(false);
        
        this.txt_nom.setText(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
        this.txt_ap.setText(jTable.getValueAt(jTable.getSelectedRow(), 1).toString());
        this.txt_user.setText(jTable.getValueAt(jTable.getSelectedRow(), 2).toString());

        SQLGenerado = (GS.buscarUser(this.txt_user.getText()));
        rscarga = PD.Consultar(SQLGenerado);

        try {
            if (rscarga.next()) {

                this.txt_pass.setText(this.rscarga.getString("pass"));
                this.cnb_preg.setSelectedItem(this.rscarga.getString("Pregunta"));
                this.txt_resp.setText(this.rscarga.getString("Respuesta"));
                this.cnb_nivel.setSelectedIndex(Integer.parseInt(this.rscarga.getString("Nivel"))+1);

            } else {

                javax.swing.JOptionPane.showMessageDialog(null,
                        "Error verifique que el usuario si existe en la Base de datos.");
            }

        } catch (SQLException | HeadlessException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage().toString());
        }

    }//GEN-LAST:event_jTableMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

        SQLGenerado = (GS.eliminarUser(this.txt_user.getText()));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Se ha eliminado con éxito de la Base de datos",
                "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            cargarTabla();

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "El Registro no existe en la Base de Datos"
                + "\no ya fue eliminado con anterioridad.", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged

        Point ubicacion = MouseInfo.getPointerInfo().getLocation();
        setLocation(ubicacion.x - x, ubicacion.y - y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
 
        nom = this.txt_nom.getText();
        ap = this.txt_ap.getText();
        user = this.txt_user.getText();
        pass = this.txt_pass.getText();
        preg = this.cnb_preg.getSelectedItem().toString();
        resp = this.txt_resp.getText();
        nivel = this.cnb_nivel.getSelectedIndex() - 1;

        SQLGenerado = (GS.agregarUser(nom, ap, user, pass, preg, resp, nivel));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Datos guardados correctamente ", "AVISO",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Los datos no fueron"
                + " guardados", "AVISO",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed

            Limpiar();
        
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void cargarTabla() {
        jTABLE.setRowCount(0);
    try {
        rscarga = GS.tablaUser("");
        while (rscarga.next()) {
            Object[] fila = new Object[3];
            fila[0] = rscarga.getString("Nombre");
            fila[1] = rscarga.getString("Apellido");
            fila[2] = rscarga.getString("Nickname");
            jTABLE.addRow(fila);
        }

    } catch (SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(null, e);
    }
    }
    
    private void Limpiar(){
        this.btn_save.setEnabled(true);
        this.btn_delete.setEnabled(false);
        this.btn_modificar.setEnabled(false);
        
        this.txt_nom.setText("");
        this.txt_ap.setText("");
        this.txt_user.setText("");
        this.txt_pass.setText("");
        this.txt_resp.setText("");
        
        this.cnb_nivel.setSelectedIndex(0);
        this.cnb_preg.setSelectedIndex(0);        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox cnb_nivel;
    private javax.swing.JComboBox cnb_preg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txt_ap;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JPasswordField txt_resp;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}

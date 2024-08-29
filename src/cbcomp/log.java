package cbcomp;

import java.awt.*;
import java.sql.*;
import javax.swing.ImageIcon;

/**
 * @author Erick Alejandro Trujillo Ortiz
 */
public class log extends javax.swing.JFrame {

    public log() {
        initComponents();
        setLocationRelativeTo(null);

    }
    private int x, y;
    String SQLGenerado, usuario, contraseña;

    GeneraSQL GS = new GeneraSQL();
    ProcesaSQL PD = new ProcesaSQL();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnl_user = new javax.swing.JPanel();
        lbl_user = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pnl_pass = new javax.swing.JPanel();
        lbl_pass = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_enter = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/PACK_IMG/pc_ico.png")).getImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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
        jLabel1.setText("Inicio de Secion Control de Bienes");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))))
                .addContainerGap())
        );

        pnl_user.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_user.setText("Usuario");

        txt_user.setFont(new java.awt.Font("Arial Narrow", 2, 14)); // NOI18N
        txt_user.setForeground(new java.awt.Color(102, 102, 102));
        txt_user.setText("undertaker");
        txt_user.setPreferredSize(new java.awt.Dimension(75, 20));
        txt_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_userMouseClicked(evt);
            }
        });
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel7.setText("¿Olvido su usuario?");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_userLayout = new javax.swing.GroupLayout(pnl_user);
        pnl_user.setLayout(pnl_userLayout);
        pnl_userLayout.setHorizontalGroup(
            pnl_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_userLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_userLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_userLayout.setVerticalGroup(
            pnl_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_userLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_pass.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_pass.setText("Contraseña");

        txt_pass.setText("nbhalo117");
        txt_pass.setPreferredSize(new java.awt.Dimension(75, 20));
        txt_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_passMouseClicked(evt);
            }
        });
        txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel6.setText("¿Olvido su contraseña?");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_passLayout = new javax.swing.GroupLayout(pnl_pass);
        pnl_pass.setLayout(pnl_passLayout);
        pnl_passLayout.setHorizontalGroup(
            pnl_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_passLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_passLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_passLayout.setVerticalGroup(
            pnl_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_passLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_pass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_enter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/correct_.png"))); // NOI18N
        btn_enter.setText("Entrar");
        btn_enter.setMaximumSize(new java.awt.Dimension(90, 30));
        btn_enter.setMinimumSize(new java.awt.Dimension(90, 30));
        btn_enter.setPreferredSize(new java.awt.Dimension(90, 30));
        btn_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enterActionPerformed(evt);
            }
        });

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/incorrect_.png"))); // NOI18N
        btn_exit.setText("Salir");
        btn_exit.setMaximumSize(new java.awt.Dimension(90, 30));
        btn_exit.setMinimumSize(new java.awt.Dimension(90, 30));
        btn_exit.setPreferredSize(new java.awt.Dimension(90, 30));
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_enter, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/login_.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel5.setText("Crear cuenta");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(pnl_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        System.exit(0);

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        setExtendedState(log.CROSSHAIR_CURSOR);

    }//GEN-LAST:event_jLabel4MouseClicked

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed

        ConexionBD.cerrarConexion();
        System.exit(0);

    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enterActionPerformed

        usuario = txt_user.getText();
        contraseña = txt_pass.getText().toString();

        SQLGenerado = GS.Login(usuario, contraseña);
        ResultSet rs = PD.Consultar(SQLGenerado);

        try {
            if (rs.next()) {

                main.acces = rs.getString("Nivel");
                java.awt.EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new principal().setVisible(true);
                    }
                });

                this.dispose();

            } else {
                javax.swing.JOptionPane.showMessageDialog(null,
                        "¡Usuario o contraseña incorrecta!.");
            }
        } catch (SQLException | HeadlessException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage().toString());
        }

    }//GEN-LAST:event_btn_enterActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

                java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new crear_users().setVisible(true);
            }
        });
        this.dispose();
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

        x = evt.getX();
        y = evt.getY();

    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged

        Point ubicacion = MouseInfo.getPointerInfo().getLocation();
        setLocation(ubicacion.x - x, ubicacion.y - y);

    }//GEN-LAST:event_jPanel2MouseDragged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        ConexionBD.abrirConexion();

    }//GEN-LAST:event_formWindowOpened

    private void txt_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_userMouseClicked

        this.txt_user.setText("");

    }//GEN-LAST:event_txt_userMouseClicked

    private void txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passActionPerformed

        usuario = txt_user.getText();
        contraseña = txt_pass.getText().toString();

        SQLGenerado = GS.Login(usuario, contraseña);
        ResultSet rs = PD.Consultar(SQLGenerado);

        try {
            if (rs.next()) {

                main.acces = rs.getString("Nivel");
                main.nick = rs.getString("Nickname");
                main.pass = rs.getString("Pass");

                if (Integer.parseInt(main.acces) < 5) {
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            new principal().setVisible(true);
                        }
                    });

                    this.dispose();
                } else {
                    javax.swing.JOptionPane.showMessageDialog(null, "Su cuenta aun no a sido Habilitada"
                            + " Pongase en contacto con el administrador para que le asigne un nivel de acceso", "AVISO",
                            javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(null,
                        "¡Usuario o contraseña incorrecta!.");
            }
        } catch (SQLException | HeadlessException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage().toString());
        }

    }//GEN-LAST:event_txt_passActionPerformed

    private void txt_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passMouseClicked

        this.txt_pass.setText("");

    }//GEN-LAST:event_txt_passMouseClicked

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed

        this.txt_pass.requestFocus();
        this.txt_pass.setText("");

    }//GEN-LAST:event_txt_userActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enter;
    private javax.swing.JButton btn_exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JPanel pnl_pass;
    private javax.swing.JPanel pnl_user;
    private javax.swing.JPasswordField txt_pass;
    public javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}

package cbcomp;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 * @author Erick Alejandro Trujillo Ortiz
 */
public class vent_catal extends javax.swing.JFrame {

    public vent_catal() {
        initComponents();
        setLocationRelativeTo(null);
        Desactivar();
    }

    DefaultTableModel jTABLE = new DefaultTableModel();
    DefaultTableModel jTABLE2 = new DefaultTableModel();
    DefaultTableModel jTABLE3 = new DefaultTableModel();
    DefaultTableModel jTABLE4 = new DefaultTableModel();
    DefaultTableModel jTABLE5 = new DefaultTableModel();

    GeneraSQL GS = new GeneraSQL();
    ProcesaSQL PD = new ProcesaSQL();

    private int x, y, rs, id, ficha, acceso= Integer.parseInt(main.acces);
    private ResultSet carga;
    private String SQLGenerado, catalogo, nombre;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        btn_exit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable(jTABLE);
        txt_marca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_modifi = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_tipoE = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_modifiequipo = new javax.swing.JButton();
        btn_guardarE = new javax.swing.JButton();
        btn_eliminarequipo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable(jTABLE3);
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(jTABLE2);
        txt_u = new javax.swing.JTextField();
        btn_guardau = new javax.swing.JButton();
        btn_modificaru = new javax.swing.JButton();
        btn_eliminaru = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_a = new javax.swing.JTextField();
        btn_eliminaa = new javax.swing.JButton();
        btn_modificara = new javax.swing.JButton();
        btn_guardara = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable(jTABLE4);
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btn_guardarficha = new javax.swing.JButton();
        btn_modificarficha = new javax.swing.JButton();
        btn_eliminarficha = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable(jTABLE5);
        jLabel5 = new javax.swing.JLabel();
        txt_ficha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setIconImage(new ImageIcon(getClass().getResource("/PACK_IMG/pc_ico.png")).getImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/back_.png"))); // NOI18N
        btn_exit.setText("Volver");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
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
        jLabel1.setText("Catalogos");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/minimizar.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/cerrar.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(146, 40));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Marcas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jScrollPane1.setAutoscrolls(true);

        jTABLE.addColumn("ID Registro");
        jTABLE.addColumn("Marca");
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);
        cargarTablamarca();

        txt_marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_marcaKeyTyped(evt);
            }
        });

        jLabel6.setText("Agregar Marca:");

        btn_modifi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/modificar_.png"))); // NOI18N
        btn_modifi.setText("Modificar");
        btn_modifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifiActionPerformed(evt);
            }
        });

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/save_.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/delete_.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_marca))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_modifi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_eliminar)
                            .addComponent(btn_guardar)
                            .addComponent(btn_modifi))))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Marcas", jPanel1);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setPreferredSize(new java.awt.Dimension(146, 40));

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo De Equipo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        txt_tipoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tipoEKeyTyped(evt);
            }
        });

        jLabel9.setText("Agregar Tipo Equipo:");

        btn_modifiequipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/modificar_.png"))); // NOI18N
        btn_modifiequipo.setText("Modificar");
        btn_modifiequipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifiequipoActionPerformed(evt);
            }
        });

        btn_guardarE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/save_.png"))); // NOI18N
        btn_guardarE.setText("Guardar");
        btn_guardarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarEActionPerformed(evt);
            }
        });

        btn_eliminarequipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/delete_.png"))); // NOI18N
        btn_eliminarequipo.setText("Eliminar");
        btn_eliminarequipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarequipoActionPerformed(evt);
            }
        });

        jScrollPane3.setAutoscrolls(true);

        jTABLE3.addColumn("ID Registro");
        jTABLE3.addColumn("Tipo de Equipo");
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);
        cargarTablaTiE();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_guardarE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_modifiequipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminarequipo))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tipoE, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_tipoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_modifiequipo)
                            .addComponent(btn_eliminarequipo)
                            .addComponent(btn_guardarE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Tipo de Equipo", jPanel4);

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setPreferredSize(new java.awt.Dimension(146, 40));

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ubicacion");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        jLabel12.setText("Agregar Ubicacion:");

        jScrollPane2.setAutoscrolls(true);

        jTABLE2.addColumn("ID Registro");
        jTABLE2.addColumn("Ubicacion");
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        cargarTablaU();

        txt_u.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_uKeyTyped(evt);
            }
        });

        btn_guardau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/save_.png"))); // NOI18N
        btn_guardau.setText("Guardar");
        btn_guardau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardauActionPerformed(evt);
            }
        });

        btn_modificaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/modificar_.png"))); // NOI18N
        btn_modificaru.setText("Modificar");
        btn_modificaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificaruActionPerformed(evt);
            }
        });

        btn_eliminaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/delete_.png"))); // NOI18N
        btn_eliminaru.setText("Eliminar");
        btn_eliminaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminaruActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_guardau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btn_modificaru)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminaru))
                    .addComponent(txt_u))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 32, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_u, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_guardau)
                            .addComponent(btn_modificaru)
                            .addComponent(btn_eliminaru)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Ubicacion", jPanel9);

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));
        jPanel10.setPreferredSize(new java.awt.Dimension(146, 40));

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Area");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jLabel13.setText("Agregar Area:");

        txt_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_aKeyTyped(evt);
            }
        });

        btn_eliminaa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/delete_.png"))); // NOI18N
        btn_eliminaa.setText("Eliminar");
        btn_eliminaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminaaActionPerformed(evt);
            }
        });

        btn_modificara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/modificar_.png"))); // NOI18N
        btn_modificara.setText("Modificar");
        btn_modificara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificaraActionPerformed(evt);
            }
        });

        btn_guardara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/save_.png"))); // NOI18N
        btn_guardara.setText("Guardar");
        btn_guardara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardaraActionPerformed(evt);
            }
        });

        jScrollPane5.setAutoscrolls(true);

        jTABLE4.addColumn("ID Registro");
        jTABLE4.addColumn("Area");
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable4);
        cargarTablaA();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_a))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btn_guardara)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_modificara)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminaa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_guardara)
                            .addComponent(btn_modificara)
                            .addComponent(btn_eliminaa)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Area", jPanel6);

        jPanel12.setBackground(new java.awt.Color(102, 102, 102));
        jPanel12.setPreferredSize(new java.awt.Dimension(146, 40));

        jLabel14.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fichas");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        btn_guardarficha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/save_.png"))); // NOI18N
        btn_guardarficha.setText("Guardar");
        btn_guardarficha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarfichaActionPerformed(evt);
            }
        });

        btn_modificarficha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/modificar_.png"))); // NOI18N
        btn_modificarficha.setText("Modificar");
        btn_modificarficha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarfichaActionPerformed(evt);
            }
        });

        btn_eliminarficha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/delete_.png"))); // NOI18N
        btn_eliminarficha.setText("Eliminar");
        btn_eliminarficha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarfichaActionPerformed(evt);
            }
        });

        jScrollPane4.setAutoscrolls(true);

        jTABLE5.addColumn("Ficha");
        jTABLE5.addColumn("Nombre");
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable3);
        cargarTablaficha();

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Ficha:");

        txt_ficha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_ficha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fichaActionPerformed(evt);
            }
        });
        txt_ficha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fichaKeyTyped(evt);
            }
        });

        jLabel8.setText("Nombre:");

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btn_guardarficha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_modificarficha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminarficha))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(txt_ficha))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_ficha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_eliminarficha)
                            .addComponent(btn_guardarficha)
                            .addComponent(btn_modificarficha)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Empleados", jPanel11);

        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/limpiar.png"))); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btn_limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_exit)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_exit)
                    .addComponent(btn_limpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     
        if (acceso > 3) {
            this.btn_guardar.setEnabled(false);
            this.btn_guardarE.setEnabled(false);
            this.btn_guardara.setEnabled(false);
            this.btn_guardau.setEnabled(false);
            this.btn_guardarficha.setEnabled(false);
        }

    }//GEN-LAST:event_formWindowOpened

    private void btn_guardauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardauActionPerformed

        catalogo = (this.txt_u.getText());

        SQLGenerado = (GS.agregarU(catalogo));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Datos guardados correctamente ", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Limpiar();

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Los datos no fueron guardados", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_guardauActionPerformed

    private void btn_eliminaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminaruActionPerformed

        SQLGenerado = (GS.eliminarU(id));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Se ha eliminado con éxito de la Base de datos",
                    "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Limpiar();

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "error al eliminar.",
                    "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_eliminaruActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        id = (Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
        txt_u.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());

        if (acceso <= 1) {
            btn_guardau.setEnabled(false);
            btn_modificaru.setEnabled(true);
            btn_eliminaru.setEnabled(true);
        } else {
            if (acceso == 2) {
                btn_guardau.setEnabled(false);
                this.btn_modificaru.setEnabled(true);
            } else {
                if (acceso == 3) {
                    btn_guardau.setEnabled(false);
                } else {
                    if (acceso == 4) {
                        this.btn_limpiar.setEnabled(true);
                    }
                }
            }
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        id = (Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString()));
        txt_tipoE.setText(jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString());

        if (acceso <= 1) {
            btn_guardarE.setEnabled(false);
            btn_eliminarequipo.setEnabled(true);
            btn_modifiequipo.setEnabled(true);
        } else {
            if (acceso == 2) {
                btn_guardarE.setEnabled(false);
                this.btn_modifiequipo.setEnabled(true);
            } else {
                if (acceso == 3) {
                    btn_guardarE.setEnabled(false);
                } else {
                    if (acceso == 4) {
                        this.btn_limpiar.setEnabled(true);
                    }
                }
            }
        }

    }//GEN-LAST:event_jTable2MouseClicked

    private void btn_eliminarequipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarequipoActionPerformed

        SQLGenerado = (GS.eliminartipoE(id));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Se ha eliminado con éxito de la Base de datos", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);

            Limpiar();

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "error al eliminar.", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_eliminarequipoActionPerformed

    private void btn_guardarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarEActionPerformed

        catalogo = (this.txt_tipoE.getText());

        SQLGenerado = (GS.agregarTipoE(catalogo));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Datos guardados correctamente ", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Limpiar();
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Los datos no fueron guardados", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_guardarEActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        id = (Integer.parseInt(jTable.getValueAt(jTable.getSelectedRow(), 0).toString()));

        SQLGenerado = (GS.eliminaMarca(id));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Se ha eliminado con éxito de la Base de datos", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);

            Limpiar();

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "error al eliminar.", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        catalogo = (this.txt_marca.getText());

        SQLGenerado = (GS.agregarMarca(catalogo));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Datos guardados correctamente ", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Limpiar();

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Los datos no fueron guardados", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_modifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifiActionPerformed

        catalogo = (this.txt_marca.getText());

        SQLGenerado = (GS.actualizarMarca(id, catalogo));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Datos guardados correctamente ", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Limpiar();

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Los datos no fueron guardados", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_modifiActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked

        id = (Integer.parseInt(jTable.getValueAt(jTable.getSelectedRow(), 0).toString()));
        txt_marca.setText(jTable.getValueAt(jTable.getSelectedRow(), 1).toString());

        if (acceso <= 1) {
            btn_guardar.setEnabled(false);
            btn_eliminar.setEnabled(true);
            btn_modifi.setEnabled(true);
        } else {
            if (acceso == 2) {
                btn_guardar.setEnabled(false);
                this.btn_modifi.setEnabled(true);
            } else {
                if (acceso == 3) {
                    btn_guardar.setEnabled(false);
                } else {
                    if (acceso == 4) {
                        this.btn_limpiar.setEnabled(true);
                    }
                }
            }
        }

    }//GEN-LAST:event_jTableMouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged

        Point ubicacion = MouseInfo.getPointerInfo().getLocation();
        setLocation(ubicacion.x - x, ubicacion.y - y);

    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

        x = evt.getX();
        y = evt.getY();

    }//GEN-LAST:event_jPanel2MousePressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        this.dispose();

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new principal().setVisible(true);
            }
        });

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        setExtendedState(log.CROSSHAIR_CURSOR);

    }//GEN-LAST:event_jLabel4MouseClicked

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed

        this.dispose();

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new principal().setVisible(true);
            }
        });

    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_modifiequipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifiequipoActionPerformed

        catalogo = (this.txt_tipoE.getText());

        SQLGenerado = (GS.actualizarTipo(id, catalogo));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Datos guardados correctamente ", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Limpiar();

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Los datos no fueron guardados", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_modifiequipoActionPerformed

    private void btn_modificaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificaruActionPerformed

        catalogo = (this.txt_u.getText());

        SQLGenerado = (GS.actualizarU(id, catalogo));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Datos guardados correctamente ", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Limpiar();

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Los datos no fueron guardados", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_modificaruActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed

        if (acceso > 3) {
            Limpiar();
            this.btn_guardar.setEnabled(false);
            this.btn_guardarE.setEnabled(false);
            this.btn_guardara.setEnabled(false);
            this.btn_guardau.setEnabled(false);
            this.btn_guardarficha.setEnabled(false);
        } else {
            Limpiar();
        }

    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void txt_marcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_marcaKeyTyped

        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
                && car != 'á'
                && car != 'é'
                && car != 'í'
                && car != 'ó'
                && car != 'ú'
                && car != 'Á'
                && car != 'É'
                && car != 'Í'
                && car != 'Ó'
                && car != 'Ú'
                && (car != (char) KeyEvent.VK_DELETE)
                && (car != (char) KeyEvent.VK_BACK_SPACE)
                && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
            java.awt.Toolkit.getDefaultToolkit().beep();
        }

        if (txt_marca.getText().length() >= 10) {
            java.awt.Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_txt_marcaKeyTyped

    private void txt_tipoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tipoEKeyTyped

        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
                && car != 'á'
                && car != 'é'
                && car != 'í'
                && car != 'ó'
                && car != 'ú'
                && car != 'Á'
                && car != 'É'
                && car != 'Í'
                && car != 'Ó'
                && car != 'Ú'
                && (car != (char) KeyEvent.VK_DELETE)
                && (car != (char) KeyEvent.VK_BACK_SPACE)
                && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
            java.awt.Toolkit.getDefaultToolkit().beep();
        }

        if (txt_tipoE.getText().length() >= 15) {
            java.awt.Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_txt_tipoEKeyTyped

    private void txt_uKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_uKeyTyped

        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
                && car != 'á'
                && car != 'é'
                && car != 'í'
                && car != 'ó'
                && car != 'ú'
                && car != 'Á'
                && car != 'É'
                && car != 'Í'
                && car != 'Ó'
                && car != 'Ú'
                && (car != (char) KeyEvent.VK_DELETE)
                && (car != (char) KeyEvent.VK_BACK_SPACE)
                && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
            java.awt.Toolkit.getDefaultToolkit().beep();
        }

        if (txt_u.getText().length() >= 25) {
            java.awt.Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_txt_uKeyTyped

    private void txt_aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_aKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_aKeyTyped

    private void btn_eliminaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminaaActionPerformed

        SQLGenerado = (GS.eliminarA(id));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Se ha eliminado con éxito de la Base de datos",
                    "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Limpiar();

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "error al eliminar.",
                    "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_eliminaaActionPerformed

    private void btn_modificaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificaraActionPerformed

        catalogo = (this.txt_a.getText());

        SQLGenerado = (GS.actualizarA(id, catalogo));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Datos guardados correctamente ", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Limpiar();

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Los datos no fueron guardados", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_modificaraActionPerformed

    private void btn_guardaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardaraActionPerformed

        catalogo = (this.txt_a.getText());

        SQLGenerado = (GS.agregarA(catalogo));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Datos guardados correctamente ", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Limpiar();

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Los datos no fueron guardados", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_guardaraActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked

        id = (Integer.parseInt(jTable4.getValueAt(jTable4.getSelectedRow(), 0).toString()));
        txt_a.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 1).toString());

        if (acceso <= 1) {
            btn_guardara.setEnabled(false);
            btn_modificara.setEnabled(true);
            btn_eliminaa.setEnabled(true);
        } else {
            if (acceso == 2) {
                btn_guardara.setEnabled(false);
                this.btn_modificara.setEnabled(true);
            } else {
                if (acceso == 3) {
                    btn_guardara.setEnabled(false);
                } else {
                    if (acceso == 4) {
                        this.btn_limpiar.setEnabled(true);
                    }
                }
            }
        }

    }//GEN-LAST:event_jTable4MouseClicked

    private void btn_guardarfichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarfichaActionPerformed

        ficha = (Integer.parseInt(this.txt_ficha.getText()));
        nombre = this.txt_nombre.getText();

        SQLGenerado = (GS.agregarFicha(ficha, nombre));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Datos guardados correctamente ", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Limpiar();

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Los datos no fueron guardados", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_guardarfichaActionPerformed

    private void btn_modificarfichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarfichaActionPerformed

        ficha = (Integer.parseInt(this.txt_ficha.getText()));
        nombre = (this.txt_nombre.getText());

        SQLGenerado = (GS.actualizarFicha(ficha, nombre));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Datos guardados correctamente ", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Limpiar();

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Los datos no fueron guardados", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_modificarfichaActionPerformed

    private void btn_eliminarfichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarfichaActionPerformed

        ficha = (Integer.parseInt(this.txt_ficha.getText()));
        SQLGenerado = (GS.eliminarFicha(ficha));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Se ha eliminado con éxito de la Base de datos",
                    "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Limpiar();

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "error al eliminar.",
                    "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_eliminarfichaActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked

        this.txt_ficha.setText(jTable3.getValueAt(jTable3.getSelectedRow(), 0).toString());
        this.txt_nombre.setText(jTable3.getValueAt(jTable3.getSelectedRow(), 1).toString());
        this.txt_ficha.setEditable(false);

        if (acceso <= 1) {
            btn_guardarficha.setEnabled(false);
            btn_modificarficha.setEnabled(true);
            btn_eliminarficha.setEnabled(true);
        } else {
            if (acceso == 2) {
                btn_guardarficha.setEnabled(false);
                this.btn_modificarficha.setEnabled(true);
            } else {
                if (acceso == 3) {
                    btn_guardarficha.setEnabled(false);
                } else {
                    if (acceso == 4) {
                        this.btn_limpiar.setEnabled(true);
                    }
                }
            }
        }

    }//GEN-LAST:event_jTable3MouseClicked

    private void txt_fichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fichaActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_txt_fichaActionPerformed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped

        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
                && car != 'á'
                && car != 'é'
                && car != 'í'
                && car != 'ó'
                && car != 'ú'
                && car != 'Á'
                && car != 'É'
                && car != 'Í'
                && car != 'Ó'
                && car != 'Ú'
                && (car != (char) KeyEvent.VK_DELETE)
                && (car != (char) KeyEvent.VK_BACK_SPACE)
                && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
            java.awt.Toolkit.getDefaultToolkit().beep();
        }

        if (this.txt_nombre.getText().length() >= 50) {
            java.awt.Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_fichaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fichaKeyTyped

        char car = evt.getKeyChar();
        if (this.txt_ficha.getText().length() >= 20) {
            java.awt.Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            java.awt.Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_txt_fichaKeyTyped

    private void cargarTablamarca() {
        jTABLE.setRowCount(0);
        try {
            carga = GS.tablaMarca();
            while (carga.next()) {
                Object[] fila = new Object[2];
                for (int j = 0; j < 2; j++) {
                    fila[j] = carga.getObject(j + 1);
                }
                jTABLE.addRow(fila);
            }
        } catch (SQLException e) {

        }
    }

    private void cargarTablaU() {
        jTABLE2.setRowCount(0);
        try {
            carga = GS.tablaU();
            while (carga.next()) {
                Object[] fila = new Object[2];
                for (int j = 0; j < 2; j++) {
                    fila[j] = carga.getObject(j + 1);
                }
                jTABLE2.addRow(fila);
            }
        } catch (SQLException ex) {

        }
    }

    private void cargarTablaA() {
        jTABLE4.setRowCount(0);
        try {
            carga = GS.tablaA();
            while (carga.next()) {
                Object[] fila = new Object[2];
                for (int j = 0; j < 2; j++) {
                    fila[j] = carga.getObject(j + 1);
                }
                jTABLE4.addRow(fila);
            }
        } catch (SQLException e) {

        }
    }

    private void cargarTablaTiE() {
        jTABLE3.setRowCount(0);
        try {
            carga = GS.tablaTipoE();
            while (carga.next()) {
                Object[] fila = new Object[2];
                for (int j = 0; j < 2; j++) {
                    fila[j] = carga.getObject(j + 1);
                }
                jTABLE3.addRow(fila);
            }
        } catch (SQLException ex) {

        }
    }

    private void cargarTablaficha() {
        jTABLE5.setRowCount(0);
        try {
            carga = GS.tablaFicha();
            while (carga.next()) {
                Object[] fila = new Object[2];
                for (int j = 0; j < 2; j++) {
                    fila[j] = carga.getObject(j + 1);
                }
                jTABLE5.addRow(fila);
            }
        } catch (SQLException e) {

        }
    }

    private void Limpiar() {

        btn_guardar.setEnabled(true);
        btn_guardarE.setEnabled(true);
        btn_guardau.setEnabled(true);
        btn_guardara.setEnabled(true);
        btn_guardarficha.setEnabled(true);

        txt_marca.setText("");
        txt_tipoE.setText("");
        txt_u.setText("");
        txt_a.setText("");
        txt_ficha.setText("");
        txt_nombre.setText("");

        cargarTablamarca();
        cargarTablaU();
        cargarTablaA();
        cargarTablaTiE();
        cargarTablaficha();

        btn_modifi.setEnabled(false);
        btn_modifiequipo.setEnabled(false);
        btn_modificaru.setEnabled(false);
        btn_modificara.setEnabled(false);
        btn_modificarficha.setEnabled(false);

        btn_eliminar.setEnabled(false);
        btn_eliminarequipo.setEnabled(false);
        btn_eliminaru.setEnabled(false);
        btn_eliminaa.setEnabled(false);
        btn_eliminarficha.setEnabled(false);
    }

    private void Desactivar() {
        btn_modifi.setEnabled(false);
        btn_modifiequipo.setEnabled(false);
        btn_modificaru.setEnabled(false);
        btn_modificara.setEnabled(false);
        btn_eliminar.setEnabled(false);
        btn_eliminaa.setEnabled(false);
        btn_eliminarequipo.setEnabled(false);
        btn_eliminaru.setEnabled(false);
        btn_modificarficha.setEnabled(false);
        btn_eliminarficha.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminaa;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_eliminarequipo;
    private javax.swing.JButton btn_eliminarficha;
    private javax.swing.JButton btn_eliminaru;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_guardarE;
    private javax.swing.JButton btn_guardara;
    private javax.swing.JButton btn_guardarficha;
    private javax.swing.JButton btn_guardau;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modifi;
    private javax.swing.JButton btn_modificara;
    private javax.swing.JButton btn_modificarficha;
    private javax.swing.JButton btn_modificaru;
    private javax.swing.JButton btn_modifiequipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField txt_a;
    private javax.swing.JTextField txt_ficha;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_tipoE;
    private javax.swing.JTextField txt_u;
    // End of variables declaration//GEN-END:variables
}

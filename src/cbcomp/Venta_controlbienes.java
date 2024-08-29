package cbcomp;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.*;
import java.util.Date;
import java.util.logging.*;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import static org.hsqldb.HsqlDateTime.e;

/**
 * @author Erick Alejandro Trujillo Ortiz
 */
public class Venta_controlbienes extends javax.swing.JFrame {

    public Venta_controlbienes() {
        initComponents();
        setLocationRelativeTo(null);
        btn_delete.setEnabled(false);
        btn_modifi.setEnabled(false);

    }

    DefaultTableModel jTABLE = new DefaultTableModel();
    private int x, y;
    variables ctrl = new variables();
    int rs;
    int acceso= Integer.parseInt(main.acces);
    ResultSet rscarga;
    GeneraSQL GS = new GeneraSQL();
    ProcesaSQL PD = new ProcesaSQL();
    String SQLGenerado, Tipo;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_fondo = new javax.swing.JPanel();
        pnl_pie = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton();
        btn_back1 = new javax.swing.JButton();
        btn_modifi = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_inventario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cnb_tipo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cnb_marca = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_ficha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_modelo = new javax.swing.JTextField();
        txt_serie = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cnb_ubicacion = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        cnb_area = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        cnb_estado = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cnb_propiedad = new javax.swing.JComboBox();
        calendar = new com.toedter.calendar.JDateChooser();
        pnl_title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable(jTABLE);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/PACK_IMG/pc_ico.png")).getImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/save_.png"))); // NOI18N
        btn_save.setText("Guardar");
        btn_save.setPreferredSize(new java.awt.Dimension(60, 30));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/back_.png"))); // NOI18N
        btn_back1.setText("Volver");
        btn_back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back1ActionPerformed(evt);
            }
        });

        btn_modifi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/modificar_.png"))); // NOI18N
        btn_modifi.setText("Modificar");
        btn_modifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifiActionPerformed(evt);
            }
        });

        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/delete_.png"))); // NOI18N
        btn_delete.setText("Eliminar");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PACK_IMG/limpiar.png"))); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_pieLayout = new javax.swing.GroupLayout(pnl_pie);
        pnl_pie.setLayout(pnl_pieLayout);
        pnl_pieLayout.setHorizontalGroup(
            pnl_pieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_modifi, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_back1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_pieLayout.setVerticalGroup(
            pnl_pieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_pieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_pieLayout.createSequentialGroup()
                        .addGroup(pnl_pieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_pieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_modifi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_back1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Inventario:");

        txt_inventario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_inventario.setForeground(new java.awt.Color(0, 102, 0));
        txt_inventario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_inventarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_inventarioKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Descriptivo");

        cnb_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione 1" }));
        cnb_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnb_tipoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Marca");

        cnb_marca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione 1" }));
        cnb_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnb_marcaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Modelo");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Serie");

        txt_ficha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_ficha.setForeground(new java.awt.Color(0, 102, 0));
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Ficha");

        txt_modelo.setForeground(new java.awt.Color(0, 102, 0));
        txt_modelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_modeloKeyReleased(evt);
            }
        });

        txt_serie.setForeground(new java.awt.Color(0, 102, 0));
        txt_serie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_serieKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txt_inventario))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cnb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cnb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txt_modelo))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txt_serie))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_inventario, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                .addComponent(cnb_tipo)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_serie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cnb_marca)))
                        .addComponent(txt_ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Usuario");

        txt_Usuario.setEditable(false);
        txt_Usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Usuario.setForeground(new java.awt.Color(0, 102, 0));
        txt_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_UsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_UsuarioKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Ubicación");

        cnb_ubicacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione 1" }));
        cnb_ubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnb_ubicacionActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Área");

        cnb_area.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione 1" }));
        cnb_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnb_areaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Estatus");

        cnb_estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione 1", "Asignado", "Reasignado", "Bueno", "Baja Definitiva", "Reparación", "Soporte Tecnico", "Renta" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnb_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cnb_area, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(cnb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cnb_ubicacion))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cnb_area, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(cnb_estado))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Observaciones");

        txt_observaciones.setColumns(20);
        txt_observaciones.setForeground(new java.awt.Color(0, 102, 0));
        txt_observaciones.setRows(5);
        txt_observaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_observacionesKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txt_observaciones);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Pemex/Renta");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Fecha");

        cnb_propiedad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione 1", "Pemex", "Rentado", "Prestado" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(116, 116, 116))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(cnb_propiedad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cnb_propiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_fondoLayout = new javax.swing.GroupLayout(pnl_fondo);
        pnl_fondo.setLayout(pnl_fondoLayout);
        pnl_fondoLayout.setHorizontalGroup(
            pnl_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnl_fondoLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(pnl_pie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_fondoLayout.setVerticalGroup(
            pnl_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_pie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnl_title.setBackground(new java.awt.Color(51, 51, 51));
        pnl_title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_titleMousePressed(evt);
            }
        });
        pnl_title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_titleMouseDragged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Control de los Bienes de Computo");

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

        javax.swing.GroupLayout pnl_titleLayout = new javax.swing.GroupLayout(pnl_title);
        pnl_title.setLayout(pnl_titleLayout);
        pnl_titleLayout.setHorizontalGroup(
            pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        pnl_titleLayout.setVerticalGroup(
            pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_titleLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane2.setAutoscrolls(true);

        jTABLE.addColumn("ID Registro");
        jTABLE.addColumn("Inventario");
        jTABLE.addColumn("Descriptivo");
        jTABLE.addColumn("Marca");
        jTABLE.addColumn("Modelo");
        jTABLE.addColumn("Serie");
        jTABLE.addColumn("Ficha");
        jTABLE.addColumn("Usuario");
        jTABLE.addColumn("Ubicacion");
        jTABLE.addColumn("Area");
        jTABLE.addColumn("Fecha");
        jTABLE.addColumn("Pemex/Renta");
        jTABLE.addColumn("Estatus");
        jTABLE.addColumn("Observaciones");
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable);
        cargarTabla();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        if (acceso > 3) {
            this.btn_save.setEnabled(false);
        }

        Combo_tipo(rscarga);
        Combo_marca(rscarga);
        Combo_U(rscarga);
        Combo_A(rscarga);

    }//GEN-LAST:event_formWindowOpened

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        
        if (acceso > 3) {
            Limpiar();
            this.btn_save.setEnabled(false);
        } else {
            Limpiar();
        }

    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

        SQLGenerado = (GS.eliminarBien(ctrl.ID));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Se ha eliminado con éxito de la Base de datos",
                    "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Limpiar();
            cargarTabla();

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "El Registro no existe en la Base de Datos"
                    + "\no ya fue eliminado con anterioridad.", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_modifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifiActionPerformed

        ctrl.Inventario = (this.txt_inventario.getText());
        ctrl.Tipo = (ctrl.cnd_idtipo);
        ctrl.Marca = (ctrl.cnd_idmarca);
        ctrl.Modelo = (this.txt_modelo.getText());
        ctrl.Serie = (this.txt_serie.getText());
        ctrl.Ficha = (Integer.parseInt(this.txt_ficha.getText()));

        ctrl.Ubicacion = (ctrl.cnd_idu);
        ctrl.Area = (ctrl.cnd_ida);
        ctrl.Fecha = new SimpleDateFormat("dd/MM/yyyy").format(calendar.getDate());
        ctrl.Propiedad = (this.cnb_propiedad.getSelectedItem().toString());
        ctrl.Estado = (this.cnb_estado.getSelectedItem().toString());

        ctrl.Observaciones = (this.txt_observaciones.getText());

        SQLGenerado = (GS.actualizarBien(ctrl.Inventario, ctrl.Tipo, ctrl.Marca, ctrl.Modelo, ctrl.Serie, ctrl.Ficha, ctrl.Ubicacion,
                ctrl.Area, ctrl.Fecha, ctrl.Propiedad, ctrl.Estado, ctrl.Observaciones));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Datos guardados correctamente ", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Limpiar();
            cargarTabla();

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Los datos no fueron guardados", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_modifiActionPerformed

    private void btn_back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back1ActionPerformed

        this.dispose();

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new principal().setVisible(true);
            }
        });

    }//GEN-LAST:event_btn_back1ActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        ctrl.Inventario = (this.txt_inventario.getText());
        ctrl.Tipo = (ctrl.cnd_idtipo);
        ctrl.Marca = (ctrl.cnd_idmarca);
        ctrl.Modelo = (this.txt_modelo.getText());
        ctrl.Serie = (this.txt_serie.getText());
        ctrl.Ficha = (Integer.parseInt(this.txt_ficha.getText()));

        ctrl.Ubicacion = (ctrl.cnd_idu);
        ctrl.Area = (ctrl.cnd_ida);
        ctrl.Fecha = new SimpleDateFormat("dd/MM/yyyy").format(calendar.getDate());
        ctrl.Propiedad = (this.cnb_propiedad.getSelectedItem().toString());
        ctrl.Estado = (this.cnb_estado.getSelectedItem().toString());

        ctrl.Observaciones = (this.txt_observaciones.getText());

        SQLGenerado = (GS.agregarBien(ctrl.Inventario, ctrl.Tipo, ctrl.Marca, ctrl.Modelo, ctrl.Serie, ctrl.Ficha, ctrl.Ubicacion,
                ctrl.Area, ctrl.Fecha, ctrl.Propiedad, ctrl.Estado, ctrl.Observaciones));

        rs = PD.Actualizar(SQLGenerado);

        if (rs == 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Datos guardados correctamente ", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Limpiar();
            cargarTabla();

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Los datos no fueron"
                    + " guardados", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_saveActionPerformed

    private void cnb_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnb_tipoActionPerformed

        ctrl.cnbtext = (this.cnb_tipo.getSelectedItem().toString());
        SQLGenerado = (GS.buscarTipoE(ctrl.cnbtext));
        rscarga = PD.Consultar(SQLGenerado);

        try {

            if (!"Seleccione 1".equals(ctrl.cnbtext)) {
                if (rscarga.next()) {

                    ctrl.cnd_idtipo = (Integer.parseInt(rscarga.getString("ID_tipo")));

                } else {

                    javax.swing.JOptionPane.showMessageDialog(null,
                            "Verifique que el Dato seleccionado se encuentra guardado en los catalogos.");
                }
            }

        } catch (SQLException | HeadlessException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage().toString());
        }

    }//GEN-LAST:event_cnb_tipoActionPerformed

    private void pnl_titleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_titleMouseDragged

        Point ubicacion = MouseInfo.getPointerInfo().getLocation();
        setLocation(ubicacion.x - x, ubicacion.y - y);

    }//GEN-LAST:event_pnl_titleMouseDragged

    private void pnl_titleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_titleMousePressed

        x = evt.getX();
        y = evt.getY();

    }//GEN-LAST:event_pnl_titleMousePressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        setExtendedState(log.CROSSHAIR_CURSOR);

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        this.dispose();

        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new principal().setVisible(true);
            }
        });

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked

        try {
            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("d/MM/yyyy");
            String fecha = jTable.getValueAt(jTable.getSelectedRow(), 10).toString();
            Date dato;
            dato = formatoDelTexto.parse(fecha);

            ctrl.ID = (Integer.parseInt(jTable.getValueAt(jTable.getSelectedRow(), 0).toString()));
            txt_inventario.setText(jTable.getValueAt(jTable.getSelectedRow(), 1).toString());
            cnb_tipo.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 2).toString());
            cnb_marca.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 3).toString());
            txt_modelo.setText(jTable.getValueAt(jTable.getSelectedRow(), 4).toString());
            txt_serie.setText(jTable.getValueAt(jTable.getSelectedRow(), 5).toString());
            txt_ficha.setText(jTable.getValueAt(jTable.getSelectedRow(), 6).toString());
            txt_Usuario.setText(jTable.getValueAt(jTable.getSelectedRow(), 7).toString());
            cnb_ubicacion.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 8).toString());
            cnb_area.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 9).toString());
            calendar.setDate(dato);
            cnb_propiedad.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 11).toString());
            cnb_estado.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 12).toString());

            txt_observaciones.setText(jTable.getValueAt(jTable.getSelectedRow(), 13).toString());

            if (acceso <= 1) {
                btn_save.setEnabled(false);
                btn_delete.setEnabled(true);
                btn_modifi.setEnabled(true);
            } else {
                if (acceso == 2) {
                    btn_save.setEnabled(false);
                    this.btn_modifi.setEnabled(true);
                } else {
                    if (acceso == 3) {
                        this.btn_save.setEnabled(false);
                    } else {
                        if (acceso == 4) {
                            this.btn_limpiar.setEnabled(true);
                        }
                    }
                }
            }

        } catch (ParseException ex) {
            Logger.getLogger(Venta_controlbienes.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jTableMouseClicked

    private void cnb_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnb_marcaActionPerformed

        ctrl.cnbtext = (this.cnb_marca.getSelectedItem().toString());

        SQLGenerado = (GS.buscarMarca(ctrl.cnbtext));

        rscarga = PD.Consultar(SQLGenerado);

        try {
            if (!"Seleccione 1".equals(ctrl.cnbtext)) {
                if (rscarga.next()) {

                    ctrl.cnd_idmarca = (Integer.parseInt(rscarga.getString("ID_marca")));

                } else {

                    javax.swing.JOptionPane.showMessageDialog(null,
                            "Verifique que el Dato seleccionado se encuentra guardado en los catalogos.");
                }
            }

        } catch (SQLException | HeadlessException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage().toString());
        }


    }//GEN-LAST:event_cnb_marcaActionPerformed

    private void cnb_ubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnb_ubicacionActionPerformed

        ctrl.cnbtext = (this.cnb_ubicacion.getSelectedItem().toString());

        SQLGenerado = (GS.buscarU(ctrl.cnbtext));

        rscarga = PD.Consultar(SQLGenerado);

        try {

            if (!"Seleccione 1".equals(ctrl.cnbtext)) {
                if (rscarga.next()) {

                    ctrl.cnd_idu = (Integer.parseInt(rscarga.getString("ID_U")));

                } else {

                    javax.swing.JOptionPane.showMessageDialog(null,
                            "Verifique que el Dato seleccionado se encuentra guardado en los catalogos.");
                }
            }

        } catch (SQLException | NumberFormatException | HeadlessException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage().toString());
        }

    }//GEN-LAST:event_cnb_ubicacionActionPerformed

    private void cnb_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnb_areaActionPerformed

        ctrl.cnbtext = (this.cnb_area.getSelectedItem().toString());

        SQLGenerado = (GS.buscarA(ctrl.cnbtext));

        rscarga = PD.Consultar(SQLGenerado);

        try {

            if (!"Seleccione 1".equals(ctrl.cnbtext)) {
                if (rscarga.next()) {

                    ctrl.cnd_ida = (Integer.parseInt(rscarga.getString("ID_A")));

                } else {

                    javax.swing.JOptionPane.showMessageDialog(null,
                            "Verifique que el Dato seleccionado se encuentra guardado en los catalogos.");
                }
            }

        } catch (SQLException | HeadlessException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage().toString());
        }

    }//GEN-LAST:event_cnb_areaActionPerformed

    private void txt_UsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_UsuarioKeyTyped

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

        if (txt_Usuario.getText().length() >= 50) {
            java.awt.Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_txt_UsuarioKeyTyped

    private void txt_fichaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fichaKeyTyped

        char car = evt.getKeyChar();
        if (txt_ficha.getText().length() >= 20) {
            java.awt.Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            java.awt.Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
            
    }//GEN-LAST:event_txt_fichaKeyTyped
       
    private void txt_inventarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_inventarioKeyTyped

        if (txt_inventario.getText().length() >= 20) {
            java.awt.Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_txt_inventarioKeyTyped

    private void txt_observacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_observacionesKeyTyped

        if (txt_observaciones.getText().length() >= 50) {
            java.awt.Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_observacionesKeyTyped

    private void txt_serieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_serieKeyReleased

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
        } else {
            txt_serie.setText(txt_serie.getText().toUpperCase());
        }

        jTABLE.setRowCount(0);
        try {
            rscarga = GS.tablaBienes(this.txt_serie.getText());
            while (rscarga.next()) {
                Object[] fila = new Object[14];
                for (int j = 0; j < 14; j++) {
                    fila[j] = rscarga.getObject(j + 1);
                }
                jTABLE.addRow(fila);
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_txt_serieKeyReleased

    private void txt_UsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_UsuarioKeyReleased


    }//GEN-LAST:event_txt_UsuarioKeyReleased

    private void txt_inventarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_inventarioKeyReleased

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
        } else {
            txt_inventario.setText(txt_inventario.getText().toUpperCase());
        }

    }//GEN-LAST:event_txt_inventarioKeyReleased

    private void txt_modeloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_modeloKeyReleased

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
        } else {
            txt_modelo.setText(txt_modelo.getText().toUpperCase());
        }

    }//GEN-LAST:event_txt_modeloKeyReleased
    
    private void txt_fichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fichaActionPerformed

        ctrl.Usuario = (this.txt_ficha.getText());
        SQLGenerado = (GS.buscarUsuario(ctrl.Usuario));
        rscarga = PD.Consultar(SQLGenerado);

        try {
            if (rscarga.next()) {

                this.txt_Usuario.setText(rscarga.getString("Usuario"));

            } else {

                javax.swing.JOptionPane.showMessageDialog(null,
                        "Verifique que esta Ficha este guardada en los catalagos.");
            }

        } catch (SQLException | HeadlessException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage().toString());
        }


    }//GEN-LAST:event_txt_fichaActionPerformed
  
    
    private void Combo_tipo(ResultSet rs) {
        try {
            rs = GS.comboTipo();
            while (rs.next()) {
                cnb_tipo.addItem(rs.getString("Tipo_equipo"));
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }

    private void Combo_marca(ResultSet rs) {
        try {
            rs = GS.comboMarca();
            while (rs.next()) {
                cnb_marca.addItem(rs.getString("Marca"));
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }

    private void Combo_U(ResultSet rs) {
        try {
            rs = GS.comboU();
            while (rs.next()) {

                cnb_ubicacion.addItem(rs.getString("Ubicacion"));
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }

    private void Combo_A(ResultSet rs) {
        try {
            rs = GS.comboA();
            while (rs.next()) {

                cnb_area.addItem(rs.getString("Area"));

            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }

    private void cargarTabla() {
        jTABLE.setRowCount(0);
        try {
            rscarga = GS.tablaBienes("");
            while (rscarga.next()) {
                Object[] fila = new Object[14];
                for (int j = 0; j < 14; j++) {
                    fila[j] = rscarga.getObject(j + 1);
                }
                jTABLE.addRow(fila);
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);

        }
    }

    private void Limpiar() {

        txt_Usuario.setText("");
        txt_ficha.setText("");
        txt_inventario.setText("");
        txt_modelo.setText("");
        txt_observaciones.setText("");
        txt_serie.setText("");

        cnb_tipo.setSelectedItem("Seleccione 1");
        cnb_marca.setSelectedItem("Seleccione 1");
        cnb_ubicacion.setSelectedItem("Seleccione 1");
        cnb_area.setSelectedItem("Seleccione 1");
        cnb_propiedad.setSelectedItem("Seleccione 1");
        cnb_estado.setSelectedItem("Seleccione 1");

        btn_save.setEnabled(true);
        btn_delete.setEnabled(false);
        btn_modifi.setEnabled(false);

        calendar.setDate(null);

        cargarTabla();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back1;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modifi;
    private javax.swing.JButton btn_save;
    private com.toedter.calendar.JDateChooser calendar;
    private javax.swing.JComboBox cnb_area;
    private javax.swing.JComboBox cnb_estado;
    private javax.swing.JComboBox cnb_marca;
    private javax.swing.JComboBox cnb_propiedad;
    private javax.swing.JComboBox cnb_tipo;
    private javax.swing.JComboBox cnb_ubicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JPanel pnl_fondo;
    private javax.swing.JPanel pnl_pie;
    private javax.swing.JPanel pnl_title;
    private javax.swing.JTextField txt_Usuario;
    private javax.swing.JTextField txt_ficha;
    public javax.swing.JTextField txt_inventario;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextArea txt_observaciones;
    private javax.swing.JTextField txt_serie;
    // End of variables declaration//GEN-END:variables
}

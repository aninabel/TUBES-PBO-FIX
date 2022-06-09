/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasprak;
import java.awt.HeadlessException;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class layer4 extends javax.swing.JFrame {

    koneksi k;
     Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    public layer4() {
        initComponents();
        setLocation(300, 130);
        tampil_diskon();
         k = new koneksi();
        
    
    koneksi db = new koneksi();


    }

    public void tampil_diskon(){
        try {
            String sql = "select * From diskon";
             Connection con = koneksi.koneksiDB();
                PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
                cbdiskon.addItem(rs.getString("tampilan"));
            } 
            
            rs.last();
            int jd = rs.getRow();
            rs.first();
            
        } catch (Exception e) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btadminlayer1 = new javax.swing.JButton();
        btpembelilayer1 = new javax.swing.JButton();
        btpembelilayer2 = new javax.swing.JButton();
        bt_total = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        no_meja = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nama_pemesan = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        menu_minuman = new javax.swing.JComboBox<>();
        harga2a = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        harga1a = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        menu_makanan = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbdiskon = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jPanel5.setBackground(new java.awt.Color(255, 102, 0));
        jPanel5.setAlignmentX(0.0F);
        jPanel5.setAlignmentY(0.0F);

        jLabel5.setBackground(new java.awt.Color(255, 204, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HUNGRY HEROES");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btadminlayer1.setBackground(new java.awt.Color(153, 102, 0));
        btadminlayer1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btadminlayer1.setForeground(new java.awt.Color(255, 255, 255));
        btadminlayer1.setText("ADMIIN");
        btadminlayer1.setBorder(null);
        btadminlayer1.setBorderPainted(false);
        btadminlayer1.setContentAreaFilled(false);
        btadminlayer1.setDisplayedMnemonicIndex(0);
        btadminlayer1.setFocusPainted(false);
        btadminlayer1.setFocusable(false);
        btadminlayer1.setPreferredSize(new java.awt.Dimension(172, 21));
        btadminlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btadminlayer1ActionPerformed(evt);
            }
        });

        btpembelilayer1.setBackground(new java.awt.Color(153, 102, 0));
        btpembelilayer1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btpembelilayer1.setForeground(new java.awt.Color(255, 255, 255));
        btpembelilayer1.setText("PEMBELI");
        btpembelilayer1.setBorder(null);
        btpembelilayer1.setBorderPainted(false);
        btpembelilayer1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btpembelilayer1.setDisplayedMnemonicIndex(0);
        btpembelilayer1.setFocusPainted(false);
        btpembelilayer1.setFocusable(false);
        btpembelilayer1.setPreferredSize(new java.awt.Dimension(172, 21));
        btpembelilayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpembelilayer1ActionPerformed(evt);
            }
        });

        btpembelilayer2.setBackground(new java.awt.Color(204, 153, 0));
        btpembelilayer2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btpembelilayer2.setForeground(new java.awt.Color(255, 255, 255));
        btpembelilayer2.setText("DISKON");
        btpembelilayer2.setBorder(null);
        btpembelilayer2.setBorderPainted(false);
        btpembelilayer2.setContentAreaFilled(false);
        btpembelilayer2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btpembelilayer2.setDefaultCapable(false);
        btpembelilayer2.setFocusPainted(false);
        btpembelilayer2.setFocusable(false);
        btpembelilayer2.setPreferredSize(new java.awt.Dimension(172, 21));
        btpembelilayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpembelilayer2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btadminlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btpembelilayer1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btpembelilayer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btadminlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btpembelilayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btpembelilayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_total.setBackground(new java.awt.Color(153, 0, 0));
        bt_total.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        bt_total.setForeground(new java.awt.Color(255, 255, 255));
        bt_total.setText("TOTAL");
        bt_total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_totalMouseClicked(evt);
            }
        });
        bt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_totalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NO MEJA");

        no_meja.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        no_meja.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NAMA PEMESAN");

        nama_pemesan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nama_pemesan.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        total.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 153, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ORDER");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        menu_minuman.setBackground(new java.awt.Color(204, 204, 0));
        menu_minuman.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menu_minuman.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PIILIH MENU MINUMAN -", "Es Teh ", "Teh Panas ", "Kopi ", "Jus Sirsak ", "Jus Cabe ", "Air Putih " }));
        menu_minuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_minumanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menu_minuman, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu_minuman, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        harga2a.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        harga2a.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        harga2a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harga2aActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HARGA");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HARGA");

        harga1a.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        harga1a.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        harga1a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harga1aActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));

        menu_makanan.setBackground(new java.awt.Color(204, 204, 0));
        menu_makanan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menu_makanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PIILIH MENU MAKANAN -", "Nasi Pecel ", "Nasi Goreng ", "Bakmi ", "Nasi Uduk ", "Paket hemat ", "KFC mcdonal ", "Nasi kuning " }));
        menu_makanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_makananActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(menu_makanan, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu_makanan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 153, 0));
        jPanel6.setAlignmentX(0.0F);
        jPanel6.setAlignmentY(0.0F);

        jLabel6.setBackground(new java.awt.Color(204, 153, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PESAN SEKARANG");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        cbdiskon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbdiskon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----PILIH DISKON----" }));
        cbdiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdiskonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PILIH DISKON");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(harga2a, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(harga1a, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nama_pemesan)
                                    .addComponent(total)
                                    .addComponent(cbdiskon, javax.swing.GroupLayout.Alignment.TRAILING, 0, 154, Short.MAX_VALUE))
                                .addGap(47, 47, 47))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(bt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel2))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(no_meja, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel7)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(harga1a, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(harga2a, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(no_meja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nama_pemesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbdiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String sql ="insert into pesan values('"+menu_makanan.getSelectedItem().toString()+"',"
            + "'"+menu_minuman.getSelectedItem().toString()+"',"
            + "'"+no_meja.getText()+"',"
            + "'"+nama_pemesan.getText()+"',"
            + "'"+total.getText()+"')";
            Connection con = koneksi.koneksiDB();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "berhasil di order");
            menu_makanan.setSelectedIndex(0);
            menu_minuman.setSelectedIndex(0);
            no_meja.setText("");
            nama_pemesan.setText("");
            total.setText("");
            tampil_diskon();
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menu_makananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_makananActionPerformed
        int harga1;
        if (menu_makanan.getSelectedItem() == "Nasi Pecel "){
            harga1 = 10000;
        }else if(menu_makanan.getSelectedItem() == "Nasi Goreng "){
            harga1 = 11000;
        }else if(menu_makanan.getSelectedItem() == "Bakmi "){
            harga1 = 8000;
        }else if(menu_makanan.getSelectedItem() == "Nasi Uduk "){
            harga1 = 6000;
        }else if(menu_makanan.getSelectedItem() == "Paket hemat "){
            harga1 = 9000;
        }else if(menu_makanan.getSelectedItem() == "KFC mcdonal "){
            harga1 = 15000;
        }else if(menu_makanan.getSelectedItem() == "Nasi kuning "){
            harga1 = 15000;
        }else{
            harga1 = 0;
        }
        this.harga1a.setText(String.valueOf(harga1));
    }//GEN-LAST:event_menu_makananActionPerformed

    private void menu_minumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_minumanActionPerformed
        int harga2 = 0;
        int nilai;
        if (menu_minuman.getSelectedItem() == "Es Teh "){
            nilai = 1;
        }else if(menu_minuman.getSelectedItem() == "Teh Panas "){
            nilai = 2;
        }else if(menu_minuman.getSelectedItem() == "Kopi "){
            nilai = 3;
        }else if(menu_minuman.getSelectedItem() == "Jus Sirsak "){
            nilai = 4;
        }else if(menu_minuman.getSelectedItem() == "Jus Cabe "){
            nilai = 5;
        }else if(menu_minuman.getSelectedItem() == "Air Putih "){
            nilai = 6;
        }else{
            nilai = 7;
        }
         switch (nilai){
            case 1:
                harga2 = 3000;

                break;
            case 2:
                harga2 = 2000;

                break;
            case 3:
                harga2 = 5000;

                break;
            case 4:
                harga2 = 3000;

                break;
            case 5:
                harga2 = 12000;

                break;
            case 6:
                harga2 = 1000;

                break;
            case 7:
                harga2 = 0;

                break;
        }
        this.harga2a.setText(String.valueOf(harga2));
    }//GEN-LAST:event_menu_minumanActionPerformed

    private void harga1aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harga1aActionPerformed
//        int a = Integer.parseInt(harga1a.getText()) + Integer.parseInt(harga2a.getText());
//       this.total.setText(String.valueOf(a));
    }//GEN-LAST:event_harga1aActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed


    }//GEN-LAST:event_totalActionPerformed

    private void harga2aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harga2aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_harga2aActionPerformed

    private void bt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_totalActionPerformed
       try {
           String sql = "select * From diskon where tampilan= '" + cbdiskon + "'";
           Connection con = koneksi.koneksiDB();
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();

           while (rs.next()) {
               double a = Integer.parseInt(harga1a.getText()) + Integer.parseInt(harga2a.getText());
               double b = Double.parseDouble(rs.getString("jumlahdiskon"));
               double c = 0;
               this.total.setText(String.valueOf(c));
           }
        } catch (Exception e) {
        }
                                       
    }//GEN-LAST:event_bt_totalActionPerformed

    private void bt_totalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_totalMouseClicked
        //int a = Integer.parseInt(harga1a.getText()) + Integer.parseInt(harga2a.getText());
      //this.total.setText(String.valueOf(a));
       try {
           String sql = "select * From diskon where tampilan= '" + cbdiskon.getSelectedItem().toString() + "'";
           Connection con = koneksi.koneksiDB();
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();

           while (rs.next()) {
               double a = Integer.parseInt(harga1a.getText()) + Integer.parseInt(harga2a.getText());
               double b = Double.parseDouble(rs.getString("jumlahdiskon"));
               double c = a * b;
               this.total.setText(String.valueOf(c));
               
           }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_totalMouseClicked

    private void btadminlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btadminlayer1ActionPerformed
        layer2 pindah1 = new layer2();
        pindah1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btadminlayer1ActionPerformed

    private void btpembelilayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpembelilayer1ActionPerformed
        layer4 pindah3 = new layer4();
        pindah3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btpembelilayer1ActionPerformed

    private void btpembelilayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpembelilayer2ActionPerformed
        layer5 pindah4 = new layer5();
        pindah4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btpembelilayer2ActionPerformed

    private void cbdiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbdiskonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(layer4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(layer4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(layer4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(layer4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new layer4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_total;
    private javax.swing.JButton btadminlayer1;
    private javax.swing.JButton btpembelilayer1;
    private javax.swing.JButton btpembelilayer2;
    private javax.swing.JComboBox<String> cbdiskon;
    private javax.swing.JTextField harga1a;
    private javax.swing.JTextField harga2a;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JComboBox<String> menu_makanan;
    private javax.swing.JComboBox<String> menu_minuman;
    private javax.swing.JTextField nama_pemesan;
    private javax.swing.JTextField no_meja;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClientCtr;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Student;

/**
 *
 * @author ADMIN
 */
public class AddStudents extends javax.swing.JFrame implements ActionListener {

    DefaultTableModel tblModel;

    public AddStudents() {
        initComponents();
        setLocationRelativeTo(null);
        btnThem.addActionListener(this);
        btnReload.addActionListener(this);
        btnThoat.addActionListener(this);
        initTable();
        loadInfoSinhVien();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnReload = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        txtMSSV = new javax.swing.JTextField();
        txtDiemToan = new javax.swing.JTextField();
        txtDiemLy = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtDiemHoa = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSV = new javax.swing.JTable();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Nhập Thông Tin Sinh Viên");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Điểm Hóa:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("MSSV: ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Họ Tên: ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Điểm Toán: ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Điểm Lý: ");

        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(51, 51, 51));
        btnThem.setText("Thêm mới");

        btnReload.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnReload.setForeground(new java.awt.Color(51, 51, 51));
        btnReload.setText("Tải lại");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(51, 51, 51));
        btnThoat.setText("Thoát");

        txtMSSV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMSSV.setForeground(new java.awt.Color(0, 51, 51));

        txtDiemToan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDiemToan.setForeground(new java.awt.Color(0, 51, 51));

        txtDiemLy.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDiemLy.setForeground(new java.awt.Color(0, 51, 51));

        txtHoTen.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtHoTen.setForeground(new java.awt.Color(0, 51, 51));

        txtDiemHoa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDiemHoa.setForeground(new java.awt.Color(0, 51, 51));

        tblSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSV);

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(51, 51, 51));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(51, 51, 51));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiemLy, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiemToan, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMSSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiemHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThem)
                                .addGap(36, 36, 36)
                                .addComponent(btnReload)
                                .addGap(39, 39, 39)
                                .addComponent(btnThoat)
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(btnXoa)
                                .addGap(33, 33, 33)
                                .addComponent(btnSua)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDiemToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDiemLy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDiemHoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem)
                            .addComponent(btnThoat))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSua)
                            .addComponent(btnXoa))
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        txtDiemHoa.setText("");
        txtDiemLy.setText("");
        txtDiemToan.setText("");
        txtHoTen.setText("");
        txtMSSV.setText("");
        loadInfoSinhVien();
    }//GEN-LAST:event_btnReloadActionPerformed

    private void tblSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSVMouseClicked
        int row = tblSV.getSelectedRow();
        if (row >= 0) {
            txtMSSV.setText(tblSV.getValueAt(row, 0).toString());
            txtHoTen.setText(tblSV.getValueAt(row, 1).toString());
            txtDiemToan.setText(tblSV.getValueAt(row, 2).toString());
            txtDiemLy.setText(tblSV.getValueAt(row, 3).toString());
            txtDiemHoa.setText(tblSV.getValueAt(row, 4).toString());
        }
    }//GEN-LAST:event_tblSVMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Do you want to update?")==JOptionPane.NO_OPTION) {
            return;
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connect = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DoAnLMT;user=sa;password=123");
            String sql = "UPDATE SINH_VIEN set hoTen=?, diemToan=?,diemLy=?, diemHoa=? where mSSV = ?";
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(5, txtMSSV.getText());
            ps.setString(1, txtHoTen.getText());
            ps.setFloat(2, Float.parseFloat(txtDiemToan.getText()));
            ps.setFloat(3, Float.parseFloat(txtDiemLy.getText()));
            ps.setFloat(4, Float.parseFloat(txtDiemHoa.getText()));
            ps.executeUpdate();
            btnReloadActionPerformed(evt);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
            ps.close();
            connect.close();
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
       if (JOptionPane.showConfirmDialog(this, "Do you want to delete?")==JOptionPane.NO_OPTION) {
            return;
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connect = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DoAnLMT;user=sa;password=123");
            String sql = "delete from SINH_VIEN where mSSV = ?";
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, txtMSSV.getText());
            ps.executeUpdate();
   
            btnReloadActionPerformed(evt);
            JOptionPane.showMessageDialog(this, "Xóa thành công!");
            ps.close();
            connect.close();
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReload;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblSV;
    private javax.swing.JTextField txtDiemHoa;
    private javax.swing.JTextField txtDiemLy;
    private javax.swing.JTextField txtDiemToan;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMSSV;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnThem)) {
            btnThem_Click();
        } 
    }

    public void btnThem_Click() {
        try {
            Student sv = new Student();
            if (txtMSSV.getText().length() != 0 && txtHoTen.getText().length() != 0 && txtDiemHoa.getText().length() != 0 && txtDiemLy.getText().length() != 0 && txtDiemToan.getText().length() != 0) {
                sv.setMssv(txtMSSV.getText());
                sv.setHoTen(txtHoTen.getText());
                float diemToan = Float.parseFloat(txtDiemToan.getText());
                float diemHoa = Float.parseFloat(txtDiemHoa.getText());
                float diemLy = Float.parseFloat(txtDiemLy.getText());

                if (diemHoa < 0.0 || diemLy < 0.0 || diemToan < 0.0 || diemHoa > 10.0 || diemLy > 10 || diemToan > 10.0) {
                    JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập 0 <= điểm <= 10");
                    return;
                }

                if (txtDiemHoa.getText().equals("")) {
                    sv.setDiemHoa(0f);
                }
                if (txtDiemLy.getText().equals("")) {
                    sv.setDiemLy(0f);
                }
                if (txtDiemToan.getText().equals("")) {
                    sv.setDiemToan(0f);
                } else {
                    sv.setDiemToan(Float.parseFloat(txtDiemToan.getText()));
                    sv.setDiemLy(Float.parseFloat(txtDiemLy.getText()));
                    sv.setDiemHoa(Float.parseFloat(txtDiemHoa.getText()));
                }
                ClientCtr ctr = new ClientCtr();
                ctr.OpenSocket();
                ctr.sendStudent(sv);
                String res = ctr.getResult();
                if (res.equals("OK")) {
                    JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
                    loadInfoSinhVien();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Không thể thêm!");
                }
                ctr.closeConnection();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ thông tin!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Không thể thêm!");
            e.printStackTrace();
        }
    }


    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"mSSV", "hoTen", "diemToan", "diemLy", "diemHoa"});
        tblSV.setModel(tblModel);
    }

    private void loadInfoSinhVien() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connect = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DoAnLMT;user=sa;password=123");

            String sql = "select * from SINH_VIEN";
            PreparedStatement p = connect.prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            tblModel.setRowCount(0);
            while (rs.next()) {
                String[] row = new String[]{
                    rs.getString("mSSV"), rs.getString("hoTen"), rs.getString("diemToan"), rs.getString("diemLy"), rs.getString("diemHoa")

                };
                tblModel.addRow(row);
            }
            tblModel.fireTableDataChanged();
            rs.close();
            p.close();
            connect.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }

    public void btnThoat_Click() {
        System.exit(0);
    }

}

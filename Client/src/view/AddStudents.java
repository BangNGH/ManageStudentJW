/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClientCtr;
import controller.ClientCtr;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
        ProcessCTR(false);
    }

    public void ProcessCTR(boolean b) {

        this.btnXoa.setEnabled(b);
        this.btnSua.setEnabled(b);
        this.txtMSSV.getFocusListeners();

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
        txtMaLop = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

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
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

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
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

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

        txtMaLop.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMaLop.setForeground(new java.awt.Color(0, 51, 51));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Mã Lớp:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(txtDiemHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(47, 47, 47)
                                .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnXoa)
                            .addComponent(btnThem))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReload)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnSua)))
                        .addGap(44, 44, 44)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnThoat)
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
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
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSua)
                            .addComponent(btnXoa))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThoat)
                        .addGap(32, 32, 32))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        txtDiemHoa.setText("");
        txtDiemLy.setText("");
        txtDiemToan.setText("");
        txtHoTen.setText("");
        txtMSSV.setText("");
        txtMaLop.setText("");
        this.btnThem.setEnabled(true);
        ProcessCTR(false);

        loadInfoSinhVien();
    }//GEN-LAST:event_btnReloadActionPerformed

    private void tblSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSVMouseClicked
        ProcessCTR(true);
        this.btnThem.setEnabled(false);
        int row = tblSV.getSelectedRow();
        if (row >= 0) {
            txtMSSV.setText(tblSV.getValueAt(row, 0).toString());
            txtHoTen.setText(tblSV.getValueAt(row, 1).toString());
            txtDiemToan.setText(tblSV.getValueAt(row, 3).toString());
            txtDiemLy.setText(tblSV.getValueAt(row, 4).toString());
            txtDiemHoa.setText(tblSV.getValueAt(row, 5).toString());
            txtMaLop.setText(tblSV.getValueAt(row, 2).toString());
        }
    }//GEN-LAST:event_tblSVMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connect = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV;user=sa;password=123");
            String sql = "UPDATE SINH_VIEN set hoTen=?, diemToan=?,diemLy=?, diemHoa=?, maLop =? where mSSV = ?";
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(6, txtMSSV.getText().trim());
            ps.setString(1, txtHoTen.getText().trim());
            ps.setFloat(2, Float.parseFloat(txtDiemToan.getText().trim()));
            ps.setFloat(3, Float.parseFloat(txtDiemLy.getText().trim()));
            ps.setFloat(4, Float.parseFloat(txtDiemHoa.getText().trim()));
            ps.setString(5, txtMaLop.getText().trim());
            ps.executeUpdate();
            btnReloadActionPerformed(evt);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
            ProcessCTR(false);
            ps.close();
            connect.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Xác nhận xóa sinh viên này?") == 0) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connect = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV;user=sa;password=123");
                String sql = "delete from SINH_VIEN where mSSV = ?";
                PreparedStatement ps = connect.prepareStatement(sql);
                ps.setString(1, txtMSSV.getText().trim());
                ps.executeUpdate();

                btnReloadActionPerformed(evt);
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
                ProcessCTR(false);
                ps.close();
                connect.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            btnReloadActionPerformed(evt);
            return;
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

    }//GEN-LAST:event_btnThemActionPerformed

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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblSV;
    private javax.swing.JTextField txtDiemHoa;
    private javax.swing.JTextField txtDiemLy;
    private javax.swing.JTextField txtDiemToan;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtMaLop;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"MSSV", "Họ Tên", "Mã lớp", "Điểm Toán", "Điểm Lý", "Điểm Hóa", "Điểm TB"});
        tblSV.setModel(tblModel);
    }

    private void loadInfoSinhVien() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connect = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV;user=sa;password=123");

            String sql = "select * from SINH_VIEN";
            PreparedStatement p = connect.prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            tblModel.setRowCount(0);
            while (rs.next()) {
                float dtb = (rs.getFloat("diemToan") + rs.getFloat("diemLy") + rs.getFloat("diemHoa")) / 3;
                //
                String[] row = new String[]{
                    rs.getString("mSSV".trim()), rs.getString("hoTen").trim(), rs.getString("maLop").trim(), rs.getString("diemToan").trim(), rs.getString("diemLy").trim(), rs.getString("diemHoa").trim(), String.valueOf(dtb)

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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnThem)) {
            btnThem_Click();
        }
    }

    private void btnThem_Click() {
        try {
            Student sv = new Student();
            if (txtMSSV.getText().length() != 0 && txtHoTen.getText().length() != 0 && txtDiemHoa.getText().length() != 0 && txtDiemLy.getText().length() != 0 && txtDiemToan.getText().length() != 0 && txtMaLop.getText().length() != 0) {
                sv.setMssv(txtMSSV.getText());
                sv.setHoTen(txtHoTen.getText());
                float diemToan = Float.parseFloat(txtDiemToan.getText().trim());
                float diemHoa = Float.parseFloat(txtDiemHoa.getText().trim());
                float diemLy = Float.parseFloat(txtDiemLy.getText().trim());
                sv.setMaLop(txtMaLop.getText());

                if (diemHoa < 0.0 || diemLy < 0.0 || diemToan < 0.0 || diemHoa > 10.0 || diemLy > 10 || diemToan > 10.0) {
                    JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập 0 <= điểm <= 10");
                    return;
                } else {
                    sv.setDiemToan(Float.parseFloat(txtDiemToan.getText().trim()));
                    sv.setDiemLy(Float.parseFloat(txtDiemLy.getText().trim()));
                    sv.setDiemHoa(Float.parseFloat(txtDiemHoa.getText().trim()));
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

}

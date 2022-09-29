/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClientCtr;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Student;

/**
 *
 * @author ADMIN
 */
public class AddStudents extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form AddStudents
     */
    public AddStudents() {
        initComponents();
        setLocationRelativeTo(null);
        btnThem.addActionListener(this);
        btnKhongLuu.addActionListener(this);
        btnThoat.addActionListener(this);

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
        btnKhongLuu = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        txtMSSV = new javax.swing.JTextField();
        txtDiemToan = new javax.swing.JTextField();
        txtDiemLy = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtDiemHoa = new javax.swing.JTextField();

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

        btnKhongLuu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnKhongLuu.setForeground(new java.awt.Color(51, 51, 51));
        btnKhongLuu.setText("Không Lưu");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnThem)
                        .addGap(40, 40, 40)
                        .addComponent(btnKhongLuu)
                        .addGap(40, 40, 40)
                        .addComponent(btnThoat)
                        .addGap(42, 42, 42))
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
                            .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiemHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(109, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKhongLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem)
                    .addComponent(btnThoat))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton btnKhongLuu;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
        } else if (e.getSource().equals(btnThoat)) {
            btnThoat_Click();
        } else {
            btnKhongLuu_Click();
        }
    }

    public void btnThem_Click() {
        try {
            Student sv = new Student();
            if (txtMSSV.getText().length() != 0 && txtHoTen.getText().length() != 0 && txtDiemHoa.getText().length() != 0 && txtDiemLy.getText().length() != 0 && txtDiemToan.getText().length() != 0) {
                sv.setMssv(txtMSSV.getText());
                sv.setHoTen(txtHoTen.getText());
                int diemToan = Integer.parseInt(txtDiemToan.getText());
                int diemHoa = Integer.parseInt(txtDiemHoa.getText());
                int diemLy = Integer.parseInt(txtDiemLy.getText());

                if (diemHoa < 0 || diemLy < 0 || diemToan < 0 || diemHoa > 10 || diemLy > 10 || diemToan > 10) {
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

    public void btnKhongLuu_Click() {
        
        txtDiemHoa.setText("");
        txtDiemLy.setText("");
        txtDiemToan.setText("");
        txtHoTen.setText("");
        txtMSSV.setText("");
    }

    public void btnThoat_Click() {
        System.exit(0);
    }

}

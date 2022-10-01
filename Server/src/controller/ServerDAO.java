/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Student;

/**
 *
 * @author ADMIN
 */
public class ServerDAO {
    private static Connection connect = null;

    public ServerDAO() {
         try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
           connect = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV;user=sa;password=123");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    public boolean ThemSinhVien(Student s) {
        String sql = "INSERT INTO SINH_VIEN(mSSV, hoTen, diemToan, diemLy, diemHoa, maLop) values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, s.getMssv().trim());
            ps.setString(2, s.getHoTen().trim());
            ps.setFloat(3, s.getDiemToan());
            ps.setFloat(4, s.getDiemLy());
            ps.setFloat(5, s.getDiemHoa());
            ps.setString(6, s.getMaLop());
            ps.executeUpdate();
           
           //ps.close();
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
     return false;   
    }

}

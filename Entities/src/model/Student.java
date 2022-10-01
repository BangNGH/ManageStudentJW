/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class Student implements Serializable{
    private String mssv;
    private String hoTen;
    private Float diemToan;
    private Float diemLy;
    private Float diemHoa;
    private String maLop;

    public Student(String mssv, String hoTen, Float diemToan, Float diemLy, Float diemHoa, String maLop) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.maLop = maLop;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }
    public Student() {
    }


    public String getMssv() {
        return mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Float getDiemToan() {
        return diemToan;
    }

    public Float getDiemLy() {
        return diemLy;
    }

    public Float getDiemHoa() {
        return diemHoa;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiemToan(Float diemToan) {
        this.diemToan = diemToan;
    }

    public void setDiemLy(Float diemLy) {
        this.diemLy = diemLy;
    }

    public void setDiemHoa(Float diemHoa) {
        this.diemHoa = diemHoa;
    }



    
    
}

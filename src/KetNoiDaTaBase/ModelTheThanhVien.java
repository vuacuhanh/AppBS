/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KetNoiDaTaBase;

/**
 *
 * @author anhng
 */
public class ModelTheThanhVien {
    private String MaThanhVien;
    private String HoTen;
    private String Email;
    private String DiaChi;
    private int SoDT;

    public ModelTheThanhVien() {
    }

    public ModelTheThanhVien(String MaThanhVien, String HoTen, String Email, String DiaChi, int SoDT) {
        this.MaThanhVien = MaThanhVien;
        this.HoTen = HoTen;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.SoDT = SoDT;
    }

    public String getMaThanhVien() {
        return MaThanhVien;
    }

    public void setMaThanhVien(String MaThanhVien) {
        this.MaThanhVien = MaThanhVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getSoDT() {
        return SoDT;
    }

    public void setSoDT(int SoDT) {
        this.SoDT = SoDT;
    }
    
}

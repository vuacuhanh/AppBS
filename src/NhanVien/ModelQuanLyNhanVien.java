/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

import java.util.Date;

/**
 *
 * @author anhng
 */
public class ModelQuanLyNhanVien {
    private String MaNhanVien;
    private String HoTen;
    private String GioiTinh;
    private String ChucVu;
    private String SoDT;
    private String Email;
    private Date NgaySinh;
    private String DiaChi;
    private String MaQuyen;
    private String Luong;

    public ModelQuanLyNhanVien() {
    }

    public ModelQuanLyNhanVien(String MaNhanVien, String HoTen, String GioiTinh, String ChucVu, String SoDT, String Email, Date NgaySinh, String DiaChi, String MaQuyen, String Luong) {
        this.MaNhanVien = MaNhanVien;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.ChucVu = ChucVu;
        this.SoDT = SoDT;
        this.Email = Email;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.MaQuyen = MaQuyen;
        this.Luong = Luong;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getMaQuyen() {
        return MaQuyen;
    }

    public void setMaQuyen(String MaQuyen) {
        this.MaQuyen = MaQuyen;
    }

    public String getLuong() {
        return Luong;
    }

    public void setLuong(String Luong) {
        this.Luong = Luong;
    }

    
    
    
}

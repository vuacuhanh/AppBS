/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KetNoiDaTaBase;

/**
 *
 * @author anhng
 */
public class ModelNhaXuatBan {
    private String MaNXB;
    private String TenNhaXuatBan;
    private String DiaChi;
    private int SoDT;

    public ModelNhaXuatBan() {
    }

    public ModelNhaXuatBan(String MaNXB, String TenNhaXuatBan, String DiaChi, int SoDT) {
        this.MaNXB = MaNXB;
        this.TenNhaXuatBan = TenNhaXuatBan;
        this.DiaChi = DiaChi;
        this.SoDT = SoDT;
    }

    public String getMaNXB() {
        return MaNXB;
    }

    public void setMaNXB(String MaNXB) {
        this.MaNXB = MaNXB;
    }

    public String getTenNhaXuatBan() {
        return TenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String TenNhaXuatBan) {
        this.TenNhaXuatBan = TenNhaXuatBan;
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

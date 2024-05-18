/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoaDon;

/**
 *
 * @author anhng
 */
public class ModelChiTietHoaDon {
    private String MaChiTietHD;
    private String MaHoaDon;
    private String MaSach;
    private int SoLuong;
    private float DonGia;

    public ModelChiTietHoaDon() {
    }

    public ModelChiTietHoaDon(String MaChiTietHD, String MaHoaDon, String MaSach, int SoLuong, float DonGia) {
        this.MaChiTietHD = MaChiTietHD;
        this.MaHoaDon = MaHoaDon;
        this.MaSach = MaSach;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public String getMaChiTietHD() {
        return MaChiTietHD;
    }

    public void setMaChiTietHD(String MaChiTietHD) {
        this.MaChiTietHD = MaChiTietHD;
    }

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }
    
}

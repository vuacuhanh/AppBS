/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoaDon;

import java.util.Date;

/**
 *
 * @author anhng
 */
public class ModelHoaDon {
    private String MaHoaDon;
    private Date NgayTao;
    private float TongTien;
    private String MaThanhVien;
    private String MaVoucher;

    public ModelHoaDon() {
    }

    public ModelHoaDon(String MaHoaDon, Date NgayTao, float TongTien, String MaThanhVien, String MaVoucher) {
        this.MaHoaDon = MaHoaDon;
        this.NgayTao = NgayTao;
        this.TongTien = TongTien;
        this.MaThanhVien = MaThanhVien;
        this.MaVoucher = MaVoucher;
    }

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float TongTien) {
        this.TongTien = TongTien;
    }

    public String getMaThanhVien() {
        return MaThanhVien;
    }

    public void setMaThanhVien(String MaThanhVien) {
        this.MaThanhVien = MaThanhVien;
    }

    public String getMaVoucher() {
        return MaVoucher;
    }

    public void setMaVoucher(String MaVoucher) {
        this.MaVoucher = MaVoucher;
    }
    
}

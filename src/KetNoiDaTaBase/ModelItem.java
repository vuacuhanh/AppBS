/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KetNoiDaTaBase;

import javax.swing.Icon;

/**
 *
 * @author User
 */
public class ModelItem {
    private String MaSach;
    private String TenSach;
    private String TacGia;
    private float GiaBan;
    private int SoLuongTon;
    private String MaTheLoai;
    private String MaNXB;
    private Icon HinhAnh;
    
    public ModelItem() {
    }

    public ModelItem(String MaSach, String TenSach, String TacGia, float GiaBan, int SoLuongTon, String MaTheLoai, String MaNXB, Icon HinhAnh) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.TacGia = TacGia;
        this.GiaBan = GiaBan;
        this.SoLuongTon = SoLuongTon;
        this.MaTheLoai = MaTheLoai;
        this.MaNXB = MaNXB;
        this.HinhAnh = HinhAnh;
    }
    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public float getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(float GiaBan) {
        this.GiaBan = GiaBan;
    }

    public int getSoLuongTon() {
        return SoLuongTon;
    }

    public void setSoLuongTon(int SoLuongTon) {
        this.SoLuongTon = SoLuongTon;
    }

    public String getMaTheLoai() {
        return MaTheLoai;
    }

    public void setMaTheLoai(String MaTheLoai) {
        this.MaTheLoai = MaTheLoai;
    }

    public String getMaNXB() {
        return MaNXB;
    }

    public void setMaNXB(String MaNXB) {
        this.MaNXB = MaNXB;
    }

    public Icon getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(Icon HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

     
}

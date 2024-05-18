/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

/**
 *
 * @author anhng
 */
public class ModelTaiKhoan {
    private String MaTaiKhoan;
    private String TenDangNhap;
    private String MatKhau;
    private String MaQuyen;

    public ModelTaiKhoan() {
    }

    public ModelTaiKhoan(String MaTaiKhoan, String TenDangNhap, String MatKhau, String MaQuyen) {
        this.MaTaiKhoan = MaTaiKhoan;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.MaQuyen = MaQuyen;
    }

    public String getMaTaiKhoan() {
        return MaTaiKhoan;
    }

    public void setMaTaiKhoan(String MaTaiKhoan) {
        this.MaTaiKhoan = MaTaiKhoan;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getMaQuyen() {
        return MaQuyen;
    }

    public void setMaQuyen(String MaQuyen) {
        this.MaQuyen = MaQuyen;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import KetNoiDaTaBase.KetNoi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginModify {

    public ModelTaiKhoan login(String tdn, String mk) {
        String sql = "SELECT * FROM TAIKHOAN WHERE TenDangNhap = ? AND MatKhau = ?";
        try (
            Connection connection = new KetNoi().getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
        ) {
            ps.setString(1, tdn);
            ps.setString(2, mk);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ModelTaiKhoan tk = new ModelTaiKhoan();
                tk.setMaTaiKhoan(rs.getString("MaTaiKhoan"));
                tk.setTenDangNhap(rs.getString("TenDangNhap"));
                tk.setMatKhau(rs.getString("MatKhau"));
                tk.setMaQuyen(rs.getString("MaQuyen"));
                return tk;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}


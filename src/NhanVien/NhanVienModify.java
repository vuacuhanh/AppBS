/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

/**
 *
 * @author anhng
 */
import KetNoiDaTaBase.KetNoi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhanVienModify {

    // Phương thức để thêm nhân viên mới
    public static boolean insert(ModelQuanLyNhanVien nv) throws Exception {
        String sql = "INSERT INTO QUANLYNHANVIEN (MaNhanVien, HoTen, ChucVu, SoDT, Email, NgaySinh, DiaChi, MaQuyen, Luong) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (
            Connection connection = new KetNoi().getKetNoi();
            PreparedStatement ps = connection.prepareStatement(sql);
        ) {
            ps.setString(1, nv.getMaNhanVien());
            ps.setString(2, nv.getHoTen());
            ps.setString(3, nv.getChucVu());
            ps.setString(4, nv.getSoDT() + ""); // Chuyển int sang String
            ps.setString(5, nv.getEmail());
            ps.setDate(6, new java.sql.Date(nv.getNgaySinh().getTime()));
            ps.setString(7, nv.getDiaChi());
            ps.setString(8, nv.getMaQuyen());
            ps.setFloat(9, nv.getLuong());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    // Phương thức để tìm nhân viên theo mã nhân viên
    public static ModelQuanLyNhanVien find(String MaNhanVien) throws Exception {
        String sql = "SELECT * FROM QUANLYNHANVIEN WHERE MaNhanVien = ?";
        try (
            Connection connection = new KetNoi().getKetNoi();
            PreparedStatement ps = connection.prepareStatement(sql);
        ) {
            ps.setString(1, MaNhanVien);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ModelQuanLyNhanVien nv = new ModelQuanLyNhanVien();
                nv.setMaNhanVien(rs.getString("MaNhanVien"));
                nv.setHoTen(rs.getString("HoTen"));
                nv.setChucVu(rs.getString("ChucVu"));
                nv.setSoDT(Integer.parseInt(rs.getString("SoDT")));
                nv.setEmail(rs.getString("Email"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setMaQuyen(rs.getString("MaQuyen"));
                nv.setLuong(rs.getFloat("Luong"));
                return nv;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    // Phương thức để xóa nhân viên theo mã nhân viên
    public static boolean delete(String MaNhanVien) throws Exception {
        String sql = "DELETE FROM QUANLYNHANVIEN WHERE MaNhanVien = ?";
        try (
            Connection connection = new KetNoi().getKetNoi();
            PreparedStatement ps = connection.prepareStatement(sql);
        ) {
            ps.setString(1, MaNhanVien);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    // Phương thức để cập nhật thông tin nhân viên
    public static boolean update(ModelQuanLyNhanVien nv) throws Exception {
        String sql = "UPDATE QUANLYNHANVIEN SET HoTen = ?, ChucVu = ?, SoDT = ?, Email = ?, NgaySinh = ?, DiaChi = ?, MaQuyen = ?, Luong = ? WHERE MaNhanVien = ?";
        try (
            Connection connection = new KetNoi().getKetNoi();
            PreparedStatement ps = connection.prepareStatement(sql);
        ) {
            ps.setString(1, nv.getHoTen());
            ps.setString(2, nv.getChucVu());
            ps.setString(3, nv.getSoDT() + ""); // Chuyển int sang String
            ps.setString(4, nv.getEmail());
            ps.setDate(5, new java.sql.Date(nv.getNgaySinh().getTime()));
            ps.setString(6, nv.getDiaChi());
            ps.setString(7, nv.getMaQuyen());
            ps.setFloat(8, nv.getLuong());
            ps.setString(9, nv.getMaNhanVien());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    // Phương thức để lấy danh sách tất cả nhân viên
    public static List<ModelQuanLyNhanVien> findAll() throws Exception {
        String sql = "SELECT * FROM QUANLYNHANVIEN";
        List<ModelQuanLyNhanVien> list = new ArrayList<>();
        try (
            Connection connection = new KetNoi().getKetNoi();
            PreparedStatement ps = connection.prepareStatement(sql);
        ) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ModelQuanLyNhanVien nv = new ModelQuanLyNhanVien();
                nv.setMaNhanVien(rs.getString("MaNhanVien"));
                nv.setHoTen(rs.getString("HoTen"));
                nv.setChucVu(rs.getString("ChucVu"));
                nv.setSoDT(Integer.parseInt(rs.getString("SoDT")));
                nv.setEmail(rs.getString("Email"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setMaQuyen(rs.getString("MaQuyen"));
                nv.setLuong(rs.getFloat("Luong"));
                list.add(nv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
}

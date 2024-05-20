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
        String sql = "INSERT INTO QUANLYNHANVIEN (MaNhanVien, HoTen, GioiTinh, ChucVu, SoDT, Email, NgaySinh, DiaChi, Luong) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (
            Connection connection = new KetNoi().getKetNoi();
            PreparedStatement ps = connection.prepareStatement(sql);
        ) {
            ps.setString(1, nv.getMaNhanVien());
            ps.setString(2, nv.getHoTen());
            ps.setString(3, nv.getGioiTinh());
            ps.setString(4, nv.getChucVu());
            ps.setString(5, nv.getSoDT());
            ps.setString(6, nv.getEmail());
            ps.setDate(7, new java.sql.Date(nv.getNgaySinh().getTime()));
            ps.setString(8, nv.getDiaChi());
            ps.setString(9, nv.getLuong());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new Exception("Error inserting data: " + ex.getMessage());
        }
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
                nv.setGioiTinh(rs.getString("GioiTinh"));
                nv.setChucVu(rs.getString("ChucVu"));
                nv.setSoDT(rs.getString("SoDT"));
                nv.setEmail(rs.getString("Email"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setLuong(rs.getString("Luong"));
                return nv;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new Exception("Error finding data: " + ex.getMessage());
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
            throw new Exception("Error deleting data: " + ex.getMessage());
        }
    }

    // Phương thức để cập nhật thông tin nhân viên
    public static boolean update(ModelQuanLyNhanVien nv) throws Exception {
        String sql = "UPDATE QUANLYNHANVIEN SET HoTen = ?, GioiTinh = ?, ChucVu = ?, SoDT = ?, Email = ?, NgaySinh = ?, DiaChi = ?, Luong = ? WHERE MaNhanVien = ?";
        try (
            Connection connection = new KetNoi().getKetNoi();
            PreparedStatement ps = connection.prepareStatement(sql);
        ) {
            ps.setString(1, nv.getHoTen());
            ps.setString(2, nv.getGioiTinh());
            ps.setString(3, nv.getChucVu());
            ps.setString(4, nv.getSoDT());
            ps.setString(5, nv.getEmail());
            ps.setDate(6, new java.sql.Date(nv.getNgaySinh().getTime()));
            ps.setString(7, nv.getDiaChi());
            ps.setString(8, nv.getLuong());
            ps.setString(9, nv.getMaNhanVien());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new Exception("Error updating data: " + ex.getMessage());
        }
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
                nv.setGioiTinh(rs.getString("GioiTinh"));
                nv.setChucVu(rs.getString("ChucVu"));
                nv.setSoDT(rs.getString("SoDT"));
                nv.setEmail(rs.getString("Email"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setLuong(rs.getString("Luong"));
                list.add(nv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new Exception("Error finding all data: " + ex.getMessage());
        }
        return list;
    }
}

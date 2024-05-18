/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KetNoiDaTaBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoi {
    private static final String Strserver = "localhost"; // Thay đổi tên máy chủ SQL Server của bạn
    private static final String strDatabase = "SQLBookStore"; // Thay đổi tên cơ sở dữ liệu của bạn
    private static final String StrUser = "root"; // Thay đổi tên người dùng của bạn
    private static final String StrPass = "16092003"; // Thay đổi mật khẩu của bạn

    public Connection getConnection() {
        Connection connection = null;
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String connectionURL = "jdbc:mysql://" + Strserver + ":3306/" + strDatabase + "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

            connection = DriverManager.getConnection(connectionURL, StrUser, StrPass);
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Lỗi kết nối cơ sở dữ liệu: " + e.getMessage());
        }
        return connection;
    }

    public static void main(String[] args) {
        KetNoi ketNoi = new KetNoi();
        Connection connection = ketNoi.getConnection();

        if (connection != null) {
            System.out.println("Kết nối thành công!");
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Kết nối không thành công.");
        }
    }
}


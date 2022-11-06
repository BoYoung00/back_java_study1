package Dao;

import Dto.Dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Dao {
    private static String url="jdbc:mysql://localhost:3306/bydbst";
    private static String user="root";
    private static String password="rlaqhdud2@";

    public int addUser(Dto dto) {
        int count = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (Exception e) {
            e.printStackTrace();
        }

        String sql = "insert into member values (?,?,?,?,?,?,?)";

        try(Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, dto.getNum());
            ps.setString(2, dto.getName());
            ps.setString(3, dto.getId());
            ps.setString(4, dto.getPassword());
            ps.setString(5, dto.getgender());
            ps.setString(6, dto.getMail());
            ps.setString(7, dto.getPhonenumber());

            count = ps.executeUpdate(); //객체 값 반환

        }catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
}

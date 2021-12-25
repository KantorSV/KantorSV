package com.training.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kachalka", "root", "11111111");
    }

    @Override
    public void create(String login, String password, String email){
        try (Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("insert into users (login, password, email) Values (?, md5(?), ?)");
            ps.setString(1, login);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.execute();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean isLoggedIn(String login, String password){
        try (Connection connection = getConnection()){
            PreparedStatement ps = connection.prepareStatement("select * from users where login=? and password=MD5(?)");
            ps.setString(1, login);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        }catch (Exception ex) {
            throw new RuntimeException();
        }
    }
}

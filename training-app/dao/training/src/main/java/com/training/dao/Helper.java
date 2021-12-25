package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper {

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/training", "root", "11111111");
    }
}

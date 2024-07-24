package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    Connection conn;

    public static Connection getConn() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/usersdb", "root", "Bekhan95");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

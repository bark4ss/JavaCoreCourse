package connection;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;

public class DBConnection {

    public static Connection getConnection () throws Exception {
        Properties properties = new Properties();
        try(InputStream in = DBConnection.class.getClassLoader().getResourceAsStream("database.properties")) {
            properties.load(in);
        }
        String url = properties.getProperty("db.url");
        String login = properties.getProperty("db.username");
        String password = properties.getProperty("db.password");
        String driver = properties.getProperty("db.driver");
        Class.forName(driver);

        return DriverManager.getConnection(url,login,password);
    }
}

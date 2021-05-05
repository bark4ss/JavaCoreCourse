package connection;

import java.sql.Connection;
import java.sql.Statement;

public class ConnectionDemo2 {
    private static final String SQL_CREATE_TABLE = "CREATE TABLE products (Id INT PRIMARY KEY AUTO_INCREMENT, ProductName VARCHAR(20), Price INT)";

    public static void main(String[] args) {
        //https://metanit.com/java/database/2.3.php
        try (Connection conn = DBConnection.getConnection();
             Statement statement = conn.createStatement()){
            System.out.println("Connection to Store DB succesfull!");
            statement.executeUpdate(SQL_CREATE_TABLE);
            System.out.println("Database has been created!");

        } catch (Exception throwables) {
            System.out.println("Connection failed...");
            System.out.println(throwables);
        }
    }
}

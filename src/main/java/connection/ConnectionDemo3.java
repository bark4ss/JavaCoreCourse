package connection;

import java.sql.Connection;
import java.sql.Statement;

public class ConnectionDemo3 {

    private static final String SQL_INSERT_PRODUCT = "INSERT Products(ProductName, Price) VALUES ('iPhone X', 76000),('Galaxy S9', 45000),('Nokia 9', 36000)";

    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection();
             Statement statement = conn.createStatement()){
            System.out.println("Connection to Store DB succesfull!");
            int rows = statement.executeUpdate(SQL_INSERT_PRODUCT);
            System.out.printf("Added %d rows", rows);

        } catch (Exception throwables) {
            System.out.println("Connection failed...");
            System.out.println(throwables);
        }

    }
}

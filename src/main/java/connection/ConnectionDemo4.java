package connection;

import java.sql.Connection;
import java.sql.Statement;

public class ConnectionDemo4 {

    private static final String SQL_UPDATE_PRICE = "UPDATE Products SET Price = Price - 5000";

    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection();
             Statement statement = conn.createStatement()){
            System.out.println("Connection to Store DB succesfull!");
            int rows = statement.executeUpdate(SQL_UPDATE_PRICE);
            System.out.printf("Updated %d rows", rows);

        } catch (Exception throwables) {
            System.out.println("Connection failed...");
            System.out.println(throwables);
        }

    }
}

package connection;

import java.sql.Connection;
import java.sql.Statement;

public class ConnectionDemo5 {
    private static final String SQL_PRODUCT_BY_ID = "DELETE FROM Products WHERE Id = 3 OR Price = 40000";

    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection();
             Statement statement = conn.createStatement()){
            System.out.println("Connection to Store DB succesfull!");
            int rows = statement.executeUpdate(SQL_PRODUCT_BY_ID);
            System.out.printf("%d row(s) deleted", rows);

        } catch (Exception throwable) {
            System.out.println("Connection failed...");
        }

    }
}

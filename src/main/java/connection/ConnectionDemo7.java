package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionDemo7 {
    private static final String SQL_PRODUCTS = "SELECT * FROM Products";

    public static void main(String[] args) {
        //https://metanit.com/java/database/2.5.php
        try (Connection conn = DBConnection.getConnection();
             Statement statement = conn.createStatement()){
            System.out.println("Connection to Store DB succesfull!");
            ResultSet resultSet = statement.executeQuery(SQL_PRODUCTS);
            while(resultSet.next()){

                int id = resultSet.getInt("Id");
                String name = resultSet.getString("ProductName");
                int price = resultSet.getInt("Price");

                System.out.printf("%d. %s - %d \n", id, name, price);
            }

        } catch (Exception throwables) {
            System.out.println("Connection failed...");
            System.out.println(throwables);
        }

    }
}

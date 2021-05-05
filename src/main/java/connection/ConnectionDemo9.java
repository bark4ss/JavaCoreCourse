package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ConnectionDemo9 {
    private static final String SQL_SELECT_BY_PRICE = "SELECT * FROM Products WHERE Price < ?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input max product price: ");
        int maxPrice = scanner.nextInt();

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT_BY_PRICE)){
            System.out.println("Connection to Store DB succesfull!");

            preparedStatement.setInt(1, maxPrice);

            ResultSet resultSet = preparedStatement.executeQuery();
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

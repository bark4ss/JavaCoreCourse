package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionDemo8 {
    private static final String SQL_INSERT_PRODUCT = "INSERT INTO Products (ProductName, Price) Values (?, ?)";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input product name: ");
        String name = scanner.nextLine();

        System.out.print("Input product price: ");
        int price = scanner.nextInt();

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_PRODUCT)){
            System.out.println("Connection to Store DB succesfull!");

            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, price);

            int rows = preparedStatement.executeUpdate();

            System.out.printf("%d rows added", rows);

        } catch (Exception throwables) {
            System.out.println("Connection failed...");
            System.out.println(throwables);
        }

    }
}

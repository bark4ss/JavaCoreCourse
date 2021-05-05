package connection;

import java.sql.Connection;

public class ConnectionDemo1 {
    public static void main(String[] args) {
        //https://javarush.ru/groups/posts/2172-jdbc-ili-s-chego-vsje-nachinaetsja
        //https://proglib.io/p/sql-for-20-minutes
        //https://tproger.ru/translations/sql-recap/
        //https://metanit.com/sql/tutorial/2.2.php
        try (Connection conn = DBConnection.getConnection()){
            System.out.println("Connection to Store DB succesfull!");
        } catch (Exception throwables) {
            System.out.println("Connection failed...");
            System.out.println(throwables);
        }
    }
}

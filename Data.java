import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Data {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/banking_db"; 
        String username = "root"; 
        String password = "password";

        Connection connection = null;

        try {
        
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connected to the database successfully!");


        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());

            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("Error Code: " + e.getErrorCode());

        } finally {
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Connection closed.");
                } catch (SQLException e) {
                    System.out.println("Error while closing the connection: " + e.getMessage());
                }
            }
        }
    }
}

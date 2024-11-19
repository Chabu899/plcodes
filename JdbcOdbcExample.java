import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcOdbcExample {
    public static void main(String[] args) {
        // Define database connection URL and credentials
        String url = "jdbc:odbc:StudentDB"; // Replace "StudentDB" with your ODBC data source name
        String username = ""; // If your database doesn't require a username, leave this blank
        String password = ""; // If your database doesn't require a password, leave this blank

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Step 1: Load the JDBC-ODBC bridge driver
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            // Step 2: Establish a connection to the ODBC data source
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established successfully!");

            // Step 3: Create a statement object to execute SQL queries
            statement = connection.createStatement();

            // Step 4: Execute a SQL SELECT query
            String sql = "SELECT id, name, age FROM students";
            resultSet = statement.executeQuery(sql);

            // Step 5: Process the result set
            System.out.println("ID\tName\t\tAge");
            System.out.println("----------------------------------");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                System.out.println(id + "\t" + name + "\t\t" + age);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC-ODBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL error occurred!");
            e.printStackTrace();
        } finally {
            // Step 6: Clean up and close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
                System.out.println("Resources released successfully!");
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}

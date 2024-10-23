package travel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {
    public Connection c;
    public Statement s;

    public Conn() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms", "root", "23022023NMDINA"); // Change your_password to your MySQL password
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

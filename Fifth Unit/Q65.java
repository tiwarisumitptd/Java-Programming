import java.sql.*;
import java.util.*;

public class Q65 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Load JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sumittiwari", "root", "Sumit2006@");

        // Create Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the new name you want to set: ");
        String NewName = sc.nextLine(); // changed to nextLine()

        System.out.print("Enter the current name of the student you want to update: ");
        String OldName = sc.nextLine(); // changed to nextLine()

        // Using PreparedStatement for security
        String query = "UPDATE students SET name = ? WHERE name = ?";
        PreparedStatement pst = con.prepareStatement(query);

        pst.setString(1, NewName); // first "?" replaced by NewName
        pst.setString(2, OldName); // second "?" replaced by OldName

        int count = pst.executeUpdate();
        System.out.println("Number of rows affected by the query: " + count);

        pst.close();
        con.close();
        sc.close();
    }
}

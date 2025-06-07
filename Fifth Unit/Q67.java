import java.sql.*;
import java.util.Scanner;

public class Q67 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Load Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish Connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sumittiwari", "root", "Sumit2006@");

        // Scanner for input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the enrollment of student: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter the name of the student: ");
        String name = sc.nextLine(); // nextLine to capture full name

        System.out.print("Enter the email id of the student: ");
        String email = sc.nextLine(); // nextLine to capture full email address

        System.out.print("Enter the age of the student: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter the status of the student: ");
        int status = sc.nextInt();

        // Correct SQL Query using placeholders
        String query = "INSERT INTO students (enrollment, name, email, age, status) VALUES (?, ?, ?, ?, ?)";

        // Create PreparedStatement
        PreparedStatement pst = con.prepareStatement(query);

        // Set values
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setString(3, email);
        pst.setInt(4, age);
        pst.setInt(5, status);

        // Execute update
        int count = pst.executeUpdate();
        System.out.println("Number of rows affected by the query: " + count);

        // Close resources
        pst.close();
        con.close();
        sc.close();
    }
}

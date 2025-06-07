import java.sql.*;
import java.util.Scanner;

public class Q66 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sumittiwari", "root", "Sumit2006@");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Enrollment number of student: ");
        int enrollment = sc.nextInt();

        String query = "select * from students where enrollment = '"+enrollment+"'";
        Statement st = con.createStatement();

        ResultSet rst = st.executeQuery(query);

        while (rst.next()) {
            System.out.println("/enrllment: "+ rst.getInt("enrollment"));
            System.out.println("name: "+rst.getString("name"));
            System.out.println("email: "+rst.getString("email"));
            System.out.println("age: "+rst.getInt("age"));
            System.out.println("status: "+rst.getBoolean("status"));
        }

        rst.close();
        st.close();
        con.close();
    }
}

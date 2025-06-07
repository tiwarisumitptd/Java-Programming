import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q64 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sumittiwari", "root", "Sumit2006@");

        Statement st = con.createStatement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of students: ");
        String name = sc.next();

        String query = "delete from students where name = '"+name+"'";

        int count = st.executeUpdate(query);
        System.out.println("Number of rows affected by the query: "+count);
        st.close();
        con.close();
    }
}

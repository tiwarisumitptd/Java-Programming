import java.sql.*;

public class Q61 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/sumittiwari";
        String user = "root";
        String password = "Sumit2006@";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection (url,user,password);

        String query = "delete from students where enrollment = 6";
        Statement st = con.createStatement();

        int count = st.executeUpdate(query);

        System.out.println("Number of rows affected by this query: " + count);
        st.close();
        con.close();
    }
}
import java.sql.*;
public class Q62 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/sumittiwari";
        String user = "root";
        String password= "Sumit2006@";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,user,password);

        Statement st = con.createStatement();
        String query = "update students set enrollment = 8 where name =  'Ashutosh Singh Sengar' ";
        int count = st.executeUpdate(query);

        System.out.println("Number of rows affected by this query "+ count);

        st.close();
        con.close();
    }
}
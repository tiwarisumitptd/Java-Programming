import java.sql.*;

public class Q60 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        String url = "jdbc:mysql://localhost:3306/sumittiwari";
        String user = "root";
        String password = "Sumit2006@";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,user,password);

        String query = "insert into students (enrollment, name, email,age,status) values (15, 'Shivam Sahu', 'sahushivam234@gmail.com', 22, 1)";

        Statement st = conn.createStatement();

        int count = st.executeUpdate(query);
        System.out.println("Number of rows affected by this query: "+count);

        st.close();
        conn.close();
    }
}

import javax.swing.*;
import java.sql.*;

public class Q79 extends JFrame {
    JTextField enrollmentTF, nameTF, ageTF;
    public Q79() {
        setTitle("Student Entry Form");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel enrollmentLabel = new JLabel("Enrollment No");
        enrollmentLabel.setBounds(20, 50, 100, 20);
        add(enrollmentLabel);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(20, 80, 100, 20);
        add(nameLabel);

        JLabel ageLabel = new JLabel("Age");
        ageLabel.setBounds(20, 110, 100, 20);
        add(ageLabel);

        enrollmentTF = new JTextField();
        enrollmentTF.setBounds(130, 50, 150, 20);
        add(enrollmentTF);

        nameTF = new JTextField();
        nameTF.setBounds(130, 80, 150, 20);
        add(nameTF);

        ageTF = new JTextField();
        ageTF.setBounds(130, 110, 150, 20);
        add(ageTF);

        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(20, 160, 100, 30);
        add(submitBtn);

        JButton resetBtn = new JButton("Reset");
        resetBtn.setBounds(130, 160, 100, 30);
        add(resetBtn);

        // Submit button logic

        submitBtn.addActionListener(e -> insertStudent());

        // Reset button logic

        resetBtn.addActionListener(e -> {
            enrollmentTF.setText("");
            nameTF.setText("");
            ageTF.setText("");
        });

        setVisible(true);
    }

    private void insertStudent()
    {
        int enrollment;
        String name;
        int age;

        try
        {
            enrollment = Integer.parseInt(enrollmentTF.getText());
            name = nameTF.getText();
            age = Integer.parseInt(ageTF.getText());
        }
        catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "Enrollment and Age must be numbers!");
            return;
        }

        String url = "jdbc:mysql://localhost:3306/std";
        String user = "root";
        String password = "password";

        String sql = "INSERT INTO bvoc (enrollment_no, name, age) VALUES (?, ?, ?)";

        try (
                Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setInt(1, enrollment);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                JOptionPane.showMessageDialog(this, "Student inserted successfully!");
                enrollmentTF.setText("");
                nameTF.setText("");
                ageTF.setText("");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage());
        }
    }
    public static void main(String[] args)
    {
        new Q79();
    }
}
import javax.swing.*;
public class Q75 {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Practical Question: 75");

            frame.setSize(400, 300);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null); // Using absolute positioning

            String[] subjects = {"C Programming", "C++ Programming", "JavaScript", "Python", "Java"};

            JList<String> list = new JList<>(subjects);
            list.setBounds(100, 50, 200, 120);

            JScrollPane scrollPane = new JScrollPane(list);
            scrollPane.setBounds(100, 50, 200, 120);

            frame.add(scrollPane);
        }
    }
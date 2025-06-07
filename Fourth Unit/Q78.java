import javax.swing.*;
import java.awt.event.*;
public class Q78 {
        public static void main(String[] args) {

            JFrame frame = new JFrame("practical Question: 78");
            frame.setSize(400, 300);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);

            JTextField textField = new JTextField();
            textField.setBounds(100, 100, 200, 30);
            frame.add(textField);

            JButton button = new JButton("Click Me");
            button.setBounds(150, 160, 100, 40);
            frame.add(button);

            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    textField.setText("Button Clicked Successfully!");
                }
            });

        }
    }
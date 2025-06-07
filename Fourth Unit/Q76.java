import javax.swing.*;
import java.awt.event.*;
public class Q76 {

        public Q76() {
            JFrame frame = new JFrame("Practical Question: 76");

            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setLayout(null);

            JButton button = new JButton("Click Me");
            button.setBounds(140, 100, 120, 40);

            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame, "You clicked the button!", "Dialog Box", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            frame.add(button);
        }

        public static void main(String[] args) {
            new Q76();
        }
    }
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q77 extends JFrame {

        Button button;
        TextField textField;

        Q77() {

            setTitle("practical Question: 77");
            setSize(400, 300);
            setLayout(null);
            setVisible(true);

            textField = new TextField();
            textField.setBounds(100, 100, 200, 30);
            add(textField);

            button = new Button("Click Me");
            button.setBounds(150, 160, 100, 40);
            add(button);
            //button.addActionListener (this);

            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    dispose();
                }
            });
        }

        public void actionPerformed(ActionEvent e) {
            textField.setText("Button Clicked Successfully!");
        }

        public static void main(String[] args) {
            new Q77();
        }
    }
import java.awt.*;

public class Q68 extends Frame{

        // Constructor
        Q68() {
            setTitle("User Defined Class with Constructor - AWT Example");

            setSize(400, 300);

            setLayout(new FlowLayout());

            Label label = new Label("Enter your name:");
            TextField textField = new TextField(20);
            Button button = new Button("Submit");

            add(label);
            add(textField);
            add(button);

            this.addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent e) {
                    dispose(); // Close the window
                }
            });

            setVisible(true);
        }

        public static void main(String[] args) {
            new Q68();
        }
    }
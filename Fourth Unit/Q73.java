import javax.swing.*;

public class Q73 {
                // User-defined class extending JFrame
                public Q73() {
                    // Create JFrame
                    JFrame frame = new JFrame("User Defined Class - Swing Example");

                    // Set frame properties
                    frame.setSize(400, 300);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setLayout(null); // Using absolute positioning

                    // Create components
                    JLabel label = new JLabel("Enter your name:");
                    label.setBounds(50, 50, 150, 30);

                    JTextField textField = new JTextField();
                    textField.setBounds(200, 50, 150, 30);

                    JButton button = new JButton("Submit");
                    button.setBounds(150, 120, 100, 40);

                    // Add components to frame
                    frame.add(label);
                    frame.add(textField);
                    frame.add(button);

                    // Make frame visible
                    frame.setVisible(true);
                }


                public static void main(String[] args) {
                    // Create an object, constructor will be called
                    new Q73();
                }
            }
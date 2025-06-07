import java.awt.*;
import java.awt.event.*;

public class Q80 {

        Q80() {
            Frame f = new Frame("User Registration Form");
            f.setSize(400, 400);
            f.setLayout(null);
            f.setBackground(Color.LIGHT_GRAY);
            f.setVisible(true);

            Label l1 = new Label("username: *", Label.LEFT);
            l1.setFont(new Font("Courier", Font.BOLD, 15));
            l1.setBounds(50, 50, 120, 30);
            l1.setForeground(Color.RED);

            Label l2 = new Label("password: *", Label.LEFT);
            l2.setFont(new Font("Courier", Font.BOLD, 14));
            l2.setBounds(50, 90, 120, 30);
            l2.setForeground(Color.RED);

            TextField t1 = new TextField("Enter your username: ");
            t1.setBounds(180, 55, 140, 20);
            t1.setForeground(Color.GRAY);

            TextField t2 = new TextField("Enter password: *");
            t2.setBounds(180, 90, 140, 20);
            t2.setForeground(Color.GRAY);

            FocusListener placeholderListener = new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    TextField field = (TextField) e.getSource();
                    if (field.getForeground() == Color.GRAY) {
                        field.setText("");
                        field.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    TextField field = (TextField) e.getSource();
                    if (field.getText().trim().isEmpty()) {
                        field.setForeground(Color.GRAY);
                        if (field == t1) field.setText("Enter your first name");
                        if (field == t2) field.setText("Enter your last name");
                    }
                }
            };

            t1.addFocusListener(placeholderListener);
            t2.addFocusListener(placeholderListener);

            Button btn = new Button("Login");
            btn.setBounds(140, 140, 70, 40);
            btn.setBackground(Color.cyan);

            // Adding Components to Frame
            f.add(l1);
            f.add(t1);
            f.add(l2);
            f.add(t2);
            f.add(btn);

            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("User Login Successfully");
                    Dialog d = new Dialog(f, "Success", true);
                    d.setLayout(new FlowLayout());
                    Label successMsg = new Label("User Login successfully");
                    Button ok = new Button("OK");
                    ok.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            d.setVisible(false);
                        }
                    });
                    d.add(successMsg);
                    d.add(ok);
                    d.setSize(250, 100);
                    d.setVisible(true);
                }
            });


            f.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    f.dispose();
                }
            });
        }

        public static void main(String[] args) {
            new Q80();
        }
    }
import javax.swing.*;

public class Q74 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Practical Question: 74");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator(); // Adds a separator line
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);

        JLabel label = new JLabel("Enter your name:");
        label.setBounds(50, 50, 150, 30);

        JTextField textField = new JTextField();
        textField.setBounds(200, 50, 150, 30);

        JButton button = new JButton("Submit");
        button.setBounds(150, 120, 100, 40);

        frame.add(label);
        frame.add(textField);
        frame.add(button);
    }
}
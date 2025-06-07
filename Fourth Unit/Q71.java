import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q71 extends Frame {
    Q71() {
        setTitle("Practical Question: 71");
        setBackground(Color.cyan);
        setSize(400, 500);
        setVisible(true);

        Button btn = new Button("Question: 71");
        btn.setBounds(80,80,120,40);
        add(btn);

        addWindowListener(new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Q71();
    }
}

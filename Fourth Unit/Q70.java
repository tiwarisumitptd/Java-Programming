import javax.swing.*;
import java.awt.*;

public class Q70 {
    public static void main(String[] args) {
        Frame f = new JFrame();
        f.setLayout(new GridLayout());
        f.setTitle("practical Question: 70");
        f.setVisible(true);
        f.setSize(500,800);
        f.setBackground(Color.RED);
        f.setBounds(45,60,400,800);

        Button btn = new Button("Click Me");
        btn.setBounds(80, 90,45,78);
        f.add(btn);
    }
}

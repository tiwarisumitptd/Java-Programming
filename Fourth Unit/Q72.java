import java.awt.*;

public class Q72 {
    public static class awt {
        awt() {
            Frame f = new Frame();
            f.setBackground(Color.gray);
            f.setSize(400, 600);
            f.setTitle("Practical Question: 72");
            f.setVisible(true);
            f.setLayout(null);

            Button btn = new Button("Click me");
            btn.setBounds(80, 80, 120, 80);

            f.add(btn);
        }
    }
        public static void main(String[] args) {
          new awt();
        }
}

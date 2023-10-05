import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jf1 = new JFrame();
        jf1.setSize(500, 500);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setVisible(true);
        jf1.setContentPane(new Pane());
    }
}

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        window.setContentPane(new Main());
        window.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        g.setColor(Color.black);
        g.fillRect(0, 0, width, height);

        // 圖片
        ImageIcon img = new ImageIcon("bird.jpg");
        img.paintIcon(null, g, 0, 0);

        // 字
        g.setColor(Color.BLUE);
        g.drawString("Hello World", 30, 30);

        // 線
        g.drawLine(10, 10, 10, 50);

        // 矩形
        g.drawRect(100, 100, 50, 50);

        // 實心矩形
        g.setColor(Color.CYAN);
        g.fillRect(200, 200, 10, 10);

        // 圓形
        g.setColor(Color.ORANGE);
        g.drawOval(70, 70, 20, 20);
        g.fillOval(90, 90, 30, 30);


    }
}

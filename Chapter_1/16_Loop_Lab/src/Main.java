import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    String type;
    int size;

    public Main() {
        while (true) {
            type = JOptionPane.showInputDialog("表格類型 A (加法表) / B (乘法表)：");
            if (type.equalsIgnoreCase("A") || type.equalsIgnoreCase("B")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "請輸入有效選項 A 或 B");
            }
        }
        size = Integer.parseInt(JOptionPane.showInputDialog("表格數量；"));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setContentPane(new Main());
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        int w = getWidth();
        int h = getHeight();
        int x = 0;
        int y = 0;
        int cellWidth = w / size;
        int cellHeight = h / size;

        // nested for loop
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || j == 1) {
                    g.setColor(Color.yellow);
                    g.fillRect(x, y, cellWidth, cellHeight);
                }

                g.setColor(Color.black);
                g.drawRect(x, y, cellWidth, cellHeight);

                if (i == 1) {
                    g.drawString("" + j, x + 5, y + 15);
                } else if (j == 1) {
                    g.drawString("" + i, x + 5, y + 15);
                } else {
                    int value;
                    // equalsIgnoreCase 是 Java 中的一個字串方法，用於比較兩個字串是否相等，但不考慮它們的大小寫。
                    if (type.equalsIgnoreCase("A")) {
                        value = i + j;
                        g.drawString(i + "+" + j + "=" + value, x + 5, y + 15);
                    } else if (type.equalsIgnoreCase("B")) {
                        value = i * j;
                        g.drawString(i + "*" + j + "=" + value, x + 5, y + 15);
                    }
                }


                g.drawRect(x, y, cellWidth, cellHeight);

                x += cellWidth;
            }
            x = 0;
            y += cellHeight;
        }
    }
}

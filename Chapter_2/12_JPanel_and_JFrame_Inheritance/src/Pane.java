import javax.swing.*;
import java.awt.*;

public class Pane extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        System.out.println("Working paintComponent");
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}

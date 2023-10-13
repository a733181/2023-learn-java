import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JPanel implements KeyListener {
    Sheep s;

    public Main() {
        s = new Sheep(40, 40);
        addKeyListener(this);
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setContentPane(new Main());
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        s.drawSheep(g);
        requestFocusInWindow();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int k = e.getKeyCode();

        switch (k) {
            case KeyEvent.VK_UP:
            case KeyEvent.VK_W:
                s.walk(0, -5);
                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                s.walk(0, 5);
                break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
                s.walk(5, 0);
                break;
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_A:
                s.walk(-5, 0);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Please use arrow key.");
        }

//        if (k == KeyEvent.VK_UP) {
//            s.walk(0, -5);
//        } else if (k == KeyEvent.VK_DOWN) {
//            s.walk(0, 5);
//        } else if (k == KeyEvent.VK_RIGHT) {
//            s.walk(5, 0);
//        } else if (k == KeyEvent.VK_LEFT) {
//            s.walk(-5, 0);
//        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

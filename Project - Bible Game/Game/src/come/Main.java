package come;

import come.GameView.DisasterView;
import come.GameView.GameView;
import come.Sprite.Moses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JPanel implements KeyListener {

    public static final int CELL = 50;
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    public static final int ROW = HEIGHT / CELL;
    public static final int COL = WIDTH / CELL;

    public static final String imgPath = "src/come/img/";
    public static GameView gameView;
    Moses moses;
    private int level;

    public Main() {
        resetGame(new DisasterView());
        addKeyListener(this);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Main());
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setResizable(false);
    }

    public void resetGame(GameView game) {
        moses = new Moses(1, 1);
        gameView = game;
        level = 1;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        gameView.drawView(g);
        moses.draw(g);
        requestFocusInWindow();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(WIDTH, HEIGHT);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        Point mosesPoint = moses.getRelativePosition();
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP: {
                if (mosesPoint.y > 1) {
                    String result = moses.overlap(mosesPoint.x, mosesPoint.y - 1);
                    if (result.equals("Die")) {
                        //reset game
                        JOptionPane.showMessageDialog(this, "You Die,Please Try Again");
                        resetGame(new DisasterView());
                        return;
                    }
                    if (!result.equals("Cannot move")) {
                        mosesPoint.y -= 1;
                    }
                }
                break;
            }
            case KeyEvent.VK_DOWN: {
                if (mosesPoint.y < ROW) {
                    String result = moses.overlap(mosesPoint.x, mosesPoint.y + 1);
                    if (result.equals("Die")) {
                        //reset game
                        JOptionPane.showMessageDialog(this, "You Die,Please Try Again");
                        resetGame(new DisasterView());
                        return;
                    }
                    if (!result.equals("Cannot move")) {
                        mosesPoint.y += 1;

                    }
                }
                break;
            }
            case KeyEvent.VK_RIGHT: {
                if (mosesPoint.x < COL) {
                    String result = moses.overlap(mosesPoint.x + 1, mosesPoint.y);
                    if (result.equals("Die")) {
                        //reset game
                        JOptionPane.showMessageDialog(this, "You Die,Please Try Again");
                        resetGame(new DisasterView());
                        return;
                    }
                    if (!result.equals("Cannot move")) {
                        mosesPoint.x += 1;
                    }
                }
                break;
            }
            case KeyEvent.VK_LEFT: {
                if (mosesPoint.x > 1) {
                    String result = moses.overlap(mosesPoint.x - 1, mosesPoint.y);
                    if (result.equals("Die")) {
                        //reset game
                        JOptionPane.showMessageDialog(this, "You Die,Please Try Again");
                        resetGame(new DisasterView());
                        return;
                    }
                    if (!result.equals("Cannot move")) {
                        mosesPoint.x -= 1;
                    }
                }
                break;
            }
        }
        moses.setPosition(mosesPoint.x, mosesPoint.y);
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

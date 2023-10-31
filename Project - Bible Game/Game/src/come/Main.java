package come;

import come.GameView.DisasterView;
import come.GameView.GameView;
import come.GameView.RedSeaGameView;
import come.GameView.TenCommandmentsView;
import come.Sprite.DisasterViewSprite.Bug;
import come.Sprite.DisasterViewSprite.Frog;
import come.Sprite.DisasterViewSprite.Ice;
import come.Sprite.DisasterViewSprite.Stone;
import come.Sprite.Moses;
import come.Sprite.RedSeaViewSprite.Anubis;
import come.Sprite.RedSeaViewSprite.Cat;
import come.Sprite.RedSeaViewSprite.Pharaoh;
import come.Sprite.Sprite;

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
        level = 1;
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
        repaint();
    }

    private boolean changeLevel(String result) {
        if (result.equals("Next level")) {
            level++;
            if (level == 2) {
                resetGame(new RedSeaGameView());
            } else if (level == 3) {
                resetGame(new TenCommandmentsView());
            }
            return true;
        }
        return false;
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
                        level = 1;
                        JOptionPane.showMessageDialog(this, "You Die,Please Try Again");
                        resetGame(new DisasterView());
                        return;
                    }
                    if (!result.equals("Cannot move")) {
                        mosesPoint.y -= 1;
                    }
                    if (result.equals("Game Over")) {
                        JOptionPane.showMessageDialog(this, "You Win");
                    }
                    if (changeLevel(result)) return;
                }
                break;
            }
            case KeyEvent.VK_DOWN: {
                if (mosesPoint.y < ROW) {
                    String result = moses.overlap(mosesPoint.x, mosesPoint.y + 1);
                    if (result.equals("Die")) {
                        //reset game
                        level = 1;
                        JOptionPane.showMessageDialog(this, "You Die,Please Try Again");
                        resetGame(new DisasterView());
                        return;
                    }
                    if (!result.equals("Cannot move")) {
                        mosesPoint.y += 1;
                    }
                    if (result.equals("Game Over")) {
                        JOptionPane.showMessageDialog(this, "You Win");
                    }
                    if (changeLevel(result)) return;
                }
                break;
            }
            case KeyEvent.VK_RIGHT: {
                if (mosesPoint.x < COL) {
                    String result = moses.overlap(mosesPoint.x + 1, mosesPoint.y);
                    if (result.equals("Die")) {
                        //reset game
                        level = 1;
                        JOptionPane.showMessageDialog(this, "You Die,Please Try Again");
                        resetGame(new DisasterView());
                        return;
                    }
                    if (!result.equals("Cannot move")) {
                        mosesPoint.x += 1;
                    }
                    if (result.equals("Game Over")) {
                        JOptionPane.showMessageDialog(this, "You Win");
                    }
                    if (changeLevel(result)) return;
                }
                break;
            }
            case KeyEvent.VK_LEFT: {
                if (mosesPoint.x > 1) {
                    String result = moses.overlap(mosesPoint.x - 1, mosesPoint.y);
                    if (result.equals("Die")) {
                        //reset game
                        level = 1;
                        JOptionPane.showMessageDialog(this, "You Die,Please Try Again");
                        resetGame(new DisasterView());
                        return;
                    }
                    if (!result.equals("Cannot move")) {
                        mosesPoint.x -= 1;
                    }
                    if (result.equals("Game Over")) {
                        JOptionPane.showMessageDialog(this, "You Win");
                    }
                    if (changeLevel(result)) return;
                }
                break;
            }
            case KeyEvent.VK_W: {
                for (int i = mosesPoint.y; i > 0; i--) {
                    for (Sprite s : gameView.getElements()) {
                        if (s.getRelativePosition() != null && s.getRelativePosition().x == mosesPoint.x && s.getRelativePosition().y == i) {
                            if (s instanceof Cat || s instanceof Ice || s instanceof Stone) {
                                return;
                            }
                            if (s instanceof Anubis || s instanceof Pharaoh || s instanceof Bug || s instanceof Frog) {
                                s.setNullPosition();
                                repaint();
                                return;
                            }
                        }
                    }
                }
                break;
            }
            case KeyEvent.VK_S: {
                for (int i = mosesPoint.y; i <= ROW; i++) {
                    for (Sprite s : gameView.getElements()) {
                        if (s.getRelativePosition() != null && s.getRelativePosition().x == mosesPoint.x && s.getRelativePosition().y == i) {
                            if (s instanceof Cat || s instanceof Ice || s instanceof Stone) {
                                return;
                            }
                            if (s instanceof Anubis || s instanceof Pharaoh || s instanceof Bug || s instanceof Frog) {
                                s.setNullPosition();
                                repaint();
                                return;
                            }
                        }
                    }
                }
                break;
            }
            case KeyEvent.VK_D: {
                for (int i = mosesPoint.x; i <= COL; i++) {
                    for (Sprite s : gameView.getElements()) {
                        if (s.getRelativePosition() != null && s.getRelativePosition().x == i && s.getRelativePosition().y == mosesPoint.y) {
                            if (s instanceof Cat || s instanceof Ice || s instanceof Stone) {
                                return;
                            }
                            if (s instanceof Anubis || s instanceof Pharaoh || s instanceof Bug || s instanceof Frog) {
                                s.setNullPosition();
                                repaint();
                                return;
                            }
                        }
                    }
                }
                break;
            }
            case KeyEvent.VK_A: {
                for (int i = mosesPoint.x; i > 0; i--) {
                    for (Sprite s : gameView.getElements()) {
                        if (s.getRelativePosition() != null && s.getRelativePosition().x == i && s.getRelativePosition().y == mosesPoint.y) {
                            if (s instanceof Cat || s instanceof Ice || s instanceof Stone) {
                                return;
                            }
                            if (s instanceof Anubis || s instanceof Pharaoh || s instanceof Bug || s instanceof Frog) {
                                s.setNullPosition();
                                repaint();
                                return;
                            }
                        }
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

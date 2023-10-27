package come;

import come.GameView.DisasterView;
import come.GameView.GameView;
import come.Sprite.Moses;

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    public static final int CELL = 50;
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    public static final int ROW = HEIGHT / CELL;
    public static final int COL = WIDTH / CELL;

    public static final String imgPath = "src/come/img/";
    public static GameView gameView;
    Moses moses;

    public Main() {
        moses = new Moses(1, 1);
        gameView = new DisasterView();
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

    @Override
    public void paintComponent(Graphics g) {
        gameView.drawView(g);
        moses.draw(g);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(WIDTH, HEIGHT);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

public class Main extends JPanel implements KeyListener {

    public static final int CELL_SIZE = 20;
    public static int width = 400;
    public static int height = 400;
    // 行
    public static int row = height / CELL_SIZE;
    // 列
    public static int col = width / CELL_SIZE;
    // 方向
    private static String direction;
    private Snake snake;
    private Fruit fruit;
    private Timer t;
    // 速度
    private int speed = 500;

    // 是否可按上下左右
    private boolean allowKeyPress;

    public Main() {
        snake = new Snake();
        fruit = new Fruit();
        t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                repaint();
            }
        }, 0, speed);
        direction = "Right";
        addKeyListener(this);
        allowKeyPress = true;
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Snake Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Main());
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setResizable(false);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(width, height);
    }

    @Override
    public void paintComponent(Graphics g) {
        // draw a black background
        g.fillRect(0, 0, width, height);
        snake.drawSnake(g);
        fruit.drawFruit(g);

        // remove snake tail and put in head
        int snakeX = snake.getSnakeBody().get(0).x;
        int snakeY = snake.getSnakeBody().get(0).y;


        // Right , x += CELL_SIZE
        // Left , x -= CELL_SIZE
        // down , y += CELL_SIZE
        // top , y -= CELL_SIZE
        if (direction.equals("Left")) {
            snakeX -= CELL_SIZE;
        } else if (direction.equals("Right")) {
            snakeX += CELL_SIZE;
        } else if (direction.equals("Top")) {
            snakeY -= CELL_SIZE;
        } else if (direction.equals("Down")) {
            snakeY += CELL_SIZE;
        }
        Node snake0 = new Node(snakeX, snakeY);
        snake.getSnakeBody().remove(snake.getSnakeBody().size() - 1);
        snake.getSnakeBody().add(0, snake0);
        allowKeyPress = true;
        requestFocusInWindow();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (!allowKeyPress) return;
        int keyCode = e.getKeyCode();
        if (keyCode == 37 && !direction.equals("Right")) {
            direction = "Left";
        } else if (keyCode == 38 && !direction.equals("Down")) {
            direction = "Top";
        } else if (keyCode == 39 && !direction.equals("Left")) {
            direction = "Right";
        } else if (keyCode == 40 && !direction.equals("Top")) {
            direction = "Down";
        }
        allowKeyPress = false;
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

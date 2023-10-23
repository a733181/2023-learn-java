import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
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
    private int speed = 100;
    // 分數
    private int score;

    // 是否可按上下左右
    private boolean allowKeyPress;

    public Main() {
        reset();
        addKeyListener(this);
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


    private void setTimer() {
        t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                repaint();
            }
        }, 0, speed);
    }

    private void reset() {
        score = 0;
        if (snake != null) {
            snake.getSnakeBody().clear();
        }
        allowKeyPress = true;
        direction = "Right";
        snake = new Snake();
        fruit = new Fruit();
        setTimer();
    }

    @Override
    public void paintComponent(Graphics g) {
        // check if the snake bite itself
        ArrayList<Node> tempSnakeBody = snake.getSnakeBody();
        Node snakeHead = tempSnakeBody.get(0);
        for (int i = 1; i < tempSnakeBody.size(); i++) {
            if (tempSnakeBody.get(i).x == snakeHead.x && tempSnakeBody.get(i).y == snakeHead.y) {
                allowKeyPress = false;
                // 取消計時器
                t.cancel();
                // 清除計時器的任務隊列中已取消的任務
                t.purge();
                int response = JOptionPane.showOptionDialog(this, "是否要重新開始？", "Game Over", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, JOptionPane.YES_OPTION);

                switch (response) {
                    case JOptionPane.CLOSED_OPTION: {
                        System.exit(0);
                        break;
                    }
                    case JOptionPane.NO_OPTION: {
                        System.exit(0);
                        break;
                    }
                    case JOptionPane.YES_OPTION: {
                        reset();
                        return;
                    }
                }
            }
        }

        // draw a black background
        g.fillRect(0, 0, width, height);
        fruit.drawFruit(g);
        snake.drawSnake(g);

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

        // check if the snake eats the fruit
        if (snake.getSnakeBody().get(0).x == fruit.getX() && snake.getSnakeBody().get(0).y == fruit.getY()) {
            // set new fruit
            // draw fruit
            // score++
            fruit.setNewLocation(snake);
            fruit.drawFruit(g);
        } else {
            snake.getSnakeBody().remove(snake.getSnakeBody().size() - 1);
        }

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

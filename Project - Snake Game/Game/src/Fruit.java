import javax.swing.*;
import java.awt.*;

public class Fruit extends Node {

    private ImageIcon img;

    public Fruit() {
        super((int) Math.floor(Math.random() * Main.col) * Main.CELL_SIZE, (int) Math.floor(Math.random() * Main.row) * Main.CELL_SIZE);
//        img = new ImageIcon("src/fruit.png");
        img = new ImageIcon(getClass().getResource("fruit.png"));
    }

    public void drawFruit(Graphics g) {
//        g.setColor(Color.yellow);
//        g.fillOval(this.x, this.y, Main.CELL_SIZE, Main.CELL_SIZE);
        img.paintIcon(null, g, this.x, this.y);
    }

    public void setNewLocation(Snake s) {
        int newX;
        int newY;
        // 是否重疊位置
        boolean overlapping;
        do {
            newX = (int) Math.floor(Math.random() * Main.col) * Main.CELL_SIZE;
            newY = (int) Math.floor(Math.random() * Main.row) * Main.CELL_SIZE;
            overlapping = checkOverlapping(newX, newY, s);
        } while (overlapping);

        this.x = newX;
        this.y = newY;
    }

    private boolean checkOverlapping(int x, int y, Snake s) {
        for (int i = 0; i < s.getSnakeBody().size(); i++) {
            int snakeBodyX = s.getSnakeBody().get(i).x;
            int snakeBodyY = s.getSnakeBody().get(i).y;
            if (x == snakeBodyX && y == snakeBodyY) {
                return true;
            }
        }
        return false;
    }

}

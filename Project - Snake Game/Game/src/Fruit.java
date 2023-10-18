import java.awt.*;

public class Fruit extends Node {

    public Fruit() {
        super((int) Math.floor(Math.random() * Main.col) * Main.CELL_SIZE, (int) Math.floor(Math.random() * Main.row) * Main.CELL_SIZE);
    }

    public void drawFruit(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(this.x, this.y, Main.CELL_SIZE, Main.CELL_SIZE);
    }
}

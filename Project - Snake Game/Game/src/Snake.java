import java.awt.*;
import java.util.ArrayList;

public class Snake {
    private ArrayList<Node> sankBody;

    public Snake() {
        sankBody = new ArrayList<>();
        sankBody.add(new Node(80, 0));
        sankBody.add(new Node(60, 0));
        sankBody.add(new Node(40, 0));
        sankBody.add(new Node(20, 0));
    }

    public void drawSnake(Graphics g) {
        g.setColor(Color.white);
        for (Node n : sankBody) {
            g.fillOval(n.x, n.y, Main.CELL_SIZE, Main.CELL_SIZE);
        }
    }
}

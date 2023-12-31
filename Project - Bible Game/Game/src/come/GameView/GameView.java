package come.GameView;

import come.Sprite.Door;
import come.Sprite.Sprite;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class GameView {


    protected ArrayList<Sprite> elements;
    protected Door door;
    protected ImageIcon img;

    public void drawView(Graphics g) {
        img.paintIcon(null, g, 0, 0);
        for (Sprite s : elements) {
            s.draw(g);
        }
    }
}

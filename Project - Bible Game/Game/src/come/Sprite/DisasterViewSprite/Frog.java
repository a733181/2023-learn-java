package come.Sprite.DisasterViewSprite;

import come.Main;
import come.Sprite.Sprite;

import javax.swing.*;

public class Frog extends Sprite {

    public Frog(int x, int y) {
        setPosition(x, y);
        img = new ImageIcon(Main.imgPath + "frog.png");
    }

    @Override
    public String overlap(int x, int y) {
        return null;
    }
}

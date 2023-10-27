package come.Sprite.DisasterViewSprite;

import come.Main;
import come.Sprite.Sprite;

import javax.swing.*;

public class Bug extends Sprite {

    public Bug(int x, int y) {
        setPosition(x, y);
        img = new ImageIcon(Main.imgPath + "bug.png");
    }

    @Override
    public String overlap(int x, int y) {
        return null;
    }
}

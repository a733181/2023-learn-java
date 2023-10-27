package come.Sprite.DisasterViewSprite;

import come.Main;
import come.Sprite.Sprite;

import javax.swing.*;

public class Ice extends Sprite {

    public Ice(int x, int y) {
        setPosition(x, y);
        img = new ImageIcon(Main.imgPath + "ice.png");
    }

    @Override
    public String overlap(int x, int y) {
        return null;
    }

}

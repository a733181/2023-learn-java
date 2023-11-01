package come.Sprite.DisasterViewSprite;

import come.Main;
import come.Sprite.Sprite;

import javax.swing.*;

public class Stone extends Sprite {

    public Stone(int x, int y) {
        setPosition(x, y);
        img = new ImageIcon(Main.imgPath + "tombstone.png");
    }

    @Override
    public String overlap(int x, int y) {

        return null;
    }
}

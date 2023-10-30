package come.Sprite.RedSeaViewSprite;

import come.Main;
import come.Sprite.Sprite;

import javax.swing.*;

public class Pharaoh extends Sprite {
    public Pharaoh(int x, int y) {
        setPosition(x, y);
        img = new ImageIcon(Main.imgPath + "pharaoh.png");
    }

    @Override
    public String overlap(int x, int y) {
        return null;
    }
}

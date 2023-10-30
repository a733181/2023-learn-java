package come.Sprite.RedSeaViewSprite;

import come.Main;
import come.Sprite.Sprite;

import javax.swing.*;

public class Anubis extends Sprite {

    public Anubis(int x, int y) {
        setPosition(x, y);
        img = new ImageIcon(Main.imgPath + "anubis.png");
    }

    @Override
    public String overlap(int x, int y) {
        return null;
    }
}

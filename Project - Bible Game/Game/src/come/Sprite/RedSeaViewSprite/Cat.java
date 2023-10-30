package come.Sprite.RedSeaViewSprite;

import come.Main;
import come.Sprite.Sprite;

import javax.swing.*;

public class Cat extends Sprite {

    public Cat(int x, int y) {
        setPosition(x, y);
        img = new ImageIcon(Main.imgPath + "cat.png");
    }

    @Override
    public String overlap(int x, int y) {
        return null;
    }
}

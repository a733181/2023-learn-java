package come.Sprite.TenComandmentsSprite;

import come.Main;
import come.Sprite.Sprite;

import javax.swing.*;

public class Tombstone extends Sprite {

    public Tombstone(int x, int y) {
        setPosition(x, y);
        img = new ImageIcon(Main.imgPath + "stone.png");
    }


    @Override
    public String overlap(int x, int y) {
        return null;
    }
}

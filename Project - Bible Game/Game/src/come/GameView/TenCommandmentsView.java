package come.GameView;

import come.Main;
import come.Sprite.TenComandmentsSprite.Tombstone;

import javax.swing.*;
import java.util.ArrayList;

public class TenCommandmentsView extends GameView {

    private Tombstone tombstone;

    public TenCommandmentsView() {
        img = new ImageIcon(Main.imgPath + "mountain.jpg");
        elements = new ArrayList<>();
        tombstone = new Tombstone(5, 5);
        elements.add(tombstone);
    }

    public Tombstone getTombstone() {
        return tombstone;
    }
}

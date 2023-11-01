package come.GameView;

import come.Main;
import come.Sprite.TenComandmentsSprite.Tombstone;

import javax.swing.*;
import java.util.ArrayList;

public class TenCommandmentsView extends GameView {


    private ArrayList<Tombstone> tombstones = new ArrayList<>();
    private int count;

    public TenCommandmentsView() {
        img = new ImageIcon(Main.imgPath + "mountain.jpg");
        elements = new ArrayList<>();
        count = 0;
        tombstones.add(new Tombstone(5, 5));
        tombstones.add(new Tombstone(1, 5));
        tombstones.add(new Tombstone(3, 4));
        tombstones.add(new Tombstone(2, 5));
        tombstones.add(new Tombstone(3, 5));
        tombstones.add(new Tombstone(4, 5));
        tombstones.add(new Tombstone(5, 7));
        tombstones.add(new Tombstone(8, 9));
        tombstones.add(new Tombstone(1, 10));
        tombstones.add(new Tombstone(2, 10));

        elements.addAll(tombstones);

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }

    public ArrayList<Tombstone> getTombstones() {
        return tombstones;
    }

}

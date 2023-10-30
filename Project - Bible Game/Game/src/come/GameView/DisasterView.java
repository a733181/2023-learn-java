package come.GameView;

import come.Main;
import come.Sprite.DisasterViewSprite.Bug;
import come.Sprite.DisasterViewSprite.Frog;
import come.Sprite.DisasterViewSprite.Ice;
import come.Sprite.DisasterViewSprite.Stone;
import come.Sprite.Door;

import javax.swing.*;
import java.util.ArrayList;

public class DisasterView extends GameView {

    public ArrayList<Bug> bugs = new ArrayList<>();
    public ArrayList<Frog> frogs = new ArrayList<>();
    public ArrayList<Ice> iceCubes = new ArrayList<>();
    public ArrayList<Stone> stones = new ArrayList<>();

    public DisasterView() {
        img = new ImageIcon(Main.imgPath + "egypt.jpg");
        elements = new ArrayList<>();
        door = new Door(10, 10);

        bugs.add(new Bug(10, 5));
        bugs.add(new Bug(9, 5));
        bugs.add(new Bug(9, 4));
        bugs.add(new Bug(6, 2));
        bugs.add(new Bug(6, 3));
        bugs.add(new Bug(6, 4));
        bugs.add(new Bug(6, 5));
        frogs.add(new Frog(1, 2));
        frogs.add(new Frog(1, 3));
        frogs.add(new Frog(1, 4));
        frogs.add(new Frog(2, 2));
        frogs.add(new Frog(2, 3));
        iceCubes.add(new Ice(7, 5));
        iceCubes.add(new Ice(3, 5));
        iceCubes.add(new Ice(5, 5));
        iceCubes.add(new Ice(4, 5));
        iceCubes.add(new Ice(8, 5));
        stones.add(new Stone(6, 6));
        stones.add(new Stone(7, 8));
        stones.add(new Stone(8, 8));
        stones.add(new Stone(9, 8));
        stones.add(new Stone(3, 8));

        elements.add(door);
        elements.addAll(bugs);
        elements.addAll(frogs);
        elements.addAll(iceCubes);
        elements.addAll(stones);
    }

    public ArrayList<Bug> getBugs() {
        return bugs;
    }

    public ArrayList<Frog> getFrogs() {
        return frogs;
    }

    public ArrayList<Ice> getIceCubes() {
        return iceCubes;
    }

    public ArrayList<Stone> getStones() {
        return stones;
    }
}

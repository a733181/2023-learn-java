package come.Sprite;

import come.GameView.DisasterView;
import come.Main;
import come.Sprite.DisasterViewSprite.Bug;
import come.Sprite.DisasterViewSprite.Frog;
import come.Sprite.DisasterViewSprite.Ice;
import come.Sprite.DisasterViewSprite.Stone;

import javax.swing.*;
import java.util.ArrayList;

public class Moses extends Sprite {

    public Moses(int x, int y) {
        setPosition(x, y);
        img = new ImageIcon(Main.imgPath + "Moses.png");
    }

    @Override
    public String overlap(int x, int y) {
        if (Main.gameView instanceof DisasterView) {
            // check for bugs and frog
            ArrayList<Frog> frogs = ((DisasterView) Main.gameView).getFrogs();
            ArrayList<Bug> bugs = ((DisasterView) Main.gameView).getBugs();
            for (Frog f : frogs) {
                if (f.getRelativePosition() != null && x == f.getRelativePosition().x && y == f.getRelativePosition().y) {
                    return "Die";
                }
            }
            for (Bug b : bugs) {
                if (b.getRelativePosition() != null && x == b.getRelativePosition().x && y == b.getRelativePosition().y) {
                    return "Die";
                }
            }
            // check ice and stone
            ArrayList<Ice> ices = ((DisasterView) Main.gameView).getIceCubes();
            ArrayList<Stone> stones = ((DisasterView) Main.gameView).getStones();
            for (Stone s : stones) {
                if (s.getRelativePosition() != null && x == s.getRelativePosition().x && y == s.getRelativePosition().y) {
                    return "Cannot move";
                }
            }
            for (Ice i : ices) {
                if (i.getRelativePosition() != null && x == i.getRelativePosition().x && y == i.getRelativePosition().y) {
                    return "Cannot move";
                }
            }
        }
        return "none";
    }
}

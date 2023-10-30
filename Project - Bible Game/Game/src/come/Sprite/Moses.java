package come.Sprite;

import come.GameView.DisasterView;
import come.GameView.RedSeaGameView;
import come.GameView.TenCommandmentsView;
import come.Main;
import come.Sprite.DisasterViewSprite.Bug;
import come.Sprite.DisasterViewSprite.Frog;
import come.Sprite.DisasterViewSprite.Ice;
import come.Sprite.DisasterViewSprite.Stone;
import come.Sprite.RedSeaViewSprite.Anubis;
import come.Sprite.RedSeaViewSprite.Cat;
import come.Sprite.RedSeaViewSprite.Pharaoh;
import come.Sprite.TenComandmentsSprite.Tombstone;

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
            // check for door
            Door door = Main.gameView.getDoor();
            if (x == door.getRelativePosition().x && y == door.getRelativePosition().y) {
                return "Next level";
            }
        } else if (Main.gameView instanceof RedSeaGameView) {
            // check cat
            ArrayList<Cat> cats = ((RedSeaGameView) Main.gameView).getCats();
            for (Cat c : cats) {
                if (c.getRelativePosition() != null && x == c.getRelativePosition().x && y == c.getRelativePosition().y) {
                    return "Cannot move";
                }
            }
            ArrayList<Anubis> anubis = ((RedSeaGameView) Main.gameView).getAnubis();
            ArrayList<Pharaoh> pharaohs = ((RedSeaGameView) Main.gameView).getPharaohs();
            for (Anubis a : anubis) {
                if (a.getRelativePosition() != null && x == a.getRelativePosition().x && y == a.getRelativePosition().y) {
                    return "Die";
                }
            }
            for (Pharaoh p : pharaohs) {
                if (p.getRelativePosition() != null && x == p.getRelativePosition().x && y == p.getRelativePosition().y) {
                    return "Die";
                }
            }
            Door door = Main.gameView.getDoor();
            if (x == door.getRelativePosition().x && y == door.getRelativePosition().y) {
                return "Next level";
            }
        } else if (Main.gameView instanceof TenCommandmentsView) {
            Tombstone tombstone = ((TenCommandmentsView) Main.gameView).getTombstone();

            if (x == tombstone.getRelativePosition().x && y == tombstone.getRelativePosition().y) {
                return "Game Over";
            }

        }
        return "none";
    }
}

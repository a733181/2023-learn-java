package come.GameView;

import come.Main;

import javax.swing.*;
import java.util.ArrayList;

public class DisasterView extends GameView {

    public DisasterView() {
        img = new ImageIcon(Main.imgPath + "/egypt.jpg");
        elements = new ArrayList<>();
    }
}

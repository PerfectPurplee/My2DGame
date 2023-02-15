package Main;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;

public class Gamepanel extends JPanel {

    final int tile = 16;
    final int scale = 3;
    final int tileSize = tile * scale;
    final int maxColumns = 12;
    final int maxRows = 16;

    final int screenWidth = tileSize * maxRows;
    final int screenHeight = tileSize * maxColumns;

    Gamepanel() {
       this.setPreferredSize(new Dimension(screenWidth, screenHeight));
       this.setBackground(Color.BLACK);
       this.setDoubleBuffered(true);
    }
}

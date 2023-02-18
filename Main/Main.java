package Main;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

//      Creates a frame(window) for a game, and then adds a container(gamepanel)
//      window size is set to a size of a gamepanel by a class method frame.pack.
        JFrame frame = new JFrame("MY 2D GAME ADVENTURE");
        Gamepanel gamePanel = new Gamepanel();

//        Basic frame settings
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

//        Adding container to a frame
        frame.add(gamePanel);
        frame.pack();

        gamePanel.startGameThread();

    }
}

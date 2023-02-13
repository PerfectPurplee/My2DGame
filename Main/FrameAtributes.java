package Main;

import javax.swing.*;
import java.awt.*;

public class FrameAtributes {

    final int width = 800;
    final int height = 600;

    void Panel() {
        JFrame frame = new JFrame("MY 2D GAME ADVENTURE");

        frame.setVisible(true);
        frame.setSize(this.width, this.height);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.black);
    }
}

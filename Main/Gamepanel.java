package Main;

import javax.swing.*;
import java.awt.*;


public class Gamepanel extends JPanel implements Runnable {

    //    container settings. Size of a square is scaled times 3.
    final int tile = 16;
    final int scale = 3;
    final int tileSize = tile * scale;
    final int maxColumns = 12;
    final int maxRows = 16;

    final int screenWidth = tileSize * maxRows;
    final int screenHeight = tileSize * maxColumns;

    //    Player starting position
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 40;
    //    Thread creation with Runnable intefrace
    Thread gameThread;
    KeyHandler keyHandler = new KeyHandler();


    public Gamepanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyHandler);
        this.setFocusable(true);

    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();

    }

    @Override
    public void run() {

        while (gameThread != null) {

            update();

            repaint();

        }

    }

    public void update() {
        if (keyHandler.upPressed) {
            playerY -= playerSpeed;
        } else if (keyHandler.downPressed) {
            playerY += playerSpeed;
        } else if (keyHandler.leftPressed) {
            playerX += playerSpeed;
        } else if (keyHandler.rightPressed) {
            playerX -= playerSpeed;
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.WHITE);
        g2.drawRect(playerX, playerY, tileSize, tileSize);
        g2.dispose();

    }
}

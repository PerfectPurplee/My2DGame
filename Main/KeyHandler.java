package Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    public boolean upPressed, downPressed, leftPressed, rightPressed;

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode();

        if (keycode == KeyEvent.VK_W)
            upPressed = true;
        else if (keycode == KeyEvent.VK_S)
            downPressed = true;
        else if (keycode == KeyEvent.VK_A)
            leftPressed = true;
        else if (keycode == KeyEvent.VK_D)
            rightPressed = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keycode = e.getKeyCode();

        if (keycode == KeyEvent.VK_W)
            upPressed = false;
        else if (keycode == KeyEvent.VK_S)
            downPressed = false;
        else if (keycode == KeyEvent.VK_A)
            leftPressed = false;
        else if (keycode == KeyEvent.VK_D)
            rightPressed = false;
    }
}
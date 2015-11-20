package me.stefvanschie.Game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

	public boolean[] keys = new boolean[2];
	public KeyInput() {
		keys[0] = false;
		keys[1] = false;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		for (int i = 0; i < Handler.object.size(); i++) {
			GameObject tempObject = Handler.object.get(i);
			if (tempObject.getID() == ID.Beam) {
				if (key == KeyEvent.VK_A) {
					tempObject.setVelX(-2);
					keys[0] = true;
				}
				if (key == KeyEvent.VK_D) {
					tempObject.setVelX(2);
					keys[1] = true;
				}
			}
		}
		if (key == KeyEvent.VK_ESCAPE)
			System.exit(1);
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		for (int i = 0; i < Handler.object.size(); i++) {
			GameObject tempObject = Handler.object.get(i);
			if (tempObject.getID() == ID.Beam) {
				if (key == KeyEvent.VK_A)
					keys[0] = false;
				if (key == KeyEvent.VK_D)
					keys[1] = false;
				if (!keys[0] && !keys[1])
					tempObject.setVelX(0);
			}
		}
	}
}

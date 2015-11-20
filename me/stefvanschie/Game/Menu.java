package me.stefvanschie.Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import me.stefvanschie.Game.Game.STATE;

public class Menu extends MouseAdapter {

	private Game game;
	private Health health;
	
	public Menu(Game game, Health health) {
		this.game = game;
		this.health = health;
	}
	
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		
		if (mouseOver(mx, my, 16, 460, 150, 50) && game.gameState == STATE.Menu) {
			game.gameState = STATE.Game;
			Handler.addObject(new Ball(100, 100, ID.Ball, health));
			Handler.addObject(new Beam(100, 100, ID.Beam));
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j ++) {
					Handler.addObject(new BlueBlock(48 + j * 96, 64 + i * 32, ID.BlueBlock, game));
				}
			}
		}
		
		if (game.gameState == STATE.Game) {
			for (int i = 0; i < Handler.objects.size(); i++) {
				GameObject tempObject = Handler.object.get(i);
				if (tempObject.getID() == ID.Ball && tempObject.getVelX() == 0 && tempObject.getVelY() == 0) {
					tempObject.setVelY(3);
					tempObject.setVelX(3);
				}
			}
		}
	}
	
	private boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
		if (mx > x && mx < x + width) {
			if (my > y && my < y + height)
				return true;
		}
		return false;
	}
	
	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		Font font = new Font("arial", 1, 25);
		g.setFont(font);
		g.drawString("Start", 60, 495);
		Font font2 = new Font("arial", 1, 50);
		g.setFont(font2);
		g.drawString("Menu", 16, 64);
		g.drawRect(16, 460, 150, 50);
	}
}

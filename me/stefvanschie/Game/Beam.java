package me.stefvanschie.Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Beam extends GameObject {
	
	public Beam (int x, int y, ID id) {
		super(x, y, id);
		setX(165);
		setY(450);
	}

	public void tick() {
		x += velX;
		x = Game.clamp(x, 0, Game.width - 155);
		Handler.addObject(new Trail(x, y, ID.Trail, Color.WHITE, 150, 25, 0.02f, handler));
		collision();
	}

	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, 150, 25);
	}

	private void collision() {
		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = Handler.object.get(i);
			if (tempObject.getID() == ID.Ball) {
				if (getBounds().intersects(tempObject.getBounds())) {
					tempObject.velY *= -1;
					if (velX > 0) {
						tempObject.velX = 3;
					} else if (velX < 0) {
						tempObject.velX = -3;
					}
				}
			}
		}
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 150, 25);
	}
	
}

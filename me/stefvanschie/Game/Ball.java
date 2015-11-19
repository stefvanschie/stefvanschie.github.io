package me.stefvanschie.Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball extends GameObject {

	private Handler handler;
	private Health health;
	
	public Ball(int x, int y, ID id, Handler handler, Health health) {
		super(x, y, id);
		velX = 3;
		velY = 3;
		setX(230);
		setY(400);
		this.handler = handler;
		this.health = health;
	}

	public void tick() {
		x += velX;
		y += velY;
		
		if (y <= 0)
			velY *= -1;
		if (y >= Game.height - 44) {
			setX(230);
			setY(400);
			setVelX(0);
			setVelY(0);
			if (Health.health <= 34) {
				Health.health = 0;
				//System.exit(1);
			} else
				Health.health -= 33;
		}
		if (x <= 0 || x >= Game.width - 36)
			velX *= -1;
		handler.addObject(new Trail(x, y, ID.Trail, Color.RED, 24, 24, 0.05f, handler));
		collision();
	}

	public void render(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x, y, 24, 24);
	}

	private void collision() {
		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			if (tempObject.getID() == ID.BlueBlock) {
				if (getBounds().intersects(tempObject.getBounds())) {
					velY *= -1;
					handler.removeObject(tempObject);
					health.points += 50;
				}
			}
		}
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 24, 24);
	}
	
}

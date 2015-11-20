package me.stefvanschie.Game;

import java.awt.Graphics;
import java.awt.Rectangle;

public class PurpleBlock extends GameObject {

	public PurpleBlock(int x, int y, ID id) {
		super(x, y, id);
	}

	@Override
	public void tick() {}
	
	@Override
	public void render(Graphics g) {
		g.setColor(Color.PURPLE);
		g.fillRect(x, y, 75, 25);
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle(x, y, 75, 25);
	}

}

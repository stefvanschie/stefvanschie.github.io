package me.stefvanschie.Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import me.stefvanschie.Game.Game.STATE;

public class BlueBlock extends GameObject {

	public Handler handler;
	public Game game;
	
	public BlueBlock(int x, int y, ID id, Handler handler, Game game) {
		super(x, y, id);
		this.handler = handler;
		this.game = game;
	}

	public void tick() {
		if (!handler.object.contains(this)) {
			game.gameState = STATE.Menu;
		}
	}

	public void render(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, 75, 25);
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, 75, 25);
	}
}

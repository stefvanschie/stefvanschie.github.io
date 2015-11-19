package me.stefvanschie.Game;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObject {

	protected int x, y;
	protected ID id;
	protected int velX, velY;
	
	public GameObject (int x, int y, ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	public abstract Rectangle getBounds();
	
	//setters
	public void setX (int x) {
		this.x = x;
	}
	public void setY (int y) {
		this.y = y;
	}
	public void setVelX (int velX) {
		this.velX = velX;
	}
	public void setVelY (int velY) {
		this.velY = velY;
	}
	public void setID (ID id) {
		this.id = id;
	}
	//getters
	public int getX () {
		return x;
	}
	public int getY () {
		return y;
	}
	public int getVelX () {
		return velX;
	}
	public int getVelY () {
		return velY;
	}
	public ID getID () {
		return id;
	}
}

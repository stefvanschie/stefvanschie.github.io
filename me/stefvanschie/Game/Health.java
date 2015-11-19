package me.stefvanschie.Game;

import java.awt.Color;
import java.awt.Graphics;

public class Health {
	
	public static int health = 100, greenValue = 200, redValue = 0;
	public int points = 0;
	public int level = 1;
	
	
	public void tick() {
		greenValue = health * 2;
		redValue = 200 - greenValue;
		if (health == 0) {
			System.out.println("Game over!");
		}
	}

	public void render(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(16, 16, 200, 32);
		g.setColor(new Color(redValue, greenValue, 0));
		g.fillRect(16, 16, (health * 2) - 1, 31);
		
		g.setColor(Color.WHITE);
		g.drawString("Points: " + points, 16, 64);
	}
	
	public void setScore(int score) {
		this.points = score;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getScore() {
		return points;
	}
	
	public int getLevel() {
		return level;
	}
}

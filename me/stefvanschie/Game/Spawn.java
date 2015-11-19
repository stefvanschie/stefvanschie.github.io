package me.stefvanschie.Game;

import java.util.Random;

public class Spawn {

	private Handler handler;
	private Health health;
	private Game game;
	
	private Random rnd;
	
	public Spawn spawn(Handler handler, Health health, Game game) {
		this.handler = handler;
		this.health = health;
		this.game = game;
		this.rnd = new Random();
		return null;
	}
	
	public void tick() {
		for (int i = 0; i < handler.object.size() ; i++) {
			GameObject tempObject = handler.object.get(i);
			if (tempObject.getID() == ID.BlueBlock) {
				if (!handler.objectExists(tempObject)) {
					//nextlevel
					System.out.println("Next level");
					health.level++;
					generateLevel();
				}
			}
		}
	}
	public void generateLevel() {
		int block = rnd.nextInt(2 + 1);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j ++) {
				if (block == 1) {
					handler.addObject(new BlueBlock(48 + j * 96, 64 + i * 32, ID.BlueBlock, handler, game));
				}
				else if (block == 2) {
					
				}
				else {
					System.out.print("Unexpected Block");
				}
			}
		}
	}
}

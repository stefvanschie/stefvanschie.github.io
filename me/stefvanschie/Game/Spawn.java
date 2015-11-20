package me.stefvanschie.Game;

import java.util.Random;

public class Spawn {

	private Health health;
	private Game game;
	
	private Random rnd;
	
	public Spawn spawn(Health health, Game game) {
		this.health = health;
		this.game = game;
		this.rnd = new Random();
		return null;
	}
	
	public void tick() {
		for (int i = 0; i < Handler.objects.size() ; i++) {
			GameObject tempObject = Handler.objects.get(i);
			if (tempObject.getID() == ID.BlueBlock) {
				if (!Handler.objectExists(tempObject)) {
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
					Handler.addObject(new BlueBlock(48 + j * 96, 64 + i * 32, ID.BlueBlock, game));
				}
				else if (block == 2) {
					Handler.addObject(new PurpleBlock(48 + j * 96, 64 + 1 * 32, ID.PurpleBlock, game));
				}
				else {
					System.out.print("Unexpected Block");
				}
			}
		}
	}
}

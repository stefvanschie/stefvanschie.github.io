package me.stefvanschie.Game;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {

	private static LinkedList<GameObject> objects = new LinkedList<GameObject>();
	
	public void static tick() {
		for (GameObject tempObject : objects) {
			tempObject.tick();
		}	
	}
	
	public void static render(Graphics g) {
		for (GameObject tempObject : objects) {
			tempObject.render(g);
		}	
	}
	
	public void static addObject(GameObject object) {
		this.objects.add(object);
	}
	
	public void static removeObject(GameObject object) {
		this.objects.remove(object);
	}
	public boolean static objectExists(GameObject object) {
		if (this.objects.contains(object)) {
			return true;
		} else {
			return false;
		}
	}
}

package me.stefvanschie.Game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable {

	private static final long serialVersionUID = -3232004111718135348L;

	public static final int width = 480, height = 560;
	
	private Thread thread;	
	private boolean running = false;
	private Handler handler;
	private Health health;
	private Spawn spawn;
	private Menu menu;
	
	public enum STATE {
		Menu,
		Game;
	}
	public STATE gameState = STATE.Menu;
	
	public Game() {
		handler = new Handler();
		health = new Health();
		spawn = new Spawn();
		menu = new Menu(this, handler, health);
		spawn.spawn(handler, health, this);
		this.addKeyListener(new KeyInput(handler));
		this.addMouseListener(menu);
		if (gameState == STATE.Game) {
			handler.addObject(new Ball(165, 430, ID.Ball, handler, health));
			handler.addObject(new Beam(100, 100, ID.Beam, handler));
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j ++) {
					handler.addObject(new BlueBlock(48 + j * 96, 64 + i * 32, ID.BlueBlock, handler, this));
				}
			}
		}
		new Window(width, height, "Arkanoid", this);
	}
	
	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
	}
	
	public synchronized void stop() {
		try {
			thread.join();
			running = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while (delta >= 1) {
				tick();
				delta--;
			}
			if (running)
				render();
			frames++;
			
			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println("FPS: " + frames);
				frames = 0;
			}
		}
		stop();
	}
	
	private void tick() {
		handler.tick();
		if (gameState == STATE.Game) {
			health.tick();
			spawn.tick();
		} else if (gameState == STATE.Menu)
			menu.tick();
	}
	
	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(Color.black);
		g.fillRect(0, 0, width, height);
		if (gameState == STATE.Game) {
			health.render(g);
		} else if (gameState == STATE.Menu)
			menu.render(g);
		handler.render(g);
		
		g.dispose();
		bs.show();
	}
	
	public static int clamp (int value, int min, int max) {
		if (value >= max)
			return value = max;
		else if (value <= min)
			return value = min;
		else
			return value;
	}
	
	public static void main(String[] args) {
		new Game();
	}
	
}

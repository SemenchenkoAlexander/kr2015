package GameState;

import Main.GamePanel;
import TileMap.*;
<<<<<<< HEAD
import Entity.*;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
=======

import java.awt.*;
>>>>>>> 9a33ff1aba840776eb498aa48176e2d3372ef271

public class Level1State extends GameState {
	
	private TileMap tileMap;
<<<<<<< HEAD
	private Background bg;
	
	private Player player;
	


=======
>>>>>>> 9a33ff1aba840776eb498aa48176e2d3372ef271
	
	public Level1State(GameStateManager gsm) {
		this.gsm = gsm;
		init();
	}
	
	public void init() {
		
		tileMap = new TileMap(30);
		tileMap.loadTiles("/Tilesets/grasstileset.gif");
		tileMap.loadMap("/Maps/level1-1.map");
		tileMap.setPosition(0, 0);
<<<<<<< HEAD
		tileMap.setTween(1);
		
		bg = new Background("/Backgrounds/grassbg1.gif", 0.1);
		
		player = new Player(tileMap);
		player.setPosition(100, 100);
		
		populateEnemies();


		
	}
	
	private void populateEnemies() {


		Point[] points = new Point[] {
			new Point(200, 100),
			new Point(860, 200),
			new Point(1525, 200),
			new Point(1680, 200),
			new Point(1800, 200)
		};

		
	}
	
	public void update() {
		
		// update player
		player.update();
		tileMap.setPosition(
			GamePanel.WIDTH / 2 - player.getx(),
			GamePanel.HEIGHT / 2 - player.gety()
		);
		
		// set background
		bg.setPosition(tileMap.getx(), tileMap.gety());
		

		
	}
	
	public void draw(Graphics2D g) {
		
		// draw bg
		bg.draw(g);
=======
		
	}
	
	
	public void update() {}
	
	public void draw(Graphics2D g) {
		
		// clear screen
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
>>>>>>> 9a33ff1aba840776eb498aa48176e2d3372ef271
		
		// draw tilemap
		tileMap.draw(g);
		
<<<<<<< HEAD
		// draw player
		player.draw(g);


		
	}
	
	public void keyPressed(int k) {
		if(k == KeyEvent.VK_LEFT) player.setLeft(true);
		if(k == KeyEvent.VK_RIGHT) player.setRight(true);
		if(k == KeyEvent.VK_UP) player.setUp(true);
		if(k == KeyEvent.VK_DOWN) player.setDown(true);
		if(k == KeyEvent.VK_W) player.setJumping(true);
		if(k == KeyEvent.VK_E) player.setGliding(true);
		if(k == KeyEvent.VK_R) player.setScratching();
		if(k == KeyEvent.VK_F) player.setFiring();
	}
	
	public void keyReleased(int k) {
		if(k == KeyEvent.VK_LEFT) player.setLeft(false);
		if(k == KeyEvent.VK_RIGHT) player.setRight(false);
		if(k == KeyEvent.VK_UP) player.setUp(false);
		if(k == KeyEvent.VK_DOWN) player.setDown(false);
		if(k == KeyEvent.VK_W) player.setJumping(false);
		if(k == KeyEvent.VK_E) player.setGliding(false);
	}
=======
	}
	
	public void keyPressed(int k) {}
	
	public void keyReleased(int k) {}
>>>>>>> 9a33ff1aba840776eb498aa48176e2d3372ef271
	
}













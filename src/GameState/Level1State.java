package GameState;

import Entity.Enemies.Slugger;
import Entity.Enemy;
import Entity.Player;
import Main.GamePanel;
import TileMap.Background;
import TileMap.TileMap;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Level1State extends GameState {
	
	private TileMap tileMap;
	private Background bg;
    private Background bg2;

	private Player player;
	
	private ArrayList<Enemy> enemies;
	
	public Level1State(GameStateManager gsm) {
		this.gsm = gsm;
		init();
	}
	
	public void init() {
		
		tileMap = new TileMap(30);
		tileMap.loadTiles("/Tilesets/grasstileset.gif");
		tileMap.loadMap("/Maps/level1-1.map");
		tileMap.setPosition(0, 0);
		tileMap.setTween(1);
		
		bg = new Background("/Backgrounds/6.gif", 0.1);
        bg2 = new Background("/Backgrounds/7.gif", 0.1);

		player = new Player(tileMap);
		player.setPosition(100, 100);
		
		populateEnemies();
	}
	
	private void populateEnemies() {
		
		enemies = new ArrayList<Enemy>();
		
		Slugger s;
		Point[] points = new Point[] {
			new Point(200, 100),
			new Point(860, 200),
			new Point(1525, 200),
			new Point(1680, 200),
			new Point(1800, 200)
		};
		for(int i = 0; i < points.length; i++) {
			s = new Slugger(tileMap);
			s.setPosition(points[i].x, points[i].y);
			enemies.add(s);
		}
		
	}
	
	public void update() {
		

		player.update();
		tileMap.setPosition(
			GamePanel.WIDTH / 2 - player.getx(),
			GamePanel.HEIGHT / 2 - player.gety()
		);
		

		//bg.setPosition(tileMap.getx(), tileMap.gety());
		

		player.checkAttack(enemies);
		
		// update enemies
		for(int i = 0; i < enemies.size(); i++) {
			Enemy e = enemies.get(i);
			e.update();
			if(e.isDead()) {
				enemies.remove(i);
				i--;

			}
		}

		
	}
	
	public void draw(Graphics2D g) {
		

		
        if (player.getHealth()>0)bg.draw(g);
        else {
            bg2.draw(g);
            g.drawString("YOU LOOSE", 120, 90);
        }


		tileMap.draw(g);
		

		player.draw(g);

		for(int i = 0; i < enemies.size(); i++) {
			enemies.get(i).draw(g);
		}



	}
	
	public void keyPressed(int k) {
		if(k == KeyEvent.VK_A) player.setLeft(true);
		if(k == KeyEvent.VK_D) player.setRight(true);
		if(k == KeyEvent.VK_W) player.setUp(true);
		if(k == KeyEvent.VK_S) player.setDown(true);
		if(k == KeyEvent.VK_SPACE) player.setJumping(true);
		if(k == KeyEvent.VK_SHIFT) player.setGliding(true);
		if(k == KeyEvent.VK_K) player.setScratching();
		if(k == KeyEvent.VK_L) player.setFiring();
	}
	
	public void keyReleased(int k) {
		if(k == KeyEvent.VK_A) player.setLeft(false);
		if(k == KeyEvent.VK_D) player.setRight(false);
		if(k == KeyEvent.VK_W) player.setUp(false);
		if(k == KeyEvent.VK_S) player.setDown(false);
		if(k == KeyEvent.VK_SPACE) player.setJumping(false);
		if(k == KeyEvent.VK_SHIFT) player.setGliding(false);
	}
	
}













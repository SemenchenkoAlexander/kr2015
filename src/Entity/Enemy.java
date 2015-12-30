package Entity;

import TileMap.TileMap;

public class Enemy extends MapObject {
	
	protected int health;
	protected int maxHealth;
	protected boolean dead;
	protected int damage;
	
	protected boolean flinching;
	protected long flinchTimer;
	
	public Enemy(TileMap tm) {
		super(tm);
	}
	
	public boolean isDead() { return dead; }
	
	public int getDamage() { return damage; }

	public void hit(int damage) {
	        dead = true;
	}

	public void update() {}
	
}















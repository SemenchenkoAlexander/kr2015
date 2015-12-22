package GameState;

<<<<<<< HEAD
public abstract class GameState {
	
	protected GameStateManager gsm;
	
	public abstract void init();
	public abstract void update();
	public abstract void draw(java.awt.Graphics2D g);
	public abstract void keyPressed(int k);
	public abstract void keyReleased(int k);
	
=======
import java.awt.*;
import TileMap.Background;
/**
 * Created by Alexander on 14.12.15.
 */

public abstract class GameState {

    protected GameStateManager gsm;

    public abstract void init();
    public abstract void update();
    public abstract void draw(Graphics2D g);
    public abstract void keyPressed(int k);
    public abstract void keyReleased(int k);


>>>>>>> 9a33ff1aba840776eb498aa48176e2d3372ef271
}

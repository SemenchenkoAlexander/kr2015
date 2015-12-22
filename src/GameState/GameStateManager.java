package GameState;

<<<<<<< HEAD
import java.util.ArrayList;

public class GameStateManager {
	
	private GameState[] gameStates;
	private int currentState;
	
	public static final int NUMGAMESTATES = 2;
	public static final int MENUSTATE = 0;
	public static final int LEVEL1STATE = 1;
	
	public GameStateManager() {
		
		gameStates = new GameState[NUMGAMESTATES];
		
		currentState = MENUSTATE;
		loadState(currentState);
		
	}
	
	private void loadState(int state) {
		if(state == MENUSTATE)
			gameStates[state] = new MenuState(this);
		if(state == LEVEL1STATE)
			gameStates[state] = new Level1State(this);
	}
	
	private void unloadState(int state) {
		gameStates[state] = null;
	}
	
	public void setState(int state) {
		unloadState(currentState);
		currentState = state;
		loadState(currentState);
		//gameStates[currentState].init();
	}
	
	public void update() {
		try {
			gameStates[currentState].update();
		} catch(Exception e) {}
	}
	
	public void draw(java.awt.Graphics2D g) {
		try {
			gameStates[currentState].draw(g);
		} catch(Exception e) {}
	}
	
	public void keyPressed(int k) {
		gameStates[currentState].keyPressed(k);
	}
	
	public void keyReleased(int k) {
		gameStates[currentState].keyReleased(k);
	}
	
}









=======
/**
 * Created by Alexander on 14.12.15.
 */
import java.util.ArrayList;

public class GameStateManager {

    private ArrayList<GameState> gameStates;
    private int currentState;

    public static final int MENUSTATE=0;
    public static final int LEVEL1STATE = 1;

    public GameStateManager(){

        gameStates=new ArrayList<GameState>();

        currentState=0;
        gameStates.add(new MenuState(this));

    }


    public void setState(int state){
        currentState=state;
        gameStates.get(currentState).init();
    }

    public void update(){
        gameStates.get(currentState).update();
    }

    public void draw (java.awt.Graphics2D g){
        gameStates.get(currentState).draw(g);
    }

    public void keyReleased(int k){
        gameStates.get(currentState).keyReleased(k);
    }
}
>>>>>>> 9a33ff1aba840776eb498aa48176e2d3372ef271

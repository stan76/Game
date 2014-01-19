package com.ip.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Array;
import com.ip.game.entities.EntityPlayer;
import com.ip.game.entities.GameObject;
import com.ip.game.gui.GuiIngame;
import com.ip.game.gui.GuiScreen;
import com.ip.game.utils.KeyListener;
import com.ip.game.world.Region;


public class Game extends com.badlogic.gdx.Game {

	public static final String NAME = "Game IP";
	public static final String VERSION = "V1";
	public static final int SCALE = 2;
	public static final int WIDTH = 1024;
	public static final int HEIGHT = WIDTH * 3 / 4;
	
	private static Game instance;
	private KeyListener keyListener;
	
	//SCREEN
	private GuiIngame guiIg;
	
	//GAME OBJECTS
	private Array<GameObject> gameObject = new Array<GameObject>();
	private EntityPlayer player;
	private Region region;
	
	
	public Game(){
		instance = this;
	}
	
	public void create() {
		keyListener = new KeyListener();
		Gdx.input.setInputProcessor(keyListener);
		
		guiIg = GuiScreen.GUI_INGAME;
		super.setScreen(guiIg);
		
		player = new EntityPlayer("Joueur 1", 32, 32);
		gameObject.add(player);
		
		region = new Region("main");
	}

	public void render() {
		keyListener.tick();
		super.render();
	}

	public void resize(int width, int height) {
		super.resize(width, height);
	}
	
	public void dispose() {
		super.dispose();
		
	}

	public void pause() {
		super.pause();
	}

	public void resume() {
		super.resume();
	}
	
	public void quit(){
		Gdx.app.exit();
	}
	
	public Array<GameObject> getGameObjects() {
		return gameObject;
	}
	
	public EntityPlayer getPlayer(){
		return player;
	}
	
	public Region getCurrentRegion(){
		return region;
	}
	
	public static Game getInstance(){
		return instance;
	}
	
	public static boolean needsOpenGL20() {
		return true;
	}
}

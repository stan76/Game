package com.ip.game;

import com.ip.gui.GuiIngame;
import com.ip.gui.GuiScreen;


public class Game extends com.badlogic.gdx.Game {

	public static final String NAME = "Game IP";
	public static final String VERSION = "V1";
	public static final int SCALE = 2;
	public static final int WIDTH = 800;
	public static final int HEIGHT = WIDTH * 3 / 4;
	private GuiIngame guiIg;
	public void create() {
		guiIg = GuiScreen.GUI_INGAME;
		super.setScreen(guiIg);
	}

	public void render() {		
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
	public static boolean needsOpenGL20() {
		return true;
	}
}

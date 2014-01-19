package com.ip.game.gui;

import com.badlogic.gdx.Screen;

public abstract class GuiScreen implements Screen {
	public static final GuiIngame GUI_INGAME = new GuiIngame();
	protected String name;
	protected GuiScreen(String name){
		this.name = name;
		
	}

	public abstract void show();
	
	public abstract void render(float delta); 

	public abstract void resize(int width, int height);

	public abstract void hide();

	public abstract void pause();

	public abstract void resume();

	public abstract void dispose();
	
	public String getName() {
		return name;		
	}
	
}

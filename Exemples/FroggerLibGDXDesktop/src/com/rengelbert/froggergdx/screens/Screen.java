package com.rengelbert.froggergdx.screens;

import java.util.ArrayList;
import java.util.List;

import com.rengelbert.froggergdx.Game;
import com.rengelbert.froggergdx.sprites.GameSprite;

public abstract class Screen  implements com.badlogic.gdx.Screen {

	
	public List<GameSprite> elements;
	protected Game _game;
	
	public Screen (Game game) {
		this._game = game;
		elements = new ArrayList<GameSprite>();
	}
	
	public void pause () {};
	public void resume () {};
	public void dispose (){};
	public void hide (){};
	public void show (){};
	public void destroy () {};
	
	public abstract void createScreen ();
	public abstract void update (float dt);
	
	@Override
	public void render(float arg0) {
	}

	@Override
	public void resize(int arg0, int arg1) {
	}
}

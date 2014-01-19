package com.ip.game.gui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.ip.game.Game;
import com.ip.game.entities.GameObject;

public class GuiIngame extends GuiScreen {

	private SpriteBatch batch;
	private OrthographicCamera camera;
	private Sprite bg;
	
	protected GuiIngame() {
		super("GuiIngame");
		batch = new SpriteBatch();
		camera = new OrthographicCamera(Game.WIDTH, Game.HEIGHT);
		bg = new Sprite(new Texture(Gdx.files.internal("textures/bg.jpg")));
	}

	public void show() {
		
	}

	public void render(float delta) {
		batch.begin();
			batch.draw(bg, 0, 0, Game.WIDTH, Game.HEIGHT); //BG
			for(GameObject o : Game.getInstance().getGameObjects()) 
			{
				o.render(delta, camera, batch);
			}
		batch.end();
		
	}

	public void resize(int width, int height) {
		
	}

	public void hide() {
		
	}

	public void pause() {
		
	}

	public void resume() {
		
	}

	public void dispose() {
		
	}
	
}

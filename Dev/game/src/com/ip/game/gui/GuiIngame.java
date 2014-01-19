package com.ip.game.gui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.ip.game.Game;
import com.ip.game.entities.GameObject;

public class GuiIngame extends GuiScreen {

	private SpriteBatch batch;
	private OrthographicCamera camera;
	//private Sprite bg;
	
	protected GuiIngame() {
		super("GuiIngame");
		batch = new SpriteBatch();
		camera = new OrthographicCamera(Game.WIDTH, Game.HEIGHT);
		//bg = new Sprite(new Texture(Gdx.files.internal("textures/bg.jpg")));
	}

	public void show() {
		
	}

	public void render(float delta) {
		Gdx.gl.glClearColor(119/255f, 181/255f, 254/255f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		Game.getInstance().getCurrentRegion().render(delta, camera, batch);
		camera.setToOrtho(false, Game.WIDTH, Game.HEIGHT);
		
		batch.begin();
			//batch.draw(bg, 0, 0, Game.WIDTH, Game.HEIGHT); //BG
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
	public SpriteBatch getBatch() {
		return batch;
	}
}

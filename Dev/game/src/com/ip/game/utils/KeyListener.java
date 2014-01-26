package com.ip.game.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.ip.game.Game;
import com.ip.game.entities.EntityPlayer;




public class KeyListener implements InputProcessor {
	
	public boolean keyDown(int keycode) {
		switch (keycode) {
		case Keys.ESCAPE:
			Game.getInstance().quit();
			break;
		}
		return false;
	}

	public boolean keyUp(int keycode) {
		//Le switch permet d'arrêter le joueur quand une touche est lâchée
		switch (keycode) {
		case Keys.LEFT:
			Game.getInstance().getPlayer().move(0,0);
			break;
		case Keys.Q:
			Game.getInstance().getPlayer().move(0,0);
			break;
		case Keys.RIGHT:
			Game.getInstance().getPlayer().move(0,0);
			break;
		case Keys.D:
			Game.getInstance().getPlayer().move(0,0);
			break;
		case Keys.UP:
			Game.getInstance().getPlayer().move(0,0);
			break;
		case Keys.Z:
			Game.getInstance().getPlayer().move(0,0);
			break;
		}
		return false;
	}


	public boolean keyTyped(char character) {

		return false;
	}


	public boolean touchDown(int screenX, int screenY, int pointer, int button) {

		return false;
	}


	public boolean touchUp(int screenX, int screenY, int pointer, int button) {

		return false;
	}


	public boolean touchDragged(int screenX, int screenY, int pointer) {

		return false;
	}


	public boolean mouseMoved(int screenX, int screenY) {

		return false;
	}


	public boolean scrolled(int amount) {

		return false;
	}
	
	public void tick(){
		if(Gdx.input.isKeyPressed(Keys.LEFT) || Gdx.input.isKeyPressed(Keys.Q)){
			EntityPlayer p = Game.getInstance().getPlayer();
			p.move(-9,0);
		}
		if(Gdx.input.isKeyPressed(Keys.RIGHT) || Gdx.input.isKeyPressed(Keys.D)){
			EntityPlayer p = Game.getInstance().getPlayer();
			p.move(10,0);
		}
		if(Gdx.input.isKeyPressed(Keys.UP) || Gdx.input.isKeyPressed(Keys.Z)){
			jump();
		}
	}
	public void jump(){
		
		
	}
	
	
}
package com.ip.game.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Vector2;
import com.ip.game.Game;
import com.ip.game.entities.EntityPlayer;




public class KeyListener implements InputProcessor {

	private Vector2 position;
	private void moveShip(
		    float delta )
		{
		    // set the position vector to the ship's current position
		    position.set( x, y );
		 
		    // move UP or DOWN
		    if( Gdx.input.isKeyPressed( Input.Keys.UP ) ) {
		        position.add( 0, MAX_VERTICAL_SPEED * delta );
		    } else if( Gdx.input.isKeyPressed( Input.Keys.DOWN ) ) {
		        position.sub( 0, MAX_VERTICAL_SPEED * delta );
		    }
		 
		    // move LEFT or RIGHT
		    if( Gdx.input.isKeyPressed( Input.Keys.LEFT ) ) {
		        position.sub( MAX_HORIZONTAL_SPEED * delta, 0 );
		    } else if( Gdx.input.isKeyPressed( Input.Keys.RIGHT ) ) {
		        position.add( MAX_HORIZONTAL_SPEED * delta, 0 );
		    }
		 
		    // update the ship's actual position
		    x = position.x;
		    y = position.y;
		}
	
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
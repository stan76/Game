package com.rengelbert.froggergdx;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.rengelbert.froggergdx.data.GameData;
import com.rengelbert.froggergdx.screens.Screen;

public class Game implements ApplicationListener {

	public static final int GAME_STATE_PLAY = 0;
	public static final int GAME_STATE_PAUSE = 1;
	public static final int GAME_STATE_ANIMATE = 2;
	
	public Screen screen;
	
	public GameData gameData;
	public SpriteBatch spriteBatch;
	public OrthographicCamera camera;
	public int screenWidth = 0;
	public int screenHeight = 0;
	
	protected HashMap<String, Screen> _screens;
	
	
	public void create() {
		_screens = new HashMap<String, Screen>();
		
	}
		
	public void setScreen (String screenClassName) {
			
			screenClassName = "com.rengelbert.froggergdx.screens."+screenClassName;
			Screen newScreen = null;
			
			if (_screens.containsKey(screenClassName) == false) {
				
				try {
					Class screenClass =  Class.forName(screenClassName); 
				    Constructor constructor = screenClass.getConstructor(Game.class);    
				    newScreen = (Screen) constructor.newInstance(this);
				    _screens.put(screenClassName, newScreen);
				} catch ( InvocationTargetException ex ){
					System.err.println( ex + " Screen with Wrong args in Constructor.");
				} catch ( NoSuchMethodException ex ){
				} catch ( ClassNotFoundException ex ){
			      System.err.println( ex + " Screen Class Not Found.");
			    } catch( InstantiationException ex ){
			      System.err.println( ex + " Screen Must be a concrete class.");
			    } catch( IllegalAccessException ex ){
			      System.err.println( ex + " Screen with Wrong number of args.");
			    }
			} else {
				newScreen = _screens.get(screenClassName);
			}
			
			if (newScreen == null) return;
			
			if (screen != null) {
				//remove current screen!
				screen.destroy();
			}
			screen = newScreen;
			screen.createScreen();
		
	}
	
	
	public void update (float dt) {}
	

	public void dispose() {
		// TODO Auto-generated method stub
	}

	public void pause() {
		// TODO Auto-generated method stub
	}

	public void render() {
		// TODO Auto-generated method stub
	}

	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub
	}

	public void resume() {
		// TODO Auto-generated method stub
	}
}
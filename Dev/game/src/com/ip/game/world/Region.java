package com.ip.game.world;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.ip.game.entities.GameObject;
import com.ip.game.gui.GuiScreen;

public class Region implements GameObject {
	
	private static int nextId = 0;
	
	private int id;
	private String name;
	private TiledMap map;
	private OrthogonalTiledMapRenderer renderer;
	
	public Region(String name){
		this.id = nextId ++;
		this.name = name;
		this.map = new TmxMapLoader().load("world/regions/" + this.name +"/map.tmx");
		renderer = new OrthogonalTiledMapRenderer(map, GuiScreen.GUI_INGAME.getBatch());
	}
	
	public void render(float delta, OrthographicCamera camera, SpriteBatch batch) {
		renderer.setView(camera);
		renderer.render();
	}

	public static int getNextId() {
		return nextId;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public TiledMap getMap() {
		return map;
	}

	public OrthogonalTiledMapRenderer getRenderer() {
		return renderer;
	}
	

}

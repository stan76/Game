package com.ip.game.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Entity implements GameObject {
	protected String name;
	protected int x,y;
	protected int width,height;
	protected Sprite sprite_left;
	protected Sprite sprite_right;
	protected int direction = 0;
	
	protected Entity(String name, Texture left, Texture right) {
		this.name = name;
		this.sprite_left = new Sprite(left);
		this.sprite_right = new Sprite(right);
	}
	
	public abstract void render(float delta, OrthographicCamera camera, SpriteBatch batch);
	
	public void move(float dx){
		x += (dx + Gdx.graphics.getDeltaTime()) / 3;
		if(dx > 1)
		{
			direction = 1;
		}
		else if(dx < 0)
		{
			direction = 0;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}

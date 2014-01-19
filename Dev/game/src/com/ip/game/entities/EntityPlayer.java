package com.ip.game.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class EntityPlayer extends Entity {
	
	public EntityPlayer(String name, int width, int height){
		super(name, new Texture(Gdx.files.internal("textures/char_left.png")),
				new Texture(Gdx.files.internal("textures/char_right.png")));
		this.name = name;
		this.width = width;
		this.height = height;
		spawn(400, 100);
	}
	
	public void spawn(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void render(float delta, OrthographicCamera camera, SpriteBatch batch){
		if(direction == 0)
		{
			batch.draw(sprite_left, x, y, width, height);
		}
		else if(direction == 1)
		{
			batch.draw(sprite_right, x, y, width, height);
		}
	}

}

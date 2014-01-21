package com.ip.game.entities;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//Interface GameObject.
public interface GameObject {
public void render(float delta, OrthographicCamera camera, SpriteBatch batch);
}

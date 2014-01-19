package com.ip.game.entities;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface GameObject {
public void render(float delta, OrthographicCamera camera, SpriteBatch batch);
}

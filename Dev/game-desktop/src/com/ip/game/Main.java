package com.ip.game;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = Game.NAME + " " + Game.VERSION;
		cfg.useGL20 = Game.needsOpenGL20();
		cfg.width = Game.WIDTH;
		cfg.height = Game.HEIGHT;
		
		new LwjglApplication(new Game(), cfg);
	}
}

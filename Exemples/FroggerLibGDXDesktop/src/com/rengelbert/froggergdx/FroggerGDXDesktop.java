package com.rengelbert.froggergdx;

import com.badlogic.gdx.backends.jogl.JoglApplication;


public class FroggerGDXDesktop {
	
	public static void main (String[] args) {
		
		//last parameter false = use OpenGL 1.1 and not 2.1+
		new JoglApplication(new FroggerGame(),
							"Frogger LibGDX",
							320, 480, false);
		
		
	}
}

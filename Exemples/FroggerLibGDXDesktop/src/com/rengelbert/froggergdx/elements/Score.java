package com.rengelbert.froggergdx.elements;

import com.rengelbert.froggergdx.Game;
import com.rengelbert.froggergdx.sprites.NumberSprite;

public class Score extends NumberSprite {

	public Score(Game game, float x, float y, String nameRoot) {
		super(game, x, y, nameRoot);
	}
	
	@Override 
	public void draw () {
		value = _game.gameData.score;
		super.draw();
	}
}

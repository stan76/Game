package com.rengelbert.froggergdx;

import com.rengelbert.froggergdx.FroggerGame;
import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;

public class FroggerGDX extends AndroidApplication {

	@Override
    public void onCreate(Bundle savedInstanceState) {

    	super.onCreate(savedInstanceState);
        initialize(new FroggerGame(), false);
        
    }
}
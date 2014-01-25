package com.ip.game.entities;



import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//Classe des joueurs qui étend la classe qui contient le positionnement des différents objets du jeu
public class EntityPlayer extends Entity {

	//Constructeur de la classe 
	public EntityPlayer(String name, int width, int height){
		//Appel du constructeur de la classe étendue. Les paramètres sont nom du joueur, et les deux images du joueur.
		super(name, new Texture(Gdx.files.internal("textures/char_left.png")),
				new Texture(Gdx.files.internal("textures/char_right.png")));
		this.name = name;
		this.width = width;
		this.height = height;
		//Endroit de spawn du joueur
		spawn(20, 190);
	}
	//////////////////////////////

	///////////////////////////////
	public void spawn(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	public void render(float delta, OrthographicCamera camera, SpriteBatch batch){
		//Nouvel affichage
		batch.setProjectionMatrix(camera.combined);
		//Si la direction est à gauche
		if(direction == 0)
		{
			//on dessine le joueur
			batch.draw(sprite_left, x, y, width, height);
		}
		else if(direction == 1)
		{
			batch.draw(sprite_right, x, y, width, height);
		}
		
	}

}

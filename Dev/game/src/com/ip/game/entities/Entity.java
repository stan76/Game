package com.ip.game.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

//Classe qui contient le positionnement des diff�rents objets du jeu (Player etc...)
public abstract class Entity implements GameObject {
	//Variable pour le nom du joueur
	protected String name;
	//Pour la position des objets
	protected int x,y;
	//Taille des objets
	protected int width,height;
	//Le sprite c'est tous les calculs de mouvement, position des objets etc ... Appartient � la lib
	protected Sprite sprite_left;
	protected Sprite sprite_right;
	//Variable direction � 1 pour positionner le player vers la droite
	protected int direction = 1;
	//Constructeur de la classe
	protected Entity(String name, Texture left, Texture right) {
		this.name = name;
		//Envoi des textures � la classe Sprite de la lib
		this.sprite_left = new Sprite(left);
		this.sprite_right = new Sprite(right);
	}
	
	public abstract void render(float delta, OrthographicCamera camera, SpriteBatch batch);
	//M�thode pour faire bouger le joueur sur la map (dx contient la valeur du d�placement)
	public void move(float dx, float dy){
		//On ajoute le d�placement effectu� � l'�tat actuel le tout divis� par 3 pour ralentir la vitesse
		x += (dx + Gdx.graphics.getDeltaTime()) / 3;
//		int saveY = y;
		y +=  (dy + Gdx.graphics.getDeltaTime());
		//Si d�placement sup�rieur � 0
		if(dx > 0)
		{
			//Direction � droite
			direction = 1;
		}
		else if(dx < 0)
		{
			//Direction � gauche
			direction = 0;
		}
//		int newPosition = y;
//		for(int i = saveY+1; i <= newPosition; i++)
//		{
//			try { 
//				  Thread.sleep(500);
//				}
//				catch (InterruptedException exception) {
//				  exception.printStackTrace();
//				}
//			y -=  (1 - Gdx.graphics.getDeltaTime());
//		}
	}
	
	//Getter et Setter pour lire et mettre � jour les variables d'info de l'objet
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

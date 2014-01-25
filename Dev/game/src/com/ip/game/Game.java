package com.ip.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Array;
import com.ip.game.entities.EntityPlayer;
import com.ip.game.entities.GameObject;
import com.ip.game.gui.GuiIngame;
import com.ip.game.gui.GuiScreen;
import com.ip.game.utils.KeyListener;
import com.ip.game.world.Region;

//CLASS PRINCIPAL
public class Game extends com.badlogic.gdx.Game {
	// constant useful for logging
    public static final String LOG = Game.class.getSimpleName();

	//D�claration des variables d'infos du jeu et de la fen�tre
	public static final String NAME = "Game IP";
	public static final String VERSION = "V1";
	public static final int SCALE = 2;
	public static final int WIDTH = 1024;
	public static final int HEIGHT = WIDTH * 3 / 4; //Ecran 4:3
	
	//D�claration de la variable pour accueillir l'instance de la classe principale
	private static Game instance;
	
	//D�claration de la variable pour accueillir l'instance de la classe de lecture de touche ==> (KeyListener)
	private KeyListener keyListener;
	
	//D�claration de la variable pour accueillir l'instance de la classe affichage dans la fen�tre (batch, background etc ...) ==> (GuiIngame)
	private GuiIngame guiIg;
	
	//D�claration et remplissage de la variable pour accueillir l'interface GameObject
	//Une interface permet d'instancier un ensemble de classes d�j� d�clar�es ==> http://fr.openclassrooms.com/informatique/cours/apprenez-a-programmer-en-java/les-interfaces.
	private Array<GameObject> gameObject = new Array<GameObject>();
	
	//D�claration de la variable d'informations des joueurs
	private EntityPlayer player;
	
	//D�claration de la variable d'informations du monde
	private Region region;
	
	//Constructeur de la classe
	public Game(){
		//instance en cours mise dans une variable
		instance = this;
	}
	
	public void create() {
		//Instanciation de la classe pour les touches
		keyListener = new KeyListener();
		//Cette m�thode g�re le touch screen pour les mobiles etc ...
		Gdx.input.setInputProcessor(keyListener);
		//Contient l'instance de la classe prot�g�e GuiIngame
		guiIg = GuiScreen.GUI_INGAME;
		//affichage du rendu � l'�cran � l'aide d'une m�thode de la lib
		super.setScreen(guiIg);
		//Instanciation du joueur
		player = new EntityPlayer("Joueur 1", 32, 32);
		//On ajoute le joueur � la liste des objets dans la variable qui contient les instances des classes appel� dans l'interface GameObject
		gameObject.add(player);
		//On instancie la classe r�gion (le param�tre attendu est le nom du monde, dossier qui contient la map et le tielset ==> game-android/assets/world/regions)
		region = new Region("main");
	}
	//La m�thode render sert � mettre � jour l'affichage
	public void render() {
		//Mise � jour de l'�tat des touches (savoir si on a appuy� sur une touche)
		keyListener.tick();
		//Appel de la m�thode de rendu de la lib
		super.render();
	}

	public void resize(int width, int height) {
		//On taille la fen�tre
		super.resize(width, height);
	}
	
	public void dispose() {
		super.dispose();
		
	}

	public void pause() {
		super.pause();
	}

	public void resume() {
		super.resume();
	}
	
	//Quitter l'application
	public void quit(){
		Gdx.app.exit();
	}
	
	//Getter pour lire les variable � partir d'autres classes
	public Array<GameObject> getGameObjects() {
		return gameObject;
	}
	
	public EntityPlayer getPlayer(){
		return player;
	}
	
	public Region getCurrentRegion(){
		return region;
	}
	
	public static Game getInstance(){
		return instance;
	}
	//M�thode qui retourne vrai pour l'utilisation du moteur OpenGL 2.0
	public static boolean needsOpenGL20() {
		return true;
	}
}

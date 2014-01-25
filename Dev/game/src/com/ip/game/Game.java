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

	//Déclaration des variables d'infos du jeu et de la fenêtre
	public static final String NAME = "Game IP";
	public static final String VERSION = "V1";
	public static final int SCALE = 2;
	public static final int WIDTH = 1024;
	public static final int HEIGHT = WIDTH * 3 / 4; //Ecran 4:3
	
	//Déclaration de la variable pour accueillir l'instance de la classe principale
	private static Game instance;
	
	//Déclaration de la variable pour accueillir l'instance de la classe de lecture de touche ==> (KeyListener)
	private KeyListener keyListener;
	
	//Déclaration de la variable pour accueillir l'instance de la classe affichage dans la fenêtre (batch, background etc ...) ==> (GuiIngame)
	private GuiIngame guiIg;
	
	//Déclaration et remplissage de la variable pour accueillir l'interface GameObject
	//Une interface permet d'instancier un ensemble de classes déjà déclarées ==> http://fr.openclassrooms.com/informatique/cours/apprenez-a-programmer-en-java/les-interfaces.
	private Array<GameObject> gameObject = new Array<GameObject>();
	
	//Déclaration de la variable d'informations des joueurs
	private EntityPlayer player;
	
	//Déclaration de la variable d'informations du monde
	private Region region;
	
	//Constructeur de la classe
	public Game(){
		//instance en cours mise dans une variable
		instance = this;
	}
	
	public void create() {
		//Instanciation de la classe pour les touches
		keyListener = new KeyListener();
		//Cette méthode gère le touch screen pour les mobiles etc ...
		Gdx.input.setInputProcessor(keyListener);
		//Contient l'instance de la classe protégée GuiIngame
		guiIg = GuiScreen.GUI_INGAME;
		//affichage du rendu à l'écran à l'aide d'une méthode de la lib
		super.setScreen(guiIg);
		//Instanciation du joueur
		player = new EntityPlayer("Joueur 1", 32, 32);
		//On ajoute le joueur à la liste des objets dans la variable qui contient les instances des classes appelé dans l'interface GameObject
		gameObject.add(player);
		//On instancie la classe région (le paramètre attendu est le nom du monde, dossier qui contient la map et le tielset ==> game-android/assets/world/regions)
		region = new Region("main");
	}
	//La méthode render sert à mettre à jour l'affichage
	public void render() {
		//Mise à jour de l'état des touches (savoir si on a appuyé sur une touche)
		keyListener.tick();
		//Appel de la méthode de rendu de la lib
		super.render();
	}

	public void resize(int width, int height) {
		//On taille la fenêtre
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
	
	//Getter pour lire les variable à partir d'autres classes
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
	//Méthode qui retourne vrai pour l'utilisation du moteur OpenGL 2.0
	public static boolean needsOpenGL20() {
		return true;
	}
}

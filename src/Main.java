// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Random;
import java.util.random.RandomGenerator;

import fr.caensup.pop.niveau.Emplacement;
import fr.caensup.pop.niveau.Map;
import fr.caensup.pop.personnage.Joueur;

public class Main {
    public static void main(String[] args) {

    	Joueur player = new Joueur("Prince", 5, 1);
    	Map map01 = new Map("Zone de départ", 4, 20);
    	
    	
    	int x = new Random().nextInt(4);
    	int y = new Random().nextInt(20);


    	Emplacement playerInitialPosition = map01.getGrille()[x][y];
    	
    	playerInitialPosition.placerPersonnage(player);
    	
    	
       
    }
}
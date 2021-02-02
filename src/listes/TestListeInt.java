/**
 * 
 */
package listes;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author manon
 *
 */
public class TestListeInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> liEntier = new ArrayList<Integer>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
		
		System.out.println("Liste de base :\n" + liEntier);
		
		//Affichez la taille de la liste
		System.out.println("\nLa liste a une taille de " + liEntier.size() + " nombres.");
		
		// Recherchez et affichez le plus grand élément de la liste
		Integer nbPlusGrand = 0;
		for (int i = 0; i < liEntier.size(); i++) {
			if (liEntier.get(i) > nbPlusGrand) {
				nbPlusGrand = liEntier.get(i);
			} 
		}
		System.out.println("Le plus grand élément est " + nbPlusGrand);
		
		// Supprimez le plus petit élément de la liste et affichez le résultat
		Integer nbPlusPetit = 0;
		for (int i = 0; i < liEntier.size(); i++) {
			if (liEntier.get(i) < nbPlusPetit) {
				nbPlusPetit = liEntier.get(i);
			} 
		}
		System.out.println("Le plus petit élément est " + nbPlusPetit);
		liEntier.remove(nbPlusPetit);
		System.out.println("\nListe après supression du plus petit élément :\n" + liEntier);
		
		// Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils deviennent
		// positifs
		for (int i = 0; i < liEntier.size(); i++) {
			if (liEntier.get(i) < 0) {
				liEntier.set(i , (Math.abs(liEntier.get(i))));
			} 
		}
		System.out.println("\nListe après avoir mis les élément négatif en positif :\n" +liEntier);
	
	}

}

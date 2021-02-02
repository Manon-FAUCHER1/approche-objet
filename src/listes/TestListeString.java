/**
 * 
 */
package listes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author manon
 *
 */
public class TestListeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> liVille = new ArrayList<String>();
		
		liVille.add("Nice");
		liVille.add("Carcassonne");
		liVille.add("Narbonne");
		liVille.add("Lyon");
		liVille.add("Foix");
		liVille.add("Pau");
		liVille.add("Marseille");
		liVille.add("Tarbes");
		
		//Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
		String ville = "";
		for (int i = 0; i < liVille.size(); i++) {
			if (liVille.get(i).length() > ville.length()) {
				ville = liVille.get(i);
			}
		}
		System.out.println(liVille);
		System.out.println("ville qui a le plus grand nombre de lettres est " + ville);
		
		// Modifiez le contenu de la liste de manière à mettre tous les noms de villes en
		// majuscules.
		liVille.replaceAll(String::toUpperCase );
		System.out.println("\nNom des villes en majuscule :\n" + liVille);
		
		// Supprimez de la liste les villes dont le nom commence par la lettre N.
		String villeN = "";
		for (int i = 0; i < liVille.size(); i++) {
			villeN = liVille.get(i);
			
			if (villeN.charAt(0) == 'N') {
					liVille.remove(i);
			}
			
		}
		System.out.println("\nListe après supression des villes commençant par la lettre N :\n" + liVille);
		
		
		
		
	}
}

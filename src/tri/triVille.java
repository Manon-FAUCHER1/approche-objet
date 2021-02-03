/**
 * 
 */
package tri;

import java.util.ArrayList;
import java.util.Collections;

import listes.Ville;

/**
 * @author manon
 *
 */
public class triVille {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Ville> villes = new ArrayList<Ville>();
		
		Ville v1 = new Ville("Nice", 343000 );
		Ville v2 = new Ville("Carcassonne", 47800);
		Ville v3 = new Ville("Narbonne", 53400);
		Ville v4 = new Ville("Lyon", 484000);
		Ville v5 = new Ville("Foix", 9700);
		Ville v6 = new Ville("Pau", 77200);
		Ville v7 = new Ville("Marseille",  850700);
		Ville v8 = new Ville("Tarbes", 40600);
		
		Collections.addAll(villes, v1,v2,v3,v4,v5,v6,v7,v8);
		
		
		System.out.println("Villes avant le tri :");
		for (Ville ville: villes) {
			System.out.print(ville + "\n");
		}
		
		// tri par ordre alphabétique avec sort() qui appelle automatiquement la methode compareTo()
		// tri ville par nombres d'habitants
		// Dans la classe listes.Ville interchanger les deux methodes compareTo()
		Collections.sort(villes);
		
		System.out.println("\nVilles avec tri :");
		for (Ville ville: villes) {
			System.out.print(ville + "\n");
		}
		
	
		// Tri avec ComparatorHabitant
		Collections.sort(villes, new ComparatorHabitant());
		
		System.out.println("\nVilles avec tri ComparatorHabitant :");
		for (Ville ville: villes) {
			System.out.print(ville + "\n");
		}
		
		
		// Tri avec ComparatorNom
		Collections.sort(villes, new ComparatorNom());
	
		System.out.println("\nVilles avec tri ComparatorNom :");
		for (Ville ville: villes) {
			System.out.print(ville + "\n");
		}
	}

}

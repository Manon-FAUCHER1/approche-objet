/**
 * 
 */
package maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

import listes.Ville;

/**
 * @author manon
 *
 */
public class ComptagePaysParContinent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Pays> liPays = new ArrayList<Pays>();
		
		Pays p1 = new Pays("France", 65, "Europe");
		Pays p2 = new Pays("Allemagne", 80, "Europe");
		Pays p3 = new Pays("Belgique", 10, "Europe");
		Pays p4 = new Pays("Russie", 150, "Asie");
		Pays p5 = new Pays("Chine", 1400, "Asie");
		Pays p6 = new Pays("Indonésie", 220, "Océanie");
		Pays p7 = new Pays("Australie", 65, "Océanie");
		
		Collections.addAll(liPays, p1,p2,p3,p4,p5,p6,p7);
		
		// Utilisez une HashMap pour réaliser un comptage du nombre de pays par continent
		HashMap<String, Integer> mapNbPays = new HashMap<String, Integer>();
		
		for (int i = 0; i < liPays.size(); i++) {
			
			Pays pay = liPays.get(i);
			String continant = pay.getContinent();
			
			Integer compteur = mapNbPays.get(continant);
			if (compteur == null) {
				compteur = 1;
			} else {
				compteur += 1;
			}
			mapNbPays.put(continant, compteur);
		}
		
		System.out.println(mapNbPays);
		
	}

}

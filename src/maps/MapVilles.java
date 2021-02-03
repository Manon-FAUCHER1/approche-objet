/**
 * 
 */
package maps;

import java.util.HashMap;
import java.util.Iterator;


import listes.Ville;

/**
 * @author manon
 *
 */
public class MapVilles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, Ville> mapVilles = new HashMap<>();
		
		Ville v1 = new Ville("Nice", 343000 );
		mapVilles.put(v1.getNom(), v1);
		Ville v2 = new Ville("Carcassonne", 47800);
		mapVilles.put(v2.getNom(), v2);
		Ville v3 = new Ville("Narbonne", 53400);
		mapVilles.put(v3.getNom(), v3);
		Ville v4 = new Ville("Lyon", 484000);
		mapVilles.put(v4.getNom(), v4);
		Ville v5 = new Ville("Foix", 9700);
		mapVilles.put(v5.getNom(), v5);
		Ville v6 = new Ville("Pau", 77200);
		mapVilles.put(v6.getNom(), v6);
		Ville v7 = new Ville("Marseille",  850700);
		mapVilles.put(v7.getNom(), v7);
		Ville v8 = new Ville("Tarbes", 40600);
		mapVilles.put(v8.getNom(), v8);
		
		// Recherchez et supprimez la ville qui a le moins d’habitants
		
		long min = Integer.MAX_VALUE;
		String keyRemove = null;
		
		Iterator<String> iter = mapVilles.keySet().iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Ville ville = mapVilles.get(key);
			
			if (ville.getNbHabitant() < min) {
				min = ville.getNbHabitant();
				keyRemove = key;
			}
		}
		mapVilles.remove(keyRemove);
		System.out.println(mapVilles);

	}

}

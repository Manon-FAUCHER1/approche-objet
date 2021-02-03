/**
 * 
 */
package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import listes.Ville;

/**
 * @author manon
 *
 */
public class FusionMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		
		// Créer une map appelée map3 et qui contient l’ensemble des données des 2 maps
		// précédentes avec les mêmes clés et les mêmes valeurs
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		for (int i = 0; i < map2.size(); i++) {
			for (int j = 0; j < map1.size(); j++) {
				map3.putAll(map1);
				map3.putAll(map2);
			}
			
		}

		System.out.println("Afichage de MAP3 qui contient MAP1 et MAP2 :");
	        
		Iterator iterator = map3.entrySet().iterator();
	    while (iterator.hasNext()) {
	    	Map.Entry mapentry = (Map.Entry) iterator.next();
	    	System.out.println("clé: "+mapentry.getKey()
	                            + " | valeur: " + mapentry.getValue());
	    }
		
		
	}

}

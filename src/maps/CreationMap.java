/**
 * 
 */
package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author manon
 *
 */
public class CreationMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, Integer> mapSalaires = new HashMap<>();
		
		mapSalaires.put("Paul", 1750);
		mapSalaires.put("Hicham", 1825);
		mapSalaires.put("Yu", 2250);
		mapSalaires.put("Ingrid", 2015);
		mapSalaires.put("Chantal", 2418);
		
		// Afficher le contenu du MAP
		Set<String> listKeys = mapSalaires.keySet();  
		Iterator<String> iter = listKeys.iterator();
		
		while(iter.hasNext())
		{
			Object key = iter.next();
			System.out.println (key + " => " + mapSalaires.get(key));
		}
		System.out.println("La taille de la MAP et de : " + mapSalaires.size());

	}

}

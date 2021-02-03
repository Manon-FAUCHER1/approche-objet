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
public class CreationEtManipulationMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		// Ajouter dans mapVilles les informations pour Lille, Lyon et Bordeaux
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		// Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map
		Set<Integer> listKeys=mapVilles.keySet();  
		Iterator<Integer> iter=listKeys.iterator();
		
		System.out.println("Liste des clés contenues dans la MAP :");
		while(iter.hasNext())
		{
			Object key= iter.next();
			System.out.print(key + ", ");
		}
		
		// Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
		
		Set<Integer> listKeys2=mapVilles.keySet(); 
		Iterator<Integer> iter2=listKeys.iterator();

		System.out.println("\n\nAffichage de l'ensemble des valeurs contenues dans la map :");
		while(iter2.hasNext())
		{
			Object key= iter2.next();
			System.out.println (mapVilles.get(key));
		}
		
		// Afficher la taille de la map
		System.out.println("\nLa taille de la MAP et de : " + mapVilles.size());
	

	}

}

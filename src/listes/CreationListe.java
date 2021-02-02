/**
 * 
 */
package listes;

import java.util.ArrayList;


/**
 * @author manon
 *
 */
public class CreationListe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> nb = new ArrayList<Integer>();
		
		 for (int i = 1; i < 101; i++) {
			nb.add(i);
		}
		 System.out.println(nb);
		 
		 // Affichez la taille de la liste
		 System.out.println("Taille la liste : " + nb.size());

	}

}

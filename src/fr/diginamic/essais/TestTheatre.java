/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

/**
 * @author manon
 *
 */
public class TestTheatre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Theatre theatre = new Theatre("Th��tre de P�ris", 350, 341, 6820);
		
		theatre.inscrire(4, 20);
		theatre.inscrire(2, 20);
		theatre.inscrire(1, 20);
		theatre.inscrire(3, 20);
		
		System.out.println("Il y a " + theatre.getNbInscrits() + " personnes incrites sur " + theatre.getCapaciteMax() + " places.\n"
				+ "La recette du th��tre s'�l�ve a " + theatre.getRecette() + "�");
	}

}

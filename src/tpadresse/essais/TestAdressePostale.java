/**
 * 
 */
package tpadresse.essais;

import tpadresse.entites.AdressePostale;

/**
 * @author manon
 *
 */
public class TestAdressePostale {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AdressePostale a1 = new AdressePostale(57,"Boulevard des Tribunes","44300","Nantes");
		
//		a1.numeroRue = 57;
//		a1.libelleRue = "Boulevard des Tribunes";
//		a1.codePostal = "44300";
//		a1.ville = "Nantes";
		
		
		AdressePostale a2 = new AdressePostale(12, "Routes de l'hermitain", "79260", "Romans");
		
//		a2.numeroRue = 12;
//		a2.libelleRue = "Routes de l'hermitain";
//		a2.codePostal = "79260";
//		a2.ville = "Romans";
		

	}

}

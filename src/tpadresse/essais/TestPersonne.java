/**
 * 
 */
package tpadresse.essais;

import tpadresse.entites.AdressePostale;
import tpadresse.entites.Personne;

/**
 * @author manon
 *
 */
public class TestPersonne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AdressePostale a1 = new AdressePostale(57,"Boulevard des Tribunes","44300","Nantes");
		AdressePostale a2 = new AdressePostale(12, "Routes de l'hermitain", "79260", "Romans");
		
		Personne p1 = new Personne("FAUCHER", "Manon");
		Personne p2 = new Personne("Mike", "PROTER", "12 Routes de l'hermitain, 79260 Romans");
		
		p1.name(p1.getNom(), p1.getPrenom());
		
		p1.setAdressePostale(a1);
		p1.getAdressePostale();
		System.out.println(p1);
		
	}

}

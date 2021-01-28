/**
 * 
 */
package fr.diginamic.banque;
import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

/**
 * @author manon
 *
 */
public class TestBanque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Compte a = new Compte(13, 1358.14);
		CompteTaux b = new CompteTaux(65, 1693, 43);
		
		Compte[] tabCompte = {a,b};
		
		for (int i = 0; i < tabCompte.length; i++) {
			System.out.println(tabCompte[i]);
		}
		
	
	
	}

}

/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

/**
 * @author manon
 *
 */
public class TestForme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Cercle ce1 = new Cercle(5.46);
		Rectangle re1 = new Rectangle(16.5, 9.4);
		Carre ca1 = new Carre(14);
		
		AffichageForme.afficher(ce1);
		AffichageForme.afficher(re1);
		AffichageForme.afficher(ca1);
		
	}

}

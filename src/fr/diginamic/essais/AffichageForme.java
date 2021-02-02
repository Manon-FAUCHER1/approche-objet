/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

/**
 * @author manon
 *
 */
public class AffichageForme {
	
	public static void afficher(Forme forme) {
		System.out.println("\n" + forme.getClass().getSimpleName());
		System.out.println("Périmètre : " + forme.calculerPerimetre());
		System.out.println("Surface : " + forme.calculerSurface());
		
	}
 
}

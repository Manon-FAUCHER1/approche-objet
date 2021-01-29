/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

/**
 * @author manon
 *
 */
public class TestCercle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Cercle c1 = new Cercle(12);
		Cercle c2 = new Cercle(30);
		
		Cercle c3 = CercleFactory.retourCercle(54);
		
		System.out.println("Cercle n°1 de rayon : " + c1.getRayon());
		System.out.println("Périmetre : " + c1.perimetre());
		System.out.println("Surface : " + c1.surface() + "\n");
		
		System.out.println("Cercle n°1 de rayon :" + c2.getRayon());
		System.out.println("Périmetre : " + c2.perimetre());
		System.out.println("Surface : " + c2.surface() + "\n");
		
		System.out.println();
		
	}

}

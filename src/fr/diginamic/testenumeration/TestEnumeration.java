/**
 * 
 */
package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author manon
 *
 */
public class TestEnumeration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Saison[] saisons = Saison.values();
		
		for (Saison s : saisons) {
		       System.out.println(s);
		}
		
		String nom = "ETE";
		System.out.println("Saison associée au nom : " + Saison.valueOf(nom));

		String libelle = "Hiver";
		System.out.println("Saison associé au nom : ");
		
	}

}

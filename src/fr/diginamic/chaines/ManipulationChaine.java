/**
 * 
 */
package fr.diginamic.chaines;

import java.util.Arrays;

import fr.diginamic.entites.Salarie;

/**
 * @author manon
 *
 */
public class ManipulationChaine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String chaine = "Durand;Marcel;2 523.5"; 

		// 1
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		
		// 2
		int tailleChaine = chaine.length();
		System.out.println("La chaine fait " + tailleChaine + " caractères de longueur.");
		
		// 3
		int premierIndex = chaine.indexOf(';');
		System.out.println("L'index du premier \";\" » contenu dans la chaine de caractères est " + premierIndex);
		
		// 4
		String name = chaine.substring(0,chaine.indexOf(';'));
		System.out.println("Methode substring et indexOf combiner pour extraire les nom de fammille : " + name);
		
		// 5
		String nameMaj = chaine.toUpperCase().substring(0,premierIndex);
		System.out.println("Affichage du nom de famille en majuscule avec la methode toUpperCase() : " + nameMaj);
		
		// 6
		String nameMin = chaine.toLowerCase().substring(0,premierIndex);
		System.out.println("Affichage du nom de famille en minuscule avec la methode toLowerCase() : " + nameMin);
		
		// 7
		String[] tabChaine = chaine.split(";");
		System.out.println("Tableau retourner avec la methode split() : " + Arrays.toString(tabChaine));
		
		// 9 Dans la classe TestSalarie dans le package fr.diginamic.essais
		
	}

}

/**
 * 
 */
package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

import fr.diginamic.recensement.sercices.MenuService;
import fr.diginamic.recensement.sercices.RecherchePopulation;
import fr.diginamic.recensement.sercices.RechercheTopDix;

/**
 * @author manon
 *
 */
public class Application {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		Recensement recensement = new Recensement();
		String cheminFichier = "C:\\Users\\manon\\Documents\\2 - PROFESSIONNEL\\1 - FORMATIONS\\1 - DIGINAMIC\\2 - COURS & TP\\9 - Java approche objet\\J7 _ J8 - TP\\recensement.csv";
		
		recensement.recenserFichier(cheminFichier);
		
		Scanner sc = new Scanner(System.in);
		int choix = 0;
		
		while (choix != 9) {
			
			choix = Integer.parseInt(MenuService.displayMenu(sc));
			
			if (choix < 1 || choix > 9) {
				System.out.println("Le choix est incorrect");
			} else {
			
				switch (choix){			
					case 1: 
						RecherchePopulation rechercheV = new RecherchePopulation(1, "ville");
						rechercheV.traiter(sc,recensement);
						break;
					case 2 :
						RecherchePopulation rechercheD = new RecherchePopulation(2, "département");
						rechercheD.traiter(sc,recensement);
						break;
					case 3 :
						RecherchePopulation rechercheR = new RecherchePopulation(3, "région");
						rechercheR.traiter(sc,recensement);
						break;
					case 4 :
						RechercheTopDix rechercheTopR = new RechercheTopDix(4, "régions");
						rechercheTopR.traiter(sc,recensement);
						break;
					case 5 :
						RechercheTopDix rechercheTopD = new RechercheTopDix(5, "départements");
						rechercheTopD.traiter(sc,recensement);
						break;
					case 6 :
						RechercheTopDix rechercheTopVparD = new RechercheTopDix(6, "département");
						rechercheTopVparD.traiter(sc,recensement);
						break;
					case 7 :
						RechercheTopDix rechercheTopVparR = new RechercheTopDix(7, "région");
						rechercheTopVparR.traiter(sc,recensement);
						break;
					case 8 :
						RechercheTopDix rechercheTopV = new RechercheTopDix(8, "villes");
						rechercheTopV.traiter(sc,recensement);
						break;
					case 9 :
						System.out.println("Fermeture de menu.");
						sc.close();
						break;
				}
			}
			
		}
		
	}
}

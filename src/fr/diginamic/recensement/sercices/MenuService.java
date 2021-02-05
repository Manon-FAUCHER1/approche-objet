package fr.diginamic.recensement.sercices;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entities.Lieux;

public class MenuService {

	protected int choixMenu;
	protected String typeRecherche;
	protected String choix;
	
	public static String displayMenu(Scanner sc) {
		
		System.out.println("\n################# MENU #################\n");
		
		System.out.println("1. Population d’une ville");
		System.out.println("2. Population d’un département");
		System.out.println("3. Population d’une région");
		System.out.println("4. Liste les 10 régions les plus peuplées");
		System.out.println("5. Liste les 10 départements les plus peuplés");
		System.out.println("6. Liste les 10 villes les plus peuplées d’un département");
		System.out.println("7. Liste les 10 villes les plus peuplées d’une région");
		System.out.println("8. Liste les 10 villes les plus peuplées de France");
		
		System.out.println("\n9. Quitter");
		
		return sc.nextLine();
	}
	

	protected void displayTopDix(List<Lieux> listeLieux) {
		Collections.sort(listeLieux, Collections.reverseOrder());
		for (int i = 0; i <= 9; i++) {
			listeLieux.get(i).information();
		}
	}
	
	protected boolean verifSiEntreeOkExiste(List<Lieux> listeLieux, String code) {
		return listeLieux.stream().anyMatch(lieu -> lieu.getCode().equals(code));
	}
	
	protected String verifSiEntreeExiste(List<Lieux> listeLieux, String choix, Scanner sc) {
		while (!verifSiEntreeOkExiste(listeLieux, choix)) {
			System.out.println("La valeur renseigner ne correspond a aucune " + typeRecherche );
			System.out.println("1. Saisir de nouveau \n2. Quitter \n");
			Integer newChoix = Integer.parseInt(sc.nextLine());
			
			while (newChoix < 1 || newChoix >2) {
				System.out.println("choix incorrect");
				System.out.println("1. Saisir de nouveau \n2. Quitter \n");
				newChoix = Integer.parseInt(sc.nextLine());
			}
			
			if (newChoix == 2) {
				return "back";
			}
			System.out.print("Merci de saisir un(e) " + typeRecherche + ":");
			choix = sc.nextLine();
		}
		return choix;
	}

}

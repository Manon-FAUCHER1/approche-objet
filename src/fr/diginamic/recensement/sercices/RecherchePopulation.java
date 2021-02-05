package fr.diginamic.recensement.sercices;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.entities.Lieux;

public class RecherchePopulation extends MenuService {
	
	public RecherchePopulation(int choixMenu, String typeRecherche) {
		this.choixMenu = choixMenu;
		this.typeRecherche = typeRecherche;
	}

	public void traiter(Scanner sc, Recensement recensement) {
		System.out.print("Merci de saisir un(e) " + typeRecherche + " :");
		choix = sc.nextLine(); // saisie du lieu
		
		List<Lieux> choixListe;
		
		if(choixMenu == 1) {
			choixListe = recensement.getPays().getListeVille();
		} else if (choixMenu == 2){
			choixListe = recensement.getPays().getListeDepartement();
		} else {
			choixListe = recensement.getPays().getListeRegion();
		}
		
		for (Lieux lieux : choixListe) {
			if (choix.equals(lieux.getCode())) {
				lieux.information();
			}
		}
		
		System.out.println("\nAppuyer sur une touche pour continuer");
		sc.nextLine();
		return;
	}


}

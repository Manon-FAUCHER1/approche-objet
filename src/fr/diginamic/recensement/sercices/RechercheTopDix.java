package fr.diginamic.recensement.sercices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.entities.Lieux;

public class RechercheTopDix extends MenuService{

	public RechercheTopDix(int choixMenu, String typeRecherche) {
		this.choixMenu = choixMenu;
		this.typeRecherche = typeRecherche;
	}
	
	public void traiter(Scanner sc, Recensement recensement) {
		
		List<Lieux> choixListe = new ArrayList<>();
		
		if (choixMenu == 4 || choixMenu == 5 || choixMenu == 8 ) { // top 10 du pay
			if (choixMenu == 4) { // Région
				choixListe = recensement.getPays().getListeRegion();
			} else if (choixMenu == 5){
				choixListe = recensement.getPays().getListeDepartement();
			} else {
				choixListe = recensement.getPays().getListeVille();
			}
			
		}else { // top 10 des villes par Région et par Département
			
			List<Lieux> choixAdditionnel = new ArrayList<>();
			
			if (choixMenu == 6) {
				System.out.print("Merci de saisir un département : \n");
				choixAdditionnel = recensement.getPays().getListeDepartement();
				this.choix = sc.nextLine();
			} else {
				System.out.print("Merci de saisir une région : \n");
				choixAdditionnel = recensement.getPays().getListeRegion();
				this.choix = sc.nextLine();
			}
			
			choix = verifSiEntreeExiste(choixAdditionnel, choix, sc);
			if (choix == "back") {
				return;
			} 		
			
			for (Lieux lieux : choixAdditionnel) {
				if (choix.equals(lieux.getCode())) {
					choixListe = lieux.getListeVille();
					System.out.println("Top 10 des villes pour le/la " + typeRecherche + " " + lieux.getNom() + " :");
				}
			}
			
		}
		
		this.displayTopDix(choixListe);
		 
		System.out.println("\nAppuyer sur une touche pour continuer");
		sc.nextLine();
		return;
	}
}

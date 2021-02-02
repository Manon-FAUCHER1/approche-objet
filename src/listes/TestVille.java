package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import listes.Ville;

public class TestVille {
	
	public static void main(String[] args) {
		ArrayList<Ville> villes = new ArrayList<Ville>();
		
		Ville v1 = new Ville("Nice", 343000 );
		Ville v2 = new Ville("Carcassonne", 47800);
		Ville v3 = new Ville("Narbonne", 53400);
		Ville v4 = new Ville("Lyon", 484000);
		Ville v5 = new Ville("Foix", 9700);
		Ville v6 = new Ville("Pau", 77200);
		Ville v7 = new Ville("Marseille",  850700);
		Ville v8 = new Ville("Tarbes", 40600);
		
		Collections.addAll(villes, v1,v2,v3,v4,v5,v6,v7,v8);
		for (Ville ville: villes) {
			System.out.print(ville + "\n");
		}
		
		
		// Recherchez et affichez la ville la plus peuplée
		long nbhabitant = 0;
		String nameVille = "";
		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getNbHabitant() > nbhabitant) {
				nbhabitant = villes.get(i).getNbHabitant();
				nameVille = villes.get(i).getNom();
			}
		}
		System.out.println("\nLa ville la plus peuplée est " + nameVille + " avec " + nbhabitant + " habitants");
		
		// Supprimez la ville la moins peuplée
		nbhabitant = villes.get(0).getNbHabitant();
		Ville villeRemove = null;
		for (int i = 1; i < villes.size(); i++) {
			if (villes.get(i).getNbHabitant() < nbhabitant) {
				nbhabitant = villes.get(i).getNbHabitant();
				nameVille = villes.get(i).getNom();
				villeRemove = villes.get(i);
			}
		}
		
		villes.remove(villeRemove);
		System.out.println("\nLa ville la moin peuplée est " + villeRemove + ", elle a été supprimer !\n");
		for (Ville ville: villes) {
			System.out.print(ville + "\n");
		}
		
		// Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
		Iterator<Ville> iter = villes.iterator();
		while (iter.hasNext()) {
			Ville ville = iter.next();
			
			if (ville.getNbHabitant() > 100000) {
				ville.setNom(ville.getNom().toUpperCase());
			}
		}
		System.out.println("\nListe avec les nom de ville de plus de 100 000 habitants en majuscule" + villeRemove + "");
		for (Ville ville: villes) {
			System.out.print(ville + "\n");
		}
		
		// Supprimer les ville de plus de 100 000 habs
		Iterator<Ville> iter2 = villes.iterator();
		while (iter2.hasNext()) {
			Ville ville = iter2.next();
			
			if (ville.getNbHabitant() > 100000) {
				iter2.remove();
			}
		}
		
		System.out.println("\nSuppresion des villes de plus de 100 000 habitants : ");
		for (Ville ville: villes) {
			System.out.print(ville + "\n");
		}
		
		
	}
}

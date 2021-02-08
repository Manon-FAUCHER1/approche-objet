package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {

		Salarie salarie = new Salarie("FAUCHER", "Manon", 3500);
		Pigiste pigiste = new Pigiste("FAUCHER", "Frederic", 21, 430);

		salarie.afficherDonnes();
		System.out.println();
		pigiste.afficherDonnes();

	}
}
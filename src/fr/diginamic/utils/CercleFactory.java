package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {
	
	public static Cercle retourCercle (double rayon) {
		Cercle c = new Cercle(rayon);
		return c;
	}

}

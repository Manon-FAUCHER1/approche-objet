package fr.diginamic.entites;

public class Theatre {

	String nom;
	int capaciteMax;
	int nbInscrits;
	double recette;
	
	public Theatre(String nom, int capaciteMax, int nbInscrits, double recette) {
		super();
		this.nom = nom;
		this.capaciteMax = capaciteMax;
		this.nbInscrits = nbInscrits;
		this.recette = recette;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public int getNbInscrits() {
		return nbInscrits;
	}

	public void setNbInscrits(int nbInscrits) {
		this.nbInscrits = nbInscrits;
	}

	public double getRecette() {
		return recette;
	}

	public void setRecette(double recette) {
		this.recette = recette;
	}

	public void inscrire(int nbClient, double prixPlace) {
		
		if (capaciteMax > nbInscrits && (capaciteMax - nbInscrits) > nbClient) {
			nbInscrits += nbClient;
			recette += (prixPlace * nbClient);
			System.out.println("Vous êtes bien inscrit !");
		} else {
			System.out.println("Désolé mais nous n'avont pas assez de places pour "+ nbClient +" personnes.\n"
					+ "Il nous reste que " + (capaciteMax - nbInscrits) + " places.");
		}

	}
	
}

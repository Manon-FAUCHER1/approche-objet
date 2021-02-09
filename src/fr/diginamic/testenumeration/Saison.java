package fr.diginamic.testenumeration;

public enum Saison {
	
	PRINTEMPS("Printemps", 1),
	ETE("Ete", 2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver", 4);
	
	private String nom;
	private int nbOrdre;
	
	private Saison(String nom,int nbOrdre) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbOrdre() {
		return nbOrdre;
	}

	public void setNbOrdre(int nbOrdre) {
		this.nbOrdre = nbOrdre;
	}
	
	
	public Saison retourInstance(String libelle) {
		Saison saison = Saison.valueOf(libelle);
		
		return saison;
	}
	
	
}

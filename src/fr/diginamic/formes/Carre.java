package fr.diginamic.formes;

public class Carre extends Rectangle{
	double cote;

	public Carre(double longueur, double largeur, double cote) {
		super(longueur, largeur);
		this.cote = cote;
	}

	public double getCote() {
		return cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
	}
	
	
}

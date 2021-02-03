package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	private double salaireMens;

	public Salarie(String nom, String prenom, double salaireMens) {
		super(nom, prenom);
		this.salaireMens = salaireMens;
	}

	public double getSalaireMens() {
		return salaireMens;
	}

	public void setSalaireMens(double salaireMens) {
		this.salaireMens = salaireMens;
	}

	@Override
	public double getSalaire() {
		return this.getSalaire();
	}

}

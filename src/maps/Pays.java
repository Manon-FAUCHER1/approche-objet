package maps;

public class Pays {

	private String nom;
	private double nbHabitants;
	private String continent;
	
	public Pays(String nom, long nbHabitants, String continent) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent = continent;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return nom + ", " + nbHabitants + " millions d’habitants, " + continent;
	}
	
	
	
}

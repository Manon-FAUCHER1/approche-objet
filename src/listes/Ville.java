package listes;

public class Ville implements Comparable<Ville>{
	private String nom;
	private long nbHabitant;
	
	public Ville(String nom, long nbHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(long nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	@Override
	public String toString() {
		return nom + " : " + nbHabitant + " Habs";
	}
	
	// Tri sur le nom par ordre alphabétique 
//	@Override
//	public int compareTo(Ville autre) {	
//		return this.nom.compareTo(autre.getNom());
//	}	
	
	// tri sur le nombre d'habitants
	@Override
	public int compareTo(Ville autre) {	
		
		if (this.nbHabitant > autre.getNbHabitant()){
			return 1;
			}
			if (this.nbHabitant < autre.getNbHabitant()){
			return -1;
			}
			return 0;
	}	
	
	public boolean aqual(Object obj) {
		
		// Vérifier que obj est bien une instance de Ville
		if (! (obj instanceof Ville)) {
			return false;
		}
		
		// A ce niveau on est sur que obj est bien une instance de Ville
		// Je peut transformer obj qui est de type Object en Ville
		Ville autre = (Ville)obj;
		
		// test 
		boolean egalite = this.nom.equals(autre.getNom()) && this.nbHabitant == autre.getNbHabitant();
		return egalite;
	}
	
	
	
	
	
	
		
	
	
	
}

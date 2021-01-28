/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * @author manon
 *
 */
public class Compte {

	int numCompte;
	double soldeCompte;
	
	
	public Compte(int numCompte, double soldeCompte) {
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}
	
	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	@Override
	public String toString() {
		return "Le compte " + numCompte + " a un solde de " + soldeCompte + " euros.";
	}
	
	
	

}

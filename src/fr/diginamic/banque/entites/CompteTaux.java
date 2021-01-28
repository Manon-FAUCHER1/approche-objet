/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * @author manon
 *
 */
public class CompteTaux extends Compte{
	
	double tauxRenumeration;

	public CompteTaux(int numCompte, double soldeCompte, double tauxRenumeration) {
		super(numCompte, soldeCompte);
		this.tauxRenumeration = tauxRenumeration;
	}

	public double getTauxRenumeration() {
		return tauxRenumeration;
	}

	public void setTauxRenumeration(double tauxRenumeration) {
		this.tauxRenumeration = tauxRenumeration;
	}

	@Override
	public String toString() {
		return super.toString() + " Le taux de renumération est de "+ tauxRenumeration + "%";
	}
	
	
	
	
	
	

	

}

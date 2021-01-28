/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * @author manon
 *
 */
public abstract class Operation {
	
	String dateOperation;
	double montantOperation;
	
	public Operation(String dateOperation, double montantOperation) {
		super();
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}
	
	
	public abstract String afficherType ();

	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontantOperation() {
		return montantOperation;
	}

	public void setMontantOperation(double montantOperation) {
		this.montantOperation = montantOperation;
	}

	@Override
	public String toString() {
		return "Date de l'operation :" + dateOperation + "\nMontant de l'operation :" + montantOperation;
	}
	
	
	

}

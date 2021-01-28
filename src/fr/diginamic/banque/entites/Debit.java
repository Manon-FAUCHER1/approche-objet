/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * @author manon
 *
 */
public class Debit extends Operation {

	public Debit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
		
	}
	
	@Override
	public String afficherType() {
		
		return "Débit";
	}
	
	

}

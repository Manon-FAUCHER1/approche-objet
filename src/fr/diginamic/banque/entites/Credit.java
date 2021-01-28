/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * @author manon
 *
 */
public class Credit extends Operation{

	public Credit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
		
	}

	@Override
	public String afficherType() {
		
		return "Crédit";
	}
	

}

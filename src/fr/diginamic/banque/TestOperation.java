/**
 * 
 */
package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

/**
 * @author manon
 *
 */
public class TestOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double tt = 0;
		
		Credit c1 = new Credit("28/01/2021", 2656.6);
		Credit c2 = new Credit("29/01/2021", 4245);
		Credit c3 = new Credit("30/01/2021", 24);
		Credit c4 = new Credit("01/02/2021", 31.5);
		
		Debit d1 = new Debit("02/02/2021", 492);
		Debit d2 = new Debit("03/02/2021", 53);
		Debit d3 = new Debit("04/02/2021", 24.3);
		Debit d4 = new Debit("05/02/2021", 358.05);
		
		Operation[] tabOperation = {c1, c2, c3, c4, d1, d2, d3, d4};
		
		System.out.println("Le montant total est de " + tt + "\n");
		
		for (int i = 0; i < tabOperation.length; i++) {
			if (tabOperation[i].afficherType() == "Crédit") {
				System.out.println(tabOperation[i].afficherType() + "\n" + tabOperation[i]);
				tt += tabOperation[i].getMontantOperation();
				System.out.println("Le montant total s'élève a " + tt + "\n");
			}else {
				System.out.println(tabOperation[i].afficherType() + "\n" + tabOperation[i]);
				tt -= tabOperation[i].getMontantOperation();
				System.out.println("Le montant total s'élève a " + tt + "\n");
			}			
		}

	}

}

/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.entites.Salarie;

/**
 * @author manon
 *
 */
public class TestSalarie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String salaire =  "2 523.5";
		
		salaire = salaire.replace(" ", "");
		
		double salairefinal = Double.parseDouble(salaire);

		Salarie p1 = new Salarie("Durand", "Marcel", salairefinal);
		

	}

}

/**
 * 
 */
package listes;

/**
 * @author manon
 *
 */
public class TestEquals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ville v1 = new Ville("Nantes", 9563);
		Ville v2 = new Ville("Nantes", 9563);
		Ville v3 = v2;
		
		boolean egalite = v3 == v2;
		System.out.println(egalite);
		
		boolean egal = v1 == v2;
		System.out.println(egal);

	}

}

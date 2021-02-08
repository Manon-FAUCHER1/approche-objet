/**
 * 
 */
package fr.diginamic.StringBuilder;

/**
 * @author manon
 *
 */
public class TestStringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long debut = System.currentTimeMillis();
		
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < 100_000; i++) {
			builder.append(i);
		}
		String chaine = builder.toString();
				
		long fin = System.currentTimeMillis();

		System.out.println("Temps écoulé en millisecondes :" + (fin-debut));
	}

}

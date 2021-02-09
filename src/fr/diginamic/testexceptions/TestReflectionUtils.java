/**
 * 
 */
package fr.diginamic.testexceptions;

import listes.Ville;

/**
 * @author manon
 *
 */
public class TestReflectionUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Ville v1 = new Ville("Nantes", 36500);
		ReflectionUtils reflection = new ReflectionUtils();
		
		try {
//			reflection.afficherAttributs(null);
			reflection.afficherAttributs(v1);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ReflectionException e) {
			e.printStackTrace();
		}
		
	}

}

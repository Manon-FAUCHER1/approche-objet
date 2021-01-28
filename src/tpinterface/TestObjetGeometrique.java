/**
 * 
 */
package tpinterface;

import tpinterface.entite.Cercle;
import tpinterface.entite.ObjetGeometrique;
import tpinterface.entite.Rectangle;

/**
 * @author manon
 *
 */
public class TestObjetGeometrique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cercle c1 = new Cercle(20);
		Rectangle r1 = new Rectangle(17, 9);
		
		
		ObjetGeometrique[] tabObjGeo = {c1, r1};
		
		for (int i = 0; i < tabObjGeo.length; i++) {
			System.out.println("Objet de type : " + tabObjGeo[i].getClass().getSimpleName());
			System.out.println("Périmetre : " + tabObjGeo[i].perimetre());
			System.out.println("Surface : " + tabObjGeo[i].surface() + "\n");
		}

	}

}

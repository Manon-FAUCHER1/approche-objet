/**
 * 
 */
package tpinterface.entite;

/**
 * @author manon
 *
 */
public class Rectangle implements ObjetGeometrique {
	double longueur;
	double largeur;
	
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	@Override
	public double perimetre() {
		return (longueur + largeur)*2;
	}
	
	@Override
	public double surface() {
		
		return longueur * largeur;
	}
	
	
}

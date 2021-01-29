/**
 * 
 */
package fr.diginamic.entites;

/**
 * @author manon
 *
 */
public class Cercle {
	
	double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public double perimetre() {
		return 2 * Math.PI * rayon;
	}

	public double surface() {
		return (rayon * rayon) * Math.PI;
	}

}

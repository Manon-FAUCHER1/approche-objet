/**
 * 
 */
package tpinterface.entite;

/**
 * @author manon
 *
 */
public class Cercle implements ObjetGeometrique {
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

	@Override
	public double perimetre() {
		return 2 * Math.PI * rayon;
	}

	@Override
	public double surface() {
		return (rayon * rayon) * Math.PI;
	}
	
	
}

package fr.diginamic.formes;

public class Cercle extends Forme{
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
	public double calculerSurface() {
		return (rayon * rayon) * Math.PI;
	}

	@Override
	public double calculerPerimetre() {
		return 2 * Math.PI * rayon;
	}

}

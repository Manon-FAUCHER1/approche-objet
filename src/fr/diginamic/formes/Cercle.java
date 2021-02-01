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
		return rayon;
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculerPerimetre() {
		return rayon;
		// TODO Auto-generated method stub
		
	}

}

package fr.diginamic.recensement.entities;


public class Departements extends Lieux {

	
	protected Regions region;
	protected Pays pays;
	
	public Departements(String code, String nom, Regions region, Pays pays) {
		super(code, nom);
		this.region = region;
		this.pays = pays;
		this.pays.addDepartement(this);
		
	}
	
	
	public void addVille(Ville ville) {
		this.population += ville.population;
		this.listeVille.add(ville);
	}
	

}

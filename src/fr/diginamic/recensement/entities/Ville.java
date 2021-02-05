/**
 * 
 */
package fr.diginamic.recensement.entities;

/**
 * @author manon
 *
 */
public class Ville extends Lieux{

	protected Departements departement;
	protected Regions region;
	protected Pays pays;


	public Ville(String code, String nom, Departements departement, Regions region, int population, Pays pays) {
		super(code, nom);
		this.population = population;
		this.departement = departement;
		this.region = region;
		this.pays = pays;
		this.departement.addVille(this);
		this.region.addVille(this);
		this.pays.addVille(this);
	}	
	
	

}

/**
 * 
 */
package fr.diginamic.recensement.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * @author manon
 *
 */
public class Pays extends Lieux {
	
	
	protected List<Lieux> listeDepartement = new ArrayList();
	protected List<Lieux> listeRegion = new ArrayList();

	public Pays(String code) {
		super(code, code);
	}
	
	public void addVille(Ville ville) {
		this.population += ville.population;
		this.listeVille.add(ville);
	}
	
	public void addDepartement(Departements departements) {
		this.listeDepartement.add(departements);
	}
	
	public void addRegion(Regions region) {
		this.listeRegion.add(region);
	}

	public List<Lieux> getListeDepartement() {
		return listeDepartement;
	}

	public List<Lieux> getListeRegion() {
		return listeRegion;
	}

}

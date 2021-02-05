package fr.diginamic.recensement.entities;

import java.util.ArrayList;
import java.util.List;

public class Regions extends Lieux {

	
	protected List<Lieux> listeDepartement = new ArrayList();
	protected Pays pays;
	
	public Regions(String code, String nom, Pays pays) {
		super(code, nom);
		this.pays = pays;
		this.pays.addRegion(this);
	}
	
	
	public void addVille(Ville ville) {
		this.population += ville.population;
		this.listeVille.add(ville);
	}
	
	public void addDepartement(Departements departements) {
		this.listeDepartement.add(departements);
	}

}

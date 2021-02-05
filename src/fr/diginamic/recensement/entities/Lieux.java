package fr.diginamic.recensement.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Lieux implements Comparable {

	protected List<Lieux> listeVille = new ArrayList();
	protected Integer population = 0;
	protected String code;
	protected String nom;
	
	public Lieux(String code, String nom) {		
		this.code = code;
		this.nom = nom;
	}

	public Integer getPopulation() {
		return population;
	}
	
	public void information() {
		System.out.println(this.nom + " => " + this.population + " Habitants");
	}

	public String getCode() {
		return code;
	}

	public String getNom() {
		return nom;
	}

	public List<Lieux> getListeVille() {
		return listeVille;
	}
	
	public int compareTo(Object o) {
		Lieux autreLieu = (Lieux)o;
		return this.population.compareTo(autreLieu.population);
	}
	
	
}

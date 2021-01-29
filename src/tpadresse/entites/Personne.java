
package entites;

import entites.AdressePostale;

/**
 * @author manon FAUCHER
 *
 */
public class Personne {

	String nom;
	String prenom;
	AdressePostale adressePostale;
	
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, String adressePostale) {
		
	}
	
	public void name(String nom, String prenom) {
		System.out.println(">> " + nom.toUpperCase() + " " + prenom + " <<\n");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public AdressePostale getAdressePostale() {
		return adressePostale;
	}

	public void setAdressePostale(AdressePostale adressePostale) {
		this.adressePostale = adressePostale;
	}

	@Override
	public String toString() {
		return prenom + " " + nom  + "\n" + adressePostale ;
	}
	
	


	
	
	
	
}

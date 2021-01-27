/**
 * 
 */
package entites;

/**
 * @author manon
 *
 */
public class AdressePostale {
	
	public int numeroRue;
	public String libelleRue;
	public String codePostal;
	public String ville;
	
	public AdressePostale(int numeroRue, String libelleRue, String codePostal, String ville) {
		super();
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	@Override
	public String toString() {
		return numeroRue + " " + libelleRue + ", " + codePostal + " " + ville;
	}
	
	

}

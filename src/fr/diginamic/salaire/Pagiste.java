package fr.diginamic.salaire;

public class Pagiste extends Intervenant{
	private int nbJour;
	private double remunerationJournalier;
	
	public Pagiste(String nom, String prenom,int nbJour, double remunerationJournalier) {
		super(nom, prenom);
		this.nbJour = nbJour;
		this.remunerationJournalier = remunerationJournalier;
	}
	
	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}

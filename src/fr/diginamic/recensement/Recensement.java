/**
 * 
 */
package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.diginamic.recensement.entities.Departements;
import fr.diginamic.recensement.entities.Pays;
import fr.diginamic.recensement.entities.Regions;
import fr.diginamic.recensement.entities.Ville;

/**
 * @author manon
 *
 */
public class Recensement {
	protected Map<String, Regions> mapRegion = new HashMap<>();
	protected Map<String, Departements> mapDepartement = new HashMap<>();
	protected Pays france;
	
	public void recenserFichier(String cheminFichier) throws IOException {
		Path fichierTraitement = Paths.get(cheminFichier);
		List<String> lignesFichier = Files.readAllLines(fichierTraitement, StandardCharsets.UTF_8);
		
		france = new Pays("france");
		
		for (String ligne : lignesFichier) {
			String[] colonne = ligne.split(";");
			
			if(colonne[0].matches("\\d+")) {
				// a partir d'ici on commence le traitement
				int populationTotale = Integer.parseInt(colonne[9].replace(" ", ""));
				String codeRegion = colonne[0];
				String codeDepartement = colonne[2];
				String codeVille = colonne[6];
				
				String nomRegion = colonne[1];
	
				if (!mapRegion.containsKey(codeRegion)) {
					Regions regions = new Regions(codeRegion, nomRegion, france);
					mapRegion.put(codeRegion, regions);
				}
				
				
				if (!mapDepartement.containsKey(codeDepartement)) {
					Departements departement = new Departements(codeDepartement, codeDepartement, mapRegion.get(codeRegion), france);
					mapDepartement.put(codeDepartement, departement);
				}
				
				Ville ville = new Ville(codeVille, codeVille, mapDepartement.get(codeDepartement), mapRegion.get(codeRegion), populationTotale, france);
				
			}
		}
	}
	
	public Pays getPays() {
		return this.france;
	}
	
	
}

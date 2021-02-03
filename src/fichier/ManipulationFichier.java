/**
 * 
 */
package fichier;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/**
 * @author manon
 *
 */
public class ManipulationFichier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\manon\\Documents\\2 - PROFESSIONNEL\\1 - FORMATIONS\\1 - DIGINAMIC\\2 - COURS & TP\\9 - Java approche objet\\J5 _ J6\\TP\\files\\recensement.csv");

//		System.out.println(path.getRoot());
//		System.out.println(path.getParent());
//		System.out.println(path.getFileName());
		
//		boolean estFichier = Files.isRegularFile(path);
//		boolean estLisible = Files.isReadable(path);
//		System.out.println(estFichier);
//		System.out.println(estLisible);
		
		try {
			List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

			for (int i = 0; i < lines.size(); i++) {
				System.out.println(lines.get(i));
			}
			
			List<String> lines2 = new ArrayList<>();
			
			for (int i = 1; i < lines.size(); i++) {
				String line = lines.get(i);
				String[] tokens = line.split(";");
				
				int token = Integer.parseInt(tokens[9].trim().replaceAll(" ", ""));	
				
				if(token > 25000) {
					String newline = tokens[6] + ";" + tokens[2] + ";" + tokens[9];
					lines2.add(newline);
				}
				
				
			}
			
			Path newPath = Paths.get("C:\\Users\\manon\\Documents\\2 - PROFESSIONNEL\\1 - FORMATIONS\\1 - DIGINAMIC\\2 - COURS & TP\\9 - Java approche objet\\J5 _ J6\\TP\\files\\recensement2.csv");
			Files.write(newPath, lines2);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

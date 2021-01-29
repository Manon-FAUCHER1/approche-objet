package fr.diginamic.essais;

import java.util.Arrays;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {

		CalculMoyenne calculMoyen = new CalculMoyenne();
		calculMoyen.ajout(1.3);
		calculMoyen.ajout(56);
		calculMoyen.ajout(-2.9);
		calculMoyen.ajout(532.05);
		calculMoyen.ajout(-23);			
		
		System.out.println(Arrays.toString(calculMoyen.getArray()) 
				+ "\nLa moyenne du tabeau est de : "
				+ calculMoyen.calcul());
	
	}
}



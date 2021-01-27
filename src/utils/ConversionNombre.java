package utils;

import java.util.Scanner;

public class ConversionNombre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un perier chiffre :");
		String a = sc.next();
		System.out.println("Veuillez saisir un deuxième chiffre :");
		String b = sc.next();
		
		int aInt = Integer.parseInt(a);
		int bInt = Integer.parseInt(b);
		
		int max = Integer.max(aInt, bInt);
		
		System.out.println("Le chiffre le plus grand des deux est : " + max);
	}
}

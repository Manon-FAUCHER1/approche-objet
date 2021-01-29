package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		double op1 = Operations.calcul(12,32.5,'+');
		double op2 = Operations.calcul(12,32.5,'-');
		double op3 = Operations.calcul(12,32.5,'*');
		double op4 = Operations.calcul(12,32.5,'/');
		
		System.out.println(op1);
		System.out.println(op2);
		System.out.println(op3);
		System.out.println(op4);

	}

}

package fr.diginamic.operations;

public class CalculMoyenne {
	double[] array = new double[2];
	int i = 0;

	public CalculMoyenne() {
		
	}
	
	public double[] getArray() {
		return array;
	}

	public void setArray(double[] array) {
		this.array = array;
	}

	public void ajout (double nb) {
		
		if (i >= array.length) {
			double[] array2 = new double[array.length+1];
			
			for (int j = 0; j < array.length; j++) {
				array2[j] = array[j];
			}
			
			array = array2;
			
		}
		array[i] = nb;
		i++;
	}
	
	public double calcul () {
		double somme = 0;
		
		for (int i = 0; i < array.length; i++) {
			somme += array[i];
		}
	         
		double moyenne =  somme / array.length;
		
		return moyenne;
	}
	
	
	
}

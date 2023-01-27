package primos;

import java.util.Random;

public class Primos {

	public static void main(String[] args) {
		int numAleatorio, i;
		int suma=0;
	
	Random random = new Random();
	numAleatorio = random.nextInt(101);
	System.out.println("Calcularemos la suma de los números primos entre 1 y " + numAleatorio);
		
	for (i=0;  i<numAleatorio; i++){
		if(i != 0 && i % 2 != 0 && i % 3 != 0 && i% 5 != 0) {
			suma = suma + i;
			System.out.println(i);
		}
		}
	System.out.println(suma);

	}
	
}
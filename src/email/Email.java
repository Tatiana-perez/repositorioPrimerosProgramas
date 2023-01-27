package email;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		String email;
		int respuesta;
		int i=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu direccion de email");
		email = sc.next();
		
		if(email.contains("@") || email.contains(".")) {
			do {
				System.out.println("Menú:");
				System.out.println("1. Extrae de la cadena el nombre");
				System.out.println("2. Pasa el nombre a mayúsculas");
				System.out.println("3. Obtén la longitud de la cadena");
				System.out.println("4. Comprueba si la cadena acaba en educa.jcyl.es");
				System.out.println("0. Salir");
				System.out.println("Seleccione una opción");
				System.out.println("Modificación - ejercicio 6");
				respuesta=sc.nextInt();
				
			switch(respuesta) {
			case 1:
				System.out.println("Ha elegido extraer de la cadena el nombre");
				while (email.charAt(i) != '.') {
					System.out.println("El nombre de su email es " + email.charAt(i));
				}
				break;
			case 2:
				System.out.println("Ha elegido pasar el nombre a mayúsculas");
				break;
			case 3:
				System.out.println("Ha elegido obtener la longitud de la cadena");
				System.out.println("La longitud de la cadena es " + email.length());
				break;
			case 4: 
				System.out.println("Ha elegido comprobar si la cadena acaba en educa.jcyl.es");
				if(email.endsWith("educa.jcyl.es")) {
					System.out.println("Tu email acaba en educa.jcyl.es");
				}else if (!email.endsWith("educa.jcyl.es")) {
					System.out.println("Tu email no acaba en educa.jcyl.es");
				}
				break;
			case 0:
				System.out.println("Ha elegido salir");
				break;
			default: 
				System.out.println("Error");
			}
				
			} while (respuesta != 0);
			
			
		}

	}

}

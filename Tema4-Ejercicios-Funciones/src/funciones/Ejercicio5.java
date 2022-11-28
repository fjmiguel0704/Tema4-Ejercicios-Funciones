package funciones;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		String caracter;
		
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce un carácter: ");
		caracter=read.nextLine();
		
		System.out.println(vocal(caracter));
		
		}
	
	static boolean vocal (String caracter) {
		boolean vocal;
		switch (caracter) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			return true;
			
		default:
			return false;
		}
	}

}

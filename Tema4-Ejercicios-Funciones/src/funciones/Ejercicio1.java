 package funciones;

import java.util.Scanner;

public class Ejercicio1 {
	
	static void eco (int numero) {
		for (int i = 1; i<=numero; i++) {
			System.out.println("Eco...");
		}
	}
	
	public static void main(String[] args) {
		int numero;
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce un número: ");
		numero= read.nextInt();
		eco(numero);
		read.close();
	}
}

package funciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numero;
		Scanner read = new Scanner (System.in);
		System.out.println("¿Cuántas veces desea repetir `Eco...´?");
		numero=read.nextInt();
		
		
		eco(numero);
		
		}


		static void eco(int repit) {
			for(int i=1; i<=repit; i++) {
				System.out.println("Eco...");
			}
		
	}

}

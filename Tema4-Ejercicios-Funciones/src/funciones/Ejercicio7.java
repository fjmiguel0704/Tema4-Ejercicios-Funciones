package funciones;

import java.util.Scanner;

public class Ejercicio7 {
		public static void main(String[] args) {
			int numero;
			
			Scanner read = new Scanner (System.in);
			System.out.println("Introduce un número: ");
			numero=read.nextInt();
			
			System.out.println(divisoresPrimo(numero));
		}
		
		static int divisoresPrimo (int numero) {
			int contador=0;
			for(int i = 2; i<numero; i++) {
				if(esPrimo(i)) {
					if(numero%i==0) {
						contador++;
					}
				}
			}
			return contador;
		}
		
		static boolean esPrimo (int num) {
			for(int i = 2; i<num; i++) {
				if (num%i==0) {
					return false;
				}
			}
			
			return true;
			
		}
}

package funciones;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		int num;
		
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce un número: ");
		num=read.nextInt();
		
		System.out.println(esPrimo(num));
		
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

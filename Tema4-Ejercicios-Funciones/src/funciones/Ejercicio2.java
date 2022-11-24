package funciones;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce el primer número: ");
		num1=read.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2=read.nextInt();
		
		read.close();
		
		function(num1, num2);
		
	}
	
		static void function(int num1, int num2) {
			if(num1<num2) {
			for(num1++; num1<num2; num1++) {
				System.out.println(num1);
			}
		}
			
			else {
				for(num1--; num1>num2; num1--) {
					System.out.println(num1);
				}
			}
		
	}
			
}



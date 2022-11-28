package funciones;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int num1, num2;
		
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce el primer número: ");
		num1=read.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2=read.nextInt();
		
		read.close();
		
		mayor(num1, num2);
		
		}
	
	static void mayor (int num1, int num2) {
		if (num1>num2) {
			System.out.println(num1);
		}
		
		else {
			System.out.println(num2);
		}
	}
	

}

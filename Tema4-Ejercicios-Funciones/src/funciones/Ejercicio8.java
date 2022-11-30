package funciones;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		int numero1, numero2, opcion;
		
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce el primer número: ");
		numero1=read.nextInt();
		System.out.println("Introduce el segundo número: ");
		numero2=read.nextInt();
		System.out.println("Seleccione una opción");
		System.out.println("a) 1 [SUMA]");
		System.out.println("b) 2 [RESTA]");
		System.out.println("c) 3 [MULTIPLICACIÓN]");
		System.out.println("d) 4 [DIVISIÓN]");
		opcion=read.nextInt();
		
		System.out.println( calculadora(numero1, numero2, opcion));
	}
	
	static int calculadora (int num1, int num2, int opc) {
		int suma, resta, multiplicacion, division;
		switch (opc) {
		case 1:
			return suma=num1+num2;
		case 2:
			return resta=num1-num2;	
		case 3:
			return multiplicacion=num1*num2;
		case 4:
			return division=num1/num2;
		default:
			System.out.println("La opción introducida no es correcta");
		}
		
		return 0;
	}

}

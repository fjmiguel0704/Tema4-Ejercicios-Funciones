package funciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int radio, altura, opcion = 0;
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce el radio del cilindro: ");
		radio=read.nextInt();
		System.out.println("Introduce la altura del cilindro: ");
		altura=read.nextInt();
		
		cilindro(altura, radio, opcion);
		
	}
	
		static void cilindro(int altura, int radio, int opcion) {
			int area, volumen;
			final double pi = 3.14;
			switch (opcion) {
			case 1: 
				area= (int) ((2*pi*radio)*(altura+radio));
				break;
			case 2:
				volumen= (int) (pi*Math.pow(radio, 2)*altura);
				break;
			
			}

	}

}

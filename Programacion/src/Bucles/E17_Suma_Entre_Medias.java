package Bucles;

import java.util.Scanner;

public class E17_Suma_Entre_Medias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 17. Sumar los números entre dos valores Escribe un programa que solicite dos
		 * números enteros A y B, y calcule la suma de todos los números entre A y B,
		 * incluyendo ambos.
		 */

		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int A = leer.nextInt();
		System.out.println("Introduce otro número: ");
		int B = leer.nextInt();

		int suma = 0;

		for (int i = A; i <= B; i++) {
			suma = suma + i;
		}

		System.out.println("La suma de los números desde " + A + " hasta " + B + " es " + suma);
	}

}

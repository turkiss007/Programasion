package Bucles;

import java.util.Scanner;

public class E15_Promedio_SerieDeNumeros {
	public static void main(String[] args) {

		/*
		 * 15. Promedio de una serie de números Escribe un programa que solicite al
		 * usuario una cantidad de números N y luego pida que introduzca esos N números.
		 * Al final, el programa debe mostrar el promedio de esos números.
		 */

		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de números que necesite: ");
		int num = leer.nextInt();

		int[] serie;
		serie = new int[num];

		int promedio = 0;

		for (int i = 0; i < num; i++) {
			System.out.println((i + 1) + "º número: ");
			serie[i] = leer.nextInt();
			promedio = promedio + serie[i];
		}

		float resultado = (float) promedio / num;
		System.out.println("El promedio es " + resultado);
	}
}

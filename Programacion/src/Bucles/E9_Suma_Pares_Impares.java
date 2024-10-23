package Bucles;

import java.util.Scanner;

public class E9_Suma_Pares_Impares {

	public static void main(String[] args) {
		/*
		 * 9. Suma de números pares y impares Escribe un programa que solicite al
		 * usuario 10 números y luego calcule la suma de los números pares y la suma de
		 * los números impares por separado.
		 */

		int num[] = new int[10];
		int sumaPares = 0, sumaImpares = 0;

		for (int i = 0; i < 10; i++) {
			// System.out.println(i);
			Scanner leer = new Scanner(System.in);
			System.out.print("Escriba el " + (i + 1) + "º número :");
			num[i] = leer.nextInt();
			if (num[i] % 2 == 0) {
				sumaPares = sumaPares + num[i];
			} else {
				sumaImpares = sumaImpares + num[i];
			}
		}

		/*
		 * int sumaPares = 0, sumaImpares = 0;
		 * 
		 * for (int j = 0; j < 10; j++) { if (num[j] % 2 == 0) { sumaPares = sumaPares +
		 * num[j]; } else { sumaImpares = sumaImpares + num[j]; }
		 */
		System.out.println(
				"La suma de los números pares es:" + sumaPares + "\nLa suma de los números impares es: " + sumaImpares);
	}
}

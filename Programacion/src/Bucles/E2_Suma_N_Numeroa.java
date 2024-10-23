package Bucles;

import java.util.Scanner;

public class E2_Suma_N_Numeroa {
	public static void main(String[] args) {
		/*
		 * Suma de los primeros N números Escribe un programa que solicite un número
		 * entero positivo N y calcule la suma de los primeros N números naturales (es
		 * decir, la suma de 1 hasta N).
		 */
		int suma = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Escriba un número: ");
		int N = leer.nextInt();
		System.out.print("La suma de los primeros " + N + " números es: ");
		for (int i = 1; i <= N; i++) {
			suma = suma + i;
		}
		System.out.println(suma);
	}
}

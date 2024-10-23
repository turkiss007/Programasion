package Bucles;

import java.util.Scanner;

public class E4_Fatorial {
	public static void main(String[] args) {
		/*
		 * Factorial de un número Escribe un programa que pida al usuario un número
		 * entero positivo y calcule su factorial utilizando un bucle.
		 */
		int factorial = 1;
		Scanner leer = new Scanner(System.in);
		System.out.println("Escriba un número: ");
		int N = leer.nextInt();
		System.out.print("Su factorial es: ");
		for (int i = 2; i <= N; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}
}

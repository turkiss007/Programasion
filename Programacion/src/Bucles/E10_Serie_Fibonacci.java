package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E10_Serie_Fibonacci {
	public static void main(String[] args) {
		/*
		 * Serie de Fibonacci Crea un programa que genere y muestre los primeros N
		 * términos de la serie de Fibonacci. El valor de N debe ser ingresado por el
		 * usuario. La secuencia de Fibonacci es: 0, 1, 1, 2, 3, 5, 8, 13...
		 */

		Scanner leer = new Scanner(System.in);
		System.out.print("Escriba un número: ");
		int num = leer.nextInt();

		List<Integer> lista = new ArrayList<Integer>(num);
		for (int i = 0; i < num; i++) {
			if (i < 2) {
				lista.add(i);
			} else {
				lista.add(lista.get(i - 2) + lista.get(i - 1));
			}
		}

		for (int j = 0; lista.get(j) <= num; j++) {
			System.out.print(lista.get(j) + " ");
		}
	}
}

package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E13_Numeros_Perfectos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 13. Número perfecto Crea un programa que determine si un número introducido
		 * por el usuario es un número perfecto. Un número perfecto es aquel que es
		 * igual a la suma de sus divisores propios positivos (excluyendo el mismo
		 * número). Por ejemplo, el número 6 es perfecto porque 1+2+3=61 + 2 + 3 =
		 * 61+2+3=6.
		 */

		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = leer.nextInt();

		int perfecto = 1;
		List<Integer> lista = new ArrayList<Integer>();

		for (int i = 2; num > i; i++) {
			if (num % i == 0) {
				lista.add(i);
				// System.out.println("Lista actualizada " + lista);
				// System.out.print(num);
				// System.out.println(" dividido entre " + i + "es " + num);
			}
		}

		// System.out.println("El tamaño de la lista es" + lista.size());
		for (int j = 0; lista.size() > j; j++) {
			// System.out.println("Posición j: " + j + "vale " + lista.get(j));
			perfecto = perfecto + lista.get(j);
			// System.out.println("La suma va valiendo " + perfecto);
		}

		if (num == perfecto) {
			System.out.println("El número " + num + " es un número perfecto");
		} else {
			System.out.println(num + " no es un número perfecto");
		}
	}

}

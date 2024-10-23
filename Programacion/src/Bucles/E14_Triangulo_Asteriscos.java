package Bucles;

import java.util.Scanner;

public class E14_Triangulo_Asteriscos {
	public static void main(String[] args) {
		/*
		 * Imprimir un triángulo de asteriscos Escribe un programa que pida al usuario
		 * un número entero positivo N y, utilizando un bucle, imprima un triángulo de
		 * asteriscos con N filas. Por ejemplo, si el usuario introduce 5, el triángulo
		 * será: markdown Copiar código
		 *
		 **
		 ***
		 ****
		 *****/
		int x = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca número de filas para su triángulos: ");
		int num = leer.nextInt();

		for (int i = 1; i <= num; i++) {
			do {
				System.out.print("*");
				x = x + 1;
			} while (x != i);
			x = 0;
			System.out.println();
		}
	}
}

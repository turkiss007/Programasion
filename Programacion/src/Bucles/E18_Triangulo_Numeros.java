package Bucles;

import java.util.Scanner;

public class E18_Triangulo_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 18. Patrón de números Escribe un programa que muestre un patrón de números
		 * con N filas. Por ejemplo, si N = 5, el patrón será: 1 22 333 4444 55555
		 */

		int x = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca número de filas: ");
		int num = leer.nextInt();

		for (int i = 1; i <= num; i++) {
			do {
				System.out.print(i);
				x = x + 1;
			} while (x != i);
			x = 0;
			System.out.println();
		}
	}

}

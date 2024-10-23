package Bucles;

import java.util.Scanner;

public class E11_Adivinar_Número {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 11. Adivinar un número (juego de bucles) Escribe un programa en el que el
		 * ordenador genere un número aleatorio entre 1 y 100. El usuario debe intentar
		 * adivinar el número. El programa debe dar pistas diciendo si el número es
		 * mayor o menor que el introducido. El bucle continuará hasta que el usuario
		 * adivine el número.
		 */

		int aleatorio = (int) (Math.random() * 100) + 1;
		// System.out.print(aleatorio);
		int numeroUsuario;
		Scanner leer = new Scanner(System.in);
		System.out.print("Intenta adivinar el número que estoy pensando: ");
		numeroUsuario = leer.nextInt();

		do {
			if (numeroUsuario > aleatorio) {
				System.out.println("Menos");
				numeroUsuario = leer.nextInt();
			} else {
				System.out.println("Más");
				numeroUsuario = leer.nextInt();
			}

		} while (numeroUsuario != aleatorio);

		System.out.println("¡Lo adivinaste!");
	}
}

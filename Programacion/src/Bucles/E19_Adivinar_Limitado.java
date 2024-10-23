package Bucles;

import java.util.Scanner;

public class E19_Adivinar_Limitado {
	public static void main(String[] args) {
		/*
		 * 19. Juego de adivinanza con intentos limitados Crea un programa en el que el
		 * ordenador genere un número aleatorio entre 1 y 100, y el usuario tenga un
		 * máximo de 5 intentos para adivinarlo. Si el usuario no lo adivina en esos 5
		 * intentos, el programa debe mostrar el número.
		 */

		int aleatorio = (int) (Math.random() * 100) + 1;
		// System.out.print(aleatorio);
		int numeroUsuario, x = 1;
		Scanner leer = new Scanner(System.in);
		System.out.print("Intenta adivinar el número que estoy pensando, tienes 5 intentos ");
		numeroUsuario = leer.nextInt();

		do {
			x = x + 1;
			if (numeroUsuario > aleatorio) {
				System.out.println("Menos");
				numeroUsuario = leer.nextInt();
			} else {
				System.out.println("Más");
				numeroUsuario = leer.nextInt();
			}

		} while ((numeroUsuario != aleatorio) && (x < 5));
		if (numeroUsuario == aleatorio) {
			System.out.println("¡Lo adivinaste!");
		} else
			System.out.println("Perdiste >:). El número era " + aleatorio);

	}
}

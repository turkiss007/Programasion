package Sentencias_de_codigo;

import java.util.Scanner;

public class E9_Random_Adivinar {
public static void main(String[]args) {
	/* Escribe un programa que genere un número aleatorio entre 1 y 100. 
	 * Luego, el usuario debe intentar adivinar el número. El programa debe decir 
	 * si el número introducido es mayor, menor o igual al número aleatorio, y 
	 * repetirse hasta que el usuario adivine correctamente.
Sentencias usadas: while, if. */
	int aleatorio = (int) (Math.random()*100) + 1;
	//System.out.print(aleatorio);
	int numeroUsuario;
	Scanner leer = new Scanner(System.in);
	System.out.print("Intenta adivinar el número que estoy pensando: ");
	numeroUsuario = leer.nextInt();
	
	do {
		if (numeroUsuario>aleatorio) {
			System.out.println("Menos");
			numeroUsuario = leer.nextInt();
		} else {System.out.println("Más");
		numeroUsuario = leer.nextInt();}
		
	} while (numeroUsuario!=aleatorio);
	
	System.out.println("¡Lo adivinaste!");
} 
}

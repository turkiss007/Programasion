package Sentencias_de_codigo;

public class E4_NumeroS1_10 {
public static void main(String[]args) {
	/*Enunciado: Escribe un programa que imprima los números del 1 al 10 en la 
	 * consola usando un bucle for.Sentencias usadas: for.
	 */
	System.out.print("Los primeros 10 numeros: ");
	for(int i=1;i<11;i++) {
		System.out.print(i);
		if (i<10) {
			System.out.print(", ");
		}
	}
}
}

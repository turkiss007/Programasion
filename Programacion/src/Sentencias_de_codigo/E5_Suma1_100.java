package Sentencias_de_codigo;

public class E5_Suma1_100 {
public static void main(String[]args) {
	/*Enunciado: Escribe un programa que utilice un bucle para sumar los números 
	 * enteros del 1 al 100 y luego imprima el resultado.Sentencias usadas: for.
	 */
	
	int suma = 0;
	for(int i=1;i<=100;i++) {
		suma = suma + i;
		//System.out.print("Sumas parciales: " + suma);
	}
	System.out.print("La suma de los 100 primeros números es " + suma);
}
}

package Sentencias_de_codigo;

public class E8_Suma_Pares_100 {
	public static void main(String[]args) {
		/*Enunciado: Escribe un programa que utilice un bucle para sumar todos los números pares entre 1 y 100 y luego imprima el resultado.
Sentencias usadas: for, if.
		 */
		
		int suma = 0;
		for(int i=2;i<=100;i=i+2) {
			suma = suma + i;
			//System.out.print("Sumas parciales: " + suma);
		}
		System.out.print("La suma de los 100 primeros números pares es " + suma);
	}
}

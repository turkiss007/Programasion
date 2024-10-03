package Ejercicios_programacion;

public class Ejercicio5_PerimetroCirculo {
public static void main(String[] args) {
	
	/* Declara una variable para el radio de un círculo. Utiliza la 
	 * fórmula Perímetro = 2 * π * radio para calcular el perímetro 
	 * del círculo e imprimirlo en la consola. Usa Math.PI para obtener 
	 * el valor de π.
	 */
	int r = 5;
	float P = (float) (2*Math.PI*r);
	System.out.print("El perímetro de un círculo es: " + P);
	
}
}

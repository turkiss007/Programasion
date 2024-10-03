package Ejercicios_programacion;

public class Ejercicio8_VariablesBooleanas {
public static void main(String[] args) {
	/*Declara dos variables booleanas, una con el valor true y otra con 
	 * false. Imprime los resultados de aplicar las operaciones lógicas 
	 * AND, OR y NOT a estas variables.
	 */
	boolean verdadero = true, falso = false;
	// OR: mientras haya un valor de los dos que sea verdadero, el valor final del operador será true.
	System.out.println("verdadero o falso: "+(verdadero||falso));
	// AND: solo cuando los dos valores sean verdaderos el valor final del operador será true.
	System.out.println("verdadero y falso: "+(verdadero&&falso));
	// NOT: Devuelve el valor contrario, si no es verdadero será falso y viceversa.
	System.out.println("no falso: "+(!falso));
	System.out.println("no verdadero: "+(!verdadero));
}
}

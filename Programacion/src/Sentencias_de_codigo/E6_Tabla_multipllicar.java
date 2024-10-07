package Sentencias_de_codigo;

import java.util.Scanner;

public class E6_Tabla_multipllicar {
public static void main (String[]args) {
	/* Escribe un programa que reciba un número entero e imprima su tabla de 
	 * multiplicar del 1 al 10. Por ejemplo, si el número es 5, debe imprimir:
python
Copiar código
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
Sentencias usadas: for. */
	
	int x, multiplicacion;
	Scanner numero = new Scanner(System.in);
	System.out.println("Escriba un número: ");
	x = numero.nextInt();
	
	System.out.println("Tabla de multiplicar del " + x);
	for(int i=1;i<=10;i++) {
		multiplicacion = i*x;
		System.out.println(x + " x " + i + " = " + multiplicacion);
	}
}
}

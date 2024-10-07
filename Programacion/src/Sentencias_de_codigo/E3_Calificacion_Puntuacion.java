package Sentencias_de_codigo;

import java.util.Scanner;

public class E3_Calificacion_Puntuacion {
public static void main(String[] args) {
	/* Enunciado: Escribe un programa que reciba una puntuación de 0 a 100 e 
	 * imprima la calificación correspondiente según las siguientes reglas:
	 * Puntuación >= 90: "A"
	 * Puntuación >= 80: "B"
	 * Puntuación >= 70: "C"
	 * Puntuación >= 60: "D"
	 * Puntuación < 60: "F"
	 * Sentencias usadas: if, else if, else.
	 */
	
	int num;
	
	do {
		Scanner leer = new Scanner(System.in);
		System.out.print("Escribe un número del 0 al 100: ");
		num = leer.nextInt();
		
		if(num<0 || num>100) {
			System.out.println("No es un número válido.");
		}
	} while (num<0 || num>100);
	
	if (num>=60) {
		if(num>=70) {
			if(num>=80){
				if(num>=90) {
					System.out.println("La calificación es A");
				}else {System.out.println("La calificación es B");}
			}else {System.out.println("La calificación es C");}
		}else {System.out.println("La calificación es D");}
	}else {System.out.println("La calificación es F");}

}
}

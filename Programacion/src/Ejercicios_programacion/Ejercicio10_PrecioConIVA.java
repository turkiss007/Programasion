package Ejercicios_programacion;

public class Ejercicio10_PrecioConIVA {
public static void main(String[]args) {
	/* Declara una variable para el precio de un producto y otra para 
	 * el porcentaje de IVA (por ejemplo, 21%). Calcula el precio final 
	 * incluyendo el IVA e imprime el resultado.
	 */
	float producto = (float) 8.2231404959;
	int IVA = 21;
	float precioFinal =(float) producto + producto*IVA/100;
	System.out.print("El precio del producto es " + producto + "$ pero con el " + IVA + "% de IVA, el precio final del producto es: " + precioFinal + "$.");
}
}

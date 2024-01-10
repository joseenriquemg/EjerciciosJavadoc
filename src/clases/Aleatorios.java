package clases;

import java.util.Random;

/**
 * Clase que recoge los diferentes numeros aleatorios generados
 * 
 * @author jemunoz
 */
public class Aleatorios {
	
	/**
	 * Función usada para imprimir los numeros aleatorios
	 * @param cantidad Cantidad de números que se generan
	 */

	public static void numerosAletorios(int cantidad) {
		double aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = Math.random();
			System.out.println(aleatorio);
		}
	}
	
	/**
	 * 
	 * 
	 * @param cantidad
	 * @param max
	 */

	public static void numerosAleatorios(int cantidad, int max) {
		int aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = (int) Math.random() * max;
			System.out.println(aleatorio);
		}
	}

	public static void numerosAleatorios(int cantidad, int minimo, int maximo) {
		int aleatorio;
		Random rand = new Random();
		for(int i=1; i<=cantidad; i++) {
			aleatorio = rand.nextInt(minimo, maximo+1);
			System.out.println(aleatorio);
		}
	}
}

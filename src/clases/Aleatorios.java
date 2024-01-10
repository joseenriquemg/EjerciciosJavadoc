package clases;

import java.util.Random;

/**
 * La clase Aleatorios proporciona métodos para generar números aleatorios.
 */
public class Aleatorios {

    /**
     * Genera la cantidad especificada de números aleatorios entre 0 (inclusive) y 1 (exclusive)
     * e imprime cada número en una nueva línea.
     *
     * @param cantidad La cantidad de números aleatorios a generar.
     */
    public static void numerosAletorios(int cantidad) {
        double aleatorio;

        for (int i = 1; i <= cantidad; i++) {
            aleatorio = Math.random();
            System.out.println(aleatorio);
        }
    }

    /**
     * Genera la cantidad especificada de números aleatorios entre 0 (inclusive) y el valor máximo (exclusive),
     * e imprime cada número en una nueva línea.
     *
     * @param cantidad La cantidad de números aleatorios a generar.
     * @param max El valor máximo para los números aleatorios.
     */
    public static void numerosAleatorios(int cantidad, int max) {
        int aleatorio;

        for (int i = 1; i <= cantidad; i++) {
            aleatorio = (int) (Math.random() * max);
            System.out.println(aleatorio);
        }
    }

    /**
     * Genera la cantidad especificada de números aleatorios entre el valor mínimo (inclusive) y el valor máximo (inclusive),
     * e imprime cada número en una nueva línea.
     *
     * @param cantidad La cantidad de números aleatorios a generar.
     * @param minimo El valor mínimo para los números aleatorios.
     * @param maximo El valor máximo para los números aleatorios.
     */
    public static void numerosAleatorios(int cantidad, int minimo, int maximo) {
        int aleatorio;
        Random rand = new Random();

        for (int i = 1; i <= cantidad; i++) {
            aleatorio = rand.nextInt(maximo - minimo + 1) + minimo;
            System.out.println(aleatorio);
        }
    }
}
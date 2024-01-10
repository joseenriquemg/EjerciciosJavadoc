package clases;

import java.util.Random;

/**
 * La clase Tesoro representa un juego simple donde se busca un tesoro en un tablero.
 */
public class Tesoro {

    /** Tamaño del tablero. */
    public static final int TAM_TABLERO = 5;

    /** Posición X del tesoro en el tablero. */
    static int xTesoro;

    /** Posición Y del tesoro en el tablero. */
    static int yTesoro;

    /** Posición X actual del jugador en el tablero. */
    int xJugador = 1;

    /** Posición Y actual del jugador en el tablero. */
    int yJugador = 1;

    /**
     * Genera aleatoriamente la posición del tesoro en el tablero.
     */
    static void generaPosicionTesoro() {
        Random rand = new Random();
        xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
        yTesoro = rand.nextInt(1, TAM_TABLERO + 1);
    }

    /**
     * Imprime el tablero del juego con la posición actual del jugador.
     */
    void pintaTablero() {
        // Imprimimos la primera línea de números
        for (int i = 1; i <= TAM_TABLERO; i++) {
            System.out.print("\t" + i);
        }

        // Salto de línea para comenzar con los números de la izquierda
        System.out.println();

        // Bucle para imprimir las líneas
        for (int i = 1; i <= TAM_TABLERO; i++) {
            // Imprimimos el número de línea
            System.out.print(i);
            // Si la línea coincide con la posición X del jugador
            if (xJugador == i) {
                // Imprimimos tantos tabuladores como posición Y del jugador
                for (int j = 1; j <= yJugador; j++) {
                    System.out.print("\t");
                }
                // Imprimimos la ficha del jugador
                System.out.print("J");
            }
            // Salto de línea para pasar a la siguiente línea
            System.out.println();
        }
    }

    /**
     * Mueve al jugador en la dirección especificada.
     *
     * @param movimiento La dirección de movimiento del jugador ("arriba", "abajo", "izquierda", "derecha").
     * @return 0 si el movimiento fue exitoso, -1 si se intenta salir del tablero, -2 si la dirección es inválida.
     */
    int mueveJugador(String movimiento) {
        int res = 0;
        String movMinuscula = movimiento.toLowerCase();

        switch (movMinuscula) {
            case "arriba":
                if (xJugador - 1 < 1) {
                    res = -1;
                } else {
                    xJugador--;
                }
                break;
            case "abajo":
                if (xJugador + 1 > TAM_TABLERO) {
                    res = -1;
                } else {
                    xJugador++;
                }
                break;
            case "izquierda":
                if (yJugador - 1 < 1) {
                    res = -1;
                } else {
                    yJugador--;
                }
                break;
            case "derecha":
                if (yJugador + 1 > TAM_TABLERO) {
                    res = -1;
                } else {
                    yJugador++;
                }
                break;
            default:
                res = -2;
                break;
        }

        return res;
    }

    /**
     * Comprueba si el jugador ha encontrado el tesoro.
     *
     * @return true si el jugador está en la misma posición que el tesoro, false de lo contrario.
     */
    boolean buscaTesoro() {
        return xTesoro == xJugador && yTesoro == yJugador;
    }
}
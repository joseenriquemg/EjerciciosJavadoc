package clases;

/**
 * La clase Operaciones proporciona métodos para realizar diversas operaciones matemáticas
 * como suma, resta, multiplicación, división, máximo y mínimo entre dos números.
 */
public class Operaciones {

    /** Primer número para realizar operaciones. */
    double num1;

    /** Segundo número para realizar operaciones. */
    double num2;

    /**
     * Constructor por defecto de la clase Operaciones.
     * Inicializa los números en cero.
     */
    public Operaciones() {

    }

    /**
     * Constructor que permite inicializar los dos números al crear un objeto de la clase Operaciones.
     *
     * @param num1 El primer número para operaciones.
     * @param num2 El segundo número para operaciones.
     */
    public Operaciones(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Calcula la suma de los dos números.
     *
     * @return La suma de los dos números.
     */
    public double suma() {
        return num1 + num2;
    }

    /**
     * Calcula la resta restando el segundo número al primero.
     *
     * @return La resta de los dos números.
     */
    public double resta() {
        return num1 - num2;
    }

    /**
     * Calcula la multiplicación de los dos números.
     *
     * @return El resultado de la multiplicación de los dos números.
     */
    public double multiplicacion() {
        return num1 * num2;
    }

    /**
     * Calcula la división del primer número entre el segundo número.
     *
     * @return El resultado de la división, o 0 si el segundo número es igual a cero.
     */
    public double division() {
        double res = 0;

        if (num2 != 0) {
            res = num1 / num2;
        }
        return res;
    }

    /**
     * Determina el máximo entre los dos números.
     *
     * @return El número más grande entre num1 y num2.
     */
    public double max() {
        return num1 > num2 ? num1 : num2;
    }

    /**
     * Determina el mínimo entre los dos números.
     *
     * @return El número más pequeño entre num1 y num2.
     */
    public double min() {
        return num1 < num2 ? num1 : num2;
    }
}





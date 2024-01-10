package clases;

/**
 * La clase Esfera representa una esfera en el espacio tridimensional.
 */
public class Esfera {

    /** Radio de la esfera, por defecto inicializado a 1.0. */
    double radio = 1.0;

    /**
     * Constructor por defecto de la clase Esfera.
     * Inicializa el radio a 1.0.
     */
    public Esfera() {
        super();
    }

    /**
     * Constructor que permite inicializar el radio al crear un objeto de la clase Esfera.
     *
     * @param radio El radio de la esfera.
     */
    public Esfera(double radio) {
        super();
        this.radio = radio;
    }

    /**
     * Calcula y devuelve la superficie de la esfera.
     *
     * @return La superficie de la esfera.
     */
    public double superficie() {
        double superficie = 4 * Math.PI * Math.pow(radio, 2);
        return superficie;
    }

    /**
     * Calcula y devuelve el volumen de la esfera.
     *
     * @return El volumen de la esfera.
     */
    public double volumen() {
        double volumen = (4 * Math.PI / 3) * Math.pow(radio, 3);
        return volumen;
    }
}
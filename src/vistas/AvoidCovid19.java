package vistas;

import modelos.Juego;

/**
 * Ejecuta el Juego.
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
 */
public class AvoidCovid19 {

    /**
     * Ejecuta el Juego
     *
     * @param args los argumentos de la línea de comando
     */
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.ejecutarJuego();
    }

}

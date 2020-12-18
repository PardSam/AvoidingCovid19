package modelos;

import controladores.PrincipalControlador;
import java.applet.AudioClip;
import java.net.URL;
import vistas.PrincipalVista;

/**
 * Esta clase se implementa de la clase IJuego para asignar valores
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
 */
public class Juego implements IJuego {

    private PrincipalVista vista;
    private PrincipalControlador controlador;

    public boolean juegoFinalizado = false;
    public boolean pierdeVida = false;

    URL urlSonidoSalto, urlSonidoChoque;
    AudioClip sonidoSalto, sonidoChoque;

    /**
     * Constructor de Juego
     */
    public Juego() {
    }

    /**
     * Ejecucion del juego
     */
    @Override
    public void ejecutarJuego() {
        vista = new PrincipalVista();
        controlador = new PrincipalControlador(vista);
    }

}

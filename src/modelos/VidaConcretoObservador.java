/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import controladores.PartidaControlador;
import java.awt.event.WindowEvent;

/**
 * descripcion
 * @version 13/12/2020/A*@version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public class VidaConcretoObservador implements IPartidaObservador {

    private Partida partida;
    PartidaControlador controlador;

    public VidaConcretoObservador(Partida partida, PartidaControlador controlador) {
        this.partida = partida;
        this.controlador = controlador;
    }
/**
     * Notifica los cambios
     */
    @Override
    public void notificar() {
        Perfil.gePerfil().getJugador().setScore(partida.getPuntaje());
        WindowEvent windowClosing = new WindowEvent(controlador.vista, WindowEvent.WINDOW_CLOSING);
        controlador.vista.dispatchEvent(windowClosing);
    }

}

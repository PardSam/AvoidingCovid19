/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import controladores.PartidaControlador;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author aries
 */
public class VidaConcretoObservador implements IPartidaObservador {

    private Partida partida;
    PartidaControlador controlador;

    public VidaConcretoObservador(Partida partida, PartidaControlador controlador) {
        this.partida = partida;
        this.controlador = controlador;
    }

    @Override
    public void notificar() {
        Perfil.gePerfil().getJugador().setScore(partida.getPuntaje());
        WindowEvent windowClosing = new WindowEvent(controlador.vista, WindowEvent.WINDOW_CLOSING);
        controlador.vista.dispatchEvent(windowClosing);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import javax.swing.JOptionPane;

/**
 *
 * @author aries
 */
public class VidaConcretoObservador implements IPartidaObservador{
    private Partida partida;

    public VidaConcretoObservador(Partida partida) {
        this.partida = partida;
    }
    
    @Override
    public void notificar() {
        JOptionPane.showMessageDialog(null, "Fin del Juegoooo");
        Perfil.gePerfil().getJugador().score = partida.getPuntaje();
    }
    
}

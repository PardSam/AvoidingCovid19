
package modelos;

import controladores.PartidaControlador;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *Es una clase abstracta que define la estructura mínima de
 *un Decorador.
 *@version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public class ContinuarPausarComando implements IComando {

    private PartidaControlador controlador;
   /**
     * Constructo de PartidaControlador
     */
    public ContinuarPausarComando(PartidaControlador controlador) {
        this.controlador = controlador;
    }
   /**
     * El metodo ejecutar de ContinuarPausarComando pone en pausa el Juego
     */
    @Override
    public void ejecutar() {
        if (!controlador.partida.isPausaPartida()) {
            controlador.playerIcon = new ImageIcon(getClass().getResource("/assets/play.png"));
            controlador.partida.setPausaPartida(true);
        } else if (controlador.partida.isPausaPartida()) {
            controlador.playerIcon = new ImageIcon(getClass().getResource("/assets/pause.png"));
            controlador.partida.setPausaPartida(false);
            controlador.vista.partidaPanel.updateUI();
        }
        controlador.vista.partidaPanel.player.setIcon(new ImageIcon(controlador.playerIcon.getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH)));
        controlador.partidaPanel.player.setFocusable(false);
    }
}

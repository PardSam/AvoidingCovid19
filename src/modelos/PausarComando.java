package modelos;

import controladores.PartidaControlador;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * descripcion
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
 */
public class PausarComando implements IComando {

    private PartidaControlador controlador;

    /**
     * Comando para pausar la partida
     *
     * @param controlador parametro que indica si se pausa el juego
     */
    public PausarComando(PartidaControlador controlador) {
        this.controlador = controlador;
    }

    /**
     * Es la funcion que ejecuta la pausa en la Partida
     */
    @Override
    public void ejecutar() {
        controlador.playerIcon = new ImageIcon(getClass().getResource("/assets/play.png"));
        controlador.partida.setPausaPartida(true);
        controlador.vista.partidaPanel.player.setIcon(new ImageIcon(controlador.playerIcon.getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH)));
        controlador.partidaPanel.player.setFocusable(false);
    }
}

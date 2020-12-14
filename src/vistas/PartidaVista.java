package vistas;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Representa la vista del menú Partida.
 *
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado,
 * @author Gonzales Cubas,
 * @author Ugaz Arenas.
 */
public class PartidaVista extends JFrame {

    public JLabel escenarioLabel;
    public PartidaPanel partidaPanel;

    /**
     * Constructor
     */
    public PartidaVista() {
        setMinimumSize(new Dimension(1024, 576));
        setLocationRelativeTo(null);
        // inicializarComponentes();
    }

    /**
     * nicializarComponentes
     *
     * @param: panel
     */
    public void inicializarComponentes(PartidaPanel panel) {

        partidaPanel = panel;

        this.add(partidaPanel);
    }
}

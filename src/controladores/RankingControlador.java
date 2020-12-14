package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.RankingVista;

/**
 * Representa una implementación de ActionListener para el Controlador de
 * Ranking
 *
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas.
 */
public class RankingControlador implements ActionListener {

    private RankingVista vista;

    /**
     * Constructor
     *
     * @param vista Diseño
     */
    public RankingControlador(RankingVista vista) {
        this.vista = vista;

        this.vista.cerrarBoton.addActionListener(this);

        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(false);
    }

    /**
     * Detectar y manejar la acción sobre el evento
     *
     * @param e Acción en el evento
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        this.vista.setVisible(false);
    }

}

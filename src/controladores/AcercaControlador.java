package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.AcercaVista;

/**
 * Representa una implementación de ActionListener para el Controlador de la
 * ventana Acerca
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
 */
public class AcercaControlador implements ActionListener {

    private AcercaVista vista;

    /**
     * Controla la vista de la ventana Acerca.
     *
     * @param vista Diseño
     */
    public AcercaControlador(AcercaVista vista) {
        this.vista = vista;
        this.vista.setResizable(false);
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

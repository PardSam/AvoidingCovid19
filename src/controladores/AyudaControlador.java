package controladores;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import vistas.AyudaVista;

/**
 * Representa una implementación de ActionListener y ComponentListener para el
 * Controlador de la ventana Ayuda
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
 */
public class AyudaControlador implements ActionListener, ComponentListener {

    private AyudaVista vista;
    public int op = 4;
    final String HELP[] = {"/assets/img__ayuda-1.png", "/assets/img__ayuda-2.png", "/assets/img__ayuda-3.png",
        "/assets/img__ayuda-4.png", "/assets/img__ayuda-5.png"};

    /**
     * Controla la vista de la ventana Ayuda.
     *
     * @param vista Diseño
     */
    public AyudaControlador(AyudaVista vista) {
        this.vista = vista;
        this.vista.principalPanel.addComponentListener(this);

        this.vista.atrasBoton.addActionListener(this);
        this.vista.siguienteBoton.addActionListener(this);
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

        switch (e.getActionCommand()) {
            case "atras":
                opcionAyuda(this.vista.imagenAyudaEtiqueta, 1);
                this.vista.imagenAyudaEtiqueta.updateUI();
                break;
            case "siguiente":
                opcionAyuda(this.vista.imagenAyudaEtiqueta, 2);
                break;
            case "cerrar":
                this.vista.setVisible(false);
                break;
        }
    }

    /**
     * Ruta de la imagen
     *
     * @param ruta dirección
     */
    public ImageIcon imagenRuta(String ruta) {

        ImageIcon img = new ImageIcon(getClass().getResource(ruta));

        return img;
    }

    /**
     * Muestra las diferentes imágenes de Ayuda
     *
     * @param etiqueta clasificar
     * @param ayuda opcion
     */
    public void opcionAyuda(JLabel etiqueta, int ayuda) {
        if (ayuda == 1) {
            op--;
            if (op < 0) {
                op = this.HELP.length - 1;
            }

        } else if (ayuda == 2) {
            op++;
            if (op >= this.HELP.length) {
                op = 0;
            }
        }
        this.vista.imgAyuda = imagenRuta(this.HELP[op]);
        this.vista.imagenAyudaEtiqueta.setIcon(new ImageIcon(this.vista.imgAyuda.getImage().
                getScaledInstance(this.vista.width, this.vista.height, Image.SCALE_FAST)));
    }

    /**
     * Cambiar el tamaño de los componentes
     *
     * @param ComponentEvent componente
     */
    @Override
    public void componentResized(ComponentEvent e) {

        this.vista.width = e.getComponent().getWidth() - 50;
        this.vista.height = e.getComponent().getHeight();

        this.vista.imagenAyudaEtiqueta.setIcon(new ImageIcon(this.vista.imgAyuda.getImage().
                getScaledInstance(this.vista.width, this.vista.height, Image.SCALE_FAST)));

    }

    /**
     * Cambia la posición del componente
     *
     * @param ComponentEvent componente
     */
    @Override
    public void componentMoved(ComponentEvent e) {

    }

    /**
     * Invocado cuando el componente se hace visible
     *
     * @param ComponentEvent componente
     */
    @Override
    public void componentShown(ComponentEvent e) {

    }

    /**
     * Invocado cuando el componente se hizo invisible
     *
     * @param ComponentEvent componente
     */
    @Override
    public void componentHidden(ComponentEvent e) {
    }
}

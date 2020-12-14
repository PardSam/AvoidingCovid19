package controladores;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelos.Perfil;
import vistas.AjustesVista;

/**
 * Representa una implementación de ActionListener para el Controlador de la
 * ventana Ajustes
 *
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas.
 */
public class AjustesControlador implements ActionListener {

    private AjustesVista vista;
    private ImageIcon masculinoImagen;
    private ImageIcon femeninoImagen;

    /**
     * Controla la vista de la ventana Ajustes.
     *
     * @param vista Diseño
     */
    public AjustesControlador(AjustesVista vista) {
        this.vista = vista;

        this.vista.aceptarBoton.addActionListener(this);
        this.vista.restablacerBoton.addActionListener(this);
        this.vista.cerrarBoton.addActionListener(this);
        this.vista.masculino.addActionListener(this);
        this.vista.femenino.addActionListener(this);

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
            case "aceptar":
                metodoAceptar();
                break;
            case "restablecer":
                metodoRestablecer();
                break;
            case "cerrar":
                metodoAceptar();
                break;
            case "Masculino":
                metodoMasculino();
                break;
            case "Femenino":
                metodoFemenino();
                break;
        }
    }

    /**
     * Validación para que el llenado de información
     */
    public void metodoAceptar() {
        if ("".equals(this.vista.nombreCaja.getText()) || this.vista.masculino.isSelected() == false && this.vista.femenino.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Rellene todos los datos");
        } else {
            this.vista.setVisible(false);
            Perfil.gePerfil().getJugador().setNombres(this.vista.nombreCaja.getText());
            Perfil.gePerfil().getJugador().setGenero(this.vista.generoGrupo.getSelection().getActionCommand());
        }
    }

    /**
     * Selección del género masculino
     */
    public void metodoMasculino() {
        masculinoImagen = new ImageIcon(getClass().getResource("/assets/masculino-activo.png"));
        this.vista.masculino.setIcon(new ImageIcon(masculinoImagen.getImage().
                getScaledInstance(25, 25, Image.SCALE_SMOOTH)));

        femeninoImagen = new ImageIcon(getClass().getResource("/assets/femenino.png"));
        this.vista.femenino.setIcon(new ImageIcon(femeninoImagen.getImage().
                getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
    }

    /**
     * Selección del género femenino
     */
    public void metodoFemenino() {
        femeninoImagen = new ImageIcon(getClass().getResource("/assets/femenino-activo.png"));
        this.vista.femenino.setIcon(new ImageIcon(femeninoImagen.getImage().
                getScaledInstance(25, 25, Image.SCALE_SMOOTH)));

        masculinoImagen = new ImageIcon(getClass().getResource("/assets/masculino.png"));
        this.vista.masculino.setIcon(new ImageIcon(masculinoImagen.getImage().
                getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
    }

    /**
     * Restablece la vetana de Ajustes
     */
    public void metodoRestablecer() {
        this.vista.nombreCaja.setText("");
        this.vista.generoGrupo.clearSelection();
        femeninoImagen = new ImageIcon(getClass().getResource("/assets/femenino.png"));
        this.vista.femenino.setIcon(new ImageIcon(femeninoImagen.getImage().
                getScaledInstance(25, 25, Image.SCALE_SMOOTH)));

        masculinoImagen = new ImageIcon(getClass().getResource("/assets/masculino.png"));
        this.vista.masculino.setIcon(new ImageIcon(masculinoImagen.getImage().
                getScaledInstance(25, 25, Image.SCALE_SMOOTH)));

        Perfil.gePerfil().getJugador().setNombres("");
        Perfil.gePerfil().getJugador().setGenero("");
        Perfil.gePerfil().setEscenarioId(1);
        Perfil.gePerfil().setPersonajeId(1);
        Perfil.gePerfil().setNivel(1);
    }
}

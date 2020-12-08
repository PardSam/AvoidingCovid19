/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import ui.Paleta;
import vistas.PersonajesVista;

/**
 *
 * @author fernandomonjav
 */
public class PersonajesControlador implements ActionListener {

    private PersonajesVista vista;

    public PersonajesControlador(PersonajesVista vista) {
        this.vista = vista;

        vista.aceptarBoton.addActionListener(this);
        vista.cerrarBoton.addActionListener(this);

        this.vista.setLocationRelativeTo(null);

        this.vista.principalPanel.add(crearPersonaje("david", "David", "./src/assets/personajes/david/prevista.png"));
        this.vista.principalPanel.add(crearPersonaje("marco", "Marco", "./src/assets/personajes/david/prevista.png"));
        this.vista.principalPanel.add(crearPersonaje("juan", "Juan", "./src/assets/personajes/david/prevista.png"));

        vista.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "aceptar":
                System.out.println("Aceptar");
                break;
            case "cerrar":
                System.out.println("Cerrar");
                this.vista.setVisible(false);
                break;

        }
    }

    public JPanel crearPersonaje(String id, String nombre, String rutaImagen) {
        JPanel personajePanel = new JPanel();
        personajePanel.setLayout(new BoxLayout(personajePanel, BoxLayout.Y_AXIS));
        personajePanel.setOpaque(false);

        ImageIcon imagen = new ImageIcon(rutaImagen);

        JLabel imagenEtiqueta = new JLabel(imagen);
        imagenEtiqueta.setSize(200, 200);

        JLabel nombreEtiqueta = new JLabel(nombre);
        nombreEtiqueta.setFont(new Font("Artial", Font.BOLD, 16));
        nombreEtiqueta.setForeground(Paleta.getPlano());

        personajePanel.add(imagenEtiqueta);
        personajePanel.add(nombreEtiqueta);

        return personajePanel;
    }
}

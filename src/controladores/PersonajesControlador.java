/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import modelos.Perfil;
import modelos.PersonajeCreador;
import ui.Paleta;
import vistas.PersonajesVista;

/**
 *
 * @author fernandomonjav
 */
public class PersonajesControlador implements ActionListener {

    private PersonajesVista vista;
    private List<JPanel> personajes = new ArrayList();
    private JLabel label;
    public int opc;
    
    public PersonajesControlador(PersonajesVista vista) {
        this.vista = vista;

        vista.aceptarBoton.addActionListener(this);
        vista.cerrarBoton.addActionListener(this);

        this.vista.setLocationRelativeTo(null);

        personajes.add(crearPersonaje(1, "David", "/assets/personajes/david/prevista.png"));
        personajes.add(crearPersonaje(2, "Marco", "/assets/personajes/marco/prevista.png"));
        personajes.add(crearPersonaje(3, "Juan", "/assets/personajes/juan/prevista.png"));

        for (int i = 0; i < personajes.size(); i++) {
            this.vista.principalPanel.add(this.personajes.get(i));
        }

        vista.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "aceptar":
                System.out.println("Aceptar");
                Perfil.gePerfil().setPersonaje(new PersonajeCreador().crear(opc + 1));
                System.out.println(Perfil.gePerfil().getPersonaje().getRutaImagen());
                this.vista.setVisible(false);
                break;
            case "cerrar":
                System.out.println("Cerrar");
                this.vista.setVisible(false);
                break;
            case "David":
                System.out.println("David");
                for (int i = 0; i < personajes.size(); i++) {
                    label = (JLabel) personajes.get(i).getClientProperty(i+1);
                    label.setForeground(Color.WHITE);
                    if (i == 0) {
                        label.setForeground(Paleta.getFondoSecundario());
                        opc = i;
                    }
                }

                break;
            case "Marco":
                System.out.println("Marco");
                for (int i = 0; i < personajes.size(); i++) {
                    label = (JLabel) personajes.get(i).getClientProperty(i+1);
                    label.setForeground(Color.WHITE);
                    if (i == 1) {
                        label.setForeground(Paleta.getFondoSecundario());
                        opc = i;
                    }
                }
                break;
            case "Juan":
                System.out.println("Juan");
                for (int i = 0; i < personajes.size(); i++) {
                    label = (JLabel) personajes.get(i).getClientProperty(i+1);
                    label.setForeground(Color.WHITE);
                    if (i == 2) {
                        label.setForeground(Paleta.getFondoSecundario());
                        opc = i;
                    }
                }
                break;
        }
    }

    public JPanel crearPersonaje(int id, String nombre, String rutaImagen) {
        JPanel personajePanel = new JPanel();
        personajePanel.setLayout(new BoxLayout(personajePanel, BoxLayout.Y_AXIS));
        personajePanel.setOpaque(false);

        ImageIcon imagen = new ImageIcon(getClass().getResource(rutaImagen));

        JRadioButton imagenRadioBoton = new JRadioButton(imagen);
        imagenRadioBoton.setSize(200, 200);
        imagenRadioBoton.setActionCommand(nombre);
        imagenRadioBoton.setOpaque(false);

        JLabel nombreEtiqueta = new JLabel(nombre);
        nombreEtiqueta.setFont(new Font("Artial", Font.BOLD, 16));
        nombreEtiqueta.setForeground(Paleta.getPlano());

        imagenRadioBoton.addActionListener(this);

        personajePanel.add(imagenRadioBoton);
        personajePanel.add(nombreEtiqueta);

        personajePanel.putClientProperty(id, nombreEtiqueta);

        return personajePanel;
    }
}

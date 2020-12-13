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
import modelos.Item;
import modelos.ItemLista;
import modelos.Iterador;
import modelos.Perfil;
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
    ItemLista itemLista;

    public PersonajesControlador(PersonajesVista vista) {
        this.vista = vista;

        vista.aceptarBoton.addActionListener(this);
        vista.cerrarBoton.addActionListener(this);

        this.vista.setLocationRelativeTo(null);

        obtenerPersonajes();
        crearPersonajes();

        vista.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "aceptar":
                Perfil.gePerfil().setPersonajeId(opc);
                System.out.println(Perfil.gePerfil().getPersonajeId());
                this.vista.setVisible(false);
                break;
            case "cerrar":
                this.vista.setVisible(false);
                break;
            case "David":
                seleccionarPersonaje(1);
                break;
            case "Marco":
                seleccionarPersonaje(2);
                break;
            case "Juan":
                seleccionarPersonaje(3);
                break;
        }
    }

    public void seleccionarPersonaje(int pos) {

        Iterador iterador = itemLista.iterador();

        while (iterador.hasNext()) {
            iterador.next();
            int i = iterador.size();

            label = (JLabel) personajes.get(i - 1).getClientProperty(i);
            label.setForeground(Color.WHITE);

            if (i == pos) {
                label.setForeground(Paleta.getFondoSecundario());
                opc = i;
            }
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

    public void obtenerPersonajes() {
        itemLista = new ItemLista("personajes");
        itemLista.agregar(new Item(1, "David", "", "/assets/personajes/david/prevista.png"));
        itemLista.agregar(new Item(2, "Marco", "", "/assets/personajes/marco/prevista.png"));
        itemLista.agregar(new Item(3, "Juan", "", "/assets/personajes/juan/prevista.png"));
    }

    public void crearPersonajes() {
        Iterador iterador = itemLista.iterador();

        while (iterador.hasNext()) {
            Item item = (Item) iterador.next();

            JPanel personajePanel = crearPersonaje(item.getId(), item.getNombre(), item.getRutaImagen());
            this.personajes.add(personajePanel);
            this.vista.principalPanel.add(personajePanel);
        }
    }
}

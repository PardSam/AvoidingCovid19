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
 * Representa una implementación de ActionListener para el Controlador de
 * Personaje
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
 */
public class PersonajesControlador implements ActionListener {

    private PersonajesVista vista;
    private List<JPanel> personajes = new ArrayList();
    private JLabel label;
    public int opc;
    ItemLista itemLista;

    /**
     * Constructor
     *
     * @param vista Diseño
     */
    public PersonajesControlador(PersonajesVista vista) {
        this.vista = vista;

        vista.aceptarBoton.addActionListener(this);
        vista.cerrarBoton.addActionListener(this);

        this.vista.setLocationRelativeTo(null);

        obtenerPersonajes();
        crearPersonajes();
        cargar();
        vista.setVisible(false);
    }

    /**
     * Detectar y manejar la acción sobre el evento; selección de personaje
     *
     * @param e Acción en el evento
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "aceptar":
                Perfil.gePerfil().setPersonajeId(opc);
                this.vista.setVisible(false);
                break;
            case "cerrar":
                this.vista.setVisible(false);
                break;
            case "Civil":
                seleccionarPersonaje(1);
                break;
            case "Doctor":
                seleccionarPersonaje(2);
                break;
            case "Policia":
                seleccionarPersonaje(3);
                break;
        }
    }

    /**
     * Selecciona personaje
     *
     * @param pos tipo
     */
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
    /**
     * Crea el personaje
     *
     * @param id identificador
     * @param nombre nombre
     * @param rutaImagen direccion
     * @return personajePanel Personaje en el panel
     */
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

    /**
     * Obtener el personaje
     */
    public void obtenerPersonajes() {
        itemLista = new ItemLista("personajes");
        itemLista.agregar(new Item(1, "Civil", "", "/assets/personajes/david/prevista.png"));
        itemLista.agregar(new Item(2, "Doctor", "", "/assets/personajes/marco/prevista.png"));
        itemLista.agregar(new Item(3, "Policia", "", "/assets/personajes/juan/prevista.png"));
    }

    /**
     * Crea los personajes
     */
    public void crearPersonajes() {
        Iterador iterador = itemLista.iterador();

        while (iterador.hasNext()) {
            Item item = (Item) iterador.next();

            JPanel personajePanel = crearPersonaje(item.getId(), item.getNombre(), item.getRutaImagen());
            this.personajes.add(personajePanel);
            this.vista.principalPanel.add(personajePanel);
        }
    }
    /**
     * Carga el personaje
     */
    public void cargar() {
        Perfil perfil = Perfil.gePerfil();
        int personajeId = perfil.getPersonajeId();
        seleccionarPersonaje(personajeId);
    }
}

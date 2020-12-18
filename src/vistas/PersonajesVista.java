package vistas;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import ui.MiBoton;
import ui.Paleta;

/**
 * Representa la vista del menú Personajes.
 *
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado,
 * @author Gonzales Cubas,
 * @author Ugaz Arenas.
 */
public class PersonajesVista extends JDialog {

    public JLabel tituloEtiqueta;
    public JButton aceptarBoton;
    public JButton cerrarBoton;

    public JPanel generalPanel;
    public JPanel encabezadoPanel;
    public JPanel principalPanel;
    public JPanel barraAccionesPanel;

    /**
     * Constructor
     */
    public PersonajesVista() {
        setSize(new Dimension(680, 380));
        setLocationRelativeTo(null);
        setResizable(false);
        setModal(true);
        inicializarComponentes();
    }

    /**
     * Inicializa todos los componentes
     */
    public void inicializarComponentes() {
        // Crear las etiquetas
        tituloEtiqueta = new JLabel("PERSONAJES");
        Font font = new Font("Arial", Font.BOLD, 24);
        tituloEtiqueta.setFont(font);
        tituloEtiqueta.setForeground(Paleta.getPlano());

        // Crear los botones
        aceptarBoton = new MiBoton();
        aceptarBoton.setText("ACEPTAR");
        aceptarBoton.setForeground(Paleta.getPlanoPrimario());
        aceptarBoton.setBackground(Paleta.getFondoPrimario());

        cerrarBoton = new MiBoton();
        cerrarBoton.setText("CERRAR");
        cerrarBoton.setForeground(Paleta.getPlanoSuperficie());
        cerrarBoton.setBackground(Paleta.getFondoSuperficie());

        // Establecer acciones de comando a los botones
        aceptarBoton.setActionCommand("aceptar");
        cerrarBoton.setActionCommand("cerrar");

        Container contenedor = getContentPane();
        contenedor.setLayout(new GridLayout(1, 1));
        contenedor.setBackground(Paleta.getFondo());

        generalPanel = new JPanel();
        generalPanel.setLayout(new GridBagLayout());
        generalPanel.setOpaque(false);

        crearEncabezadoPanel();
        crearPrincipalPanel();
        crearBarraAcionesPanel();

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 0;
        generalPanel.add(encabezadoPanel, gbc);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        generalPanel.add(principalPanel, gbc);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.weighty = 0;
        generalPanel.add(barraAccionesPanel, gbc);

        contenedor.add(generalPanel);

    }

    /**
     * Crea el panel para el encabezado
     */
    private void crearEncabezadoPanel() {
        encabezadoPanel = new JPanel();
        encabezadoPanel.setBorder(new EmptyBorder(8, 0, 0, 0));
        encabezadoPanel.setOpaque(false);

        encabezadoPanel.add(tituloEtiqueta);
    }

    /**
     * Crea el Panel Principal
     */
    private void crearPrincipalPanel() {
        principalPanel = new JPanel();
        GridLayout grid = new GridLayout(1, 3);
        grid.setHgap(8);
        principalPanel.setLayout(grid);
        principalPanel.setBorder(new EmptyBorder(8, 16, 8, 16));
        principalPanel.setOpaque(false);

    }

    /**
     * Crea el panel para la barra de acciones
     */
    private void crearBarraAcionesPanel() {
        barraAccionesPanel = new JPanel();
        barraAccionesPanel.setLayout(new BoxLayout(barraAccionesPanel, BoxLayout.X_AXIS));
        barraAccionesPanel.setBorder(new EmptyBorder(0, 8, 8, 8));
        barraAccionesPanel.setOpaque(false);

        barraAccionesPanel.add(Box.createHorizontalGlue());
        barraAccionesPanel.add(aceptarBoton);
        barraAccionesPanel.add(Box.createRigidArea(new Dimension(8, 0)));
        barraAccionesPanel.add(cerrarBoton);
    }

}

package vistas;

import java.awt.Container;
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
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import ui.MiBoton;
import ui.Paleta;

/**
 * Representa la vista del menú Acerca.
 *
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado,
 * @author Gonzales Cubas,
 * @author Ugaz Arenas.
 */
public class AcercaVista extends JDialog {

    public JLabel tituloEtiqueta;
    public JTextArea informacionArea;
    public JButton cerrarBoton;

    public JPanel generalPanel;
    public JPanel encabezadoPanel;
    public JPanel principalPanel;
    public JPanel barraAccionesPanel;

    /**
     * Constructor
     */
    public AcercaVista() {
        this.setSize(540, 528);
        iniciarComponentes();
        setModal(true);
    }

    /**
     * Inicia los componentes
     */
    private void iniciarComponentes() {
        tituloEtiqueta = new JLabel("ACERCA");
        Font font = new Font("Roboto", Font.BOLD, 32);
        tituloEtiqueta.setFont(font);
        tituloEtiqueta.setForeground(Paleta.getPlano());

        informacionArea = new JTextArea();
        informacionArea.setText(
                "\n\t\t\tUniversidad Señor de Sipán\n"
                + "     Escuela Académico Profesional de Ingeniería de Sistemas\n\n"
                + "     Colaboradores:\n\n"
                + "     - Fernando Monja Vásquez\n"
                + "     - Samuel Sánchez Pardo\n"
                + "     - Fiorella More Villegas\n"
                + "     - Jenniffer Diaz Coronado\n"
                + "     - Carlos Ugaz Arenas\n"
                + "     - Jeins Gonzales Cubas\n\n"
                + "     Docente:\n\n"
                + "     - Heber Ivan Mejia Cabrera\n\n"
                + "     Curso:\n\n"
                + "     - Patrones de Diseño de Software y Arquitectura\n\n"
                + "\t                 Avoiding COVID-19. Version 1.0\n\n"
        );
        informacionArea.setEditable(false);
        informacionArea.setForeground(Paleta.getPlanoPrimario());
        informacionArea.setBackground(Paleta.getFondoSuperficie());

        cerrarBoton = new MiBoton();
        cerrarBoton.setText("CERRAR");
        cerrarBoton.setForeground(Paleta.getPlanoPrimario());
        cerrarBoton.setBackground(Paleta.getFondoSuperficie());

        cerrarBoton.setActionCommand("cerrar");

        Container contenedor = this.getContentPane();
        contenedor.setLayout(new GridLayout(1, 1));
        contenedor.setBackground(Paleta.getFondo());

        generalPanel = new JPanel();
        generalPanel.setLayout(new GridBagLayout());
        generalPanel.setOpaque(false);

        crearEncabezadoPanel();
        crearPrincipalPanel();
        crearBarraAccionesPanel();

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 0;
        generalPanel.add(encabezadoPanel, gbc);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 2;
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
        encabezadoPanel.setBorder(new EmptyBorder(16, 0, 16, 0));
        encabezadoPanel.setOpaque(false);

        encabezadoPanel.add(tituloEtiqueta);
    }

    /**
     * crea el panel principal
     */
    private void crearPrincipalPanel() {
        principalPanel = new JPanel();
        principalPanel.setLayout(new BoxLayout(principalPanel, BoxLayout.X_AXIS));
        principalPanel.setOpaque(false);

        principalPanel.add(Box.createHorizontalStrut(30));
        principalPanel.add(informacionArea);
        principalPanel.add(Box.createHorizontalStrut(30));
    }

    /**
     * Crea el panel para la barra de acciones
     */
    private void crearBarraAccionesPanel() {
        barraAccionesPanel = new JPanel();
        barraAccionesPanel.setLayout(new BoxLayout(barraAccionesPanel, BoxLayout.X_AXIS));
        barraAccionesPanel.setBorder(new EmptyBorder(16, 8, 8, 8));
        barraAccionesPanel.setOpaque(false);

        barraAccionesPanel.add(Box.createHorizontalGlue());
        barraAccionesPanel.add(cerrarBoton);
    }
}

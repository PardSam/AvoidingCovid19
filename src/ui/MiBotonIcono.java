package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 * Diseña los iconos Boton extendido de JButton
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
 */
public class MiBotonIcono extends JButton {

    private Shape shape;
    private int ancho = 34;
    private int alto = 34;

    /**
     * Constructor
     */
    public MiBotonIcono() {
        super();
        setOpaque(false);
        setFocusPainted(false);
        setBorderPainted(false);

        setContentAreaFilled(false);

        setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.CYAN, 4),
                BorderFactory.createLineBorder(Color.BLACK, 4))
        );
    }

    /**
     * Pinta componentes
     *
     * @param g Gráficos
     */
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillOval(0, 0, getWidth() - 1, getHeight() - 1);
        super.paintComponent(g);
    }

}

package ui;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;

/**
 * Diseño de botones extendido de JButton
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
 */
public class MiBoton extends JButton {

    private Shape shape;
    private int borderRadius = 32;

    /**
     * Constructor
     */
    public MiBoton() {
        super();
        setOpaque(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFont(new Font("Roboto", Font.BOLD, 12));
    }

    /**
     * Pinta componentes
     *
     * @param g Gráficos
     */
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, borderRadius, borderRadius);
        super.paintComponent(g);
    }

    /**
     * Pinta los bordes
     *
     * @param g Gráficos
     */
    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(getBackground());
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, borderRadius, borderRadius);
    }

    /**
     * Contenedor
     *
     * @param x posicion
     * @param y posicion
     */
    @Override
    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, borderRadius, borderRadius);
        }
        return shape.contains(x, y);
    }

}

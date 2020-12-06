/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class MiBotonIcono extends JButton {

    private Shape shape;
    private int ancho =  34;
    private int alto =  34;

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

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillOval(0, 0, getWidth() - 1, getHeight() - 1);
        super.paintComponent(g);
    }

}

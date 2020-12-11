/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author aries
 */
public class PartidaPanel extends JPanel {

    private PartidaVista vista;
    private Graphics2D gAuxiliar;
            
    public PartidaPanel(PartidaVista vista) {
        this.vista = vista;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) g;
        gAuxiliar = g2;
        vista.dibujar(g2);
        vista.dibujarPuntaje(g2);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import modelos.Perfil;

/**
 *
 * @author aries
 */
public class PartidaJPanel extends JPanel{
    public PartidaJPanel(){
        
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D)g;
        dibujar(g2);
        dibujarPuntaje(g2);
    }

    private void dibujar(Graphics2D g2) {
        //Perfil.gePerfil().getEscenario().dibujar(g2);
        //Perfil.gePerfil().getPersonaje().dibujar(g2);
        mover();
    }

    private void dibujarPuntaje(Graphics2D g2) {
        
    }

    private void mover() {
        //Perfil.gePerfil().getEscenario().mover();
        //Perfil.gePerfil().getPersonaje().mover();
    }
}

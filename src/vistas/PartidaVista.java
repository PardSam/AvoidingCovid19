/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import modelos.Escenario;
import modelos.EscenarioCreador;
import modelos.EscenarioCreadorAbstracto;
import modelos.Perfil;

/**
 *
 * @author aries
 */
public class PartidaVista extends JFrame{
    public JLabel escenarioLabel;
    public PartidaPanel partidaPanel;
    
    
    public PartidaVista() {
        setMinimumSize(new Dimension(1024, 576));

        
        setLocationRelativeTo(null);
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        partidaPanel = new PartidaPanel(this);
        
        this.add(partidaPanel);           
        
        partidaPanel.repaint();

    }
    
}

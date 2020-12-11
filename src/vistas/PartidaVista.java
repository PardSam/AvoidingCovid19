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

    private JLabel escenarioLabel;
    private PartidaJPanel partida;
    public PartidaVista() {
        setMinimumSize(new Dimension(1024, 576));
        //this.setUndecorated(true);
        //this.setResizable(false);
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
        
        setLocationRelativeTo(null);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        escenarioLabel = new JLabel();
        escenarioLabel.setIcon(new ImageIcon(getClass().getResource(Perfil.gePerfil().getEscenario().getRutaImagen())));
        this.add(escenarioLabel);           
        //partida = new PartidaJPanel();
       // this.add(partida);
    }
    
}

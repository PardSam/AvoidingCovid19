/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author aries
 */
public class PartidaVista extends JFrame {

    public JLabel escenarioLabel;
    public PartidaPanel partidaPanel;

    public PartidaVista() {
        setMinimumSize(new Dimension(1024, 576));
        setLocationRelativeTo(null);
        // inicializarComponentes();
    }

    public void inicializarComponentes(PartidaPanel panel) {

        partidaPanel = panel;

        this.add(partidaPanel);
    }
}

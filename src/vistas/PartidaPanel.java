/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import modelos.Partida;

/**
 *
 * @author aries
 */
public class PartidaPanel extends JPanel {

    private Graphics2D gAuxiliar;
    private Partida partida;
    public JRadioButton player;
    private JLabel icono;
    private JLabel mascarilla;
    private ImageIcon imagen;

    public Graphics2D getgAuxiliar() {
        return gAuxiliar;
    }

    public void setgAuxiliar(Graphics2D gAuxiliar) {
        this.gAuxiliar = gAuxiliar;
    }

    public PartidaPanel() {

    }

    public PartidaPanel(Partida partida) {
        this.partida = partida;
        setLayout(null);
        componentes();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) g;
        gAuxiliar = g2;
        this.partida.dibujar(g2, this.partida.isVal());
        this.partida.dibujarPuntaje(g2);
        if (this.partida.isVal()) {
            this.updateUI();
        }

        System.out.println("hola");

    }

    public void componentes() {
        player = new JRadioButton();
        player.setBounds(890, 15, 55, 55);
        player.setActionCommand("Player");
        imagen = new ImageIcon(getClass().getResource("/assets/pause.png"));
        player.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH)));
        player.setOpaque(false);

        icono = new JLabel();
        icono.setBounds(15, 15, 55, 55);
        imagen = new ImageIcon(getClass().getResource("/assets/covid.png"));
        icono.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH)));

        mascarilla = new JLabel();
        mascarilla.setBounds(15, 80, 55, 55);
        imagen = new ImageIcon(getClass().getResource("/assets/mascarilla.png"));
        mascarilla.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH)));

        this.add(player);
        this.add(icono);
        this.add(mascarilla);
    }
}

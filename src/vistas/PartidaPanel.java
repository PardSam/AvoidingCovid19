/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import modelos.Escenario;
import modelos.EscenarioCreador;
import modelos.Partida;
import modelos.Perfil;

/**
 *
 * @author aries
 */
public class PartidaPanel extends JPanel {

    private Graphics2D gAuxiliar;
    private Partida partida;

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
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) g;
        gAuxiliar = g2;
        this.partida.dibujar(g2);
        //dibujar(g2);
        System.out.println("hola");
    }
}

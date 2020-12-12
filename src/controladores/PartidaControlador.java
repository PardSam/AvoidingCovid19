/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import modelos.Nivel1;
import modelos.Nivel2;
import modelos.Nivel3;
import modelos.Partida;
import modelos.Perfil;
import vistas.PartidaPanel;
import vistas.PartidaVista;

/**
 *
 * @author Fernando
 */
public class PartidaControlador implements ActionListener {

    private Partida partida;

    private boolean val = true;
    private ImageIcon playerIcon;

    private PartidaVista vista;
    private PartidaPanel partidaPanel;

    public PartidaControlador(PartidaVista vista) {
        this.vista = vista;

        switch (Perfil.gePerfil().getNivel()) {
            case 1:
                partida = new Nivel1();
                break;
            case 2:
                partida = new Nivel2();
                break;
            case 3:
                partida = new Nivel3();
                break;
            default:
                partida = new Nivel1();
        }

        partidaPanel = new PartidaPanel(partida);
        this.vista.inicializarComponentes(partidaPanel);
        partida.generar();
        this.vista.partidaPanel.player.addActionListener(this);
        this.vista.setLocationRelativeTo(null);

        vista.setVisible(true);
  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Player":

                if (val) {
                    playerIcon = new ImageIcon(getClass().getResource("/assets/play.png"));
                    val = false;
                } else if (val == false) {
                    playerIcon = new ImageIcon(getClass().getResource("/assets/pause.png"));
                    val = true;
                    this.vista.partidaPanel.updateUI();
                }
                this.vista.partidaPanel.player.setIcon(new ImageIcon(playerIcon.getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH)));
                break;
        }
    }
}

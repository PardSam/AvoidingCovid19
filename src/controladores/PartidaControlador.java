/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import modelos.ControlInvocador;
import modelos.IComando;
import modelos.Nivel1;
import modelos.Nivel2;
import modelos.Nivel3;
import modelos.Partida;
import modelos.PausarComando;
import modelos.Perfil;
import modelos.SaltarComando;
import vistas.PartidaPanel;
import vistas.PartidaVista;

/**
 *
 * @author Fernando
 */
public class PartidaControlador implements ActionListener, KeyListener {

    public Partida partida;

    public ImageIcon playerIcon;

    public PartidaVista vista;
    public PartidaPanel partidaPanel;

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

        this.vista.partidaPanel.setFocusable(true);
        this.vista.partidaPanel.addKeyListener(this);

        this.vista.setLocationRelativeTo(null);

        vista.setVisible(true);

    }

    private void ejecutarComando(IComando comando) {
        ControlInvocador control = new ControlInvocador(comando);
        control.run();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Player":
                ejecutarComando(new PausarComando(this));
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_SPACE) {
            ejecutarComando(new SaltarComando(partida));
        }

        if (ke.getKeyCode() == KeyEvent.VK_P) {
            this.partidaPanel.player.doClick();
        }

    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelos.ControlInvocador;
import modelos.IComando;
import modelos.TrabajoPartida;
import modelos.HospitalPartida;
import modelos.ComisariaPartida;
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
public class PartidaControlador implements ActionListener, KeyListener,WindowListener {

    public Partida partida;

    public ImageIcon playerIcon;

    public PartidaVista vista;
    public PartidaPanel partidaPanel;

    public PartidaControlador(PartidaVista vista) {
        this.vista = vista;
        this.vista.addWindowListener(this);

        switch (Perfil.gePerfil().getNivel()) {
            case 1:
                partida = new TrabajoPartida();
                break;
            case 2:
                partida = new HospitalPartida();
                break;
            case 3:
                partida = new ComisariaPartida();
                break;
            default:
                partida = new TrabajoPartida();
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

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        Component frame;
        if (JOptionPane.showConfirmDialog(this.vista, 
            "Are you sure you want to close this window?", "Close Window?", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
           
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}

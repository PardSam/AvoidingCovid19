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
import modelos.ContinuarComando;
import modelos.ContinuarPausarComando;
import modelos.Partida;
import modelos.PartidaCaretaker;
import modelos.PausarComando;
import modelos.Perfil;
import modelos.SaltarComando;
import modelos.VidaConcretoObservador;
import vistas.PartidaPanel;
import vistas.PartidaVista;

/**
 *
 * @author Fernando
 */
public class PartidaControlador implements ActionListener, KeyListener, WindowListener {

    public Partida partida;

    public ImageIcon playerIcon;

    public PartidaVista vista;
    public PartidaPanel partidaPanel;

    public PartidaCaretaker partidaCaretaker;

    public PartidaControlador(PartidaVista vista, PartidaCaretaker partidaCaretaker) {
        this.vista = vista;

        this.partidaCaretaker = partidaCaretaker;

        if (partidaCaretaker.getEstados().size() > 0) {
            partida = partidaCaretaker.getMemento(partidaCaretaker.getEstados().size() - 1).getEstadoGuardado();
        } else {

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

        }
        partida.agregar(new VidaConcretoObservador(partida));
        
        partidaPanel = new PartidaPanel(partida);

        this.vista.inicializarComponentes(partidaPanel);

        partida.generar();

        this.vista.addWindowListener(this);
        this.vista.partidaPanel.player.addActionListener(this);

        this.vista.partidaPanel.setFocusable(true);
        this.vista.partidaPanel.addKeyListener(this);

        ejecutarComando(new ContinuarComando(this));

        this.vista.setLocationRelativeTo(null);

        vista.setVisible(false);

    }

    private void ejecutarComando(IComando comando) {
        ControlInvocador control = new ControlInvocador(comando);
        control.run();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Player":
                ejecutarComando(new ContinuarPausarComando(this));
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
            ejecutarComando(new ContinuarPausarComando(this));
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
        ejecutarComando(new PausarComando(this));

        int confirmar = JOptionPane.showConfirmDialog(this.vista,
                "Are you sure you want to close this window?", "Close Window?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (confirmar == JOptionPane.YES_OPTION) {
            partidaCaretaker.agregarMemento(partida.guardarEstado());
        }
    }

    @Override
    public void windowClosed(WindowEvent e
    ) {
    }

    @Override
    public void windowIconified(WindowEvent e
    ) {
    }

    @Override
    public void windowDeiconified(WindowEvent e
    ) {
    }

    @Override
    public void windowActivated(WindowEvent e
    ) {
    }

    @Override
    public void windowDeactivated(WindowEvent e
    ) {
    }
}

package controladores;

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
 * Representa una implementación de ActionListener, KeyListener y WindowListener
 * para el Controlador de Partida
 *
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas.
 */
public class PartidaControlador implements ActionListener, KeyListener, WindowListener {

    public Partida partida;

    public ImageIcon playerIcon;

    public PartidaVista vista;
    public PartidaPanel partidaPanel;

    public PartidaCaretaker partidaCaretaker;

    /**
     * Vista de la partida y sus diferentes aspectos.
     *
     * @param vista Diseño
     */
    public PartidaControlador(PartidaVista vista, PartidaCaretaker partidaCaretaker) {
        this.vista = vista;

        this.partidaCaretaker = partidaCaretaker;

        Perfil perfil = Perfil.getPerfil();

        if (perfil.isContinuarPartida() && partidaCaretaker.getEstados().size() > 0) {
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
        partida.agregar(new VidaConcretoObservador(partida, this));

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

    /**
     * Ejecuta los comandos que se le asigne
     *
     * @param comando comando
     */
    private void ejecutarComando(IComando comando) {
        ControlInvocador control = new ControlInvocador(comando);
        control.run();
    }

    /**
     * Detectar y manejar la acción sobre el evento
     *
     * @param e Acción en el evento
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Player":
                ejecutarComando(new ContinuarPausarComando(this));
                break;
        }
    }

    /**
     * Ejecutar cuando presiona una tecla, pero que esta corresponda a
     * caracteres
     *
     * @param KeyEvent llave del evento
     */
    @Override
    public void keyTyped(KeyEvent ke) {

    }

    /**
     * Ejecutar cuando se presiona la tecla space
     *
     * @param KeyEvent llave del evento
     */
    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_SPACE) {
            ejecutarComando(new SaltarComando(partida));
        }

        if (ke.getKeyCode() == KeyEvent.VK_P) {
            ejecutarComando(new ContinuarPausarComando(this));
        }

    }

    /**
     * Se ejecuta cuando se libera la tecla
     *
     * @param KeyEvent llave del evento
     */
    @Override
    public void keyReleased(KeyEvent ke) {

    }

    /**
     * Muestra una ventana por primera vez
     *
     * @param WindowEvent ventana
     */
    @Override
    public void windowOpened(WindowEvent e) {
    }

    /**
     * Elimina la ventana de la pantalla
     *
     * @param WindowEvent ventana
     */
    @Override
    public void windowClosing(WindowEvent e) {
        ejecutarComando(new PausarComando(this));
        Perfil perfil = Perfil.getPerfil();
        if (partida.isFinPartida()) {
            JOptionPane.showMessageDialog(null, "Fin de partida");
            perfil.setContinuarPartida(false);
        } else {

            int confirmar = JOptionPane.showConfirmDialog(this.vista,
                    "Are you sure you want to close this window?", "Close Window?",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            if (confirmar == JOptionPane.YES_OPTION) {

                perfil.setContinuarPartida(true);
                partidaCaretaker.agregarMemento(partida.guardarEstado());
            }
        }

    }

    /**
     * Cierra la ventana de la pantalla
     *
     * @param WindowEvent ventana
     */
    @Override
    public void windowClosed(WindowEvent e
    ) {
    }

    /**
     * Reducir la ventana a ícono
     *
     * @param WindowEvent ventana
     */
    @Override
    public void windowIconified(WindowEvent e
    ) {
    }

    /**
     * Restaura la ventana a tamaño original
     *
     * @param WindowEvent ventana
     */
    @Override
    public void windowDeiconified(WindowEvent e
    ) {
    }

    /**
     * Ventana enfocada
     *
     * @param WindowEvent ventana
     */
    @Override
    public void windowActivated(WindowEvent e
    ) {
    }

    /**
     * Ventana desenfocada
     *
     * @param WindowEvent ventana
     */
    @Override
    public void windowDeactivated(WindowEvent e
    ) {
    }
}

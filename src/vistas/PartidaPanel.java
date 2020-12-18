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
 * Representa el Panel Partida.
 *
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado,
 * @author Gonzales Cubas,
 * @author Ugaz Arenas.
 */
public class PartidaPanel extends JPanel {

    private Graphics2D gAuxiliar;
    private Partida partida;
    public JRadioButton player;
    private JLabel icono;
    private JLabel mascarilla;
    private ImageIcon imagen;

    /**
     * obtiene gAuxiliar
     *
     * @return gAuxiliar
     */
    public Graphics2D getgAuxiliar() {
        return gAuxiliar;
    }

    /**
     * Establece gAuxiliar
     *
     * @param gAuxiliar
     */
    public void setgAuxiliar(Graphics2D gAuxiliar) {
        this.gAuxiliar = gAuxiliar;
    }

    /**
     * Constructor
     */
    public PartidaPanel() {

    }

    /**
     * Constructor
     */
    public PartidaPanel(Partida partida) {
        this.partida = partida;
        setLayout(null);
        componentes();
    }

    /**
     * Pinta los componentes
     *
     * @param: Graphics
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);

        Graphics2D g2 = (Graphics2D) g;
        gAuxiliar = g2;

        this.partida.dibujar(g2);
        this.partida.dibujarPuntaje(g2);
        if (this.partida.isFinPartida()) {            
            if (this.partida.getActualizarPartida()<5) {
                System.out.println(this.partida.getActualizarPartida());
                  this.updateUI();
            }          
           this.partida.setActualizarPartida(this.partida.getActualizarPartida()+1);
        }
        if (!this.partida.isPausaPartida() && this.partida.isFinPartida() == false) {
            this.partida.mover();
            this.updateUI();
            try {
                Thread.sleep(5);
            } catch (InterruptedException err) {

            }
        }
    }

    /**
     * inicia los componentes
     */
    public void componentes() {
        player = new JRadioButton();
        player.setBounds(890, 15, 80, 55);
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

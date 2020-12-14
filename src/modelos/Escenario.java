package modelos;

import java.awt.Graphics2D;
import javax.swing.ImageIcon;

/**
 * Es una clase abstracta.
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public abstract class Escenario {

    private Partida partida;
        /**
     * Constructor vació del escenario 
     */
    public Escenario() {
    }
            /**
     * Constructor que asigna una partida a Escenario
     */
    public Escenario(Partida partida) {
        this.partida = partida;
    }
        /**
     * Retorna una partida 
     * @return  La partida
     */
    public Partida getPartida() {
        return this.partida;
    }
        /**
     * Establece una partida
     * @param partida Coloca una partida
     */
    public void setPartida(Partida partida) {
        this.partida = partida;
    }
        /**
     * Dibuja el personaje doctor según los ejes establecidos
     * @param g  Grafica un escenario
     */
    public abstract void dibujar(Graphics2D g);
    public abstract String getRutaImagen(); 
    public abstract String getRutaNocheImagen();   
    public abstract int getNivel();   
    public abstract void setEscenarioImg(ImageIcon escenarioImg);   
    public abstract ImageIcon getEscenarioImg();   
    public abstract void mover() ;
}

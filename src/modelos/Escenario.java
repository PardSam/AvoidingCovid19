/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
     * Methodo que obtiene a la clase Partida
     * @param partida Escenario para la partida
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
     * @param partidaColoca una partida
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

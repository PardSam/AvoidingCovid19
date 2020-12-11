/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Graphics2D;
import java.awt.geom.Area;

/**
 *
 * @author aries
 */
public abstract class Personaje {
    private Partida partida;
      public Personaje() {
    }
    
    public Personaje(Partida partida) {
        this.partida = partida;
    }
    public abstract void dibujar(Graphics2D g);

    public abstract String getRutaImagen();

    public abstract void mover();

    public abstract Area getBounds();
}

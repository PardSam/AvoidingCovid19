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
public abstract class Obstaculo {

    public abstract void mover();

    public abstract void dibujar(Graphics2D g);

    public abstract Area getBounds();

    public abstract boolean colision();
}

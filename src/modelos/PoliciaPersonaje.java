/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Graphics2D;
import java.awt.geom.Area;
import javax.swing.ImageIcon;

/**
 *
 * @author aries
 */
public class PoliciaPersonaje extends Personaje {

    private boolean sube = false;
    private boolean baja = false;
    private boolean salta = false;
    private int tipo;
    private String rutaImagen;
    private int ancho = 112;
    private int alto = 110;
    private int xInicial = 50;
    private int yInicial = 370;
    private int xAuxiliar = 0;
    private int yAuxiliar = 0;

    public PoliciaPersonaje() {
        this.baja = false;
        this.sube = false;
        this.salta = false;
        this.tipo = 1;
        this.rutaImagen = "/assets/personajes/juan/normal.png";
    }

    @Override
    public void dibujar(Graphics2D g) {
        ImageIcon personaje = new ImageIcon(getClass().getResource(this.rutaImagen));
        g.drawImage(personaje.getImage(), xInicial, yInicial, ancho, alto, null);
    }

    @Override
    public void mover() {

    }

    @Override
    public Area getBounds() {
        return null;
    }

    @Override
    public String getRutaImagen() {
        return rutaImagen;
    }

}

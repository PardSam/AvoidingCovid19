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

    private boolean sube;
    private boolean baja;
    private boolean salta;
    private int tipo;
    private String rutaImagen;
    private int ancho = 112;
    private int alto = 78;
    private int xInicial = 50;
    private int yInicial = 270;
    private int xAuxiliar = 0;
    private int yAuxiliar = 0;

    public PoliciaPersonaje() {
        this.baja = false;
        this.sube = false;
        this.salta = false;
        this.tipo = 1;
        this.rutaImagen = "/assets/personaje/juan/normal.png";
    }

    @Override
    public void dibujar(Graphics2D g) {
        ImageIcon personaje = new ImageIcon(getClass().getResource("/multimedia/tractor.png"));
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.geom.Area;
import javax.swing.ImageIcon;

/**
 *
 * @author aries
 */
public class DoctorPersonaje extends Personaje {

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

    public DoctorPersonaje() {
        this.baja = false;
        this.sube = false;
        this.salta = false;
        this.tipo = 1;
        this.rutaImagen = "/assets/personajes/marco/normal.png";
    }

    @Override
    public void dibujar(Graphics2D g) {
        ImageIcon personaje = new ImageIcon(getClass().getResource(this.rutaImagen));
        g.drawImage(personaje.getImage(), xInicial, yInicial, ancho, alto, null);
    }

    @Override
    public void mover() {
        if (xInicial + xAuxiliar > 0 && xInicial + xAuxiliar < 1000 - ancho) {
            xInicial = xInicial + xAuxiliar;
        }

        if (salta) {
            if (yInicial == 370) {
                sube = true;
                yAuxiliar = -2;
                baja = false;
            }

            if (yInicial == 150) {
                baja = true;
                yAuxiliar = 2;
                sube = false;
            }

            if (sube) {
                yInicial = yInicial + yAuxiliar;
            }

            if (baja) {
                yInicial = yInicial + yAuxiliar;

                if (yInicial == 370) {
                    salta = false;
                }
            }
        }
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            salta = true;
        }
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;

/**
 * Representa una implementación concreta de la clase Personaje.
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */

public class DoctorPersonaje extends Personaje {

    private boolean sube = false;
    private boolean baja = false;
    private boolean salta = false;
    private int tipo;
    private String rutaImagen;
    private int ancho = 70;
    private int alto = 145;
    private int xInicial = 50;
    private int yInicial = 370;
    private int xAuxiliar = 0;
    private int yAuxiliar = 0;
   
    private Area piernaIzquierda, piernaDerecha, cuerpo, personajeArea;
    /**
     * Establece la posición inicial en el eje y
     * @param yInicial Posicion en y
     */
    @Override
    public void setyInicial(int yInicial) {
        this.yInicial = yInicial;
    }
    /**
     * Evalua el movimiento saltar del personaje doctor
     * @return Boleeano para verificar el salto
     */
    public boolean isSalta() {
        return salta;
    }
    /**
     * Establece el movimiento saltar del persona doctor
     * @param salta Determinar si salta o no
     */
    @Override
    public void setSalta(boolean salta) {
        this.salta = salta;
    }
    /**
     * Inicializa los valores del personaje doctor
     */
    public DoctorPersonaje() {
        this.baja = false;
        this.sube = false;
        this.salta = false;
        this.tipo = 1;
        this.rutaImagen = "/assets/personajes/marco/normal.png";
    }
    /**
     * Dibuja el personaje doctor según los ejes establecidos
     * @param g Grafica el Personaje
     */
    @Override
    public void dibujar(Graphics2D g) {
        ImageIcon personaje = new ImageIcon(getClass().getResource(this.rutaImagen));
        g.drawImage(personaje.getImage(), xInicial, yInicial, ancho, alto, null);
    }
    /**
     * Direcciona el movimiento del personaje doctor 
     */
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
    /**
     * Retrona un boleeano para el movimiento de saltar
     */
    @Override
    public void saltar() {
        salta = true;
    }
/**
 * Define el área del personaje doctor 
 * @return  Area del personaje
 */
    @Override
    public Area getBounds() {
        Rectangle forma1 = new Rectangle(xInicial, yInicial, 95, 62);
        cuerpo = new Area(forma1);

        Ellipse2D forma2 = new Ellipse2D.Double(xInicial, yInicial + 28, 48, 48);
        piernaDerecha = new Area(forma2);

        Ellipse2D forma3 = new Ellipse2D.Double(xInicial + 73, yInicial + 39, 38, 38);
        piernaIzquierda = new Area(forma3);

        personajeArea = cuerpo;
        personajeArea.add(cuerpo);
        personajeArea.add(personajeArea);
        personajeArea.add(piernaIzquierda);

        return personajeArea;
    }
/**
 * Retorna la ruta de la imagen del personaje doctor
 * @return Ruta de la imagen
 */
    @Override
    public String getRutaImagen() {
        return rutaImagen;
    }

}

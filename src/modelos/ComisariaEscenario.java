/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Graphics2D;
import javax.swing.ImageIcon;

/**
 * Representa una implementación concreta de la clase Escenario.
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public class ComisariaEscenario extends Escenario {

    private String titulo;
    public String rutaImagen;
    public String rutaNocheImagen;
    private int ancho, alto, nivel;
    private int xInicial = 1024, yInicial = 0;
    private int xAuxiliar = 0, yAuxiliar = 0;
    private ImageIcon escenarioImg;
    /**
     * Constructor del escenario comisaría 
     */
    public ComisariaEscenario() {
        super();
        this.titulo = "Comisaria";
        this.ancho = 1024;
        this.alto = 550;
        this.nivel = 3;
        this.rutaImagen = "/assets/escenarios/comisaria/fondo.png";
        this.rutaNocheImagen = "/assets/escenarios/comisaria/fondo.png";
    }
    /**
     * Constructor del escenario comisaría en la Partida
     * @param partida Datos de la partida
     */
    public ComisariaEscenario(Partida partida) {
        super(partida);
        this.titulo = "Comisaria";
        this.ancho = 1024;
        this.alto = 550;
        this.nivel = 3;
        this.rutaImagen = "/assets/escenarios/comisaria/fondo.png";
        this.rutaNocheImagen = "/assets/escenarios/comisaria/fondo.png";
    }
/**
 * Direcciona el movimiento del escenario comisaría 
 */
    @Override
    public void mover() {
        xInicial = xInicial - 2;
        xAuxiliar = xAuxiliar - 2;

        if (xInicial == 0 || xAuxiliar == -1024) {
            xInicial = 1024;
            xAuxiliar = 0;
        }
    }
    /**
     * Retorna la ruta de la imagen del escenario de noche
     * @return Imagen de noche
     */
    @Override
    public String getRutaNocheImagen() {
        return rutaNocheImagen;
    }
    /**
     * Retorna la ruta de la imagen del escenario comisaría 
     * @return Ruta de la imagen
     */
    @Override
    public String getRutaImagen() {
        return rutaImagen;
    }
    /**
     * Retorna el nivel de la partida
     * @return Obtiene Nivel 
     */
    @Override
    public int getNivel() {
        return nivel;
    }
    /**
     * Obtiene el nivel de la partida
     * @param nivel Nivel del juego
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    /**
     * Retorna imagen del Escenario
     * @return  Imagen de Escenario
     */
    @Override
    public ImageIcon getEscenarioImg() {
        return escenarioImg;
    }
    /**
     * Estable la imagen del escenario de comisaria 
     * @param escenarioImg Imagen del escenario
     */
    @Override
    public void setEscenarioImg(ImageIcon escenarioImg) {
        this.escenarioImg = escenarioImg;
    }
    /**
     * Dibuja el escenario comisaría según los ejes establecidos
     * @param g  Grafica el escenario
     */
    @Override
    public void dibujar(Graphics2D g) {
        //ImageIcon escenario = new ImageIcon(getClass().getResource(this.rutaImagen));
        g.drawImage(escenarioImg.getImage(), xInicial, yInicial, ancho, alto, null);
        g.drawImage(escenarioImg.getImage(), xAuxiliar, yAuxiliar, ancho, alto, null);
    }

}

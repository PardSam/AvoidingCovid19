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
public class HospitalEscenario extends Escenario {

    private String titulo;
    public String rutaImagen;
    public String rutaNocheImagen;
    private int ancho = 1024, alto = 550, nivel = 2;
    private int xInicial = 1024, yInicial = 0;
    private int xAuxiliar = 0, yAuxiliar = 0;
    private ImageIcon escenarioImg;
    /**
     * Constructor del escenario hospital
     */
    public HospitalEscenario() {
        super();
        this.titulo = "Hospital";
        this.rutaImagen = "/assets/escenarios/hospital/fondo.png";
        this.rutaNocheImagen = "/assets/escenarios/hospital/fondo.png";
    }
    /**
     * Constructor del escenario hospital en la Partida
     * @param partida Asigana el escenario en la partida
     */
    public HospitalEscenario(Partida partida) {
        super(partida);
        this.titulo = "Hospital";
        this.rutaImagen = "/assets/escenarios/hospital/fondo.png";
        this.rutaNocheImagen = "/assets/escenarios/hospital/fondo.png";
    }
    /**
     * Direcciona el movimiento del escenario hospital
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
     * Retorna la ruta de la imagen del escenario hospital en la noche
     * @return Ruta de la imagen
     */
    @Override
    public String getRutaNocheImagen() {
        return rutaNocheImagen;
    }
    /**
     * Retorna la ruta de la imagen del escenario hospital
     * @return Ruta de la imagen
     */
      
    @Override
    public String getRutaImagen() {
        return rutaImagen;
    }
    /**
     * Indica el nivel de la partida
     * @return El Nivel
     */
    @Override
    public int getNivel() {
        return nivel;
    }
    /**
     * Establece el nivel 
     * @param nivel Numero de nivel
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * Obtiene la imagen del escenario
     * @return Imagen del escenario
     */
    @Override
    public ImageIcon getEscenarioImg() {
        return escenarioImg;
    }
    /**
     * Establece la imagen del escenario
     * @param escenarioImg Imagen para el escenario
     */
    @Override
    public void setEscenarioImg(ImageIcon escenarioImg) {
        this.escenarioImg = escenarioImg;
    }
    /**
     * Dibujo el escenario en la partida
     * @param g Grafica al hospital Escenario
     */
    @Override
    public void dibujar(Graphics2D g) {
       // ImageIcon escenario = new ImageIcon(getClass().getResource(this.rutaImagen));
        g.drawImage(escenarioImg.getImage(), xInicial, yInicial, ancho, alto, null);
        g.drawImage(escenarioImg.getImage(), xAuxiliar, yAuxiliar, ancho, alto, null);
    }


}

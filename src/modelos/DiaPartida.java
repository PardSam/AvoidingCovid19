/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.GrayFilter;
import javax.swing.ImageIcon;

/**
 * DiaPartida
 * Es una clase que Hereda de Ambiente Partida Decorador para modificar el escenario.
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public class DiaPartida extends AmbientePartidaDecorador {
    /**
     * Obtiene un ambiente de la clase Escenario 
     * @param decorado  Escenario Decorado
     */
    public DiaPartida(Escenario decorado) {
        super(decorado);
    }
    /**
     * Dibuja el escenario de dia según los ejes establecidos
     * @param g Grafica el escenario dentro de la partida
     */
    @Override
    public void dibujar(Graphics2D g) {
        getDecorado().setEscenarioImg(new ImageIcon(getClass().getResource(getDecorado().getRutaImagen())));
        getDecorado().dibujar(g);
    }
    /**
     * Retorna la ruta de la imagen del personaje civil
     * @return Ruta de la imagen
     */
    @Override
    public String getRutaImagen() {
        return getDecorado().getRutaImagen();
    }
    /**
     * Direcciona el movimiento del escenario
     */
    @Override
    public void mover() {
        getDecorado().mover();
    }
    /**
     * Retorna el nivel de la Partida
     * @return  Nivel
     */
    @Override
    public int getNivel() {
        return getDecorado().getNivel();
    }
    /**
     * Establece la imagen del escenario
     * @param escenarioImg Coloca la imagen
     */
    @Override
    public void setEscenarioImg(ImageIcon escenarioImg) {
        getDecorado().getEscenarioImg();
    }
    /**
     * Retorna la imagen el escenario
     * @return La imagen del escenario
     */
    @Override
    public ImageIcon getEscenarioImg() {
        return getDecorado().getEscenarioImg();
    }
    /**
     * Retorma imagen de noche del Escenario
     * @return La imagen de noche
     */
    @Override
    public String getRutaNocheImagen() {
        return getDecorado().getRutaNocheImagen();
    }
}

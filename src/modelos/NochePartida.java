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
 * Clase que se extiendo de la clase  AmbientePartidaDecorador para un escenario
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public class NochePartida extends AmbientePartidaDecorador {
    /**
     * Obtiene un ambiente de la clase Escenario 
     * @param decorado 
     */
    public NochePartida(Escenario decorado) {
        super(decorado);
    }

    /*@Override
    public void escenarioCambio(Escenario decorado) {
        ImageIcon escenario = new ImageIcon(getClass().getResource(decorado.getRutaImagen()));
        Image normalImage = escenario.getImage();
        Image grayImage = GrayFilter.createDisabledImage(normalImage);
        escenario.setImage(grayImage);
    }
     */
    /**
     * Se Graficara el escenario con la tematica de noche
     * @param g Grafica el escenario
     */
    @Override
    public void dibujar(Graphics2D g) {
        getDecorado().setEscenarioImg(new ImageIcon(getClass().getResource(getDecorado().getRutaImagen())));
        Image normalImage = getDecorado().getEscenarioImg().getImage();
        Image grayImage = GrayFilter.createDisabledImage(normalImage);
        getDecorado().getEscenarioImg().setImage(grayImage);

        getDecorado().dibujar(g);
    }
    /**
     * Obtiene la ruta de la imagen para el escenario nocturno
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
     * Indica el nivel de la partida
     * @return Nivel
     */
    @Override
    public int getNivel() {
        return getDecorado().getNivel();
    }
    /**
     * Establece la imagen del escenario
     * @param escenarioImg Imagen del escenario
     */
    @Override
    public void setEscenarioImg(ImageIcon escenarioImg) {
        getDecorado().getEscenarioImg();
    }
    /**
     * Obtiene la imagen del escenario
     * @return Imagen del escenario
     */
    @Override
    public ImageIcon getEscenarioImg() {
        return getDecorado().getEscenarioImg();
    }
    /**
     * Obtiene la imagen nocturna del escenario
     * @return Ruta de la imagen de noche
     */
    @Override
    public String getRutaNocheImagen() {
        return getDecorado().getRutaNocheImagen();
    }

}

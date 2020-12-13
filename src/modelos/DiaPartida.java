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
 *
 * @author aries
 */
public class DiaPartida extends AmbientePartidaDecorador {

    public DiaPartida(Escenario decorado) {
        super(decorado);
    }

    @Override
    public void dibujar(Graphics2D g) {
        getDecorado().setEscenarioImg(new ImageIcon(getClass().getResource(getDecorado().getRutaImagen())));
        getDecorado().dibujar(g);
    }

    @Override
    public String getRutaImagen() {
        return getDecorado().getRutaImagen();
    }

    @Override
    public void mover() {
        getDecorado().mover();
    }

    @Override
    public int getNivel() {
        return getDecorado().getNivel();
    }

    @Override
    public void setEscenarioImg(ImageIcon escenarioImg) {
        getDecorado().getEscenarioImg();
    }

    @Override
    public ImageIcon getEscenarioImg() {
        return getDecorado().getEscenarioImg();
    }

    @Override
    public String getRutaNocheImagen() {
        return getDecorado().getRutaNocheImagen();
    }
}

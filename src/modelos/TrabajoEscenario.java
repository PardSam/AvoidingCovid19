/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Graphics2D;
import javax.swing.ImageIcon;

/**
 *
 * @author aries
 */
public class TrabajoEscenario extends Escenario {

    private String titulo;
    public String rutaImagen;
    public String rutaNocheImagen;
    private int ancho, alto, nivel;
    private int xInicial = 1024, yInicial = 0;
    private int xAuxiliar = 0, yAuxiliar = 0;
    private ImageIcon escenarioImg;

    public TrabajoEscenario() {
        this.titulo = "Trabajo";
        this.ancho = 1024;
        this.alto = 550;
        this.nivel = 1;
        this.rutaImagen = "/assets/escenarios/trabajo/fondo.png";
        this.rutaNocheImagen = "/assets/escenarios/trabajo/fondo-noche.png";
    }

    public TrabajoEscenario(Partida partida) {
        super(partida);
        this.titulo = "Trabajo";
        this.ancho = 1024;
        this.alto = 550;
        this.nivel = 1;
        this.rutaImagen = "/assets/escenarios/trabajo/fondo.png";
        this.rutaNocheImagen = "/assets/escenarios/trabajo/fondo-noche.png";
    }

    @Override
    public String getRutaNocheImagen() {
        return rutaNocheImagen;
    }

    @Override
    public ImageIcon getEscenarioImg() {
        return escenarioImg;
    }

    @Override
    public void setEscenarioImg(ImageIcon escenarioImg) {
        this.escenarioImg = escenarioImg;
    }

    @Override
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String getRutaImagen() {
        return rutaImagen;
    }

    @Override
    public void mover() {
        xInicial = xInicial - 2;
        xAuxiliar = xAuxiliar - 2;

        if (xInicial == 0 || xAuxiliar == -1024) {
            xInicial = 1024;
            xAuxiliar = 0;
        }
    }

    @Override
    public void dibujar(Graphics2D g) {
        //ImageIcon escenario = new ImageIcon(getClass().getResource(this.rutaImagen));
        g.drawImage(escenarioImg.getImage(), xInicial, yInicial, ancho, alto, null);
        g.drawImage(escenarioImg.getImage(), xAuxiliar, yAuxiliar, ancho, alto, null);
    }

}

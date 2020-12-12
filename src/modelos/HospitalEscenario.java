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
public class HospitalEscenario extends Escenario {

    private String titulo;
    public String rutaImagen;
    private int ancho =1024, alto = 550, nivel= 2;
    private int xInicial = 1024, yInicial = 0;
    private int xAuxiliar = 0, yAuxiliar = 0;

    public HospitalEscenario() {
        super();
        this.titulo = "Hospital";
        this.rutaImagen = "/assets/escenarios/hospital/fondo.png";
    }

    public HospitalEscenario(Partida partida) {
        super(partida);
        this.titulo = "Hospital";
        this.rutaImagen = "/assets/escenarios/hospital/fondo.png";
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
    public String getRutaImagen() {
        return rutaImagen;
    }

    @Override
    public void dibujar(Graphics2D g) {
        ImageIcon escenario = new ImageIcon(getClass().getResource(this.rutaImagen));
        g.drawImage(escenario.getImage(), xInicial, yInicial, ancho, alto, null);
        g.drawImage(escenario.getImage(), xAuxiliar, yAuxiliar, ancho, alto, null);
    }
}

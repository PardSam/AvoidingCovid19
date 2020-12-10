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
    public  String rutaImagen;
    private int ancho, alto, nivel;
    private int xInicial, yInicial;
    private int xAuxiliar, yAuxiliar;
    
    public TrabajoEscenario() {
        this.titulo = "Trabajo";
        this.ancho = 8;
        this.alto = 3;
        this.nivel = 1;
        this.rutaImagen = "/assets/escenarios/trabajo/fondo.png";
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

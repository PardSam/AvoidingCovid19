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
public class ComisariaEscenario extends Escenario {

    private String titulo;
    public String rutaImagen;
    private int ancho, alto, nivel;
    private int xInicial = 1024, yInicial=0;
    private int xAuxiliar=0, yAuxiliar=0;

    public ComisariaEscenario() {
        super();
        this.titulo = "Comisaria";
        this.ancho = 1024;
        this.alto = 500;
        this.nivel = 3;
        this.rutaImagen = "/assets/escenarios/comisaria/fondo.png";
    }
        
    public ComisariaEscenario(Partida partida) {
        super(partida);
        this.titulo = "Comisaria";
        this.ancho = 1024;
        this.alto = 500;
        this.nivel = 3;
        this.rutaImagen = "/assets/escenarios/comisaria/fondo.png";
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

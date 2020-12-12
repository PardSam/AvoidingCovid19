/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;

/**
 *
 * @author aries
 */
public class ObstaculoNegativo extends Obstaculo {

    private Partida partida;
    int ancho = 112;
    int alto = 110;
    String rutaImagen = "/assets/personajes/juan/normal.png";

    Area cabeza, cuerpo, enfermo;

    int xInicial = 1024;
    int yInicial = 370;

    int xAuxiliar = -4;

    public ObstaculoNegativo(Partida partida) {
        this.partida = partida;
    }

    @Override
    public void mover() {
        if (xInicial <= -100) {
            partida.setPuntaje(partida.getPuntaje() + 1);;

            xInicial = 1300;

            /* if (partida.getPuntaje() == 3 || partida.getPuntaje() == 5 || juego.puntos == 9 || juego.puntos == 12) {
                xAuxiliar = xAuxiliar - 2;
                juego.nivel++;
            }*/
        } else {
            if (colision()) {
                if (partida.getDefensa() == 0) {
                    partida.finJuego();
                } else {
                    partida.pierdeVida();
                }
            } else {
                xInicial = xInicial + xAuxiliar;
            }
        }
    }

    @Override
    public void dibujar(Graphics2D g) {
        ImageIcon obstaculo = new ImageIcon(getClass().getResource(rutaImagen));
        g.drawImage(obstaculo.getImage(), xInicial, yInicial, ancho, alto, null);
    }

    @Override
    public Area getBounds() {
        Ellipse2D forma1 = new Ellipse2D.Double(xInicial, yInicial, 40, 40);
        cabeza = new Area(forma1);

        Rectangle forma2 = new Rectangle(xInicial + 12, yInicial + 16, 50, 53);
        cuerpo = new Area(forma2);

        enfermo = cabeza;
        enfermo.add(cabeza);
        enfermo.add(cuerpo);

        return enfermo;
    }

    @Override
    public boolean colision() {
        Area areaA = new Area(partida.getPersonaje().getBounds());
        areaA.intersect(getBounds());

        return !areaA.isEmpty();
    }

}

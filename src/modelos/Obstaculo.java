/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Graphics2D;
import java.awt.geom.Area;

/**
 *
 * @author aries
 */
public abstract class Obstaculo {

    private int ancho;
    private int alto;
    private int xInicial;
    private int xAuxiliar;
    private int yInicial;
    private int yAuxiliar;
    private Partida partida;
    private IObstaculoEstado estado;

    public Obstaculo(Partida partida) {
        this.partida = partida;
        this.estado = new ObstaculoNegativoEstado();
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getxInicial() {
        return xInicial;
    }

    public void setxInicial(int xInicial) {
        this.xInicial = xInicial;
    }

    public int getxAuxiliar() {
        return xAuxiliar;
    }

    public void setxAuxiliar(int xAuxiliar) {
        this.xAuxiliar = xAuxiliar;
    }

    public int getyInicial() {
        return yInicial;
    }

    public void setyInicial(int yInicial) {
        this.yInicial = yInicial;
    }

    public int getyAuxiliar() {
        return yAuxiliar;
    }

    public void setyAuxiliar(int yAuxiliar) {
        this.yAuxiliar = yAuxiliar;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public abstract void mover();

    public abstract void dibujar(Graphics2D g);

    public abstract Area getBounds();

    public boolean colision() {
        Area areaA = new Area(partida.getPersonaje().getBounds());
        areaA.intersect(getBounds());

        return !areaA.isEmpty();
    }

    public void colisionar() {
        estado.colisionar(partida);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author aries
 */
public abstract class  Obstaculo {
    private Partida partida;
    private int ancho;
    private int alto;
    private int inicialX;
    private int inicialY;
    
    public Obstaculo(Partida partida) {
        this.partida = partida;
    }
    
    public abstract void clonar() ;

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

    public int getInicialX() {
        return inicialX;
    }

    public void setInicialX(int inicialX) {
        this.inicialX = inicialX;
    }

    public int getInicialY() {
        return inicialY;
    }

    public void setInicialY(int inicialY) {
        this.inicialY = inicialY;
    }
}

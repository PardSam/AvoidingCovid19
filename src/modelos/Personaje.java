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
public abstract class Personaje {

    private boolean sube;
    private boolean baja;
    private boolean salta;
    private int tipo;
    private String rutaImagen;

    public abstract void dibujar();

    public boolean isSube() {
        return sube;
    }

    public void setSube(boolean sube) {
        this.sube = sube;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    public boolean isSalta() {
        return salta;
    }

    public void setSalta(boolean salta) {
        this.salta = salta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

}

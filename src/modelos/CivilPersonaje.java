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
public class CivilPersonaje extends Personaje {

    private boolean sube;
    private boolean baja;
    private boolean salta;
    private int tipo;
    private String rutaImagen;

    public CivilPersonaje() {
        this.baja = false;
        this.sube = false;
        this.salta = false;
        this.tipo = 1;
        this.rutaImagen = "Personaje civil";
    }

    @Override
    public void dibujar() {
        System.out.println("Ruta imagen: "+this.rutaImagen);
        System.out.println("Tipo "+this.tipo);
        System.out.println("Sube : "+this.sube);
        System.out.println("Baja : "+this.baja);
        System.out.println("Salta : "+this.salta);
    }

}

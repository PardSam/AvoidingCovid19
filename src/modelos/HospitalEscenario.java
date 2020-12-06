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
public class HospitalEscenario extends Escenario {

    private String titulo;
    private String rutaImagen;
    private int ancho, alto, nivel;

    public HospitalEscenario() {
        this.titulo = "Hospital";
        this.ancho = 8;
        this.alto = 3;
        this.nivel = 2;
        this.rutaImagen = "Hospital ruta";
    }

    @Override
    public void diseñar() {
        System.out.println("Ruta imagen: " + this.rutaImagen);
        System.out.println("Titulo " + this.titulo);
        System.out.println("Ancho : " + this.ancho);
        System.out.println("Alto : " + this.alto);
        System.out.println("Nivel : " + this.nivel);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 * Implementacion del jugador
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public class Jugador {

    private static Jugador jugador = null;
    private String nombre;
    private String genero;
    /**
     * Obtiene a un Jugador 
     * @return Nuevo o un jugador
     */
    public static Jugador getJugador() {
        if (jugador == null) {
            jugador = new Jugador();
        }
        return jugador;
    }
    /**
     * Obtiene el nombre del jugador 
     * @return Nombre del Jugador
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre al jugador
     * @param nombre Nombre del jugador
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene el genero del jugador
     * @return Genero del Jugador
     */
    public String getGenero() {
        return genero;
    }
    /**
     * Establecer el genero del jugador
     * @param genero Genero del Jugador
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
}

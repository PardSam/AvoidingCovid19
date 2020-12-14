/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 * Ejecutar el juego con todos sus componentes
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public interface  IJuego {
    public abstract void ejecutarJuego() ;
    public abstract void elegirPersonaje(int pj) ;
    public abstract void elegirEscenario(int esc) ;
    public abstract void mostrarPersonaje() ;
    public abstract void mostrarEscenario() ;
}

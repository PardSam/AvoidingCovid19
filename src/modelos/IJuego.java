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
public interface  IJuego {
    public abstract void ejecutarJuego() ;
    public abstract void elegirPersonaje() ;
    public abstract void elegirEscenario() ;
    public abstract void mostrarPersonaje() ;
    public abstract void mostrarEscenario() ;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 * AmbientePartidaDecorador
 *Es una clase abstracta que define la estructura mínima de
 *un Decorador.
 *@version 13/12/2020/A
 * @author Sanchez Pardo, Monja Vasquez, More Villegas, Diaz Coronado, Gonzales Cubas, Ugaz Arenas.
 */
public abstract class AmbientePartidaDecorador extends Escenario{
    private Escenario decorado;

    public AmbientePartidaDecorador(Escenario decorado) {
        this.decorado = decorado;
    }

    public Escenario getDecorado() {
        return decorado;
    }

    public void setDecorado(Escenario decorado) {
        this.decorado = decorado;
    }
    
}

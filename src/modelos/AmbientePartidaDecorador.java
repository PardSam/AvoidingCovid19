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

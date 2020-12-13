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
public class SaltarComando implements IComando {

    private Partida partida;

    public SaltarComando(Partida partida) {
        this.partida = partida;
    }

    @Override
    public void ejecutar() {
        partida.getPersonaje().saltar();
    }

}

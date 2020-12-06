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
public class DiaPartida extends AmbientePartidaDecorador {

    Escenario ambiente;

    public DiaPartida(Escenario ambiente) {
        this.ambiente = ambiente;
    }

    @Override
    public void getEscenario() {

    }

}

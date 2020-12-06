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
public class NochePartida extends AmbientePartidaDecorador {

    Escenario ambiente;

    public NochePartida(Escenario ambiente) {
        this.ambiente = ambiente;
    }

    @Override
    public void getEscenario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

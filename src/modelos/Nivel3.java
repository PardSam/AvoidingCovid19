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
public class Nivel3 extends Partida {

    @Override
    public void inicializar() {
        Perfil perfil = Perfil.gePerfil();
        setEscenario(new EscenarioCreador().crearTipo(perfil.getEscenarioId()));
        System.out.println("Inicializando partida: " + getEscenario().getRutaImagen());
    }

    @Override
    public void jugar() {
    }

    @Override
    public boolean juegoFinalizado() {
        return true;
    }

    @Override
    public void resultado() {
    }

}

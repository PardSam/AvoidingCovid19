/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 * descripcion
 * @version 13/12/2020/A*@version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public class TrabajoPartida extends Partida {
/**
 * inicializar el trabajoPartida
 */
    @Override
    public void inicializar() {
        setPuntajePartida(10);
        Perfil perfil = Perfil.gePerfil();

        if (isHorario()) {
            setEscenario(new EscenarioCreador().crearTipo(perfil.getEscenarioId()));
            setEscenario(new DiaPartida(getEscenario()));
        }
        if (!isHorario()) {
            setEscenario(new EscenarioCreador().crearTipo(perfil.getEscenarioId()));
            setEscenario(new NochePartida(getEscenario()));
        }
        setPersonaje(new PersonajeCreador().crear(perfil.getPersonajeId()));
        setObstaculo(new EnfermoObstaculo(this));
    }
/**
 * methodo jugar
 */
    @Override
    public void jugar() {
    }
/**
 * resultado
 */
    @Override
    public void resultado() {
    }

}

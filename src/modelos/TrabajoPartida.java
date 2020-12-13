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
public class TrabajoPartida extends Partida {

    @Override
    public void inicializar() {
        setPuntajePartida(10);
        Perfil perfil = Perfil.gePerfil();

        if (isHorario()) {
            System.out.println("horario dia");
            setEscenario(new EscenarioCreador().crearTipo(perfil.getEscenarioId()));
            setEscenario(new DiaPartida(getEscenario()));
        }
        if (!isHorario()) {
            System.out.println("horario noche");
            setEscenario(new EscenarioCreador().crearTipo(perfil.getEscenarioId()));
            setEscenario(new NochePartida(getEscenario()));
        }
        setPersonaje(new PersonajeCreador().crear(perfil.getPersonajeId()));
        setObstaculo(new EnfermoObstaculo(this));
    }

    @Override
    public void jugar() {
    }

    @Override
    public void resultado() {
    }

}

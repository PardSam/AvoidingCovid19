/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 * Implementa el pirmer nivel de la partida
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public class Nivel1 extends Partida {
    /**
     * Inicializa la partida con el primer nivel
     */
    @Override
    public void inicializar() {
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
    /**
     * Se ejecuta la partida
     */
    @Override
    public void jugar() {
    }
    /**
     * Se muestran los resultados
     */
    @Override
    public void resultado() {
    }

}

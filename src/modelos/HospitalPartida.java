package modelos;

/**
 * Se encarga de crear un escenario.
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public class HospitalPartida extends Partida {
    /**
     * Inicialización del Nivel 2
     */
    @Override
    public void inicializar() {
        setPuntajePartida(20);
        Perfil perfil = Perfil.gePerfil();
        setEscenario(new EscenarioCreador().crearTipo(perfil.getEscenarioId()));
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
     * Jugar el Nivel 2
     */
    @Override
    public void jugar() {
    }
    /**
     * Resultados del Nivel 2
     */
    @Override
    public void resultado() {
    }

}

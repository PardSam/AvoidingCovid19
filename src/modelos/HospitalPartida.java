package modelos;

/**
 * Se encarga de crear la partida hospital
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
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
            setEscenario(new DiaPartida(getEscenario()));
        } else {
            setEscenario(new NochePartida(getEscenario()));
        }

        setPersonaje(new PersonajeCreador().crear(perfil.getPersonajeId()));
        getPersonaje().setPartida(this);

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

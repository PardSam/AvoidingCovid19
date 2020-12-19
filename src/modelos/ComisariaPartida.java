package modelos;

/**
 * Se encarga de crear la partida comisaría
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
 */
public class ComisariaPartida extends Partida {

    /**
     * Inicialización del Nivel 3
     */
    @Override
    public void inicializar() {
        setPuntajePartida(30);
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
     * Jugar el Nivel 3
     */
    @Override
    public void jugar() {
    }

    /**
     * Resultados del Nivel 3
     */
    @Override
    public void resultado() {
    }

}

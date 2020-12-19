package modelos;

/**
 * Se encarga de crear la partida trabajo
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
 */
public class TrabajoPartida extends Partida {

    /**
     * inicializar el trabajoPartida
     */
    @Override
    public void inicializar() {
        setPuntajePartida(10);
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

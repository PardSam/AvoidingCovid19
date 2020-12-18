package modelos;

/**
 * descripcion
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
 */
public class Perfil {

    private static Perfil perfil = null;
    private int nivel = 1;
    private int score = 0;
    private int personajeId = 1;
    private int escenarioId = 1;
    private Jugador jugador;
    private boolean continuarPartida = false;

    /**
     * Obtiene el perfil de la partida
     *
     * @return retorna el perfil
     */
    public static Perfil gePerfil() {
        if (perfil == null) {
            perfil = new Perfil();
            perfil.setJugador(new Jugador());
        }
        return perfil;
    }

    /**
     * retorna el perfil
     *
     * @return
     */
    public static Perfil getPerfil() {
        return perfil;
    }

    /**
     * Establece el perfil de la partida
     *
     * @param perfil es el parametro para establecer el Perfil
     */
    public static void setPerfil(Perfil perfil) {
        Perfil.perfil = perfil;
    }

    /**
     * retorna el valor de jugador
     *
     * @return
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * asigna a jugador el valor de parametro jugador
     *
     * @param jugador
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * retorna el personajeId
     *
     * @return
     */
    public int getPersonajeId() {
        return personajeId;
    }

    /**
     * asigna a personajeId el valor del parametro personajeId
     *
     * @param personajeId
     */
    public void setPersonajeId(int personajeId) {
        this.personajeId = personajeId;
    }

    /**
     * retorna el valor de escenarioId
     *
     * @return
     */
    public int getEscenarioId() {
        return escenarioId;
    }

    /**
     * Asigna a escenarioId el valor del parametro pasado
     *
     * @param escenarioId
     */
    public void setEscenarioId(int escenarioId) {
        this.escenarioId = escenarioId;
    }

    /**
     * retorna el nivel
     *
     * @return
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * asigna el nivel
     *
     * @param nivel
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;

    }

    /**
     * retorna el score
     *
     * @return
     */
    public int getScore() {
        return score;
    }

    /**
     * retorna el score
     *
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * retorna continuarPartida
     *
     * @return
     */
    public boolean isContinuarPartida() {
        return continuarPartida;
    }

    /**
     * asigna un valor a continuarPartida
     *
     * @param continuarPartida
     */
    public void setContinuarPartida(boolean continuarPartida) {
        this.continuarPartida = continuarPartida;
    }

}

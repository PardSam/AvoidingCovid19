package modelos;
/**
 * Implementacion del jugador
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public class Jugador {

    public String nombres;
    public String genero;
    public int score;

    public Jugador() {
        nombres = ""; 
        genero = "";
        score = 0;
    }
    /**
     * Obtiene a un Jugador 
     * @return Nuevo o un jugador
     */
    public Jugador(String nombres, String genero, int score) {
        this.nombres = nombres;
        this.genero = genero;
        this.score = score;
    }
    /**
     * Obtiene el nombre del jugador 
     * @return Nombre del Jugador
     */
    public String getNombres() {
        return nombres;
    }
    /**
     * Establece el nombre al jugador
     * @param nombre Nombre del jugador
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    /**
     * Obtiene el genero del jugador
     * @return Genero del Jugador
     */
    public String getGenero() {
        return genero;
    }
    /**
     * Establecer el genero del jugador
     * @param genero Genero del Jugador
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * Obtiene el score del jugador
     * @return Score del Jugador
     */
    public int getScore() {
        return score;
    }
    /**
     * Establecer el score del jugador
     * @param score Score del Jugador
     */
    public void setScore(int score) {
        this.score = score;
    }
    
}

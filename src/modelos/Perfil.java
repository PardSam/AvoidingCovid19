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
public class Perfil {

    private static Perfil perfil = null;
    private Personaje personaje = new PersonajeCreador().crear(1);
    private int nivel = 1;
    private int score = 0;
    private Escenario escenario = new EscenarioCreador().crearTipo(nivel);

    public static Perfil gePerfil() {
        if (perfil == null) {
            perfil = new Perfil();
        }
        return perfil;
    }

    public Escenario getEscenario() {

        return escenario;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}

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
    private int nivel = 1;
    private int score = 0;
    private int personajeId = 1;
    private int escenarioId = 1;

    public static Perfil gePerfil() {
        if (perfil == null) {
            perfil = new Perfil();
        }
        return perfil;
    }

    public static Perfil getPerfil() {
        return perfil;
    }

    public static void setPerfil(Perfil perfil) {
        Perfil.perfil = perfil;
    }

    public int getPersonajeId() {
        return personajeId;
    }

    public void setPersonajeId(int personajeId) {
        this.personajeId = personajeId;
    }

    public int getEscenarioId() {
        return escenarioId;
    }

    public void setEscenarioId(int escenarioId) {
        this.escenarioId = escenarioId;
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

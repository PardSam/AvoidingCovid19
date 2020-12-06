/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author fernandomonjav
 */
public class Juego implements IJuego {

    private Personaje personaje;
    private int puntaje;
    private int vidas;
    private int nivel;

    public Juego(Personaje personaje, int puntaje, int vidas, int nivel) {
        this.personaje = personaje;
        this.puntaje = puntaje;
        this.vidas = vidas;
        this.nivel = nivel;
    }

    @Override
    public void ejecutarJuego() {

    }

    @Override
    public void elegirPersonaje() {

    }

    @Override
    public void elegirEscenario() {

    }

    @Override
    public void mostrarPersonaje() {

    }

    @Override
    public void mostrarEscenario() {

    }

}

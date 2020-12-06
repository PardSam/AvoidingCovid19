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
    private PersonajeCreadorAbstracto creador;
    private int puntaje;
    private int vidas;
    private int nivel;

    public Juego(int puntaje, int vidas, int nivel) {
        creador = new PersonajeCreador();
        this.puntaje = puntaje;
        this.vidas = vidas;
        this.nivel = nivel;
    }

    @Override
    public void ejecutarJuego() {

    }

    @Override
    public void elegirPersonaje(int pj) {
         personaje = creador.crear(pj);
    }

    @Override
    public void elegirEscenario(int esc) {

    }

    @Override
    public void mostrarPersonaje() {

    }

    @Override
    public void mostrarEscenario() {

    }
    
    public static void main(String[] args) {
        System.out.println("Juego");
        Juego play = new Juego(0,3,1);
        play.elegirPersonaje(3);
        play.personaje.dibujar();
    }

}

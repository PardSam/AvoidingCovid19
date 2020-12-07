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
    private Escenario escenario;
    private PersonajeCreadorAbstracto creadorPersonaje;
    private EscenarioCreadorAbstracto creadorEscenario;
    private int puntaje;
    private int vidas;
    private int nivel;

    public Juego(int puntaje, int vidas, int nivel) {
        creadorPersonaje = new PersonajeCreador();
        creadorEscenario = new EscenarioCreador();
        this.puntaje = puntaje;
        this.vidas = vidas;
        this.nivel = nivel;
    }

    @Override
    public void ejecutarJuego() {

    }

    @Override
    public void elegirPersonaje(int pj) {
         personaje = creadorPersonaje.crear(pj);
    }

    @Override
    public void elegirEscenario(int esc) {
        escenario = creadorEscenario.crearTipo(esc);
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
        
        play.elegirPersonaje(1);
        play.personaje.dibujar();
        
        System.out.println("____________________________________");
        
        play.elegirEscenario(2);
        play.escenario.diseñar();
    }

}

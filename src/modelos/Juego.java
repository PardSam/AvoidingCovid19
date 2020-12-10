/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import controladores.PrincipalControlador;
import java.applet.AudioClip;
import java.net.URL;
import vistas.PrincipalVista;

/**
 *
 * @author fernandomonjav
 */
public class Juego implements IJuego {

    private Personaje personaje;
    private Escenario escenario;
    private PersonajeCreadorAbstracto creadorPersonaje;
    private EscenarioCreadorAbstracto creadorEscenario;
    private PrincipalVista vista;
    private PrincipalControlador controlador;
    private int puntaje;
    private int vidas;
    private int nivel;
    public boolean juegoFinalizado = false;
    public boolean pierdeVida = false;
    URL urlSonidoSalto, urlSonidoChoque;
    AudioClip sonidoSalto, sonidoChoque;

    public Juego() {
        creadorPersonaje = new PersonajeCreador();
        creadorEscenario = new EscenarioCreador();

        this.puntaje = 0;
        this.vidas = 0;
        this.nivel = 0;
    }

    @Override
    public void ejecutarJuego() {        
        vista = new PrincipalVista();
        controlador = new PrincipalControlador(vista);
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
       Juego play = new Juego();               
    }

}

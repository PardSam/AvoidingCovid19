/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

/**
 *
 * @author aries
 */
public abstract class Partida {

    private Personaje personaje;
    private int puntaje;
    private int proteccion;
    private int defensa;
    private int vidas;
    private Escenario escenario;
    private int ancho;
    private int alto;

    public abstract void inicializar();

    public abstract void jugar();

    public abstract boolean juegoFinalizado();

    public abstract void resultado();

    public final void generar() {
        inicializar();
        while (!juegoFinalizado()) {
            jugar();
        }
        resultado();
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getProteccion() {
        return proteccion;
    }

    public void setProteccion(int proteccion) {
        this.proteccion = proteccion;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public Escenario getEscenario() {
        return escenario;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void getComando(IComando comando) {

    }

    public IComando setComando() {
        return null;
    }

    public ScoreMemento crearScoreMemento() {
        return null;
    }

    public ScoreMemento setScoreMemento() {
        return null;
    }

    public void notificar() {

    }

    public void agregarObservador(IPartidaObservador observador) {

    }

    public void observador(IPartidaObservador observador) {

    }

    public void dibujar(Graphics2D g) {
        escenario.dibujar(g);
        personaje.dibujar(g);

        mover();
    }

    public void mover() {
        escenario.mover();
        personaje.mover();
    }

    public void dibujarPuntaje(Graphics2D g) {

        Graphics2D g1 = g, g2 = g;

        Font score = new Font("Arial", Font.BOLD, 30);
        g.setFont(score);
        g.setColor(Color.white);
        //g1.drawString("Vidas: " + vidas, 20, 45);
        g1.drawString("Nivel: " + Perfil.gePerfil().getNivel(), 450, 45);
        g1.drawString("Score: " + puntaje, 600, 45);
        //g1.drawString("Pause ", 890, 45);

        /*if (juegoFinalizado) {
            g2.setColor(Color.yellow);
            g2.drawString("Perdiste", ((float)getBounds().getCenterX() / 2) + 170, 70);
        }*/
    }
}

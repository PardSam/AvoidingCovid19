/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;

/**
 *
 * @author aries
 */
public abstract class Partida {

    private int puntaje;
    private int puntajePartida;
    private int proteccion;
    private int defensa;

    private int ancho;
    private int alto;

    private boolean pierdeDefensa = false;
    private boolean pierdeProteccion = false;
    private boolean pausaPartida = false;
    private boolean finPartida = false;
    private boolean ganarPartida = false;
    private boolean horario = true;

    private Escenario escenario;
    private Personaje personaje;
    private Obstaculo obstaculo;

    public Partida() {
        this.puntaje = 0;
        this.proteccion = 3;
        this.defensa = 3;
        this.pierdeDefensa = false;
        this.pierdeProteccion = false;
        this.pausaPartida = false;
        this.finPartida = false;
    }

    public boolean isHorario() {
        return horario;
    }

    public int getPuntajePartida() {
        return puntajePartida;
    }

    public void setPuntajePartida(int puntajePartida) {
        this.puntajePartida = puntajePartida;
    }

    public void setHorario(boolean horario) {
        this.horario = horario;
    }

    public boolean isGanarPartida() {
        return ganarPartida;
    }

    public void setGanarPartida(boolean ganarPartida) {
        this.ganarPartida = ganarPartida;
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

    public boolean isPierdeProteccion() {
        return pierdeProteccion;
    }

    public void setPierdeProteccion(boolean pierdeProteccion) {
        this.pierdeProteccion = pierdeProteccion;
    }

    public boolean isPierdeDefensa() {
        return pierdeDefensa;
    }

    public void setPierdeDefensa(boolean pierdeDefensa) {
        this.pierdeDefensa = pierdeDefensa;
    }

    public boolean isPausaPartida() {
        return pausaPartida;
    }

    public void setPausaPartida(boolean pausaPartida) {
        this.pausaPartida = pausaPartida;
    }

    public boolean isFinPartida() {
        return finPartida;
    }

    public void setFinPartida(boolean finPartida) {
        this.finPartida = finPartida;
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

    public Obstaculo getObstaculo() {
        return obstaculo;
    }

    public void setObstaculo(Obstaculo obstaculo) {
        this.obstaculo = obstaculo;
    }

    public void finalizarPartida() {
        finPartida = true;
        //pausaPartida = true;
    }

    public void bajarProteccion() {
        pierdeProteccion = true;
        //proteccion--;
    }

    public void bajarDefensa() {
        pierdeDefensa = true;

    }

    public abstract void inicializar();

    public abstract void jugar();

    public abstract void resultado();

    public final void generar() {
        inicializar();
        /*
        while (true) {

            if (partidaFinalizado) {
                break;
            }

            panel.repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException err) {
            }
        }
         */
        resultado();
    }

    public PartidaMemento guardarEstado() {
        return new PartidaMemento(this);
    }

    public void recuperarEstado(PartidaMemento estado) {
        this.proteccion = estado.getEstadoGuardado().getProteccion();
        this.defensa = estado.getEstadoGuardado().getDefensa();
        this.puntaje = estado.getEstadoGuardado().getPuntaje();
        this.escenario = estado.getEstadoGuardado().getEscenario();
        this.personaje = estado.getEstadoGuardado().getPersonaje();
        this.obstaculo = estado.getEstadoGuardado().getObstaculo();
    }

    public PartidaMemento crearScoreMemento() {
        return null;
    }

    public PartidaMemento setScoreMemento() {
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
        obstaculo.dibujar(g);
    }

    public void mover() {
        escenario.mover();
        personaje.mover();
        obstaculo.mover();
    }

    public void dibujarPuntaje(Graphics2D g) {

        Graphics2D g1 = g;

        Font score = new Font("Arial", Font.BOLD, 30);
        g.setFont(score);
        g.setColor(Color.white);
        g1.drawString("Nivel: " + Perfil.gePerfil().getNivel(), 450, 45);
        g1.drawString("Score: " + puntaje, 600, 45);
        g1.drawString("" + proteccion, 100, 55);
        g1.drawString("" + defensa, 100, 120);
    }

    public void reiniciar() {
        this.personaje.setyInicial(370);
        this.personaje.setSalta(false);
        this.obstaculo.setxInicial(1400);
    }
}

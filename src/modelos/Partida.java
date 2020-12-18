package modelos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;

/**
 * descripcion
 *
 * @version 13/12/2020/A*@version 09/12/2020/A
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado,
 * @author Gonzales Cubas,
 * @author Ugaz Arenas.
 */
public abstract class Partida extends PartidaSujeto {

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

    /**
     * Evalua el horario dentro de la partida
     *
     * @return retorna el horario
     */
    public boolean isHorario() {
        return horario;
    }

    public int getPuntajePartida() {
        return puntajePartida;
    }

    public void setPuntajePartida(int puntajePartida) {
        this.puntajePartida = puntajePartida;
    }

    /**
     * Establece el horario en el que se encuentra la partida
     *
     * @param horario parametro para determinar el horario
     */
    public void setHorario(boolean horario) {
        this.horario = horario;
    }

    /**
     * evalua si se gana la partida
     *
     * @return retorna ganar partida
     */
    public boolean isGanarPartida() {
        return ganarPartida;
    }

    /**
     * Establece Si se a ganado perdido en el juego
     *
     * @param ganarPartida parametro para establecer si se gana
     */
    public void setGanarPartida(boolean ganarPartida) {
        this.ganarPartida = ganarPartida;
    }

    /**
     * obtiene el puntaje de la partida
     *
     * @return retorna el puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * Establece el puntaje de la partida
     *
     * @param puntaje Es el parametro numerico para establecer el puntaje
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    /**
     * obtiene la proteccion del personaje en la partida
     *
     * @return retorna cuanta proteccion tiene
     */
    public int getProteccion() {
        return proteccion;
    }

    /**
     * Establece la proteccion del personaje
     *
     * @param proteccion parametro que inica cuanta proteccion tiene el
     * personaje
     */
    public void setProteccion(int proteccion) {
        this.proteccion = proteccion;
    }

    /**
     * obtiene la defensa del personaje en la partida
     *
     * @return retorna cuanta proteccion tiene
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * Establece la defensa del personaje
     *
     * @param defensa parametro que inica cuanta defensa tiene el personaje
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /**
     * obtine el ancho de la partida
     *
     * @return retorna el ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * Establece el ancho de la partida
     *
     * @param ancho parametro que indica el hancho de la partida
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * obtine el alto de la partida
     *
     * @return retorna el alto
     */
    public int getAlto() {
        return alto;
    }

    /**
     * Establece la altura de la partida
     *
     * @param alto parametro que indica la altura de la partida
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }

    /**
     * evalua si se pierda proteccion el personaje
     *
     * @return retorna si se pierde la proteccion
     */
    public boolean isPierdeProteccion() {
        return pierdeProteccion;
    }

    /**
     * Establece si se piere la proteccion
     *
     * @param pierdeProteccion establece el nuevo estado si se ha perdido
     * proteccion
     */
    public void setPierdeProteccion(boolean pierdeProteccion) {
        this.pierdeProteccion = pierdeProteccion;
    }

    /**
     * Evalua si se piere defensa
     *
     * @return Retorna si se ha perdido defensa
     */
    public boolean isPierdeDefensa() {
        return pierdeDefensa;
    }

    /**
     * Establece si se ah perdido defensa
     *
     * @param pierdeDefensa establece el nuevo estado si se ha perdido defensa
     */
    public void setPierdeDefensa(boolean pierdeDefensa) {
        this.pierdeDefensa = pierdeDefensa;
    }

    /**
     * Evalua si se pone en pausa la partida
     *
     * @return retorna la pausa
     */
    public boolean isPausaPartida() {
        return pausaPartida;
    }

    /**
     * Establece pausa en la partida
     *
     * @param pausaPartida es el parametro para determinar si se ha de pausar
     */
    public void setPausaPartida(boolean pausaPartida) {
        this.pausaPartida = pausaPartida;
    }

    /**
     * Evalua si la partida ah llegado a su fin
     *
     * @return retorna es estado e fin de la partida
     */
    public boolean isFinPartida() {
        return finPartida;
    }

    /**
     * Establece el fin de la partida
     *
     * @param finPartida es el parametro para determinar si termina la partida
     */
    public void setFinPartida(boolean finPartida) {
        this.finPartida = finPartida;
    }

    /**
     * obtiene el escenario en el que se encuentra
     *
     * @return retorna el escenario
     */
    public Escenario getEscenario() {
        return escenario;
    }

    /**
     * Establece el escenario de la partiad
     *
     * @param escenario parametro que nos da el escenario
     */
    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }

    /**
     * obtine el persoanje que se encuentra en la partiad
     *
     * @return retorna el personaje
     */
    public Personaje getPersonaje() {
        return personaje;
    }

    /**
     * Establece el personaje que estara en partida
     *
     * @param personaje es parametro del personaje a introducir
     */
    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    /**
     * obtiene el obstaculo que se genera
     *
     * @return retorna el obstaculo
     */
    public Obstaculo getObstaculo() {
        return obstaculo;
    }

    /**
     * Establece el obstaculo a generarce
     *
     * @param obstaculo es el parametro que determina el obstaculo
     */
    public void setObstaculo(Obstaculo obstaculo) {
        this.obstaculo = obstaculo;
    }

    /**
     * Funcion para finalizar la partida y notificar a los observadores
     */
    public void finalizarPartida() {
        finPartida = true;
        this.notificar();
    }

    /**
     * Funcion para bajar la proteccion el persnaje
     */
    public void bajarProteccion() {
        pierdeProteccion = true;
    }

    /**
     * Bajar la defensa defensa del personaje
     */
    public void bajarDefensa() {
        pierdeDefensa = true;

    }

    /**
     * inicializa
     */
    public abstract void inicializar();

    /**
     * funcion para empezar a jugar
     */
    public abstract void jugar();

    /**
     * funcion del resultado de la partida
     */
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

    /**
     * devuelve un punto de guardado
     *
     * @return new PartidaMemento(this);
     */
    public PartidaMemento guardarEstado() {
        return new PartidaMemento(this);
    }

    /**
     * metodo del memento para guardar los datos al cerrar la ventana del juego
     * recibe como parametro un PartidaMemento
     *
     * @param estado
     */
    public void recuperarEstado(PartidaMemento estado) {
        this.proteccion = estado.getEstadoGuardado().getProteccion();
        this.defensa = estado.getEstadoGuardado().getDefensa();
        this.puntaje = estado.getEstadoGuardado().getPuntaje();
        this.escenario = estado.getEstadoGuardado().getEscenario();
        this.personaje = estado.getEstadoGuardado().getPersonaje();
        this.obstaculo = estado.getEstadoGuardado().getObstaculo();
        this.horario = estado.getEstadoGuardado().isHorario();
    }

    /**
     * funcion para graficar latos de la partida
     *
     * @param g parametro que sirve para graficar las imagenes de la partida
     */
    public void dibujar(Graphics2D g) {
        escenario.dibujar(g);
        personaje.dibujar(g);
        obstaculo.dibujar(g);
    }

    /**
     * Funcion para dar movimiento a los objetos de la partida
     */
    public void mover() {
        escenario.mover();
        personaje.mover();
        obstaculo.mover();
    }

    /**
     * Funcion para mostrar el puntaje de la partida
     *
     * @param g parametro que dibujar el puntaje
     */
    public void dibujarPuntaje(Graphics2D g) {

        Graphics2D g1 = g;

        Font score = new Font("Arial", Font.BOLD, 30);
        g.setFont(score);
        g.setColor(Color.white);
        g1.drawString("Nivel: " + Perfil.gePerfil().getNivel(), 300, 55);
        g1.drawString("Score: " + puntaje, 600, 55);
        g1.drawString("" + proteccion, 100, 55);
        g1.drawString("" + defensa, 100, 120);
    }

    /**
     * Funcion para reiniciar la partida
     */
    public void reiniciar() {
        this.personaje.setyInicial(370);
        this.personaje.setSalta(false);
        this.obstaculo.setxInicial(1400);
    }
}

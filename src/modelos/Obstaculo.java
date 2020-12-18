package modelos;

import java.awt.Graphics2D;
import java.awt.geom.Area;

/**
 * Clase que se extiendo de la clase AmbientePartidaDecorador para un escenario
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
 */
public abstract class Obstaculo {

    private int ancho;
    private int alto;
    private int xInicial;
    private int xAuxiliar;
    private int yInicial;
    private int yAuxiliar;
    private Partida partida;
    private IObstaculoEstado estado;

    /**
     * constructor de Obstaculo que recibe como parametro partida
     *
     * @param partida
     */
    public Obstaculo(Partida partida) {
        this.partida = partida;
        this.estado = new ObstaculoNegativoEstado();
    }

    /**
     * obtiene el ancho del obstaculo
     *
     * @return retorna el ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * Estabnlece el ancho del obstaculo
     *
     * @param ancho parametro numerico del ancho
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * obtiene el alto del obstaculo
     *
     * @return retorna el alto
     */
    public int getAlto() {
        return alto;
    }

    /**
     * Establece el alto del obstaculo
     *
     * @param alto Parametro numerico de la altura
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }

    /**
     * obtine el eje X inicial
     *
     * @return retorna el dato del eje X
     */
    public int getxInicial() {
        return xInicial;
    }

    /**
     * establece el valor inicial del obstaculo en el eje X
     *
     * @param xInicial es el parametro numerico
     */
    public void setxInicial(int xInicial) {
        this.xInicial = xInicial;
    }

    /**
     * obtine el eje auxiliar X
     *
     * @return retorna el eje auxiliar X
     */
    public int getxAuxiliar() {
        return xAuxiliar;
    }

    /**
     * Establece el eje auxiliar X
     *
     * @param xAuxiliar parametro numero x
     */
    public void setxAuxiliar(int xAuxiliar) {
        this.xAuxiliar = xAuxiliar;
    }

    /**
     * obtine el eje inicial y
     *
     * @return
     */
    public int getyInicial() {
        return yInicial;
    }

    /**
     *
     * @param yInicial
     */
    public void setyInicial(int yInicial) {
        this.yInicial = yInicial;
    }

    /**
     * obtiene el eje auxiliar Y
     *
     * @return retorna el Eje auxiliar Y
     */
    public int getyAuxiliar() {
        return yAuxiliar;
    }

    /**
     * Establece el Eje auxiliar Y
     *
     * @param yAuxiliar parametro numerico para establecer el eje auxiliar Y
     */
    public void setyAuxiliar(int yAuxiliar) {
        this.yAuxiliar = yAuxiliar;
    }

    /**
     * obtiene la partida en la que se juega
     *
     * @return retorna la partida
     */
    public Partida getPartida() {
        return partida;
    }

    /**
     * Establece la partida
     *
     * @param partida
     */
    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    /**
     * funcion que sirve para mover el obstaculo
     */
    public abstract void mover();

    /**
     * Funcion que sirve para dibujar el obstaculo
     *
     * @param g parametro que dibuja el obstaculo
     */
    public abstract void dibujar(Graphics2D g);

    /**
     * funcion para eterminar el Area del obstaculo
     *
     * @return retorna el area del obstaculo
     */
    public abstract Area getBounds();

    public boolean colision() {
        Area areaA = new Area(partida.getPersonaje().getBounds());
        areaA.intersect(getBounds());

        return !areaA.isEmpty();
    }

    /**
     * Funcion para saber si ah sucedido una colicion con el obstaculo
     */
    public void colisionar() {
        estado.colisionar(partida);
    }
}

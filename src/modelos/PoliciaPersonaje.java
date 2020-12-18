package modelos;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Area;
import javax.swing.ImageIcon;

/**
 * descripcion
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
 */
public class PoliciaPersonaje extends Personaje {

    private boolean sube = false;
    private boolean baja = false;
    private boolean salta = false;
    private int tipo;
    private String rutaImagen;
    private int ancho = 70;
    private int alto = 145;

    private int xInicial = 50;
    private int yInicial = 370;
    private int xAuxiliar = 0;
    private int yAuxiliar = 0;

    private Area cuerpo, personajeArea;

    /**
     * Establece el punto inicial en la coordenada Y
     */
    @Override
    public void setyInicial(int yInicial) {
        this.yInicial = yInicial;
    }

    /**
     * evalua si sucede un salto
     *
     * @return salta
     */
    public boolean isSalta() {
        return salta;
    }

    /**
     * Establece el salto
     *
     * @param salta parametro que indica si se esta efectuano o no, un salto
     */
    @Override
    public void setSalta(boolean salta) {
        this.salta = salta;
    }

    /**
     * construnctor de la clase PoliciaPersonaje
     */
    public PoliciaPersonaje() {
        this.baja = false;
        this.sube = false;
        this.salta = false;
        this.tipo = 1;
        this.rutaImagen = "/assets/personajes/juan/normal.png";
    }

    /**
     * Agrega el personaje civil en la partida
     *
     * @param partida Establece la ruta del personaje
     */
    public PoliciaPersonaje(Partida partida) {
        super(partida);
        this.tipo = 1;
        this.rutaImagen = "/assets/personajes/david/normal.png";
    }

    /**
     * dibuja un personaje atravez el parametro establecido
     *
     * @param g
     */
    @Override
    public void dibujar(Graphics2D g) {
        ImageIcon personaje = new ImageIcon(getClass().getResource(this.rutaImagen));
        g.drawImage(personaje.getImage(), xInicial, yInicial, ancho, alto, null);
    }

    /**
     * Funcion para mover al personaje
     */
    @Override
    public void mover() {
        if (xInicial + xAuxiliar > 0 && xInicial + xAuxiliar < 1000 - ancho) {
            xInicial = xInicial + xAuxiliar;
        }

        if (salta) {
            if (yInicial == 370) {
                sube = true;
                yAuxiliar = -2;
                baja = false;
            }

            if (yInicial == 150) {
                baja = true;
                yAuxiliar = 2;
                sube = false;
            }

            if (sube) {
                yInicial = yInicial + yAuxiliar;
            }

            if (baja) {
                yInicial = yInicial + yAuxiliar;

                if (yInicial == 370) {
                    salta = false;
                }
            }
        }
    }

    /**
     * Funcion para determinar el salto
     */
    @Override
    public void saltar() {
        salta = true;
    }

    /**
     * obtiene las coordenadas que ocupa el personaje
     *
     * @return el aria del personaje
     */
    @Override
    public Area getBounds() {
        Rectangle forma1 = new Rectangle(xInicial, yInicial, 70, 145);
        cuerpo = new Area(forma1);

        personajeArea = cuerpo;
        personajeArea.add(cuerpo);

        return personajeArea;
    }

    /**
     * obtiene la ruta de la imagen
     *
     * @return la ruta de la imagen del personaje
     */
    @Override
    public String getRutaImagen() {
        return rutaImagen;
    }

}

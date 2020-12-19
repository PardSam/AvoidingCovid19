package modelos;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Area;

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

    private String rutaImagen;

    private int ancho = 70;
    private int alto = 145;

    private int xInicial = 50;
    private int yInicial = 370;
    private int xAuxiliar = 0;
    private int yAuxiliar = 0;

    private boolean sube = false;
    private boolean baja = false;
    private boolean salta = false;

    private SpriteSheet spriteSheet;

    private Area cuerpo, personajeArea;

    private AudioClip sonidoSaltar;

    /**
     * construnctor de la clase PoliciaPersonaje
     */
    public PoliciaPersonaje() {
        this.baja = false;
        this.sube = false;
        this.salta = false;
        this.rutaImagen = "/assets/personajes/policia/sprite.png";
        this.spriteSheet = new SpriteSheet(this.rutaImagen);
        this.sonidoSaltar = Applet.newAudioClip(getClass().getResource("/assets/saltar.wav"));
    }

    /**
     * Agrega el personaje civil en la partida
     *
     * @param partida Establece la ruta del personaje
     */
    public PoliciaPersonaje(Partida partida) {
        super(partida);
        this.rutaImagen = "/assets/personajes/policia/sprite.png";
        spriteSheet = new SpriteSheet(this.rutaImagen);
        this.sonidoSaltar = Applet.newAudioClip(getClass().getResource("/assets/saltar.wav"));
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
     * dibuja un personaje atravez el parametro establecido
     *
     * @param g
     */
    @Override
    public void dibujar(Graphics2D g) {
        Image personaje;

         if (salta) {
            personaje = spriteSheet.getSprite(2, 1, 78, 144);

        } else if (getPartida().isFinPartida()) {
            personaje = spriteSheet.getSprite(3, 1, 78, 144);

        } else {
            personaje = spriteSheet.getSprite(1, 1, 78, 144);
        }

        g.drawImage(personaje, xInicial, yInicial, ancho, alto, null);
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
        this.sonidoSaltar.play();
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

}

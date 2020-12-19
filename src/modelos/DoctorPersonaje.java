package modelos;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Area;

/**
 * Representa una implementación concreta de la clase Personaje.
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
 */
public class DoctorPersonaje extends Personaje {

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

    private Area cuerpo;
    private Area personajeArea;

    private AudioClip sonidoSaltar;

    /**
     * Inicializa los valores del personaje doctor
     */
    public DoctorPersonaje() {
        this.baja = false;
        this.sube = false;
        this.salta = false;
        this.rutaImagen = "/assets/personajes/doctor/sprite.png";
        this.spriteSheet = new SpriteSheet(this.rutaImagen);
        this.sonidoSaltar = Applet.newAudioClip(getClass().getResource("/assets/saltar.wav"));
    }

    /**
     * Agrega el personaje doctor en la partida
     *
     * @param partida Establece la ruta del personaje
     */
    public DoctorPersonaje(Partida partida) {
        super(partida);
        this.rutaImagen = "/assets/personajes/doctor/sprite.png";
        this.spriteSheet = new SpriteSheet(this.rutaImagen);
        this.sonidoSaltar = Applet.newAudioClip(getClass().getResource("/assets/saltar.wav"));
    }

    /**
     * Retorna la ruta de la imagen del personaje doctor
     *
     * @return Ruta de la imagen
     */
    @Override
    public String getRutaImagen() {
        return rutaImagen;
    }

    /**
     * Establece la posición inicial en el eje y
     *
     * @param yInicial Posicion en y
     */
    @Override
    public void setyInicial(int yInicial) {
        this.yInicial = yInicial;
    }

    /**
     * Evalua el movimiento saltar del personaje doctor
     *
     * @return Boleeano para verificar el salto
     */
    public boolean isSalta() {
        return salta;
    }

    /**
     * Establece el movimiento saltar del persona doctor
     *
     * @param salta Determinar si salta o no
     */
    @Override
    public void setSalta(boolean salta) {
        this.salta = salta;
    }

    /**
     * Dibuja el personaje doctor según los ejes establecidos
     *
     * @param g Grafica el Personaje
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
     * Direcciona el movimiento del personaje doctor
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
     * Retrona un boleeano para el movimiento de saltar
     */
    @Override
    public void saltar() {
        salta = true;
        this.sonidoSaltar.play();
    }

    /**
     * Define el área del personaje doctor
     *
     * @return Area del personaje
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

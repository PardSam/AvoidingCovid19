package modelos;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Area;
import javax.swing.ImageIcon;

/**
 * Representa una implementación concreta de la clase Obstaculo.
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
 */
public class EnfermoObstaculo extends Obstaculo {

    private String rutaImagen;
    private Area cuerpo;
    private Area enfermo;

    private AudioClip sonidoColision;
    private AudioClip sonidoColisionFinal;

    /**
     * Constructor del Obstáculo enfermo en la Partida
     *
     * @param partida Posicion de la imagen para el Enfermo
     */
    public EnfermoObstaculo(Partida partida) {
        super(partida);
        this.rutaImagen = "/assets/enfermo.png";
        setAncho(70);
        setAlto(145);
        setxInicial(1024);
        setyInicial(370);
        setxAuxiliar(-4);
        setyAuxiliar(0);

        this.sonidoColision = Applet.newAudioClip(getClass().getResource("/assets/tos.wav"));
        this.sonidoColisionFinal = Applet.newAudioClip(getClass().getResource("/assets/tos-final.wav"));

    }

    /**
     * Direcciona el movimiento del Obstáculo enfermo
     */
    @Override
    public void mover() {

        if (getxInicial() <= -100) {
            getPartida().setPuntaje(getPartida().getPuntaje() + 1);

            if (getPartida().getPuntaje() == 10 || getPartida().getPuntaje() == 20) {
                getPartida().setGanarPartida(true);

                Perfil perfil = Perfil.gePerfil();

                if (perfil.getEscenarioId() < 3) {
                    perfil.setEscenarioId(perfil.getEscenarioId() + 1);
                } else {
                    perfil.setEscenarioId(1);
                }

                if (perfil.getPersonajeId() < 3) {
                    perfil.setPersonajeId(perfil.getPersonajeId() + 1);
                } else {
                    perfil.setPersonajeId(1);
                }

                perfil.setNivel(perfil.getNivel() + 1);

                getPartida().generar();
                getPartida().reiniciar();
            }

            if (getPartida().getPuntaje() == 5 || getPartida().getPuntaje() == 10 || getPartida().getPuntaje() == 15 || getPartida().getPuntaje() == 20 || getPartida().getPuntaje() == 25) {
                getPartida().setHorario(!getPartida().isHorario());
                getPartida().generar();
            } else if (getPartida().getPuntaje() == 30) {
                getPartida().finalizarPartida();

            }

            setxInicial(1024);

        } else {
            if (colision()) {

                this.colisionar();

                if (getPartida().getProteccion() == 0) {
                    this.sonidoColisionFinal.play();

                } else {
                    this.sonidoColision.play();
                }

                getPartida().reiniciar();

            } else {
                setxInicial(getxInicial() + getxAuxiliar());
            }
        }

        if (getPartida().getProteccion() == 0) {
            getPartida().finalizarPartida();
        }
    }

    /**
     * Dibuja el personaje doctor según los ejes establecidos
     *
     * @param g Grafica el enfermo
     */
    @Override
    public void dibujar(Graphics2D g) {
        ImageIcon obstaculo = new ImageIcon(getClass().getResource(rutaImagen));
        g.drawImage(obstaculo.getImage(), getxInicial(), getyInicial(), getAncho(), getAlto(), null);

    }

    /**
     * Define el área del personaje doctor
     *
     * @return el area para la colisión del EnfermoObstaculo
     */
    @Override
    public Area getBounds() {
        Rectangle forma1 = new Rectangle(getxInicial(), getyInicial(), 70, 145);
        cuerpo = new Area(forma1);

        enfermo = cuerpo;
        enfermo.add(cuerpo);

        return enfermo;
    }

}

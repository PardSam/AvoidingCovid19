package modelos;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
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
    private Area cuerpo, enfermo;

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
    }

    /**
     * Direcciona el movimiento del Obstáculo enfermo
     */
    @Override
    public void mover() {

        if (getxInicial() <= -100) {
            getPartida().setPuntaje(getPartida().getPuntaje() + 1);
            if (getPartida().getPuntaje() == 11 || getPartida().getPuntaje() == 21) {
                getPartida().setGanarPartida(true);
                Perfil.gePerfil().setEscenarioId(Perfil.gePerfil().getEscenarioId() + 1);
                Perfil.gePerfil().setPersonajeId(Perfil.gePerfil().getPersonajeId() + 1);
                Perfil.gePerfil().setNivel(Perfil.gePerfil().getNivel() + 1);
                getPartida().setHorario(!getPartida().isHorario());

                getPartida().generar();
                getPartida().reiniciar();
            }
            if (getPartida().getPuntajePartida() / 2 == getPartida().getPuntaje() || getPartida().getPuntajePartida() / 2 == getPartida().getPuntaje() || getPartida().getPuntajePartida() / 2 == getPartida().getPuntaje()) {
                getPartida().setHorario(!getPartida().isHorario());
                getPartida().generar();
            }
            if (getPartida().getPuntaje() == 30) {
                getPartida().finalizarPartida();
            }
            setxInicial(1024);

        } else {
            if (colision()) {
                this.colisionar();
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

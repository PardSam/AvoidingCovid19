package modelos;

import java.awt.Graphics2D;
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
public class TrabajoEscenario extends Escenario {

    private String titulo;
    public String rutaImagen;
    public String rutaNocheImagen;
    private int ancho, alto, nivel;
    private int xInicial = 1024, yInicial = 0;
    private int xAuxiliar = 0, yAuxiliar = 0;
    private ImageIcon escenarioImg;

    /**
     * Constructor del escenario trabajo
     */
    public TrabajoEscenario() {
        this.titulo = "Trabajo";
        this.ancho = 1024;
        this.alto = 550;
        this.nivel = 1;
        this.rutaImagen = "/assets/escenarios/trabajo/fondo.png";
        this.rutaNocheImagen = "/assets/escenarios/trabajo/fondo-noche.png";
    }

    /**
     * Inicia un escenario
     *
     * @param partida parametro para iniciar el escenario en la partida
     */
    public TrabajoEscenario(Partida partida) {
        super(partida);
        this.titulo = "Trabajo";
        this.ancho = 1024;
        this.alto = 550;
        this.nivel = 1;
        this.rutaImagen = "/assets/escenarios/trabajo/fondo.png";
        this.rutaNocheImagen = "/assets/escenarios/trabajo/fondo-noche.png";
    }

    /**
     * obtiene la ruta ed la imagen del escenario de noche
     *
     * @return la ruta de la imagen
     */
    @Override
    public String getRutaNocheImagen() {
        return rutaNocheImagen;
    }

    /**
     * obtiene la imagen del escenario de dia
     *
     * @return la imagen
     */
    @Override
    public ImageIcon getEscenarioImg() {
        return escenarioImg;
    }

    /**
     * establece la imagen del escenario
     *
     * @param escenarioImg es el parametro done recive la imagen para
     * establecerla
     */
    @Override
    public void setEscenarioImg(ImageIcon escenarioImg) {
        this.escenarioImg = escenarioImg;
    }

    /**
     * *
     * devuelve el nivel
     *
     * @return
     */
    @Override
    public int getNivel() {
        return nivel;
    }

    /**
     * asigna un valor al nivel
     *
     * @param nivel
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String getRutaImagen() {
        return rutaImagen;
    }

    /**
     * mueve el escenario
     *
     */
    @Override
    public void mover() {
        xInicial = xInicial - 2;
        xAuxiliar = xAuxiliar - 2;

        if (xInicial == 0 || xAuxiliar == -1024) {
            xInicial = 1024;
            xAuxiliar = 0;
        }
    }

    /**
     * dibuja el escenario en el panel
     *
     * @param g
     */
    @Override
    public void dibujar(Graphics2D g) {
        //ImageIcon escenario = new ImageIcon(getClass().getResource(this.rutaImagen));
        g.drawImage(escenarioImg.getImage(), xInicial, yInicial, ancho, alto, null);
        g.drawImage(escenarioImg.getImage(), xAuxiliar, yAuxiliar, ancho, alto, null);
    }
}

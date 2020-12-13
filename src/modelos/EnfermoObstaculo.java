/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;

/**
 *
 * @author Fernando
 */
public class EnfermoObstaculo extends Obstaculo {

    private String rutaImagen;
    private Area cabeza;
    private Area cuerpo;
    private Area enfermo;

    public EnfermoObstaculo(Partida partida) {
        super(partida);
        this.rutaImagen = "/assets/personajes/juan/normal.png";
        setAncho(112);
        setAlto(110);
        setxInicial(1024);
        setyInicial(370);
        setxAuxiliar(-4);
        setyAuxiliar(0);
    }

    @Override
    public void mover() {
        if (getxInicial() <= -100) {
            getPartida().setPuntaje(getPartida().getPuntaje() + 1);

            setxInicial(1300);

            /*
            if (getPartida().getPuntaje() == 3 || getPartida().getPuntaje() == 5 || getPartida().getPuntaje() == 9 || getPartida().getPuntaje() == 12) {
                setxAuxiliar(getxAuxiliar() - 2);
                // partida.nivel++;
            }
             */
        } else {
            if (colision()) {
                if (getPartida().getDefensa() == 0) {
                    getPartida().finalizarPartida();
                } else {
                    getPartida().bajarProteccion();
                    //getPartida().bajarDefensa();
                   
                }
            } else {
                setxInicial(getxInicial() + getxAuxiliar());
                this.colisionar();
            }
        }
        if(getPartida().getProteccion() == 0){
            getPartida().setFinPartida(true);
        }
    }

    @Override
    public void dibujar(Graphics2D g) {
        ImageIcon obstaculo = new ImageIcon(getClass().getResource(rutaImagen));
        g.drawImage(obstaculo.getImage(), getxInicial(), getyInicial(), getAncho(), getAlto(), null);
    }

    @Override
    public Area getBounds() {
        Ellipse2D forma1 = new Ellipse2D.Double(getxInicial(), getyInicial(), 40, 40);
        cabeza = new Area(forma1);

        Rectangle forma2 = new Rectangle(getxInicial() + 12, getyInicial() + 16, 50, 53);
        cuerpo = new Area(forma2);

        enfermo = cabeza;
        enfermo.add(cabeza);
        enfermo.add(cuerpo);

        return enfermo;
    }

}

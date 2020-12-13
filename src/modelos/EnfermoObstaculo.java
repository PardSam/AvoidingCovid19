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
import javax.swing.JOptionPane;
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
        this.rutaImagen = "/assets/enfermo.png";
        setAncho(70);
        setAlto(145);
        // setAncho(112);
        // setAlto(110);
        setxInicial(1024);
        setyInicial(370);
        // setyInicial(370);
        setxAuxiliar(-4);
        setyAuxiliar(0);
    }

    @Override
    public void mover() {
        if (getxInicial() <= -100) {
            getPartida().setPuntaje(getPartida().getPuntaje() + 1);
            if (getPartida().getPuntaje() == 11 || getPartida().getPuntaje() == 21) {
                //JOptionPane.showMessageDialog(null, "Pasaste el nivel");
                getPartida().setGanarPartida(true);
                Perfil.gePerfil().setEscenarioId(Perfil.gePerfil().getEscenarioId() + 1);
                Perfil.gePerfil().setNivel(Perfil.gePerfil().getNivel()+ 1);
                getPartida().setHorario(!getPartida().isHorario());
                System.out.println(getPartida().isHorario());
                
                getPartida().generar();
                getPartida().reiniciar();
            }
            if(getPartida().getPuntajePartida()/2 == getPartida().getPuntaje() || getPartida().getPuntajePartida()/2 ==getPartida().getPuntaje() || getPartida().getPuntajePartida()/2 == getPartida().getPuntaje()){
                getPartida().setHorario(!getPartida().isHorario());
                System.out.println(getPartida().isHorario());
                getPartida().generar();
            }
            if (getPartida().getPuntaje() == 30) {
                getPartida().finalizarPartida();
                //JOptionPane.showMessageDialog(null, "Felicidades ganaste");
            }
            setxInicial(1024);

            /*
            if (getPartida().getPuntaje() == 3 || getPartida().getPuntaje() == 5 || getPartida().getPuntaje() == 9 || getPartida().getPuntaje() == 12) {
                setxAuxiliar(getxAuxiliar() - 2);
                // partida.nivel++;
            }
             */
        } else {
            if (colision()) {
                if (getPartida().getProteccion() == 1) {
                    getPartida().finalizarPartida();
                    //JOptionPane.showMessageDialog(null, "Perdiste");
                }
                this.colisionar();

                getPartida().reiniciar();
            } else {
                setxInicial(getxInicial() + getxAuxiliar());

            }
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

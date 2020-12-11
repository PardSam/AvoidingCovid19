/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.Graphics2D;
import modelos.Nivel1;
import modelos.Nivel2;
import modelos.Nivel3;
import modelos.Partida;
import modelos.Perfil;
import vistas.PartidaVista;

/**
 *
 * @author Fernando
 */
public class PartidaControlador {

    private Partida partida;

    private PartidaVista vista;

    public PartidaControlador(PartidaVista vista) {
        this.vista = vista;

        switch (Perfil.gePerfil().getNivel()) {
            case 1:
                partida = new Nivel1();
                break;
            case 2:
                partida = new Nivel2();
                break;
            case 3:
                partida = new Nivel3();
                break;
            default:
                partida = new Nivel1();
        }

        partida.generar();

        this.vista.setLocationRelativeTo(null);

        vista.setVisible(false);
    }

    private void dibujar(Graphics2D g) {
        partida.getEscenario().dibujar(g);
        partida.getEscenario().dibujar(g);

    }

    private void mover(Graphics2D g) {
        partida.getEscenario().mover();
        partida.getEscenario().mover();

    }
}

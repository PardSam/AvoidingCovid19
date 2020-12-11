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
import vistas.PartidaPanel;
import vistas.PartidaVista;

/**
 *
 * @author Fernando
 */
public class PartidaControlador {

    private Partida partida;

    private PartidaVista vista;
    
    private PartidaPanel partidaPanel;

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
        
        partidaPanel = new PartidaPanel(partida);
        this.vista.inicializarComponentes(partidaPanel);
        
        this.vista.setLocationRelativeTo(null);

        vista.setVisible(false);
    }
}

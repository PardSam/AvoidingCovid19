/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import modelos.Jugador;
import vistas.AcercaVista;
import vistas.AjustesVista;
import vistas.AyudaVista;
import vistas.EscenariosVista;
import vistas.PartidaVista;
import vistas.PersonajesVista;
import vistas.PrincipalVista;

/**
 *
 * @author fernandomonjav
 */
public class PrincipalControlador implements ActionListener {

    public PrincipalVista vista;
    public AcercaVista acerca;
    public AcercaControlador controladorAcerca;
    public AjustesVista ajustes;
    public AjustesControlador controladorAjuste;
    public AyudaVista ayuda;
    public AyudaControlador controladorayuda;
    public EscenariosVista escenario;
    public EscenariosControlador controladorEscenario;
    public PersonajesVista personaje;
    public PersonajesControlador controladorPersonaje;
    public PartidaVista partida;
    public PartidaControlador controladorPartida;

    public PrincipalControlador(PrincipalVista vista) {
        this.vista = vista;

        vista.playBoton.addActionListener(this);
        vista.comenzarBoton.addActionListener(this);
        vista.escenariosBoton.addActionListener(this);
        vista.personajesBoton.addActionListener(this);
        vista.ayudaBoton.addActionListener(this);
        vista.infoBoton.addActionListener(this);
        vista.ajustesBoton.addActionListener(this);
        vista.salirBoton.addActionListener(this);

        escenario = new EscenariosVista();
        controladorEscenario = new EscenariosControlador(escenario);

        personaje = new PersonajesVista();
        controladorPersonaje = new PersonajesControlador(personaje);

        ayuda = new AyudaVista();
        controladorayuda = new AyudaControlador(ayuda);

        acerca = new AcercaVista();
        controladorAcerca = new AcercaControlador(acerca);

        ajustes = new AjustesVista();
        controladorAjuste = new AjustesControlador(ajustes);

        vista.setVisible(true);

        escenario.setVisible(false);
        personaje.setVisible(false);
        ayuda.setVisible(false);
        acerca.setVisible(false);
        ajustes.setVisible(false);

        this.vista.setLocationRelativeTo(null);
        this.vista.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "play":
                System.out.println("Play");

                partida = new PartidaVista();
                controladorPartida = new PartidaControlador(partida);
                partida.setVisible(true);
                //this.vista.setVisible(false);
                break;
            case "comenzar":
                System.out.println("Comenzar");
                partida = new PartidaVista();
                controladorPartida = new PartidaControlador(partida);
                partida.setVisible(true);
                //this.vista.setVisible(false);
                break;
            case "escenarios":
                System.out.println("Escenarios");
                escenario.setVisible(true);
                break;
            case "personajes":
                System.out.println("Personajes");
                personaje.setVisible(true);
                break;
            case "ayuda":
                System.out.println("Ayuda");
                ayuda.setVisible(true);
                break;
            case "info":
                System.out.println("Info");
                acerca.setVisible(true);
                break;
            case "ajustes":
                System.out.println("Ajustes");
                ajustes.setVisible(true);
                break;
            case "salir":
                System.exit(0);
                break;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import vistas.PrincipalVista;

/**
 *
 * @author fernandomonjav
 */
public class PrincipalControlador implements ActionListener {

    private PrincipalVista vista;

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
        
        this.vista.setLocationRelativeTo(null);
        this.vista.setDefaultCloseOperation(EXIT_ON_CLOSE);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "play":
                System.out.println("Play");
                break;
            case "comenzar":
                System.out.println("Comenzar");
                break;
            case "escenarios":
                System.out.println("Escenarios");
                break;
            case "personajes":
                System.out.println("Personajes");
                break;
            case "ayuda":
                System.out.println("Ayuda");
                break;
            case "info":
                System.out.println("Info");
                break;
            case "ajustes":
                System.out.println("Ajustes");
                break;
            case "salir":
                System.out.println("Salir");
                break;
        }
    }
}

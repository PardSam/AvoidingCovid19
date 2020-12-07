/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import vistas.AyudaVista;

/**
 *
 * @author aries
 */
public class AyudaControlador implements ActionListener {

    private AyudaVista vista;

    public AyudaControlador(AyudaVista vista) {
        this.vista = vista;

        this.vista.atrasBoton.addActionListener(this);
        this.vista.siguienteBoton.addActionListener(this);
        this.vista.cerrarBoton.addActionListener(this);

        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "atras":
                System.out.println("Atras");
                break;
            case "siguiente":
                System.out.println("Siguiente");
                break;
            case "cerrar":
                System.out.println("Cerrar");
                this.vista.setVisible(false);
                break;
        }
    }
}

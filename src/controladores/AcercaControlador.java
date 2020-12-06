/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import vistas.AcercaVista;

/**
 *
 * @author aries
 */
public class AcercaControlador implements ActionListener{
    private AcercaVista vista;
    
    public AcercaControlador(AcercaVista vista){
        this.vista = vista;
        
        this.vista.cerrarBoton.addActionListener(this);
        
        this.vista.setLocationRelativeTo(null);
        this.vista.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.vista.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Cerrar");        
    }    
}

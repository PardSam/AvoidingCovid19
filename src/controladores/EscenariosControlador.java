/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.EscenariosVista;

/**
 *
 * @author fernandomonjav
 */
public class EscenariosControlador implements ActionListener {

    private EscenariosVista vista;

    public EscenariosControlador(EscenariosVista vista) {
        this.vista = vista;

        vista.aceptarBoton.addActionListener(this);
        vista.cerrarBoton.addActionListener(this);
        
         this.vista.setLocationRelativeTo(null);
        
        vista.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "aceptar":
                System.out.println("Aceptar");
                break;
            case "cerrar":
                this.vista.setVisible(false);
                System.out.println("Cerrar");
                break;

        }
    }
}

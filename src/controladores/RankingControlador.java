/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.RankingVista;

/**
 *
 * @author aries
 */
public class RankingControlador implements ActionListener {

    private RankingVista vista;

    public RankingControlador(RankingVista vista) {
        this.vista = vista;

        this.vista.cerrarBoton.addActionListener(this);

        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.vista.setVisible(false);
    }

}

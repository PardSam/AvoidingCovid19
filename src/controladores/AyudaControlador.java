/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.ImageIcon;
import vistas.AyudaVista;

/**
 *
 * @author aries
 */
public class AyudaControlador implements ActionListener, ComponentListener {

    private AyudaVista vista;
    private ImageIcon femeninoImagen;

    public AyudaControlador(AyudaVista vista) {
        this.vista = vista;
        this.vista.principalPanel.addComponentListener(this);

        this.vista.atrasBoton.addActionListener(this);
        this.vista.siguienteBoton.addActionListener(this);
        this.vista.cerrarBoton.addActionListener(this);

        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(false);
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

    @Override
    public void componentResized(ComponentEvent e) {

        int width = e.getComponent().getWidth();
        int height = e.getComponent().getHeight();
        this.vista.imagenAyudaEtiqueta.setIcon(new ImageIcon(this.vista.imgAyuda.getImage().getScaledInstance(width, height, Image.SCALE_FAST)));
    }

    @Override
    public void componentMoved(ComponentEvent e) {

    }

    @Override
    public void componentShown(ComponentEvent e) {

    }

    @Override
    public void componentHidden(ComponentEvent e) {
    }
}

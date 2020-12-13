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
import javax.swing.JLabel;
import vistas.AyudaVista;

/**
 *
 * @author aries
 */
public class AyudaControlador implements ActionListener, ComponentListener {

    private AyudaVista vista;
    public int op = 4;
    final String HELP[] = {"/assets/img__ayuda-1.png", "/assets/img__ayuda-2.png", "/assets/img__ayuda-3.png",
        "/assets/img__ayuda-4.png", "/assets/img__ayuda-5.png"};

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
                opcionAyuda(this.vista.imagenAyudaEtiqueta,1);
                this.vista.imagenAyudaEtiqueta.updateUI();
                break;
            case "siguiente":
                opcionAyuda(this.vista.imagenAyudaEtiqueta,2);
                break;
            case "cerrar":
                this.vista.setVisible(false);
                break;
        }
    }

    public ImageIcon imagenRuta(String ruta) {

        ImageIcon img = new ImageIcon(getClass().getResource(ruta));

        return img;
    }

    public void opcionAyuda(JLabel etiqueta, int ayuda) {
        if (ayuda == 1) {
            op--;
            if (op < 0) {
                op = this.HELP.length-1;
            }

        } else if (ayuda == 2) {
            op++;
            if (op >= this.HELP.length) {
                op = 0;
            }
        }
        this.vista.imgAyuda = imagenRuta(this.HELP[op]);
        this.vista.imagenAyudaEtiqueta.setIcon(new ImageIcon(this.vista.imgAyuda.getImage().
                getScaledInstance(this.vista.width, this.vista.height, Image.SCALE_FAST)));
    }

    @Override
    public void componentResized(ComponentEvent e) {

        this.vista.width = e.getComponent().getWidth() - 50;
        this.vista.height = e.getComponent().getHeight();

        this.vista.imagenAyudaEtiqueta.setIcon(new ImageIcon(this.vista.imgAyuda.getImage().
                getScaledInstance(this.vista.width, this.vista.height, Image.SCALE_FAST)));

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

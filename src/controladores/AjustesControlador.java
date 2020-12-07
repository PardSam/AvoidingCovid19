/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import vistas.AjustesVista;

/**
 *
 * @author aries
 */
public class AjustesControlador implements ActionListener {

    private AjustesVista vista;
    private ImageIcon masculinoImagen;
    private ImageIcon femeninoImagen;

    public AjustesControlador(AjustesVista vista) {
        this.vista = vista;

        this.vista.aceptarBoton.addActionListener(this);
        this.vista.restablacerBoton.addActionListener(this);
        this.vista.cerrarBoton.addActionListener(this);
        this.vista.masculino.addActionListener(this);
        this.vista.femenino.addActionListener(this);

        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "aceptar":
                System.out.println("Aceptar");
                break;
            case "restablecer":
                System.out.println("Restablecer");
                break;
            case "cerrar":
                System.out.println("Cerrar");
                this.vista.setVisible(false);
                break;
            case "Masculino":
                masculinoImagen = new ImageIcon("./src/assets/masculino-activo.png");
                this.vista.masculino.setIcon(new ImageIcon(masculinoImagen.getImage().
                        getScaledInstance(25, 25, Image.SCALE_SMOOTH)));

                femeninoImagen = new ImageIcon("./src/assets/femenino.png");
                this.vista.femenino.setIcon(new ImageIcon(femeninoImagen.getImage().
                        getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
                break;
            case "Femenino":
                femeninoImagen = new ImageIcon("./src/assets/femenino-activo.png");
                this.vista.femenino.setIcon(new ImageIcon(femeninoImagen.getImage().
                        getScaledInstance(25, 25, Image.SCALE_SMOOTH)));

                masculinoImagen = new ImageIcon("./src/assets/masculino.png");
                this.vista.masculino.setIcon(new ImageIcon(masculinoImagen.getImage().
                        getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
                break;
        }
    }
}

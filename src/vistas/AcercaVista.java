/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author aries
 */
public class AcercaVista extends JFrame{
    public JLabel tituloEtiqueta;
    public JTextArea informacionArea;
    public JButton cerrarBoton;
    
    public AcercaVista(){
        this.setSize(540, 320);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        tituloEtiqueta = new JLabel("ACERCA");
        Font font = new Font("Roboto", Font.BOLD, 56);
        tituloEtiqueta.setFont(font);
        tituloEtiqueta.setForeground(new Color(0XFFFFFF));
        
        informacionArea = new JTextArea();
        
        cerrarBoton = new JButton("Cerrar",new ImageIcon("./src/assets/salir.png"));
        cerrarBoton.setForeground(new Color(0X333333));
        cerrarBoton.setBackground(new Color(0XFFFF00));
        cerrarBoton.setActionCommand("cerrar");
        
        Container contenedor = this.getContentPane();
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));
        contenedor.setBackground(new Color(0X073763));
        
         JPanel opcionesPanel = new JPanel();
        opcionesPanel.setLayout(new BoxLayout(opcionesPanel, BoxLayout.X_AXIS));
        opcionesPanel.setOpaque(false);
        
        contenedor.add(tituloEtiqueta);
        contenedor.add(informacionArea);
        
        opcionesPanel.add(Box.createHorizontalGlue());
        opcionesPanel.add(cerrarBoton);
        
        contenedor.add(opcionesPanel);
    }
}

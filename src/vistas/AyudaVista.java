/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author aries
 */
public class AyudaVista  extends JFrame{
    public JLabel tituloEtiqueta;
    public JButton atrasBoton;
    public JButton siguienteBoton;
    public JButton cerrarBoton;
    
    public AyudaVista(){
        this.setSize(500, 400);
        iniciarComponentes();
    }
    
    public void iniciarComponentes(){    
        
        tituloEtiqueta = new JLabel("AYUDA");
        Font font = new Font("Roboto", Font.BOLD, 56);
        tituloEtiqueta.setFont(font);
        tituloEtiqueta.setForeground(new Color(0XFFFFFF));
        
        atrasBoton = new JButton("Atras");
        siguienteBoton = new JButton("Siguiente");
        cerrarBoton = new JButton("Cerrar");
        
        atrasBoton.setForeground(Color.white);
        atrasBoton.setBackground(new Color(0X0a4f8f));        
       
        
        siguienteBoton.setForeground(Color.white);
        siguienteBoton.setBackground(new Color(0X0a4f8f));        
        
        
        cerrarBoton.setForeground(Color.white);
        cerrarBoton.setBackground(new Color(0X0a4f8f));
        
        
        atrasBoton.setActionCommand("atras");
        siguienteBoton.setActionCommand("siguiente");
        cerrarBoton.setActionCommand("cerrar");
        
        Container contenedor = this.getContentPane();
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));
        contenedor.setBackground(new Color(0X073763));
        
        JPanel opcionesPanel = new JPanel();
        opcionesPanel.setLayout(new BoxLayout(opcionesPanel, BoxLayout.X_AXIS));
        opcionesPanel.setOpaque(false);
        
        contenedor.add(tituloEtiqueta);
        
        opcionesPanel.add(atrasBoton);
        opcionesPanel.add(siguienteBoton);
        opcionesPanel.add(cerrarBoton);
        
        contenedor.add(opcionesPanel);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import ui.MiBoton;
import ui.Paleta;

/**
 *
 * @author aries
 */
public class AyudaVista extends JFrame {

    public JLabel tituloEtiqueta;
    public ImageIcon imgAyuda;
    public JLabel imagenAyudaEtiqueta;
    public JButton atrasBoton;
    public JButton siguienteBoton;
    public JButton cerrarBoton;
    public JPanel generalPanel;
    public JPanel encabezadoPanel;
    public JPanel principalPanel;
    public JPanel barraAccionesPanel;
    
        
    public int width;
    public int height;  
    
    public AyudaVista() {
        this.setSize(500, 400);
        iniciarComponentes();
    }

    public void iniciarComponentes() {

        tituloEtiqueta = new JLabel("AYUDA");
        Font font = new Font("Roboto", Font.BOLD, 32);
        tituloEtiqueta.setFont(font);
        tituloEtiqueta.setForeground(Paleta.getPlanoPrimario());
        
        imgAyuda = new ImageIcon("./src/assets/img__ayuda-1.png");
        imagenAyudaEtiqueta = new JLabel();
        imagenAyudaEtiqueta.setSize(320,160);
        imagenAyudaEtiqueta.setIcon(new ImageIcon(imgAyuda.getImage().getScaledInstance(imagenAyudaEtiqueta.
                getWidth(), imagenAyudaEtiqueta.getHeight(),Image.SCALE_SMOOTH)));
        
        atrasBoton = new MiBoton();
        atrasBoton.setText("Atras");
        atrasBoton.setForeground(Paleta.getPlanoPrimario());
        atrasBoton.setBackground(Paleta.getFondoSuperficie());
        
        siguienteBoton = new MiBoton();
        siguienteBoton.setText("Siguiente");
         siguienteBoton.setForeground(Paleta.getPlanoPrimario());
        siguienteBoton.setBackground(Paleta.getFondoSuperficie());
        
        cerrarBoton = new MiBoton();
        cerrarBoton.setText("Cerrar");
        cerrarBoton.setForeground(Paleta.getPlanoPrimario());
        cerrarBoton.setBackground(Paleta.getFondoSuperficie());        

        atrasBoton.setActionCommand("atras");
        siguienteBoton.setActionCommand("siguiente");
        cerrarBoton.setActionCommand("cerrar");

        Container contenedor = this.getContentPane();
        contenedor.setLayout(new GridLayout(1, 1));
        contenedor.setBackground(Paleta.getFondo());

        generalPanel = new JPanel();
        generalPanel.setLayout(new GridBagLayout());
        generalPanel.setOpaque(false);

        crearEncabezadoPanel();
        crearPrincipalPanel();
        crearBarraAccionesPanel();

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 0;
        generalPanel.add(encabezadoPanel, gbc);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        generalPanel.add(principalPanel, gbc);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.weighty = 0;
        generalPanel.add(barraAccionesPanel, gbc);

        contenedor.add(generalPanel);
    }

    private void crearEncabezadoPanel() {
        encabezadoPanel = new JPanel();
        encabezadoPanel.setBorder(new EmptyBorder(10, 0, 0, 0));
        encabezadoPanel.setOpaque(false);

        encabezadoPanel.add(tituloEtiqueta);
    }

    private void crearPrincipalPanel() {
        principalPanel = new JPanel();
        principalPanel.setLayout(new BoxLayout(principalPanel, BoxLayout.PAGE_AXIS));
        principalPanel.setBorder(new EmptyBorder(0, 32, 0, 32));
        principalPanel.setOpaque(false);

        //principalPanel.add(Box.createHorizontalStrut(90));
        principalPanel.add(imagenAyudaEtiqueta);
        //principalPanel.add(Box.createHorizontalStrut(30));
    }

    private void crearBarraAccionesPanel() {
       barraAccionesPanel = new JPanel();
        barraAccionesPanel.setLayout(new BoxLayout(barraAccionesPanel, BoxLayout.X_AXIS));
        barraAccionesPanel.setBorder(new EmptyBorder(15, 8, 8, 8));
        barraAccionesPanel.setOpaque(false);

        barraAccionesPanel.add(Box.createHorizontalGlue());
        barraAccionesPanel.add(atrasBoton);
        barraAccionesPanel.add(Box.createRigidArea(new Dimension(8, 0)));
        barraAccionesPanel.add(siguienteBoton);
        barraAccionesPanel.add(Box.createRigidArea(new Dimension(8, 0)));
        barraAccionesPanel.add(cerrarBoton);
        barraAccionesPanel.add(Box.createVerticalStrut(50));
    }
}

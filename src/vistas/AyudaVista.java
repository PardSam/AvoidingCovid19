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
    
    public AyudaVista() {
        this.setSize(500, 400);
        iniciarComponentes();
    }

    public void iniciarComponentes() {

        tituloEtiqueta = new JLabel("AYUDA");
        Font font = new Font("Roboto", Font.BOLD, 32);
        tituloEtiqueta.setFont(font);
        tituloEtiqueta.setForeground(new Color(0XFFFFFF));
        
        imgAyuda = new ImageIcon("./src/assets/img-ayuda.png");
        imagenAyudaEtiqueta = new JLabel();
        imagenAyudaEtiqueta.setSize(320,160);
        imagenAyudaEtiqueta.setIcon(new ImageIcon(imgAyuda.getImage().getScaledInstance(imagenAyudaEtiqueta.
                getWidth(), imagenAyudaEtiqueta.getHeight(),Image.SCALE_SMOOTH)));
        
        atrasBoton = new MiBoton();
        atrasBoton.setText("Atras");
        siguienteBoton = new MiBoton();
        siguienteBoton.setText("Siguiente");
        cerrarBoton = new MiBoton();
        cerrarBoton.setText("Cerrar");

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
        gbc.weightx = 52;
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
        principalPanel.setLayout(new BoxLayout(principalPanel, BoxLayout.X_AXIS));
        principalPanel.setOpaque(false);

        principalPanel.add(Box.createHorizontalStrut(90));
        principalPanel.add(imagenAyudaEtiqueta);
        principalPanel.add(Box.createHorizontalStrut(30));
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

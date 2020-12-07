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
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import ui.MiBoton;
import ui.Paleta;

/**
 *
 * @author aries
 */
public class AjustesVista extends JFrame {
    
    public JLabel tituloEtiqueta;
    public JLabel nombreEtiqueta;
    public JTextField nombreCaja;
    public JLabel generoEtiqueta;
    public JRadioButton masculino;
    public JRadioButton femenino;
    public ButtonGroup generoGrupo;
    private ImageIcon maleIcon;
    private ImageIcon femaleIcon;
    public JButton aceptarBoton;
    public JButton restablacerBoton;
    public JButton cerrarBoton;
    
    public JPanel generalPanel;
    public JPanel encabezadoPanel;
    public JPanel principalPanel;
    public JPanel barraAccionesPanel;
    
    public AjustesVista() {
        this.setSize(400, 320);
        iniciarComponentes();
    }
    
    public void iniciarComponentes() {
        tituloEtiqueta = new JLabel("Ajustes");
        Font font = new Font("Roboto", Font.BOLD, 24);
        tituloEtiqueta.setFont(font);
        tituloEtiqueta.setForeground(new Color(0XFFFFFF));

        //validar el maximo y minimo de caracteres en la caja
        nombreEtiqueta = new JLabel("Nombre");
        nombreEtiqueta.setForeground(new Color(0XFFFFFF));
        
        nombreCaja = new JTextField();
        nombreCaja.setForeground(Paleta.getPlanoPrimario());
        nombreCaja.setBackground(Paleta.getFondoSuperficie());
        
        generoEtiqueta = new JLabel("Genero");
        generoEtiqueta.setForeground(new Color(0XFFFFFF));
        
        masculino = new JRadioButton();
        femenino = new JRadioButton();
        masculino.setActionCommand("Masculino");
        femenino.setActionCommand("Femenino");
        
        maleIcon = new ImageIcon("./src/assets/masculino.png");
        femaleIcon = new ImageIcon("./src/assets/femenino.png");
        
        masculino.setIcon(new ImageIcon(maleIcon.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        masculino.setBackground(new Color(0X073763));
        femenino.setIcon(new ImageIcon(femaleIcon.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        femenino.setBackground(new Color(0X073763));
        
        generoGrupo = new ButtonGroup();
        generoGrupo.add(masculino);
        generoGrupo.add(femenino);
        
        aceptarBoton = new MiBoton();
        aceptarBoton.setText("ACEPTAR");
        aceptarBoton.setBackground(Paleta.getFondoPrimario());
        aceptarBoton.setForeground(Paleta.getPlanoSuperficie());
        
        restablacerBoton = new MiBoton();
        restablacerBoton.setText("RESTABLECER");
        restablacerBoton.setBackground(Paleta.getFondoSuperficie());
        restablacerBoton.setForeground(Paleta.getPlanoSuperficie());
        
        cerrarBoton = new MiBoton();
        cerrarBoton.setText("CERRAR");
        cerrarBoton.setBackground(Paleta.getFondoSuperficie());
        cerrarBoton.setForeground(Paleta.getPlanoSuperficie());
        
        aceptarBoton.setActionCommand("aceptar");
        restablacerBoton.setActionCommand("restablecer");
        cerrarBoton.setActionCommand("cerrar");
        
        Container contenedor = this.getContentPane();
        contenedor.setLayout(new GridLayout(1, 1));
        contenedor.setBackground(new Color(0X073763));
        
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
        gbc.weighty = 1;
        generalPanel.add(encabezadoPanel, gbc);
        
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 0;
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
        encabezadoPanel.setBorder(new EmptyBorder(5, 0, 0, 0));
        encabezadoPanel.setOpaque(false);
        encabezadoPanel.add(tituloEtiqueta);
    }
    
    private void crearPrincipalPanel() {
        principalPanel = new JPanel();
        principalPanel.setLayout(new GridBagLayout());
        principalPanel.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        
        JPanel nombrePanel = new JPanel();
        
        nombrePanel.setLayout(new BoxLayout(nombrePanel, BoxLayout.Y_AXIS));
        nombrePanel.setOpaque(false);
        
        JPanel etiquetaGeneroPanel = new JPanel();
        etiquetaGeneroPanel.setLayout(new BoxLayout(etiquetaGeneroPanel, BoxLayout.Y_AXIS));
        etiquetaGeneroPanel.setOpaque(false);
        
        JPanel cajaPanel = new JPanel();
        cajaPanel.setLayout(new BoxLayout(cajaPanel, BoxLayout.LINE_AXIS));
        cajaPanel.setOpaque(false);
        
        JPanel generoPanel = new JPanel();
        generoPanel.setLayout(new BoxLayout(generoPanel, BoxLayout.X_AXIS));
        //generoPanel.setOpaque(false);
        
        nombrePanel.add(Box.createHorizontalStrut(10));
        nombrePanel.add(nombreEtiqueta);
         nombrePanel.add(Box.createVerticalStrut(10));
        //nombrePanel.setAlignmentX(JPanel.BOTTOM_ALIGNMENT);

        cajaPanel.add(Box.createHorizontalStrut(45));
        cajaPanel.add(nombreCaja);
        cajaPanel.add(Box.createHorizontalStrut(50));
        cajaPanel.add(Box.createVerticalStrut(20));
        
        etiquetaGeneroPanel.add(Box.createVerticalStrut(10));
        etiquetaGeneroPanel.add(Box.createHorizontalStrut(10));
        etiquetaGeneroPanel.add(generoEtiqueta);
        //etiquetaGeneroPanel.add(Box.createVerticalStrut(-5));
        generoPanel.add(Box.createHorizontalStrut(40));
        generoPanel.add(masculino);
        generoPanel.add(femenino);
        generoPanel.add(Box.createVerticalStrut(100));
        
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 0;
        gbc.weightx = 50;
        gbc.weighty = 1;
        //principalPanel.add(Box.createRigidArea(new Dimension(1, 0)));
        principalPanel.add(nombrePanel, gbc);
        
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        principalPanel.add(cajaPanel, gbc);
        
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.weighty = 0;
        principalPanel.add(etiquetaGeneroPanel, gbc);
        
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 3;
        gbc.weightx = 1;
        gbc.weighty = 1;
        principalPanel.add(generoPanel, gbc);
        
    }
    
    private void crearBarraAccionesPanel() {
        barraAccionesPanel = new JPanel();
        barraAccionesPanel.setLayout(new BoxLayout(barraAccionesPanel, BoxLayout.X_AXIS));
        barraAccionesPanel.setBorder(new EmptyBorder(15, 8, 8, 8));
        barraAccionesPanel.setOpaque(false);
        
        barraAccionesPanel.add(Box.createRigidArea(new Dimension(40, 0)));
        barraAccionesPanel.add(aceptarBoton);
        barraAccionesPanel.add(Box.createRigidArea(new Dimension(8, 0)));
        barraAccionesPanel.add(restablacerBoton);
        barraAccionesPanel.add(Box.createRigidArea(new Dimension(8, 0)));
        barraAccionesPanel.add(cerrarBoton);
    }
}

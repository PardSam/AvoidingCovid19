/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author aries
 */
public class AjustesVista extends JFrame{
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
    
    public AjustesVista(){
        this.setSize(540,320);
        iniciarComponentes();
    }
    public void iniciarComponentes(){
        tituloEtiqueta =new JLabel("AJUSTES");
        Font font = new Font("Roboto", Font.BOLD, 56);
        tituloEtiqueta.setFont(font);
        tituloEtiqueta.setForeground(new Color(0XFFFFFF));
        
        //validar el maximo y minimo de caracteres en la caja
        nombreEtiqueta =new JLabel("Nombre");
        nombreEtiqueta.setForeground(new Color(0XFFFFFF));
        
        nombreCaja = new JTextField();

        
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
        
        aceptarBoton = new JButton("Aceptar");
        restablacerBoton = new JButton("Restablecer");
        cerrarBoton = new JButton("Cerrar");        
        
        aceptarBoton.setActionCommand("aceptar");
        restablacerBoton.setActionCommand("restablecer");
        cerrarBoton.setActionCommand("cerrar");
        
        Container contenedor = this.getContentPane();
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));
        contenedor.setBackground(new Color(0X073763));
        
        JPanel nombrePanel = new JPanel();
        nombrePanel.setLayout(new BoxLayout(nombrePanel, BoxLayout.X_AXIS));
        nombrePanel.setOpaque(false);
        
        JPanel generoPanel = new JPanel();
        generoPanel.setLayout(new BoxLayout(generoPanel, BoxLayout.X_AXIS));
        generoPanel.setOpaque(false);
        
        JPanel opcionesPanel = new JPanel();
        opcionesPanel.setLayout(new BoxLayout(opcionesPanel, BoxLayout.X_AXIS));
        opcionesPanel.setOpaque(false);
        
        contenedor.add(tituloEtiqueta);
        
        nombrePanel.add(nombreEtiqueta);
        nombrePanel.add(nombreCaja);    
        
        generoPanel.add(masculino);
        generoPanel.add(femenino); 
        
        opcionesPanel.add(aceptarBoton);
        opcionesPanel.add(restablacerBoton);
        opcionesPanel.add(cerrarBoton);
        
        contenedor.add(nombrePanel);
        contenedor.add(generoEtiqueta);
        contenedor.add(generoPanel);
        contenedor.add(opcionesPanel); 
    }
}

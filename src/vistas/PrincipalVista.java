/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladores.PrincipalControlador;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author fernandomonjav
 */
public class PrincipalVista extends JFrame {

    public JLabel nombreEtiqueta;
    public JButton playBoton;
    public JButton comenzarBoton;
    public JButton escenariosBoton;
    public JButton personajesBoton;
    public JButton ayudaBoton;
    public JButton infoBoton;
    public JButton ajustesBoton;
    public JButton salirBoton;

    public PrincipalVista() {
        setMinimumSize(new Dimension(1024, 576));

        inicializarComponentes();
    }

    public void inicializarComponentes() {
        // Crear los botones
        nombreEtiqueta = new JLabel("Avoiding Covi 19");
        Font font = new Font("Roboto", Font.BOLD, 72);
        nombreEtiqueta.setFont(font);
        nombreEtiqueta.setForeground(new Color(0XFFFFFF));        
         
        playBoton = new JButton("Play");

        comenzarBoton = new JButton("COMENZAR", new ImageIcon("./src/assets/jugar.png"));
        comenzarBoton.setForeground(new Color(0XFFFFFF));
        comenzarBoton.setBackground(new Color(0X009E0F));

        escenariosBoton = new JButton("ESCENARIOS", new ImageIcon("./src/assets/escenario.png"));
        escenariosBoton.setForeground(new Color(0X333333));
        escenariosBoton.setBackground(new Color(0XFFFF00));

        personajesBoton = new JButton("PERSONAJES", new ImageIcon("./src/assets/personaje.png"));
        personajesBoton.setForeground(new Color(0X333333));
        personajesBoton.setBackground(new Color(0XFFFF00));

        ayudaBoton = new JButton(new ImageIcon("./src/assets/ayuda.png"));
        ayudaBoton.setForeground(new Color(0X333333));
        ayudaBoton.setBackground(new Color(0XFFFF00));

        infoBoton = new JButton(new ImageIcon("./src/assets/info.png"));
        infoBoton.setForeground(new Color(0X333333));
        infoBoton.setBackground(new Color(0XFFFF00));

        ajustesBoton = new JButton(new ImageIcon("./src/assets/ajustes.png"));
        ajustesBoton.setForeground(new Color(0X333333));
        ajustesBoton.setBackground(new Color(0XFFFF00));

        salirBoton = new JButton(new ImageIcon("./src/assets/salir.png"));
        salirBoton.setForeground(new Color(0X333333));
        salirBoton.setBackground(new Color(0XFFFF00));

        // Establecer acciones de comando a los botones
        playBoton.setActionCommand("play");
        comenzarBoton.setActionCommand("comenzar");
        escenariosBoton.setActionCommand("escenarios");
        personajesBoton.setActionCommand("personajes");
        ayudaBoton.setActionCommand("ayuda");
        infoBoton.setActionCommand("info");
        ajustesBoton.setActionCommand("ajustes");
        salirBoton.setActionCommand("salir");

        Container contenedor = getContentPane();
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));
        contenedor.setBackground(new Color(0X073763));

        JPanel accionesPanel = new JPanel();
        accionesPanel.setLayout(new BoxLayout(accionesPanel, BoxLayout.X_AXIS));
        accionesPanel.setOpaque(false);

        accionesPanel.add(comenzarBoton);
        accionesPanel.add(escenariosBoton);
        accionesPanel.add(personajesBoton);

        JPanel opcionesPanel = new JPanel();
        opcionesPanel.setLayout(new BoxLayout(opcionesPanel, BoxLayout.X_AXIS));
        opcionesPanel.setOpaque(false);

        opcionesPanel.add(ayudaBoton);
        opcionesPanel.add(infoBoton);
        opcionesPanel.add(ajustesBoton);
        opcionesPanel.add(salirBoton);

        JPanel barraPanel = new JPanel();
        barraPanel.setLayout(new BoxLayout(barraPanel, BoxLayout.X_AXIS));
        barraPanel.setOpaque(false);

        barraPanel.add(accionesPanel);
        barraPanel.add(Box.createHorizontalGlue());
        barraPanel.add(opcionesPanel);

        // Agregar los botones al contenedor
        contenedor.add(nombreEtiqueta);
        contenedor.add(playBoton);
        contenedor.add(barraPanel);

    }

    public static void main(String[] args) {
        PrincipalVista vista = new PrincipalVista();
        PrincipalControlador controlador = new PrincipalControlador(vista);
        vista.setVisible(true);
        // TODO code application logic here
    }
}

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
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
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
import ui.MiBotonIcono;

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

    public JPanel encabezadoPanel;
    public JPanel principalPanel;
    public JPanel accionesPanel;
    public JPanel opcionesPanel;
    public JPanel barraAccionesPanel;
    public JPanel generalPanel;

    public PrincipalVista() {
        setMinimumSize(new Dimension(1024, 576));

        inicializarComponentes();
    }

    public void inicializarComponentes() {
        // Crear los botones
        nombreEtiqueta = new JLabel("Avoiding COVID 19");
        Font font = new Font("Arial", Font.BOLD, 72);
        nombreEtiqueta.setFont(font);
        nombreEtiqueta.setForeground(new Color(0XFFFFFF));

        playBoton = new MiBotonIcono();
        playBoton.setIcon(new ImageIcon("./src/assets/jugar.png"));
        playBoton.setBackground(Paleta.getFondoSuperficie());

        comenzarBoton = new MiBoton();
        comenzarBoton.setText("COMENZAR");
        comenzarBoton.setIcon(new ImageIcon("./src/assets/comenzar.png"));
        comenzarBoton.setForeground(Paleta.getPlanoPrimario());
        comenzarBoton.setBackground(Paleta.getFondoPrimario());

        escenariosBoton = new MiBoton();
        escenariosBoton.setText("ESCENARIOS");
        escenariosBoton.setIcon(new ImageIcon("./src/assets/escenario.png"));
        escenariosBoton.setForeground(Paleta.getPlanoSecundario());
        escenariosBoton.setBackground(Paleta.getFondoSecundario());

        personajesBoton = new MiBoton();
        personajesBoton.setText("PERSONAJES");
        personajesBoton.setIcon(new ImageIcon("./src/assets/personaje.png"));
        personajesBoton.setForeground(Paleta.getPlanoSecundario());
        personajesBoton.setBackground(Paleta.getFondoSecundario());

        ayudaBoton = new MiBotonIcono();
        ayudaBoton.setIcon(new ImageIcon("./src/assets/ayuda.png"));
        ayudaBoton.setForeground(Paleta.getPlanoSecundario());
        ayudaBoton.setBackground(Paleta.getFondoSecundario());

        infoBoton = new MiBotonIcono();
        infoBoton.setIcon(new ImageIcon("./src/assets/info.png"));
        infoBoton.setForeground(Paleta.getPlanoSecundario());
        infoBoton.setBackground(Paleta.getFondoSecundario());

        ajustesBoton = new MiBotonIcono();
        ajustesBoton.setIcon(new ImageIcon("./src/assets/ajustes.png"));
        ajustesBoton.setForeground(Paleta.getPlanoSecundario());
        ajustesBoton.setBackground(Paleta.getFondoSecundario());

        salirBoton = new MiBotonIcono();
        salirBoton.setIcon(new ImageIcon("./src/assets/salir.png"));
        salirBoton.setForeground(Paleta.getPlanoSecundario());
        salirBoton.setBackground(Paleta.getFondoSecundario());

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

    public void crearEncabezadoPanel() {
        encabezadoPanel = new JPanel();
        encabezadoPanel.setBorder(new EmptyBorder(32, 0, 0, 0));
        encabezadoPanel.setOpaque(false);

        encabezadoPanel.add(nombreEtiqueta);
    }

    public void crearPrincipalPanel() {
        principalPanel = new JPanel();
        principalPanel.setLayout(new BoxLayout(principalPanel, BoxLayout.X_AXIS));
        principalPanel.setOpaque(false);

        principalPanel.add(Box.createHorizontalGlue());
        principalPanel.add(playBoton);
        principalPanel.add(Box.createHorizontalGlue());
    }

    private void crearBarraAccionesPanel() {
        barraAccionesPanel = new JPanel();
        barraAccionesPanel.setLayout(new BoxLayout(barraAccionesPanel, BoxLayout.X_AXIS));
        barraAccionesPanel.setBorder(new EmptyBorder(0, 8, 8, 8));
        barraAccionesPanel.setOpaque(false);

        accionesPanel = new JPanel();
        accionesPanel.setLayout(new BoxLayout(accionesPanel, BoxLayout.X_AXIS));
        accionesPanel.setOpaque(false);

        accionesPanel.add(comenzarBoton);
        accionesPanel.add(Box.createRigidArea(new Dimension(8, 0)));
        accionesPanel.add(escenariosBoton);
        accionesPanel.add(Box.createRigidArea(new Dimension(8, 0)));
        accionesPanel.add(personajesBoton);

        opcionesPanel = new JPanel();
        opcionesPanel.setLayout(new BoxLayout(opcionesPanel, BoxLayout.X_AXIS));
        opcionesPanel.setOpaque(false);

        opcionesPanel.add(ayudaBoton);
        opcionesPanel.add(Box.createRigidArea(new Dimension(8, 0)));
        opcionesPanel.add(infoBoton);
        opcionesPanel.add(Box.createRigidArea(new Dimension(8, 0)));
        opcionesPanel.add(ajustesBoton);
        opcionesPanel.add(Box.createRigidArea(new Dimension(8, 0)));
        opcionesPanel.add(salirBoton);

        barraAccionesPanel.add(accionesPanel);
        barraAccionesPanel.add(Box.createHorizontalGlue());
        barraAccionesPanel.add(opcionesPanel);

    }

    public static void main(String[] args) {
        PrincipalVista vista = new PrincipalVista();
        PrincipalControlador controlador = new PrincipalControlador(vista);
        vista.setVisible(true);
        // TODO code application logic here
    }
}

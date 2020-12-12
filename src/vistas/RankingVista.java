/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import modelos.Persona;
import ui.MiBoton;
import ui.ModeloTabla;
import ui.Paleta;

/**
 *
 * @author aries
 */
public class RankingVista extends JFrame {

    private JPanel generalPanel;
    public JPanel encabezadoPanel;
    public JPanel principalPanel;
    public JPanel barraAccionesPanel;

    public JLabel tituloEtiqueta;
    public JTable listaTabla;
    public JButton cerrarBoton;
    public List<Persona> personas;

    public RankingVista() {
        this.setSize(540, 320);
        personas = new ArrayList<>();
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        tituloEtiqueta = new JLabel("Avoiding Covid-19");
        Font font = new Font("Roboto", Font.BOLD, 24);
        tituloEtiqueta.setFont(font);
        tituloEtiqueta.setForeground(Paleta.getPlano());

        Persona per1 = new Persona("Sam", "Masculino", 50);

        personas.add(per1);
        System.out.println("prueba");
        ModeloTabla mtp = new ModeloTabla(personas);
        listaTabla = new JTable();
        listaTabla.setModel(mtp);
        listaTabla.setForeground(Paleta.getPlano());
        listaTabla.setBackground(Paleta.getFondoSuperficie());

        cerrarBoton = new MiBoton();
        cerrarBoton.setText("CERRAR");
        cerrarBoton.setForeground(Paleta.getPlanoPrimario());
        cerrarBoton.setBackground(Paleta.getFondoSuperficie());

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
        principalPanel.setLayout(new BoxLayout(principalPanel, BoxLayout.X_AXIS));
        principalPanel.setOpaque(false);

        principalPanel.add(Box.createHorizontalStrut(30));
        principalPanel.add(new JScrollPane(listaTabla));
        principalPanel.add(Box.createHorizontalStrut(30));
    }

    private void crearBarraAccionesPanel() {
        barraAccionesPanel = new JPanel();
        barraAccionesPanel.setLayout(new BoxLayout(barraAccionesPanel, BoxLayout.X_AXIS));
        barraAccionesPanel.setBorder(new EmptyBorder(15, 8, 8, 8));
        barraAccionesPanel.setOpaque(false);

        barraAccionesPanel.add(Box.createHorizontalGlue());
        barraAccionesPanel.add(cerrarBoton);
    }
}

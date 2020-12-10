/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import modelos.EscenarioCreador;
import modelos.Perfil;
import ui.Paleta;

import vistas.EscenariosVista;

/**
 *
 * @author fernandomonjav
 */
public class EscenariosControlador implements ActionListener {

    public EscenariosVista vista;
    public List<JPanel> escenario = new ArrayList();
    public JLabel label;
    public int opc;

    public EscenariosControlador(EscenariosVista vista) {
        this.vista = vista;

        vista.aceptarBoton.addActionListener(this);
        vista.cerrarBoton.addActionListener(this);

        this.vista.setLocationRelativeTo(null);

        escenario.add(crearEscenario(1, "Trabajo", "/assets/escenarios/trabajo/prevista.png"));
        escenario.add(crearEscenario(2, "Hospital", "/assets/escenarios/trabajo/prevista.png"));
        escenario.add(crearEscenario(3, "Comisaria", "/assets/escenarios/trabajo/prevista.png"));

        for (int i = 0; i < escenario.size(); i++) {
            this.vista.principalPanel.add(this.escenario.get(i));
        }
        vista.setVisible(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "aceptar":
                System.out.println("Aceptar");

                Perfil.gePerfil().setEscenario(new EscenarioCreador().crearTipo(opc + 1));
                Perfil.gePerfil().setNivel(opc + 1);
                this.vista.setVisible(false);
                break;
            case "cerrar":
                System.out.println("Cerrar");
                this.vista.setVisible(false);
                break;
            case "Trabajo":
                System.out.println("Trabajo");
                for (int i = 0; i < escenario.size(); i++) {
                    label = (JLabel) escenario.get(i).getClientProperty(i + 1);
                    label.setForeground(Color.WHITE);
                    if (i == 0) {
                        label.setForeground(Paleta.getFondoSecundario());
                        opc = i;
                    }
                }
                break;
            case "Hospital":
                System.out.println("Hospital");
                for (int i = 0; i < escenario.size(); i++) {
                    label = (JLabel) escenario.get(i).getClientProperty(i + 1);
                    label.setForeground(Color.WHITE);
                    if (i == 1) {
                        label.setForeground(Paleta.getFondoSecundario());
                        opc = i;
                    }
                }
                break;
            case "Comisaria":
                System.out.println("Comisaria");
                for (int i = 0; i < escenario.size(); i++) {
                    label = (JLabel) escenario.get(i).getClientProperty(i + 1);
                    label.setForeground(Color.WHITE);
                    if (i == 2) {
                        label.setForeground(Paleta.getFondoSecundario());
                        opc = i;
                    }
                }
                break;
        }
    }

    public JPanel crearEscenario(int id, String nombre, String rutaImagen) {
        JPanel escenarioPanel = new JPanel();
        escenarioPanel.setLayout(new BoxLayout(escenarioPanel, BoxLayout.Y_AXIS));
        escenarioPanel.setOpaque(false);

        ImageIcon imagen = new ImageIcon(getClass().getResource(rutaImagen));

        JRadioButton imagenRadioBoton = new JRadioButton(imagen);
        imagenRadioBoton.setSize(200, 200);
        imagenRadioBoton.setActionCommand(nombre);
        imagenRadioBoton.setOpaque(false);

        JLabel nombreEtiqueta = new JLabel(nombre);
        nombreEtiqueta.setFont(new Font("Artial", Font.BOLD, 16));
        nombreEtiqueta.setForeground(Paleta.getPlano());

        imagenRadioBoton.addActionListener(this);

        escenarioPanel.add(imagenRadioBoton);
        escenarioPanel.add(nombreEtiqueta);

        escenarioPanel.putClientProperty(id, nombreEtiqueta);

        return escenarioPanel;
    }
}

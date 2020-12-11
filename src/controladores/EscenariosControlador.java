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
import modelos.Item;
import modelos.ItemLista;
import modelos.Iterador;
import modelos.Perfil;
import ui.Paleta;

import vistas.EscenariosVista;

/**
 *
 * @author fernandomonjav
 */
public class EscenariosControlador implements ActionListener {

    public EscenariosVista vista;
    public List<JPanel> escenarios = new ArrayList();
    public JLabel label;
    public int opc;
    ItemLista itemLista;

    public EscenariosControlador(EscenariosVista vista) {
        this.vista = vista;

        vista.aceptarBoton.addActionListener(this);
        vista.cerrarBoton.addActionListener(this);

        this.vista.setLocationRelativeTo(null);

        obtenerEscenarios();
        crearEscenarios();

        vista.setVisible(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "aceptar":
                System.out.println("Aceptar");
                Perfil perfil = Perfil.gePerfil();
                perfil.setEscenarioId(opc);
                perfil.setNivel(opc);
                this.vista.setVisible(false);
                break;
            case "cerrar":
                System.out.println("Cerrar");
                this.vista.setVisible(false);
                break;
            case "Trabajo":
                System.out.println("Trabajo");
                seleccionarEscenario(1);
                break;
            case "Hospital":
                System.out.println("Hospital");
                seleccionarEscenario(2);
                break;
            case "Comisaria":
                System.out.println("Comisaria");
                seleccionarEscenario(3);
                break;
        }
    }

    public void seleccionarEscenario(int pos) {

        Iterador iterador = itemLista.iterador();

        while (iterador.hasNext()) {
            iterador.next();
            int i = iterador.size();

            label = (JLabel) escenarios.get(i - 1).getClientProperty(i);
            label.setForeground(Color.WHITE);

            if (i == pos) {
                label.setForeground(Paleta.getFondoSecundario());
                opc = i;
            }
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

    public void obtenerEscenarios() {
        itemLista = new ItemLista("escenarios");
        itemLista.agregar(new Item(1, "Trabajo", "", "/assets/escenarios/trabajo/prevista.png"));
        itemLista.agregar(new Item(2, "Hospital", "", "/assets/escenarios/hospital/prevista.png"));
        itemLista.agregar(new Item(3, "Comisaria", "", "/assets/escenarios/comisaria/prevista.png"));
    }

    public void crearEscenarios() {
        Iterador iterador = itemLista.iterador();

        while (iterador.hasNext()) {
            Item item = (Item) iterador.next();

            JPanel escenarioPanel = crearEscenario(item.getId(), item.getNombre(), item.getRutaImagen());
            this.escenarios.add(escenarioPanel);
            this.vista.principalPanel.add(escenarioPanel);
        }
    }
}

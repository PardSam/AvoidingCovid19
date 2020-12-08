/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import ui.Paleta;

import vistas.EscenariosVista;

/**
 *
 * @author fernandomonjav
 */
public class EscenariosControlador implements ActionListener {

    private EscenariosVista vista;

    public EscenariosControlador(EscenariosVista vista) {
        this.vista = vista;

        vista.aceptarBoton.addActionListener(this);
        vista.cerrarBoton.addActionListener(this);

        
         this.vista.setLocationRelativeTo(null);
        
       
        this.vista.principalPanel.add(crearEscenario("trabajo", "Trabajo", "./src/assets/escenarios/trabajo/prevista.png"));
        this.vista.principalPanel.add(crearEscenario("comisaria", "Comisaria", "./src/assets/escenarios/comisaria/prevista.png"));
        this.vista.principalPanel.add(crearEscenario("hospital", "Hospital", "./src/assets/escenarios/hospital/prevista.png"));
        
        vista.setVisible(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "aceptar":
                System.out.println("Aceptar");
                break;
            case "cerrar":
                System.out.println("Cerrar");
                this.vista.setVisible(false);
                break;

        }
    }

    public JPanel crearEscenario(String id, String nombre, String rutaImagen) {
        JPanel escenarioPanel = new JPanel();
        escenarioPanel.setLayout(new BoxLayout(escenarioPanel, BoxLayout.Y_AXIS));
        escenarioPanel.setOpaque(false);

        ImageIcon imagen = new ImageIcon(rutaImagen);

        JLabel imagenEtiqueta = new JLabel(imagen);
        imagenEtiqueta.setSize(200, 200);

        JLabel nombreEtiqueta = new JLabel(nombre);
        nombreEtiqueta.setFont(new Font("Artial", Font.BOLD, 16));
        nombreEtiqueta.setForeground(Paleta.getPlano());

        escenarioPanel.add(imagenEtiqueta);
        escenarioPanel.add(nombreEtiqueta);

        return escenarioPanel;
    }
}

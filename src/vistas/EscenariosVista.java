/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author fernandomonjav
 */
public class EscenariosVista extends JFrame {

    public JLabel tituloEtiqueta;
    public JButton aceptarBoton;
    public JButton cerrarBoton;

    public EscenariosVista() {
        setSize(540, 320);

        inicializarComponentes();
    }

    public void inicializarComponentes() {
        // Crear las etiquetas
        tituloEtiqueta = new JLabel("ESCENARIOS");
        
        // Crear los botones
        aceptarBoton = new JButton("Aceptar");
        cerrarBoton = new JButton("Cerrar");

        // Establecer acciones de comando a los botones
        aceptarBoton.setActionCommand("aceptar");
        cerrarBoton.setActionCommand("cerrar");

        Container contenedor = getContentPane();
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.X_AXIS));

        // Agregar las etiquetas al contenedor
        contenedor.add(tituloEtiqueta);
        
        // Agregar los botones al contenedor
        contenedor.add(aceptarBoton);
        contenedor.add(cerrarBoton);
    }
}

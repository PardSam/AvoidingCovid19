/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladores.AcercaControlador;
import controladores.AjustesControlador;
import controladores.AyudaControlador;
import controladores.PrincipalControlador;


/**
 *
 * @author fernandomonjav
 */
public class AvoidCovid19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PrincipalVista vista = new PrincipalVista();
        //PrincipalControlador controlador = new PrincipalControlador(vista);
        // TODO code application logic here
        AjustesVista ajustes = new AjustesVista();
        AjustesControlador controladorAjuste = new AjustesControlador(ajustes);
        
        //AcercaVista acerca = new AcercaVista();
        //AcercaControlador controladorAcerca = new AcercaControlador(acerca);
        
        //AyudaVista ayuda = new AyudaVista();
        //AyudaControlador controladorayuda = new AyudaControlador(ayuda);
    
    }

}

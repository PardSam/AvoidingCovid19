/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladores.PrincipalControlador;
import modelos.Juego;


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
        Juego juego = new Juego();
        juego.ejecutarJuego();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 * Se encarga de crear un escenario.
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public abstract class EscenarioCreadorAbstracto {

    final int TRABAJO = 1;
    final int HOSPITAL = 2;
    final int COMISARIA = 3;

    public abstract Escenario crearTipo(int tipo);
}

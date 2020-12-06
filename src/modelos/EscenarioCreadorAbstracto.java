/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author aries
 */
public abstract class EscenarioCreadorAbstracto {

    final int TRABAJO = 1;
    final int HOSPITAL = 2;
    final int COMISARIA = 3;

    public abstract Escenario crearTipo(int tipo);
}

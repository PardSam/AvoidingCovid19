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

    public final int TRABAJO = 1;
    public final int HOSPITAL = 2;
    public final int COMISARIA = 3;

    public abstract Escenario crearTipo(int tipo);
}

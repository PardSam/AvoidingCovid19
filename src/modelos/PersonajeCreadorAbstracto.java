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
public abstract class PersonajeCreadorAbstracto {
    private final int CIVIL=1;
    private final int DOCTOR=1;
    private final int POLICIA=1;
    public abstract Personaje crear(int tipo);
}

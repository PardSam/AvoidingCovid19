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

    final int CIVIL = 1;
    final int DOCTOR = 2;
    final int POLICIA = 3;

    public abstract Personaje crear(int tipo);
}

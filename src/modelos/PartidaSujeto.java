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
public abstract class PartidaSujeto implements IPartidaObservador {

    public abstract void agregar(IPartidaObservador observador);

    public abstract void remover(IPartidaObservador observador);

    @Override
    public abstract void notificar();
}

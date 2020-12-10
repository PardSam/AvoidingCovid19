/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author aries
 * @param <E>
 */
public interface Iterador<E extends Object> {

    public abstract boolean hasNext();

    public abstract E next();
    
    public abstract int size();
}

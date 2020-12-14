/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;


/**
 * Clase que define las operaciones.
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 * @param <E> Lista de objetos
 */
public interface Iterador<E extends Object> {

    public abstract boolean hasNext();

    public abstract E next();
    
    public abstract int size();
}

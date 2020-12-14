/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.List;

/**
 *  Implementa las operaciones definidas en la clase iterador
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public class ItemIterator implements Iterador<Item> {

    private List<Item> items;
    private int posicion = 0;
    /**
     * Constructor de los ítems  
     * @param items Lista de items
     */
    public ItemIterator(List<Item> items) {
        this.items = items;
    }
    /**
     * Verifican la posicion del item
     * @return Boleeano con la posicion del item
     */
    @Override
    public boolean hasNext() {
        if (items.size() > posicion) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * Direcciona al siguiente item 
     * @return posicion
     */
    @Override
    public Item next() {
        Item i = this.items.get(posicion);
        posicion++;
        return i;
    }
    /**
     * Retorna la posición  
     * @return La posicion del iterador
     */
    @Override
    public int size() {
        return posicion;
    }
}

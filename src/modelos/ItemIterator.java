/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.List;

/**
 *
 * @author fernandomonjav
 */
public class ItemIterator implements Iterador<Item> {

    private List<Item> items;
    private int posicion = 0;

    public ItemIterator(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (items.size() > posicion) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Item next() {
        Item i = this.items.get(posicion);
        posicion++;
        return i;
    }

    @Override
    public int size() {
        return posicion;
    }
}

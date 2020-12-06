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
public class ItemIterator implements Iterador {

    private List<Item> ItemList;

    public ItemIterator() {

    }

    @Override
    public boolean hasnext() {
        return true;//Cambiar
    }

    @Override
    public Item next() {
        return new Item();//Cambiar
    }
}

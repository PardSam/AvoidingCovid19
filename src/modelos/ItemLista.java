/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aries
 */
public class ItemLista {

    private final List<Item> itemLista = new ArrayList<>();
    private String nombreLista;

    public ItemLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void agregar(Item item) {
        itemLista.add(item);
    }

    public ItemIterator iterador() {
        return new ItemIterator(itemLista);
    }
}

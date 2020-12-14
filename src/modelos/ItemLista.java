/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase con una lista de item.
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public class ItemLista {

    private final List<Item> itemLista = new ArrayList<>();
    private String nombreLista;
    /**
     * Se establece el nombre de la lista item
     * @param nombreLista Nombre Item
     */
    public ItemLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }
    /**
     * Obtiene el nombre del Item
     * @return Nombre del Item
     */
    public String getNombreLista() {
        return nombreLista;
    }
    /**
     * Agrega otro item a la lista
     * @param item Adicionar item
     */
    public void agregar(Item item) {
        itemLista.add(item);
    }
    /**
     * Retorna el ItemIterator para la lista   
     * @return Nuevo Item Iterador
     */
    public ItemIterator iterador() {
        return new ItemIterator(itemLista);
    }
}

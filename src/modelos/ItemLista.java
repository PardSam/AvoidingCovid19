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
public class ItemLista {

    private String nombreLista;

    public ItemLista() {

    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void agregar() {

    }

    public ItemIterator iterador() {
        return new ItemIterator(); // cambiar
    }
}

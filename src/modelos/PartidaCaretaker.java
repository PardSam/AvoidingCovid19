/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 * descripcion
 * @version 13/12/2020/A*@version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public class PartidaCaretaker {

    private List<PartidaMemento> estados = new ArrayList<>();
/**
 * metodo para agregar un estado a la lista
 * @param estado 
 */
    public void agregarMemento(PartidaMemento estado) {
        estados.add(estado);
    }
/**
 * funcion que devuelve un estado segun un indice pasado por parametro
 * @param indice
 * @return 
 */
    public PartidaMemento getMemento(int indice) {
        if (indice < estados.size()) {
            return estados.get(indice);
        }

        return null;

    }
/**
 * devuelve la lista de estados
 * @return 
 */
    public List<PartidaMemento> getEstados() {
        return estados;
    }
/**
 * asigna una lista de estados que es pasado por parametro
 * @param estados 
 */
    public void setEstados(List<PartidaMemento> estados) {
        this.estados = estados;
    }

}

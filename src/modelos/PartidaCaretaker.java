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
public class PartidaCaretaker {

    private List<PartidaMemento> estados = new ArrayList<>();

    public void agregarMemento(PartidaMemento estado) {
        estados.add(estado);
    }

    public PartidaMemento getMemento(int indice) {
        if (indice < estados.size()) {
            return estados.get(indice);
        }

        return null;

    }

    public List<PartidaMemento> getEstados() {
        return estados;
    }

    public void setEstados(List<PartidaMemento> estados) {
        this.estados = estados;
    }

}

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
public abstract class PartidaSujeto  {

    protected List<IPartidaObservador> listaObservadores = new ArrayList<>();

    public  void agregar(IPartidaObservador observador){
        listaObservadores.add(observador);
    }

    public  void remover(IPartidaObservador observador){
        listaObservadores.remove(observador);
    }


    public  void notificar(){
        for (int i = 0; i < listaObservadores.size(); i++) {
            listaObservadores.get(i).notificar();
        }
    }
}

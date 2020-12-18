package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 * descripcion
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
 */
public abstract class PartidaSujeto {

    protected List<IPartidaObservador> listaObservadores = new ArrayList<>();

    /**
     * Funcion para agegar un observador
     *
     * @param observador parametro que da las caracteristicas de observador
     */
    public void agregar(IPartidaObservador observador) {
        listaObservadores.add(observador);
    }

    /**
     * Funcion para remover un observador
     *
     * @param observador parametro que quita de observador
     */
    public void remover(IPartidaObservador observador) {
        listaObservadores.remove(observador);
    }

    /**
     * Funcion para notificar a los observadores
     */

    public void notificar() {
        for (int i = 0; i < listaObservadores.size(); i++) {
            listaObservadores.get(i).notificar();
        }
    }
}

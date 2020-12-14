package modelos;

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
public class PartidaMemento {
    private Partida estado;
/**
 * metodo que asigna la partida de un parametro estado
 * @param estado 
 */
    public PartidaMemento(Partida estado) {
        this.estado = estado;
    }
    /**
     * devuelve el estado
     * @return 
     */
    public Partida getEstadoGuardado() {
        return estado;
    }
}

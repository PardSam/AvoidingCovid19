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
public class ObstaculoNegativoEstado implements IObstaculoEstado {
    /**
     * Funcion que determina si exite coolcion entre los objetos del juego y disminuir vida al personaje
     * @param partida parametro que nos a acceso a los objetos que pueden colisionar
     */
    @Override
    public void colisionar(Partida partida) {
        if (partida.getDefensa() > 0) {
            partida.setDefensa(partida.getDefensa() - 1);        
        }else if(partida.getDefensa() == 0 && partida.getProteccion()>0){
            partida.setProteccion(partida.getProteccion() - 1);
        }
    }

}

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
public class ObstaculoPositivoEstado implements IObstaculoEstado {
    
    /**
     * Funcion que determina si exite coolcion entre los objetos del juego y aumentar vida al personaje
     * @param partida parametro que nos a acceso a los objetos que pueden colisionar
     */
    @Override
    public void colisionar(Partida partida) {
        if (partida.getProteccion() >= 0 && partida.getProteccion() < 3) {
            partida.setProteccion(partida.getProteccion() + 1);
        } else if (partida.getDefensa() >= 0 && partida.getDefensa() < 3) {
            partida.setDefensa(partida.getDefensa() + 1);
        }
    }

}

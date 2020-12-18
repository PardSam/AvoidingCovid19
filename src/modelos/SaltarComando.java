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
public class SaltarComando implements IComando {

    private Partida partida;
/**
 * constructor que asigna un valor  a la partida
 * @param partida 
 */
    public SaltarComando(Partida partida) {
        this.partida = partida;
    }
/**
 * metodo que sirve para que el personaje salte
 */
    @Override
    public void ejecutar() {
        partida.getPersonaje().saltar();
    }

}

package modelos;

/**
 *Es una clase abstracta que define la estructura mínima de
 *un Decorador.
 *@version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public abstract class AmbientePartidaDecorador extends Escenario{
    private Escenario decorado;

    public AmbientePartidaDecorador(Escenario decorado) {
        this.decorado = decorado;
    }
    /**
     * Obtener  escenario decorado
     * @return Escenario 
     */
    public Escenario getDecorado() {
        return decorado;
    }
    /**
     * Establece el escenario decorado
     * @param decorado  Decora al escenario 
     */
    public void setDecorado(Escenario decorado) {
        this.decorado = decorado;
    }
    
}

package modelos;

/**
 * Se encarga de crear un escenario.
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
 */
public abstract class EscenarioCreadorAbstracto {

    /**
     * variables finales para la creación de escenario
     */
    final int TRABAJO = 1;
    final int HOSPITAL = 2;
    final int COMISARIA = 3;

    public abstract Escenario crearTipo(int tipo);
}

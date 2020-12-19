package modelos;

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
public abstract class PersonajeCreadorAbstracto {

    final int CIVIL = 1;
    final int DOCTOR = 2;
    final int POLICIA = 3;

    /**
     * Funcion para crear un personaje segun el tipo establecio
     *
     * @param tipo parametro que indica que tipo de personaje se crea
     * @return un personaje
     */
    public abstract Personaje crear(int tipo);
}

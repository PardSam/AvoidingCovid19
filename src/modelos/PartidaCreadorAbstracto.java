package modelos;

/**
 * descripcion
 *
 * @version 18/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 */
public abstract class PartidaCreadorAbstracto {

    final int TRABAJO = 1;
    final int HOSPITAL = 2;
    final int COMISARIA = 3;

    /**
     * Funcion para crear una partida segun el tipo establecio
     *
     * @param tipo parametro que indica que tipo de partida se crea
     * @return una partida
     */
    public abstract Partida crear(int tipo);
}

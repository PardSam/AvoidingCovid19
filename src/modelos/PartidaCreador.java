package modelos;

/**
 * descripcion
 *
 * @version 18/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 */
public class PartidaCreador extends PartidaCreadorAbstracto {

    public PartidaCreador() {

    }

    /**
     * Funcion para crear la partida
     *
     * @param tipo parametro que indica que tipo de partida se crea
     * @return la partida creada
     */
    @Override
    public Partida crear(int tipo) {
        Partida objeto;
        switch (tipo) {
            case TRABAJO:
                objeto = new TrabajoPartida();
                break;
            case HOSPITAL:
                objeto = new HospitalPartida();
                break;
            case COMISARIA:
                objeto = new ComisariaPartida();
                break;
            default:
                objeto = new TrabajoPartida();
        }
        return objeto;
    }

}

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
public class PersonajeCreador extends PersonajeCreadorAbstracto {

    public PersonajeCreador() {

    }

    /**
     * Funcion para crear al personaje
     *
     * @param tipo parametro que indica que tipo de personaje se crea
     * @return el personaje creado
     */
    @Override
    public Personaje crear(int tipo) {
        Personaje objeto;
        switch (tipo) {
            case CIVIL:
                objeto = new CivilPersonaje();
                break;
            case DOCTOR:
                objeto = new DoctorPersonaje();
                break;
            case POLICIA:
                objeto = new PoliciaPersonaje();
                break;
            default:
                objeto = new CivilPersonaje();
        }
        return objeto;
    }

}

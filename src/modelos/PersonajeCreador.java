/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author aries
 */
public class PersonajeCreador extends PersonajeCreadorAbstracto {

    public PersonajeCreador() {

    }

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
                objeto = null;
        }
        return objeto;
    }

}

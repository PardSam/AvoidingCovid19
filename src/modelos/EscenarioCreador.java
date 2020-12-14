/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 * Representa una implementación concreta de la clase Escenario
 *@version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */

public class EscenarioCreador extends EscenarioCreadorAbstracto {
    /**
     * Constructor vacío 
     */
    public EscenarioCreador() {

    }
    /**
     * Crea un escenario según el tipo indicado.
     * @param tipo Establece el tipo de escenario
     * @return Objeto escenario
     */
    @Override
    public Escenario crearTipo(int tipo) {
        Escenario objeto;
        switch (tipo) {
            case TRABAJO:
                objeto = new TrabajoEscenario();
                break;
            case HOSPITAL:
                objeto = new HospitalEscenario();
                break;
            case COMISARIA:
                objeto = new ComisariaEscenario();
                break;
            default:
                objeto = null;
        }        
        return objeto;
    }
}

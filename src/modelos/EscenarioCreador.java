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
public class EscenarioCreador extends EscenarioCreadorAbstracto {

    public EscenarioCreador() {

    }

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

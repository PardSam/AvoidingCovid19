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
public class ControlInvocador {
    private IComando comando;

    public ControlInvocador(IComando comando) {
        this.comando = comando;
    }
    
    public void run(){
        this.comando.ejecutar();
    }
}

package modelos;

/**
 * Representa la acción que dispara un comando.
  *@version 09/12/2020/A
 * @author Sanchez Pardo
 * @author  Monja Vasquez
 * @author  More Villegas
 * @author  Diaz Coronado, 
 * @author  Gonzales Cubas,
 * @author  Ugaz Arenas.
 */
public class ControlInvocador {
    private IComando comando;
/**
 * Establecer un comando
 * @param comando  Agrega el comando
 */
    public ControlInvocador(IComando comando) {
        this.comando = comando;
    }
        /**
     * Ejecuta el comando
     */
    public void run(){
        this.comando.ejecutar();
    }
}

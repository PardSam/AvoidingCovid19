/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Fernando
 */
public class ObstaculoPositivoEstado implements IObstaculoEstado {

    @Override
    public void colisionar(Partida partida) {
        if (partida.getProteccion() >= 0 && partida.getProteccion() < 3) {
            partida.setProteccion(partida.getProteccion() + 1);
        } else if (partida.getDefensa() >= 0 && partida.getDefensa() < 3) {
            partida.setDefensa(partida.getDefensa() + 1);
        }
    }

}

package ui;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelos.Jugador;

/**
 * Modelo de la tabla extendido de AbstractTableModel
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
 */
public class ModeloTabla extends AbstractTableModel {

    String[] columnas = {"Nombre", "Genero", "Score"};
    List<Jugador> personas;

    /**
     * Constructor
     */
    public ModeloTabla(List<Jugador> personas) {
        this.personas = personas;
    }

    /**
     * Número de filas
     *
     * @return personas.size filas
     */
    @Override
    public int getRowCount() {
        return personas.size();
    }

    /**
     * Número de columnas
     *
     * @return columnas.length columnas
     */
    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    /**
     * Nombre la columna
     *
     * @param column numero
     * @return colum Nombre
     */
    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    /**
     * Valor intersección fila columna
     *
     * @param rowIndex fila
     * @param columnIndex fila
     * @return columna una columna
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String columna = "";
        Jugador persona = (Jugador) personas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                columna = persona.getNombres();
                break;
            case 1:
                columna = persona.getGenero();
                break;
            case 2:
                columna = String.valueOf(persona.getScore());
                break;
        }
        return columna;
    }

    /**
     * Elimina un campo
     *
     * @param rowIndex fila
     */
    public void eliminar(int rowIndex) {
        personas.remove(rowIndex);
    }

    /**
     * Actualiza la tabla
     *
     * @param rowIndex fila
     * @param p jugador
     */
    public void actualizar(int rowIndex, Jugador p) {
        personas.remove(rowIndex);
        personas.add(rowIndex, p);
    }
}

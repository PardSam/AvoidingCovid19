/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelos.Persona;

/**
 *
 * @author aries
 */
public class ModeloTabla extends AbstractTableModel{
    String [] columnas = {"Nombre","Genero","Score"};    
    List<Persona> personas;
    
    public ModeloTabla(List<Persona> personas) {
        this.personas = personas;
    }
    
    @Override
    public int getRowCount() {
        return personas.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }
   @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       String columna = "";
    Persona persona = (Persona) personas.get(rowIndex);
    switch(columnIndex){
        case 0: columna = persona.getNombres();
        break;
        case 1: columna = persona.getGenero();
        break;
        case 2: columna = String.valueOf(persona.getScore());
        break;
     }
        return columna;  
    }
    public void eliminar(int rowIndex){
       personas.remove(rowIndex);
    }
    
   public void actualizar(int rowIndex,Persona p){
        personas.remove(rowIndex);
        personas.add(rowIndex, p);
    }  
}

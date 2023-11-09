/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Arreglos.Tabla;

import Modelo.Persona;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Victor
 */
public class ModeloTablaPersona extends AbstractTableModel {

    private Persona personas[];

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    @Override
    public int getRowCount() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return personas.length;
    }

    @Override
    public int getColumnCount() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return 5;
    }

    @Override
    public Object getValueAt(int i, int i1) {

        Persona p = personas[i];

        switch (i1) {
            case 0:
                return (p != null) ? p.getTipoIde() : "";
            case 1:
                return (p != null) ? p.getDNI() : "";
            case 2:
                return (p != null) ? p.getNombre() : "";
            case 3:
                return (p != null) ? p.getApellido() : "";
            case 4:
                return (p != null) ? p.getDireccion() : "";

            default:
                return null;

        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Tipo identificacion";
            case 1:
                return "Numero identidicacion";
            case 2:
                return "Nombre";
            case 3:
                return "Apellido";
            case 4:
                return "Direccion";

            default:
                return null;

        }
    }
}

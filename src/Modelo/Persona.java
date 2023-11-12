/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Victor
 */
public class Persona {
    private Integer Id_Persona;
    private String TipoDNI;
    private String DNI;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private Rol id_rol;

    public Integer getId_Persona() {
        return Id_Persona;
    }

    public void setId_Persona(Integer Id_Persona) {
        this.Id_Persona = Id_Persona;
    }

    public String getTipoDNI() {
        return TipoDNI;
    }

    public void setTipoDNI(String TipoDNI) {
        this.TipoDNI = TipoDNI;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Rol getId_rol() {
        return id_rol;
    }

    public void setId_rol(Rol id_rol) {
        this.id_rol = id_rol;
    }
    
    @Override
    public String toString() {
        return "Id_Persona: " + Id_Persona + ", Tipo DNI: " + TipoDNI + ", Numero DNI: " + DNI + ", Nombre: " + Nombre + ", Apellido: " + Apellido + ", Direccion: " + Direccion + ", Rol: " + id_rol +"\n";
    }
    
}

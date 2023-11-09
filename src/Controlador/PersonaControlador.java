/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Persona;

/**
 *
 * @author Victor
 */
public class PersonaControlador {
    private Persona persona;
    private Persona[] personas;
    
    public PersonaControlador(Integer tamanio) {
        this.personas = new Persona[tamanio];
    }
    
    //metodo que permite guardar
    public Boolean Guardar(){
        Integer pos = VerificarPosicion();
        if (pos > -1) {
            persona.setId_Persona(pos + 1);
            personas[VerificarPosicion()] = persona;
            return true;
        } else {
            return false;
        }
    }
    
//    public Boolean Verificar(){
//        Boolean band = false;
//        
//        for(int i=0; i < this.personas.length; i++){
//            if(this.personas[i] !=null){
//                band = true;
//                break;
//            }
//        }
//        return band;
//    }
    
    public Integer VerificarPosicion(){
        
        Integer band = -1;
        
        for(int i=0; i < this.personas.length; i++){
            if(this.personas[i] ==null){
                band = i;
                break;
            }
        }
        return band;
    }
    
    public void Imprimir(){
        for(int i = 0 ;i > this.getPersonas().length; i++){
            System.out.println(getPersonas()[i]);
        }
    }
    
     public Persona getPersona() {
        if(persona == null){
            persona = new Persona();
        }
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "DNI: " + getPersona().getDNI() + " Apellidos: " + getPersona().getApellido() + " Nombres: " + getPersona().getNombre();
    }
    
}

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
    private Persona[] MatrizPersona;
    
    public PersonaControlador(Integer tamanio) {
        this.MatrizPersona = new Persona[tamanio];
    }
    
    //metodo que permite guardar
    public Boolean Guardar(){
        Integer pos = VerificarPosicion();
        if (pos > -1) {
            persona.setId_Persona(pos + 1);
            MatrizPersona[VerificarPosicion()] = persona;
            return true;
        } 
        else {
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
        
        for(int i = 0; i < this.MatrizPersona.length; i++){
            if(this.MatrizPersona[i] == null){
                band = i;
                break;
            }
        }
        return band;
    }
    
    public void Imprimir() {
        for (int i = 0; i > this.getMatrizPersona().length; i++) {
            System.out.println(getMatrizPersona()[i]);
        }
    }

    public Persona getPersona() {
        if (persona == null) {
            persona = new Persona();
        }
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona ;
    }

    public Persona[] getMatrizPersona() {
        return MatrizPersona;
    }

    public void setMatrizPersona(Persona[] MatrizPersona) {
        this.MatrizPersona = MatrizPersona;
    }
    
//    @Override
//    public String toString() {
//        return "Id_Persona: "+ getPersona().getId_Persona() + "Tipo DNI: "+ getPersona().getTipoDNI()+"Numero DNI: " + getPersona().getDNI() + " Nombres: " + getPersona().getNombre()+ " Apellido: " + getPersona().getApellido()+"Direccion: "+ getPersona().getDireccion();
//    }
      
}

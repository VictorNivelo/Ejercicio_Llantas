/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Tda.listas;

import Controlador.Ecepciones.EstaVacia;
import javax.swing.JOptionPane;

/**
 *
 * @author Invitado xd
 */
public class ListaDinamica<E> {
    private Nodo<E> cabezera;
    private Nodo<E> ultimo;
    private Integer Longitud;

    public ListaDinamica() {
        cabezera = null;
        ultimo = null;
        Longitud = 0;
    }
    
    public Boolean EstaVacio(){
        return(cabezera == null || Longitud.intValue() == 0 );
    }
    
    private void AgregarCabeza(E info){
        Nodo<E> Ayuda;
        if(EstaVacio()){
            Ayuda = new Nodo<>(info);
            cabezera = Ayuda;
            ultimo = Ayuda;
            Longitud++;
        }
        else{
            Nodo<E> CabezaAyuda = cabezera;
            Ayuda = new Nodo<>(info, CabezaAyuda);
            cabezera = Ayuda;
            Longitud++;
        }
    }
    
    private void AgregarFinal(E info){
        Nodo<E> Ayuda;
        if(EstaVacio()){
            AgregarCabeza(info);
//            Ayuda = new Nodo<>(info);
//            cabezera = Ayuda;
//            ultimo = Ayuda;
//            Longitud++;
        }
        else{
            Ayuda = new Nodo<>(info, null);
            ultimo.setNext(Ayuda);
            ultimo = Ayuda;
            Longitud++;
        }
    }
    
    public void Agregar(E info){
        AgregarFinal(info);
    }
    
    private E ObtenerPrimero() throws EstaVacia{
        if(EstaVacio()){
            throw new EstaVacia("La lista esta vacia");
        }
        return cabezera.getInfo();
    }
    
    private E ObtenerUltimo() throws EstaVacia{
        if(EstaVacio()){
            throw new EstaVacia("La lista esta vacia");
        }
        return ultimo.getInfo();
    }
    
    public E ObtenerInfo(Integer indice)throws EstaVacia, IndexOutOfBoundsException{
        return ObtenerNodo(indice).getInfo();
    }
    
    private Nodo<E> ObtenerNodo(Integer indice)throws EstaVacia, IndexOutOfBoundsException{
        if(EstaVacio()){
            throw new EstaVacia("La lista esta vacia");
        }
        else if(indice.intValue() < 0 || indice.intValue() == Longitud){
            throw new IndexOutOfBoundsException("Fuera de nodo");
        }
        else if(indice.intValue() == 0){
            return cabezera;
        }
        else if(indice.intValue() == (Longitud -1)){
            return ultimo;
        }
        else{
            Nodo<E> Buscar = cabezera;
            int contador =0;
            while(contador < indice.intValue()){
                contador++;
                Buscar = Buscar.getNext();
            }
            return Buscar;
        }
    }
    
    public void Agregar (E info, Integer indice)throws EstaVacia{
        if(EstaVacio() || indice.intValue() == 0){
            AgregarCabeza(info);
        }
        else if(indice.intValue() == Longitud){
            AgregarFinal(info);
        }
        else{
            Nodo<E> BuscarPrevio = ObtenerNodo(indice - 1);
            Nodo<E> Buscar= ObtenerNodo(indice);
            Nodo<E> Ayuda = new Nodo<>(info, Buscar);
            BuscarPrevio.setNext(Ayuda);
            Longitud++;
        }
    }
    
    
}

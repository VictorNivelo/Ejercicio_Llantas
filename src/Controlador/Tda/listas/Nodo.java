/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Tda.listas;

/**
 *
 * @author Invitado xd
 */
public class Nodo<E> {

    private E info;
    private Nodo<E> Siguiente;

    public Nodo(E info) {
        this.info = info;
        Siguiente = null;

    }

    public Nodo(E info, Nodo<E> next) {
        this.info = info;
        this.Siguiente = next;

    }

    public Nodo() {
        Siguiente = null;
        info = null;

    }

    public E getInfo() {
        return info;
    }

    public void setInfo(E info) {
        this.info = info;
    }

    public Nodo<E> getNext() {
        return Siguiente;
    }

    public void setNext(Nodo<E> next) {
        this.Siguiente = next;
    }
}

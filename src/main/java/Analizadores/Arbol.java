package Analizadores;

import java.util.ArrayList;


public class Arbol{
    
    private String nombre;
    private NodoArbol cabeza;
    private Arbol next;
    
    
    public Arbol(String nombre,NodoArbol cabeza){
        this.nombre=nombre;
        this.cabeza=cabeza;
        this.next=null;
        
    }
    public String getNombre(){
        return this.nombre;
    }
    public NodoArbol getCabeza(){
        return this.cabeza;
    }
    public Arbol getNext(){
        return this.next;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setCabeza(NodoArbol nodo){
        this.cabeza=nodo;
    }
    public void setNext(Arbol next){
        this.next=next;
    }
    
    
    
    

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analizadores;

/**
 *
 * @author osmar
 */
public class Arboles {
    public Arbol cabeza;
    public Arbol body;
    
    public Arboles(){
        this.cabeza=null;
        this.body=null;
    }
    
    public void insertar(String nombre,NodoArbol nodoC){
        Arbol arbol=new Arbol(nombre,nodoC);
        if(this.cabeza==null){
            this.cabeza=arbol;
            this.body=arbol;
        }else{
            this.body.setNext(arbol);
            this.body=arbol;
        }
    }
    
    public void mostrar(){
        Arbol temp=this.cabeza;
        while(temp!=null){
            System.out.println(temp.getNombre());
            mostrarArbol(temp.getCabeza());
            System.out.println("");
            temp=temp.getNext();
        }
    }
    
    public void mostrarArbol(NodoArbol nodo){
        if(nodo.getIzq()!=null){
            mostrarArbol(nodo.getIzq());
        }
        System.out.print(nodo.getDato());
        if(nodo.getDer()!=null){
            mostrarArbol(nodo.getDer());
        }
    }
}

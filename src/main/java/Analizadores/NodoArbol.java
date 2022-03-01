/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analizadores;

/**
 *
 * @author osmar
 */
public class NodoArbol {
    
    private String Dato;
    private boolean anulable;
    private NodoArbol izq;
    private NodoArbol der;
    private int first;
    private int last;
       
    public NodoArbol(String dato,boolean anulable,int first, int last){
        this.Dato=dato;
        this.anulable=anulable;
        this.first=first;
        this.last=last;
        this.izq=null;
        this.der=null;
    }
    
    public String getDato(){
        return this.Dato;
    }
    public boolean getAnulable(){
        return this.anulable;
    }
    public int getFirst(){
        return this.first;
    }
    public int getLast(){
        return this.last;
    }
    public NodoArbol getIzq(){
        return this.izq;
    }
    public NodoArbol getDer(){
        return this.der;
    }
    public void setDato(String dato){
        this.Dato=dato;
    }
    public void setAnulable(boolean anulable){
        this.anulable=anulable;
    }
    public void setFirst(int first){
        this.first=first;
    }
    public void setLast(int last){
        this.last=last;
    }
    public void setIzq(NodoArbol izq){
        this.izq=izq;
    }
    public void setDer(NodoArbol der){
        this.der=der;
    }
}
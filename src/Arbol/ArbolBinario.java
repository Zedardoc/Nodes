/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;

/**
 *
 * @author CENTIC
 */
public class ArbolBinario {
    Nodo raiz;
    
    public ArbolBinario(){
        this.raiz = null;
    }
    
    public Nodo insertarNodo(int dato, Nodo nodoaux){
        Nodo nuevonodo = new Nodo(dato);
        
        if(isEmpty()){
            raiz = nuevonodo;
            return null;
        }
        if(dato >= nodoaux.dato){
            if(nodoaux.hijoDerecho != null){
                
            } else{
                nodorecorre.hijoDerecho = nuevonodo;
            }
        }
    }
    public boolean isEmpty(){
        return (raiz == null);
    }
}

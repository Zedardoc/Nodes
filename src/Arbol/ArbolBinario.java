/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author CENTIC
 */
public class ArbolBinario {
    Nodo raiz;
    
    public ArbolBinario(){
        this.raiz = null;
    }
    public void insertarNodo(int dato){
        raiz = insertarNodo(dato, raiz);
    }

    public Nodo insertarNodo(int dato, Nodo padre){
        Nodo nuevonodo = new Nodo(dato);
        if(padre == null){
            
            return nuevonodo;
        }
        if(dato >= padre.dato){
            padre.hijoDerecho = insertarNodo(dato, padre.hijoDerecho);
            System.out.println("Entro en el hijo derecho");
        } else {
            padre.hijoIzquierdo = insertarNodo(dato, padre.hijoIzquierdo);
            System.out.println("Entro en el hijo izquierdo");
        }
        
        return padre;
    }
    
    public void printArbol(){
        if(isEmpty()){
            System.out.println("Vacio");
            return;
        }
        Queue<Nodo> nodos = new LinkedList<>();
        nodos.add(raiz);
        while(!nodos.isEmpty()){
            Nodo nodo = nodos.poll();
            
            System.out.println(" " + nodo.dato);
            
            if(nodo.hijoIzquierdo != null){
                nodos.add(nodo.hijoIzquierdo);
            }
            if(nodo.hijoDerecho != null){
                nodos.add(nodo.hijoDerecho);
            }
        }
    }
    public boolean isEmpty(){
        return (raiz == null);
    }
}

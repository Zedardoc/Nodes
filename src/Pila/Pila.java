/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

/**
 *
 * @author CENTIC
 */
public class Pila {
    private Nodo cima;
    private int tamaño;
    
    public Pila(){
        cima = null;
        tamaño =0;
    }
    
    public void push(int dato){
        Nodo nuevonodo = new Nodo(dato);
        nuevonodo.Siguiente = cima;
        cima = nuevonodo;
        tamaño++;
    }
    
    public int pop(){
        Nodo nodoauxiliar = cima;
        cima = cima.Siguiente;
        tamaño--;
        System.out.println("Se saco el elemento " + nodoauxiliar.dato + " de la pila");
        return nodoauxiliar.dato;
    }
    
    public int peak(){
        if(tamaño == 0){
            System.out.println("No hay datos");
            return 0;
        }
        System.out.println("La cima tiene un nodo de valor " + cima.dato + ".");
        return cima.dato;
    }
    
    public void eliminarPila(){
       while(cima!=null){
           pop();
       }
    }
    
    public boolean isEmpty(){
        return (tamaño == 0);
    }
    
    public void imprimir(){
        Nodo nodoauxiliar = cima;
        while(nodoauxiliar != null){
            
            System.out.println(nodoauxiliar.dato);
            nodoauxiliar = nodoauxiliar.Siguiente;
        }
    }
}

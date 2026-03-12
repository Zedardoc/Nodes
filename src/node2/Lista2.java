/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package node2;

/**
 *
 * @author CENTIC
 */
public class Lista2 {
    private Nodo2 cabeza, cola;
    private int tamaño = 0;
    
    public Lista2(){
        this.cabeza = null;
        this.cola = null;
    }
    
    public boolean estaVacio(){
        return (this.cabeza == null);
    }

    public int getTamaño() {
        return tamaño;
    }
    
    public void agregarNodoalInicio(int dato){
        Nodo2 nuevonodo = new Nodo2(dato);
        if(tamaño == 0){
            cabeza = nuevonodo;
            cola = nuevonodo;
            tamaño++;
            return;
        }
       nuevonodo.Siguiente = cabeza;
       cabeza.anterior = nuevonodo;
       cabeza = nuevonodo;
       tamaño++;
    }
    
    public void agregarNodoalFinal(int dato){
        Nodo2 nuevonodo = new Nodo2(dato);
        if(tamaño == 0){
            cabeza=nuevonodo;
            cola=nuevonodo;
            tamaño++;
            return;
        }
        
        nuevonodo.anterior = cola;
        cola.Siguiente = nuevonodo;
        cola = nuevonodo;
        tamaño++;
    }
    
    public void printList(){  
        Nodo2 auxiliar = cabeza;
        System.out.println("Cabeza -> ");
        while(auxiliar != null){
            System.out.println(auxiliar.dato);
            auxiliar = auxiliar.Siguiente;
            
        }System.out.println("-> Final");
        auxiliar = cola;
        System.out.println("Final -> ");
        while(auxiliar != null){
            System.out.println(auxiliar.dato);
            auxiliar = auxiliar.anterior;
            
        }
        System.out.println("-> Cabeza");
    }
}

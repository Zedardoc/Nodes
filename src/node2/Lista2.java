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
    
    public void eliminarNodoalInicio(){
        if(tamaño == 0){
            return;
        } else if(tamaño == 1){
            cabeza = null;
            cola = null;
        }
        Nodo2 nodoauxiliar = cabeza.Siguiente;
        nodoauxiliar.anterior = null;
        cabeza = nodoauxiliar;
        tamaño--;
    }
    
    public void eliminarNodoalFinal(){
        if(tamaño == 0){
            return;
        } else if(tamaño == 1){
            cabeza = null;
            cola = null;
        }
        Nodo2 nodoauxiliar = cola.anterior;
        nodoauxiliar.Siguiente = null;
        cola = nodoauxiliar;
        tamaño--;
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
    
    public void agregarNodoalN(int dato, int n){
        if(n == 0){
            agregarNodoalInicio(dato);
            tamaño++;
            return;
        }
        else if(n==(tamaño)){
            agregarNodoalFinal(dato);
            tamaño++;
            return;
        }
        else if(n>=tamaño){
            System.out.println("Indice excede tamaño");
            return;
        }
        Nodo2 nodoauxiliar = cabeza;
        Nodo2 nuevonodo = new Nodo2(dato);
        int contador = 0;
        while(nodoauxiliar != null && contador < (n-1) ){
            contador++;
            nodoauxiliar = nodoauxiliar.Siguiente;
        }
        nuevonodo.Siguiente = nodoauxiliar.Siguiente;
        nuevonodo.anterior = nodoauxiliar;
        nodoauxiliar.Siguiente.anterior = nuevonodo;
        nodoauxiliar.Siguiente = nuevonodo;
        tamaño++;
    }
    
    public void eliminarNodoalN(int n){
        if(tamaño == 0){
            return;
        } else
        if(n == 0 && tamaño >=1){
            eliminarNodoalInicio();
            
            return;
            
        } else
        if(n == (tamaño-1)){
            eliminarNodoalFinal();
            
            return;
        }
        Nodo2 nodoauxiliar = nodoauxiliar = cabeza;
        int contador = 0;
        while(contador < (n-1)){
            contador++;
            nodoauxiliar = nodoauxiliar.Siguiente;
        }
        Nodo2 nodoeliminado = nodoauxiliar.Siguiente;
        nodoauxiliar.Siguiente = nodoauxiliar.Siguiente.Siguiente;
        nodoauxiliar.Siguiente.anterior = nodoauxiliar;
        nodoeliminado.anterior = null;
        nodoeliminado.Siguiente=null;
        tamaño--;
        
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

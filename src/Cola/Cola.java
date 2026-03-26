/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;

/**
 *
 * @author CENTIC
 */
public class Cola {
    private Nodo inicio;
    private Nodo fin;
    private int tamaño;
    
    public Cola(){
        inicio = fin = null;
        tamaño = 0;
    }
    
    public void enqueue(int dato){
        Nodo nuevonodo = new Nodo(dato);
        if(isEmpty()){
            inicio = nuevonodo;
        }
        else{
            fin.Siguiente = nuevonodo;
        }
        
        fin = nuevonodo;
        tamaño++;
        
    }
    
    public int dequeue(){
        Nodo nodoauxiliar = inicio;
        inicio = inicio.Siguiente;
        nodoauxiliar.Siguiente = null;
        tamaño--;
        return nodoauxiliar.dato;
    }
    
    public int peek(){
        return inicio.dato;
    }
    public boolean isEmpty(){
        return (tamaño == 0);
    }
    
    public void eliminarCola(){
        while(isEmpty()==false){
            dequeue();
        }
    }
    public void printqueue(){
        Nodo nodoaux = inicio;
        System.out.println("Cabeza ->");
        while(nodoaux != null){
            System.out.println(nodoaux.dato);
            nodoaux = nodoaux.Siguiente;
            
        }
        System.out.println("- > Null");
    }
}

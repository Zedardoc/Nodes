/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package node;

/**
 *
 * @author CENTIC
 */
public class Lista {
    
    private Nodo cabeza;
    
    public Lista(){
        this.cabeza = null;
    }
    
    public void agregarNodoalInicio(int dato){
        Nodo nodoIni = new Nodo(dato);
        nodoIni.Siguiente = cabeza;
        cabeza=nodoIni;
    }
    
    public void agregarNodoalFinal(int dato){
        if(cabeza == null){
            agregarNodoalInicio(dato);
            return;
        }
        Nodo nodoauxiliar = cabeza;
        while(nodoauxiliar.Siguiente != null){
            nodoauxiliar = nodoauxiliar.Siguiente;
        }
        
        Nodo nuevonodo = new Nodo(dato);
        nodoauxiliar.Siguiente = nuevonodo;
    }
    
    public int agregarNodoalN(int dato, int n){
        if(cabeza == null){
            agregarNodoalInicio(dato);
            return 1;
        }
        Nodo nodoauxiliar = cabeza;
        Nodo nuevonodo = new Nodo(dato);
        for(int i = 0; i<n;i++){
            if(nodoauxiliar.Siguiente == null){
                return 0;   
            }
            
            nodoauxiliar = nodoauxiliar.Siguiente;
            
        }
        nuevonodo.Siguiente = nodoauxiliar.Siguiente;
        nodoauxiliar.Siguiente = nuevonodo;
        return 1;
    }
    public void printNodes(){
        Nodo nodoauxiliar = cabeza;
        while(nodoauxiliar != null){
            System.out.println("Nodo con dato: " + nodoauxiliar.dato);
            nodoauxiliar = nodoauxiliar.Siguiente;
        }
        System.out.println("null");
    }
}

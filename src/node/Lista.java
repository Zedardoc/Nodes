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
    public int tamano;
    public Lista(){
        this.cabeza = null;
    }
    
    public void agregarNodoalInicio(int dato){
        Nodo nodoIni = new Nodo(dato);
        nodoIni.Siguiente = cabeza;
        cabeza=nodoIni;
        tamano++;
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
        tamano++;
    }
    
    public int agregarNodoalN(int dato, int n){
        if(cabeza == null || n == 0){
            agregarNodoalInicio(dato);
            return 1;
        }
        Nodo nodoauxiliar = cabeza;
        Nodo nuevonodo = new Nodo(dato);
        for(int i = 1; i<(n);i++){
            if(nodoauxiliar.Siguiente == null){
                System.out.println("Has intentado ingresar un dato en un indice todavia inexistente >:v");
                return 0;   
            }
            
            nodoauxiliar = nodoauxiliar.Siguiente;
            
        }
        nuevonodo.Siguiente = nodoauxiliar.Siguiente;
        nodoauxiliar.Siguiente = nuevonodo;
        tamano++;
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
    
    public int getTamaño(){
        return tamano;
    }
    
    public boolean estaVacia(){
        boolean x;
        x = (getTamaño() == 0) ? true : false;
        return x;
    }
    
    public int eliminarNodoPrincipio(){
        Nodo inicio = cabeza;
        cabeza = cabeza.Siguiente;
        inicio.Siguiente = null;
        tamano--;
        return 1;
    }
    public int eliminarNodoFinal(){
        Nodo nodoauxiliar = cabeza;
        while(nodoauxiliar.Siguiente.Siguiente != null){
            
            nodoauxiliar = nodoauxiliar.Siguiente;
        }
        nodoauxiliar.Siguiente = null;
        tamano--; 
        return 1;
    }
    public int eliminarNodoN(int n){
        if(n == 0){
            eliminarNodoPrincipio();
            return 1;
        }
        else if(n == (tamano-1)){
            eliminarNodoFinal();
            return 1;
        } else if(n>(tamano-1)){
            return 0;
        }
        Nodo nodoauxiliar = cabeza;
        int contador = 1;
        while(contador <(n-1)){
            contador++;
            nodoauxiliar = nodoauxiliar.Siguiente;
        }
        Nodo nodoenlace = nodoauxiliar.Siguiente;
        nodoauxiliar.Siguiente = nodoauxiliar.Siguiente.Siguiente;
        nodoenlace.Siguiente = null;
        tamano--;
        return 1;
    }
    
    public Nodo BuscarNodoporIndice(int n){
        if(n == 0){
           return cabeza; 
        }
        int cont = 1;
        Nodo nodoauxiliar = cabeza;
        while(cont <= n){
            cont++;
            nodoauxiliar = nodoauxiliar.Siguiente;
            
        }
        return nodoauxiliar;
        
    }
    public Nodo BuscarNodoporValor(int n){
        if()
        int cont = 1;
        while(cont <= n){
            cont++;
            nodoauxiliar = nodoauxiliar.Siguiente;
            
        }
        return nodoauxiliar;
        
    }
}
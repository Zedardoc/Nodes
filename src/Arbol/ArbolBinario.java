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

    private Nodo insertarNodo(int dato, Nodo padre){
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
    
    public void recorrerPreOrden(Nodo recorre){
        if(recorre != null){
            System.out.println(recorre.dato);
            recorrerPreOrden(recorre.hijoIzquierdo);
            recorrerPreOrden(recorre.hijoDerecho);
            
        }
    }
    
    public Nodo Busqueda(int dato){
        Nodo nodorecorre = raiz;
        boolean encontrado = false;
        while(nodorecorre != null){
            if(dato == nodorecorre.dato){
                encontrado = true;
                break;
            }
            else if(dato < nodorecorre.dato){
                nodorecorre = nodorecorre.hijoIzquierdo;
            } else if(dato >= nodorecorre.dato) {
                nodorecorre = nodorecorre.hijoDerecho;
            }
                
        }
        if(encontrado){
            return nodorecorre;
        }
        return null;
    }
    
       public void eliminarNodoporDato(int dato){
       //encontrar el nodo anterior
       Nodo nodoanterior = null;
       Nodo nodorecorre = raiz;
        boolean encontrado = false;
        while(nodorecorre != null){
            if((nodorecorre.hijoDerecho!= null &&nodorecorre.hijoIzquierdo!= null) && dato == nodorecorre.hijoIzquierdo.dato || dato == nodorecorre.hijoDerecho.dato){
                encontrado = true;
                break;
            }
            else if(dato < nodorecorre.dato){
                nodorecorre = nodorecorre.hijoIzquierdo;
            } else if(dato >= nodorecorre.dato) {
                nodorecorre = nodorecorre.hijoDerecho;
            }
                
        }
        if(encontrado){
            nodoanterior = nodorecorre;
        }
        else {
            return;
        }
        Nodo nodoeliminado;
        if(nodoanterior.hijoDerecho.dato == dato){
            nodoeliminado = nodoanterior.hijoDerecho;
        } else{
            nodoeliminado = nodoanterior.hijoIzquierdo;
        }
        if(nodoeliminado == null){
            return;
        }
        
        if(nodoeliminado.hijoIzquierdo !=null && nodoeliminado.hijoDerecho != null){
            //comportamiento cuando dos hijos existen
        } else if((nodoeliminado.hijoIzquierdo != null) ^ (nodoeliminado.hijoDerecho != null)){
            //encontrar cual nodo es diferente de nulo
            Nodo nodoauxiliar;
            if(nodoeliminado.hijoIzquierdo != null){
                nodoauxiliar = nodoeliminado.hijoIzquierdo;
                nodoeliminado.hijoIzquierdo = null;
            } else {
                nodoauxiliar = nodoeliminado.hijoDerecho;
                nodoeliminado.hijoDerecho = null;
            }
            
            if(nodoanterior.hijoDerecho.dato == dato){
                nodoanterior.hijoDerecho = nodoauxiliar;
            } else {
                nodoanterior.hijoIzquierdo = nodoauxiliar;
            }
        }
        else {
            if(nodoanterior.hijoDerecho.dato == dato){
                nodoanterior.hijoDerecho = null;
            } else{
                nodoanterior.hijoIzquierdo = null;
            }
            
        }
        
    }
    public boolean isEmpty(){
        return (raiz == null);
    }
}

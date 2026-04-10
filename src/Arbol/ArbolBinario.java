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
    
    private Nodo encontrarHijoPorDato(Nodo padre, int dato){
        if(padre.hijoDerecho.dato == dato){
            return padre.hijoDerecho;
        } else {
            return padre.hijoIzquierdo;
        }
    }
    
    private Nodo encontrarNodoanterior(int dato){
      
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
            return nodorecorre;
        }
        else {
            return null;
        }
    }
       public void eliminarNodoporDato(int dato){
       //encontrar el nodo anterior
       Nodo nodoanterior = encontrarNodoanterior(dato);
        Nodo nodoeliminado;
        nodoeliminado = encontrarHijoPorDato(nodoanterior, dato);
        Nodo nodoauxiliar;
        if(nodoeliminado.hijoIzquierdo !=null && nodoeliminado.hijoDerecho != null){
            //comportamiento cuando dos hijos existen
            //situarse un nodo antes al menor del sub arbol derecho
            nodoauxiliar = nodoeliminado;
            
            if(nodoeliminado.hijoDerecho.hijoIzquierdo != null){
                nodoauxiliar = nodoauxiliar.hijoDerecho;
                while(nodoauxiliar.hijoIzquierdo.hijoIzquierdo != null){
                    nodoauxiliar = nodoauxiliar.hijoIzquierdo;
                }
            } else{
               if(nodoanterior.hijoDerecho.dato == nodoeliminado.dato){
                   nodoanterior.hijoDerecho = nodoauxiliar;
                   nodoauxiliar.hijoIzquierdo = nodoeliminado.hijoIzquierdo;
                   nodoeliminado.hijoIzquierdo = null;
                   nodoeliminado.hijoDerecho = null;
               }
            }
            
            Nodo nodomenor = nodoauxiliar.hijoIzquierdo;
                    
        } else if((nodoeliminado.hijoIzquierdo != null) ^ (nodoeliminado.hijoDerecho != null)){
            //encontrar cual nodo es diferente de nulo
            
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
            //comporamiento cuando no tiene hijos
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;

/**
 *
 * @author CENTIC
 */
public class main {
    public static void main(String[] args) {
      ArbolBinario arbol = new ArbolBinario();
      arbol.insertarNodo(4);
      arbol.insertarNodo(3);
      arbol.insertarNodo(5);
      arbol.insertarNodo(6);
      arbol.insertarNodo(7);
      //arbol.recorrerPreOrden(arbol.raiz);
      //System.out.println(arbol.Busqueda(5).dato);
      arbol.eliminarNodoporDato(6);
      arbol.recorrerPreOrden(arbol.raiz);
      
    }
}

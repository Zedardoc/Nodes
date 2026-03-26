/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;

/**
 *
 * @author CENTIC
 */
public class Nodo{
    
    public int dato;
    public Nodo hijoIzquierdo;
    public Nodo hijoDerecho;
    
    public Nodo(int dato){
        this.dato = dato;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }
}

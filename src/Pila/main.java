/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

/**
 *
 * @author CENTIC
 */
public class main {
    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.push(5);
        pila.push(7);
        pila.peak();
        pila.eliminarPila();
        pila.imprimir();
        System.out.println(pila.isEmpty());
    }
}

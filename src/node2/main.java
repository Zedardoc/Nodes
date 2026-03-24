/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package node2;

/**
 *
 * @author CENTIC
 */
public class main {
    public static void main(String[] args) {
        System.out.println("hola");
        
        Lista2 l2 = new Lista2();
        l2.agregarNodoalInicio(6);
        l2.agregarNodoalInicio(7);
        l2.agregarNodoalInicio(8);
        l2.agregarNodoalFinal(9);
        l2.agregarNodoalN(5, 2);
        l2.eliminarNodoalInicio();
        l2.eliminarNodoalFinal();
        l2.eliminarNodoalN(0);
        l2.printList();
        
        
    }
}

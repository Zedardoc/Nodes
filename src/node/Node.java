/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package node;

/**
 *
 * @author CENTIC
 */
public class Node {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.agregarNodoalInicio(5);
        lista.agregarNodoalFinal(7);
        lista.agregarNodoalFinal(6);
        lista.agregarNodoalN(57, 3);
        
        lista.eliminarNodoN(1);
        lista.eliminarNodoN(1);
        System.out.println("---------------------");
        System.out.println(lista.BuscarNodoporIndice(1).dato);
        lista.printNodes();
        
        System.out.println(lista.getTamaño());
       
    }
    
}

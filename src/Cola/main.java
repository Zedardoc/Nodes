/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;

/**
 *
 * @author CENTIC
 */
public class main {
    public static void main(String[] args) {
       Cola cola = new Cola();
       cola.enqueue(5);
       cola.enqueue(7);
       cola.dequeue();
       cola.eliminarCola();
       cola.printqueue();
    }
}

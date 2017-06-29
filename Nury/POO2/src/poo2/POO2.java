/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author CFP31-08
 */
public class POO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code applic ation logic here
    }
    //a la hora de crear un objeto puedo usar la interface como un tipo de dato 
    Cuadrupedo unPerro = new Perro();
    //esta implementacion solo me permitira acceder al comportamiento de un cuadrupedo

    Perro otroPerro = new Perro();
    // esta otra creacion de un objeto permite acceder al comportamiento de un cuadrupero y ademas mamifero.
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocontardescendente;
import java.util.*;

/**
 *
 * @author CFP31-09
 */
public class Proyectocontardescendente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num;
        System.out.println("Ingrese desde donde se mostraran los numeros");
        Scanner sca= new Scanner(System.in); //para leer datos enteros. sca es una variable de tipo Scanner
        // se requiere
        num=sca.nextInt(); //para asignarle el valor a la variable
        while (num>=0){ 
            if (num%5==0) {
            System.out.println("");    
            }           
            System.out.print(num+" ");
              num--;
    }
    
}
}

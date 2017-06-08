/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_test;
import java.util.*;
/**
 *
 * @author CFP31-08
 */
public class Project_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//las llaves son el inicio y el fin de las funciones y algoritmo
        // TODO code application logic here
        int contador = 0;// se define el tipo de dato y se le asignan valores
        int numero_para_contar;
        
        Scanner un_scanner = new Scanner(System.in);//para leer se crea el objeto con new, system.in es para que imprima en el cuadrito
                
        numero_para_contar = un_scanner.nextInt();//convierte lo escaneado a entero con el nextInt
        
        while (contador<numero_para_contar) {//en while la accion debe estar entre parentesis
            contador = contador+1;
        System.out.println(contador);//imprimir
        }
    }
}

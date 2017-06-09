/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_test002;

import java.util.Scanner;

/**
 *
 * @author CFP31-15
 */
public class Project_test002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador;
        Scanner un_scanner = new Scanner(System.in);
        
        contador = un_scanner.nextInt();
        
        while ( contador >0) {
             contador = contador -1;
             System.out.println(contador); // Es el Escribir o Imprimir del PSINT
        }
           
    }
    
}

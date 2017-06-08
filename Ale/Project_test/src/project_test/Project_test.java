/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_test;

import java.util.*;


/**
 *
 * @author CFP31-15
 */
public class Project_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        int numero_para_contar ;
        
        Scanner un_scanner = new Scanner(System.in);
        
        numero_para_contar = un_scanner.nextInt();
        
        while ( contador < numero_para_contar) {
             contador = contador +2;
             System.out.println(contador); // Es el Escribir o Imprimir del PSINT
        }
           
        
    }
    
}




package prueba2;

import java.util.*;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CFP31-04
 */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
        int numero_para_empezar_a_restar;
        
        System.out.print("Ingrese el numero para empezar a restar");
        
        Scanner un_scanner = new Scanner(System.in);
        numero_para_empezar_a_restar = un_scanner.nextInt();
        
        System.out.print("Numeros del 1 al"  + numero_para_empezar_a_restar);
        while (numero_para_empezar_a_restar > 0 ) 
        
        {
            numero_para_empezar_a_restar = numero_para_empezar_a_restar-1;
            System.out.println(numero_para_empezar_a_restar);
        // TODO code application logic here
    }
    
    }

    }
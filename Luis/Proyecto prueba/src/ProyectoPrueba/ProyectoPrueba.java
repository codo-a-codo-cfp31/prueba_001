package ProyectoPrueba;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor

/**
 *
 * @author CFP31-04
 */
public class ProyectoPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        int numero_parar_de_contar;
        
        System.out.print("Ingrese el numero para parar de contar");
        Scanner un_scanner = new Scanner(System.in);
        numero_parar_de_contar = un_scanner.nextInt();
        
        System.out.print("Numeros del 1 al numero");
        while (contador < numero_parar_de_contar) {
            contador = contador+1;
            System.out.println(contador);
        }
                
    }
    
}

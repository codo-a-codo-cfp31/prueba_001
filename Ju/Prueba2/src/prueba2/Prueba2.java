/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;
import java.util.*;

/**
 *
 * @author cfp31-06
 */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        int numero_para_contar = 10;
                
                Scanner un_scanner = new Scanner(System.in);
                numero_para_contar = un_scanner.nextInt();
                
        while (contador  < numero_para_contar){
                contador = contador +1;
                System.out.println(contador);
               
                
        }
        
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monotributo;

import java.util.Scanner;

/**
 *
 * @author CFP31-15
 */
public class Monotributo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese su facturacion anual");
        
        Scanner unScanner = new Scanner(System.in);
        
        int facturacionAnual = unScanner.nextInt();
        String categoria = "Sin Categoria";
        
        if ( facturacionAnual <= 84000 ){
            categoria = "A";
        } else if (facturacionAnual <= 126000 ) {
            categoria = "B";
        }
        
        
        System.out.println("Tu categoria es: " + categoria);
                
    }
    
}

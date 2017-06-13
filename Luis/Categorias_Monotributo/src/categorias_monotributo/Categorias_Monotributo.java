/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categorias_monotributo;

import java.util.*;

/**
 *
 * @author CFP31-04
 */
public class Categorias_Monotributo {

    
            /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double ingreso_anual;
        System.out.println("Ingrese su facturacion anual");
        
        Scanner Un_scanner = new Scanner(System.in);
        ingreso_anual = Un_scanner.nextDouble();
        
        if (ingreso_anual < 0) {
            System.out.println("El ingreso anual debe ser mayor o igual a 0");  
        }
        
        if ((ingreso_anual >=0) && (ingreso_anual <=84000)){
            System.out.println("Usted pertenece a la categoria A");
        }
        
        if ((ingreso_anual > 84000) && (ingreso_anual <=126000)){
            System.out.println("Usted pertenece a la categoria B");
        }
        
        if ((ingreso_anual > 126000) && (ingreso_anual <=168000)){
            System.out.println("Usted pertenece a la categoria C");
        }
        
        if ((ingreso_anual > 168000) && (ingreso_anual <=252000)){
            System.out.println("Usted pertenece a la categoria D");
        }
        
        if ((ingreso_anual > 252000) && (ingreso_anual <=336000)){
            System.out.println("Usted pertenece a la categoria E");
        }
        
        if ((ingreso_anual > 336000) && (ingreso_anual <=420000)){
            System.out.println("Usted pertenece a la categoria F");
        }
        
        if ((ingreso_anual > 420000) && (ingreso_anual <=504000)){
            System.out.println("Usted pertenece a la categoria G");
        }
        
        if ((ingreso_anual > 504000) && (ingreso_anual <=700000)){
            System.out.println("Usted pertenece a la categoria H");
        }
        
        if ((ingreso_anual > 700000) && (ingreso_anual <=822500)){
            System.out.println("Usted pertenece a la categoria I");
        }
        
        if ((ingreso_anual > 822500) && (ingreso_anual <=945000)){
            System.out.println("Usted pertenece a la categoria J");
        }
        
        if ((ingreso_anual > 945000) && (ingreso_anual <=1050000)){
            System.out.println("Usted pertenece a la categoria K");
        }
        
        if (ingreso_anual > 1050000){
            System.out.println("Sobrepasa las categorias del monotributo");
        }
    
}
}

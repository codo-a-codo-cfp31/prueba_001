/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomonotributo;
import java.util.*;
/**
 *
 * @author CFP31-08
 */
public class Ejerciciomonotributo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    Double FacturacionAnual;
    
   System.out.println("Bienvenido, ingrese su facturacion anual");
    
   Scanner un_Scanner = new Scanner(System.in);
   
   FacturacionAnual = un_Scanner.nextDouble();
   
   if ((FacturacionAnual >= 1) && (FacturacionAnual <= 84000)){
        System.out.println("Usted pertenece a la categoria A");
    } 
        else if((FacturacionAnual > 84000)&& (FacturacionAnual <=126000)){
            System.out.println("Usted pertenece a la categoria B");
    }
    if ((FacturacionAnual>126000) && (FacturacionAnual <= 168000)){
        System.out.println("Usted pertenece a la categoria C");
    }        
         else if ((FacturacionAnual>168000)&&(FacturacionAnual <= 252000)){
            System.out.println("Usted pertenece a la categoria D"); 
    }
    if ((FacturacionAnual>252000)&&(FacturacionAnual <= 336000)){
        System.out.println("Usted pertenece a la categoria E");
    }
         else if ((FacturacionAnual >336000)&&(FacturacionAnual<=420000)){
            System.out.println("Usted pertenece a la categoria F");
    }
    if ((FacturacionAnual>420000)&&(FacturacionAnual <= 504000)){
        System.out.println("Usted pertenece a la categoria G");
    }
        else if ((FacturacionAnual>504000)&&(FacturacionAnual <= 700000)){
            System.out.println("Usted pertenece a la categoria H");
    }
    if ((FacturacionAnual>700000)&&(FacturacionAnual <= 822500)){
        System.out.println("Usted pertenece a la categoria I");
    }
         else if ((FacturacionAnual>822500)&&(FacturacionAnual <= 945000)){
             System.out.println("Usted pertenece a la categoria J");
    }
    if ((FacturacionAnual>945000)&&(FacturacionAnual <= 1050000)){
        System.out.println("Usted pertenece a la categoria K");
    }
        else if ((FacturacionAnual>1051000)||(FacturacionAnual<0)){
            System.out.println("Monto fuera de rango");
                }
    }
}



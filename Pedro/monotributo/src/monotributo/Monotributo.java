/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monotributo;
import java.util.*;

public class Monotributo {

 
    public static void main(String[] args) {
        double num;
        System.out.println("Ingrese su facturacion anual");
        Scanner sca= new Scanner(System.in); //para leer datos enteros. sca es una variable de tipo Scanner
        // se requiere
        num=sca.nextDouble();
        if((num>0) && (num<=84000)){
        System.out.println("Usted pertenece a la Categoria A");
        }        
        else if((num>84000) && (num<=126000)){
        System.out.println("Usted pertenece a la Categoria B");
        } 
        else if((num>126000) && (num<=168000)){
        System.out.println("Usted pertenece a la Categoria C");
        } 
        else if((num>168000) && (num<=252000)){
        System.out.println("Usted pertenece a la Categoria D");
        } 
        else if((num>252000) && (num<=336000)){
        System.out.println("Usted pertenece a la Categoria E");
        } 
        else if((num>336000) && (num<=420000)){
        System.out.println("Usted pertenece a la Categoria F");
        } 
        else if((num>420000) && (num<=504000)){
        System.out.println("Usted pertenece a la Categoria G");
        } 
        else if((num>504000) && (num<=700000)){
        System.out.println("Usted pertenece a la Categoria H");
        } 
        else if((num>700000) && (num<=822500)){
        System.out.println("Usted pertenece a la Categoria I");
        } 
        else if((num>822500) && (num<=945000)){
        System.out.println("Usted pertenece a la Categoria J");
        } 
        else if((num>945000) && (num<=1050000)){
        System.out.println("Usted pertenece a la Categoria K");
        } 
        else if((num>1050000) || (num<=0)){
        System.out.println("Monto fuera de rango permitido. de 1 hasta 1050000");
        } 
    }
    
}

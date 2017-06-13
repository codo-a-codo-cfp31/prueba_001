
package ejercicio_monotributo;

import java.util.*;

public class Ejercicio_monotributo {

    //Ingresar el monto de facturacion anual para calcular la categiria de monotributo a la cual corresponde
    
    public static void main(String[] args) {
        
       //Facturaciones maximas de caa categoria
       float categoria_A_max = 84000;
       float categoria_B_max = 126000;
       float categoria_C_max = 168000;
       float categoria_D_max = 252000;
       float categoria_E_max = 336000;
       float categoria_F_max = 420000;
       float categoria_G_max = 504000;
       float categoria_H_max = 700000;
       float categoria_I_max = 822500;
       float categoria_J_max = 945000;
       float categoria_K_max = 1050000;
       
       float facturacion_anual;
       
       //Solicita el ingreso del monto anual
       System.out.println("Ingrese se su facturacion anual");
       Scanner monto_ingresado = new Scanner(System.in);
       facturacion_anual = monto_ingresado.nextFloat();
       System.out.println("El monto ngresado es: $ "+facturacion_anual);
       
       //Se evalua el monto ingresado para calcular la categoria que corresponde
       //Declaramos a variable categoria para poder ir asignandole los respecitvos valores
       String categoria = "";
       
       if ( facturacion_anual <= categoria_A_max ){
           categoria = "A";
       }
       else if (facturacion_anual <= categoria_B_max) {
            categoria = "B";
               }
       else if (facturacion_anual <= categoria_C_max) {
            categoria = "C";
               }
       else if (facturacion_anual <= categoria_D_max) {
            categoria = "D";
               }
       else if (facturacion_anual <= categoria_E_max) {
            categoria = "E";
               }
       else if (facturacion_anual <= categoria_F_max) {
            categoria = "F";
               }
       else if (facturacion_anual <= categoria_G_max) {
            categoria = "G";
               }
       else if (facturacion_anual <= categoria_H_max) {
            categoria = "H";
               }
       else if (facturacion_anual <= categoria_I_max) {
            categoria = "I";
               }
       else if (facturacion_anual <= categoria_J_max) {
            categoria = "J";
               }
       else if (facturacion_anual <= categoria_K_max) {
            categoria = "K";
               }
       else {
           categoria = "El monto registrado no pertenece a una cateoría";
       }
       
       System.out.println("Su Monotributo corresponde a la categoría: " + categoria);
    }
    
}

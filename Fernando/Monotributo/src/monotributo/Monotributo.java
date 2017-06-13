

package monotributo;
import java.util.*;

public class Monotributo {

    public static void main(String[] args) {
        String categoria = "Sin Categoria";
        Scanner teclado = new Scanner(System.in);
  
        System.out.println("Ingrese el monto total facturado:");
        int salarioAnual = teclado.nextInt();
            
        if (salarioAnual <= 84000) {
            categoria = "A";
        }else if (salarioAnual <= 126000) {
            categoria = "B";
        }else if (salarioAnual <= 168000) {
            categoria = "C";
        }else if (salarioAnual <= 252000) {
            categoria = "D";
        }else if (salarioAnual <= 336000) {
            categoria = "E";
        }else if (salarioAnual <= 420000) {
            categoria = "F";
        }else if (salarioAnual <= 504000) {
            categoria = "G";
        }else if (salarioAnual <= 700000) {
            categoria = "H";
        }else if (salarioAnual <= 822500) {
            categoria = "I";
        }else if (salarioAnual <= 945000) {
            categoria = "J";
        }else if (salarioAnual <= 1050000) {
            categoria = "K";
        }
           System.out.println("Tu categoria es: "+ categoria);
         
    }
    
}
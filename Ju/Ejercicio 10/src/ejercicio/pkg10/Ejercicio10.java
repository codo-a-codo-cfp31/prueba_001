/**
 * @Program:
 * Leer una frase y encontrar la palabra de mayor longitud.
 * El programa debe imprimir la palabra y el número de carateres de la misma.
 * */
package ejercicio.pkg10;

/**
 *
 * @author Nacho
 */
import java.util.Scanner;

public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        String aux;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        frase = teclado.nextLine();
        
        
        aux = frase.substring(0,frase.indexOf(" "));
        
    }

}

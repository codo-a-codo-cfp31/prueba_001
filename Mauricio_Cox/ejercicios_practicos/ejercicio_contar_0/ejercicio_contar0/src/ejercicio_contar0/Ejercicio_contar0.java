package ejercicio_contar0;
import java.util.*; 
public class Ejercicio_contar0 {
            
        //Ejercicio contar hasta cero 
    public static void main(String[] args) {
        
        int contador;
        
        Scanner un_scanner = new Scanner(System.in);
        
        //Reemplaza al leer
         contador = un_scanner.nextInt();
        //Mientras que contador sea MAYOR a cero se restara una unidad -1
        while (contador > 0){
            
            contador = contador -1;
            
            //reemplaza al escrbir
            System.out.println(contador);
         }
        
    }
}
















//import java.util.Scanner;
Scanner teclado = new Scanner  (System.in);
System.out.printIn ("ingrese número: ");
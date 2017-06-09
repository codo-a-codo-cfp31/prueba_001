package ejercicio_contar0;
import java.util.*; 
public class Ejercicio_contar0 {
            
        //Ejercicio contar hasta cero 
    public static void main(String[] args) {
        
        int contador;
        
        Scanner un_scanner = new Scanner(System.in);
        
         contador = un_scanner.nextInt();
        
        while (contador > 0){
            
            contador = contador -1;
            
            System.out.println(contador);
         }
        
    }
}

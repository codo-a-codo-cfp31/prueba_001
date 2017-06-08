
package proyectoprueba;
import java.util.*;

public class ProyectoPrueba {

    public static void main(String[] args) {
        int cont=0,num;
        String nombre;
        System.out.println("Ingrese su nombre");
        Scanner sc= new Scanner(System.in); //para leer datos enteros. sc es una variable de tipo Scanner
        // se requiere de la libreria java.util.*
        nombre=sc.next();
        System.out.println("El nombre es: "+nombre);
        System.out.println("Ingrese hasta donde se muestran numeros");
        Scanner sca= new Scanner(System.in); //para leer datos enteros. sca es una variable de tipo Scanner
        // se requiere
        num=sca.nextInt(); //para asignarle el valor a la variable
        while (cont<num){    
            cont=cont+1; 
              System.out.println(cont); 
        } 
    }    
}

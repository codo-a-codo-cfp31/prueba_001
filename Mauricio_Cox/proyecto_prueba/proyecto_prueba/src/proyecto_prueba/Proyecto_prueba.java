package proyecto_prueba;

//Paquete importado para poder utilizar la instruccion Scanner y se lo hace con un * para oder utilizarlas todas
import java.util.*;

public class Proyecto_prueba {
    
//para encontrar la doumentacion de cada instruccion se puede hacer click derecho > show java documentation
//Tambien se utiliza control y espacio 
    
    public static void main(String[] args) {
        
        //Programa que cuenta de 1 a 100
        int contador = 0;
        int numero_para_contar;
        
        //este valor puede no existir ya que scanner esta tomando el valor que ingresamos desde el teclado
        //int numero_para_contar = 100;
        
        //aqui va a leer, scanner siempre devuelve un valor entero "int"
        //System.in es el ingreso de datos del sistema,
        Scanner un_scanner = new Scanner(System.in);
        
         numero_para_contar = un_scanner.nextInt();
        
        
        //Mientras que contador sea menor a < 100
        // contador = contador+1;
        //Fin mientras
        //Las instrucciones siempre se colocan entre parentecis
        while (contador < numero_para_contar){
            //para iprimir pares se le coloca +2 y listo
            contador = contador+1;
            
            
            
            //Reemplaza a la instruccion escribir de Pseint
            //print solo imprime el resultado todo seguido sin hacer saltos de linea
            //System.out.print(contador);
            
            //println imprime los resultados uno debajo de otro "ln" significa
            //que el sistema imprimira linea por linea.
            System.out.println(contador);
    }
        
    }
    
}

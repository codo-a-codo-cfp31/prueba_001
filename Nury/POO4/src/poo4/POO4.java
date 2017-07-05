/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo4;
import java.util.*;

/**
 *
 * @author CFP31-08
 */
public class POO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //1-Pedir un numero => la cantidad de la lista
        //2-Ingresar nombre y apellido de cada persona en la lista
        //3-Mostrarlo por pantalla
        //4-Hay que usar List<IPersona> unaLista = new ArrayList();
        //unaLista.add(persona);
        System.out.println("Ingrese la cantidad de personas que desea en la lista");
        
            List<IPersona> unaLista = new ArrayList();

            Scanner unScanner = new Scanner(System.in);
            
            Integer LongitudUnaLista = unScanner.nextInt();       
            
                for (int i=0;i<LongitudUnaLista; i++){
                    
                System.out.println("Ingrese el nombre de la persona " + i + ": ");
                String SuNombre = unScanner.next();
                
                System.out.println("Ingrese el apellido de la persona " + i + ": ");
                String SuApellido = unScanner.next();
                
                IPersona unaPersona = new Persona(SuNombre, SuApellido);

                unaLista.add(unaPersona);
            }   
            System.out.println("La Lista de personas es : " + unaLista);
            
            System.out.println("-------------------------------------------------");
            System.out.println("Buscar en la lista a la siguiente persona(nombre)");
            
            String BuscarUnaPersona = unScanner.next();
            
            for (int i=0;i<LongitudUnaLista; i++){
                IPersona persona_de_la_lista = unaLista.get(i);
                String nombre_de_la_persona = persona_de_la_lista.comoTeLlamas();
                
                if (BuscarUnaPersona.equalsIgnoreCase(nombre_de_la_persona)){
                    System.out.println("Encontre a la persona con ese nombre");
                }
            }
   
    }
}

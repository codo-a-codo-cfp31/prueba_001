/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo4;
import java.util.*;
/**
 *
 * @author @AnalistaSistok
 */
public class POO4 {
    /**
     * @param  args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        // 1- Pedir un numero => la cantidad en una lista
        // 2- Ingresar Nombre y Apellido de cada persona de esa lista
        // 3- Mostrarlo por pantalla
        // Hay que usar List<IPersona> unaLista = new ArrayList();
        // unaLista.add(persona);
        List<IPersona> lista_de_personas = new ArrayList();
        
        System.out.println("Ingrese la cantidad de persona en la lista: ");
        int cantidad_de_personas = scanner.nextInt();
        
        for (int i = 0; i < cantidad_de_personas; i++) {
            
            System.out.println("Ingrese el nombre de la persona " + i + " : ");
            String nombre_persona = scanner.next();
            
            System.out.println("Ingrese el apellido de la persona " + i + " : ");
            String appelido_persona = scanner.next();
            
            IPersona unaPersona = new Persona(nombre_persona, appelido_persona);
            
            lista_de_personas.add(unaPersona);
        }
        
        System.out.println("La lista de personas es: " + lista_de_personas);
        
        System.out.println("***********************************************");
        System.out.println("Buscar en la lista a la siguiente persona(nombre): ");
        String buscarPersonaPorNombre = scanner.next();
        
        for (int i = 0; i < cantidad_de_personas; i++) {
            IPersona unaPersona = lista_de_personas.get(i);
              String nombre_de_la_persona = unaPersona.comoTeLlamas();
            if (buscarPersonaPorNombre .equalsIgnoreCase(nombre_de_la_persona)/* Aca escribir condicion */) {
                System.out.println("Encontre a la persona con ese nombre");
            }
        }
    }
}
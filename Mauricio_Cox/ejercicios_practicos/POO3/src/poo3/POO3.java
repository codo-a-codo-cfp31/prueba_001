/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3;


import java.util.*;

/**
 *
 * @author CFP31-15
 */
public class POO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aula unAula = new Aula();
        
        Alumno unAlumno = new Alumno();
        unAula.addAlumno(unAlumno);
        
        
        List<IPersona> lista = unAula.dameLaListaDePersonas();
        
        for (int i = 0; i < lista.size(); i++) {
            IPersona unaPersona =  lista.get(i);
            
            System.out.println("Persona en el Aula con nombre: " + unaPersona.comoTeLlamas());
            
        }
        
        
    }
    
}

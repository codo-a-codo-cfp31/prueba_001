/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3;

import java.util.*;
/**
 *
 * @author cfp31-06
 */
public class POO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aula unAula = new Aula();
        
        Alumno Alumno1 = new Alumno ();
        unAula.addAlumno(Alumno1);
        Alumno1.ahoraTeLlamas("Luis");
        
        Alumno Alumno2 = new Alumno ();
        unAula.addAlumno(Alumno2);
        Alumno2.ahoraTeLlamas("Airam");
        
        Alumno Alumno3 = new Alumno ();
        unAula.addAlumno(Alumno3);
        Alumno3.ahoraTeLlamas("Nury");
        
        Alumno Alumno4 = new Alumno ();
        unAula.addAlumno(Alumno4);
        Alumno4.ahoraTeLlamas("Mauricio");
        
        Alumno Alumno5 = new Alumno ();
        unAula.addAlumno(Alumno5);
        Alumno5.ahoraTeLlamas("Pedro");
        
        Profesor elProfesor = new Profesor();
        unAula.addProfesor(elProfesor);
        elProfesor.ahoraTeLlamas("Alejandro");
        
        
        
        List<IPersona> lista = unAula.dameLaListaDePersonas();
        
        for (int i=0; i<lista.size(); i++){
            IPersona unaPersona = lista.get(i);
            
            System.out.println("Persona en el Aula con nombre: " + unaPersona.comoTeLlamas());
            
        }
    }
    
}

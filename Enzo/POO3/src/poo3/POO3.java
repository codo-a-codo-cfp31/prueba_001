/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3;
import java.util.*;
import java.io.*;
/**
 *
 *@author @AnalistaSistok #CFP31 #SEducA
 */
public class POO3 {
/**
 * @param   args the command line arguments
 */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
//        Alumno unAlumno = new Alumno();
        Aula unAula = new Aula();
//        unAula.addAlumno(unAlumno);
        Alumno unAlumno=new Alumno("Bart","Simpson");
        unAula.addAlumno(unAlumno);
        
        List<IPersona> lista = unAula.dameLaListaDePersonas();
        
        for (int i = 0; i < lista.size(); i++) {
        IPersona unaPersona =lista.get(i);
        System.out.println("Persona en el Aula con Nombre: " + unaPersona.comoTeLlamas()+" y Apellido: "+unaPersona.cualEsTuApellido());  
        }
    }
}
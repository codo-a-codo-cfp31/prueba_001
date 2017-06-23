/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author CFP31-15
 */
public class Persona {
     protected String nombre;
     protected String apellido;
     protected int edad;
     protected int dni;
     protected Ropa suRopa;
    
     
     
     
     public Persona(String unNombre, String unApellido, int unEdad){
         nombre = unNombre;
         apellido = unApellido;
         edad = unEdad;
     }
     
     
     
     public String comoTeLlamas(){
         return nombre;
     }
     
     public void ahoraTeLlamas(String tuNuevoNombre){
         nombre = tuNuevoNombre;
     }
     
     public String cualEsTuApellido(){
         return apellido;
     }
     
     public void ahoraTuApellidoEs(String tuNuevoApellido){
         apellido = tuNuevoApellido;
     }
}

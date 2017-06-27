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
<<<<<<< HEAD
     private String nombre;
     private String apellido;
     private int edad;
     private int dni;
=======
     protected String nombre;
     protected String apellido;
     protected int edad;
     protected int dni;
>>>>>>> ebe6746fe1e00a4f11dce1835f5b364393d7180b
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
<<<<<<< HEAD
     }    
     
     
=======
     }
>>>>>>> ebe6746fe1e00a4f11dce1835f5b364393d7180b
     
     public String cualEsTuApellido(){
         return apellido;
     }
     
<<<<<<< HEAD
     
     
     public int cualEsTuEdad(){
         return edad;
     }
     public void ahoraTuEdadEs (int tuNuevaEdad){
         edad = tuNuevaEdad;
     }
     
 
     
     public int cualEsTuDni(){
         return dni;
     }       
     public void ahoraTuDniEs (int tuNuevoDni){
         dni = tuNuevoDni;    
     }
     
     public Persona(){
         
     }
     public Persona(String nombre, String apellido, int edad){
         suRopa = new Ropa("lala","lala","lala");
     }
     
     public Persona(String unTalle, String unColor, String unTipo){
         suRopa = new Ropa(unTalle, unColor, unTipo);
     }

=======
     public void ahoraTuApellidoEs(String tuNuevoApellido){
         apellido = tuNuevoApellido;
     }
>>>>>>> ebe6746fe1e00a4f11dce1835f5b364393d7180b
}

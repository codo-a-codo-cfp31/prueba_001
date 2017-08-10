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
         
     suRopa = new Ropa("lala","lala","lala");
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

     public int cualEsTuEdad(){
         return edad;
     }
     public void ahoraTuEdadEs (int tuNuevaEdad){
         edad = tuNuevaEdad;
     }
     
     public void ahoraTuApellidoEs(String tuNuevoApellido){
         apellido = tuNuevoApellido;
     }
     
     public int cualEsTuDni(){
         return dni;
     }       
     public void ahoraTuDniEs (int tuNuevoDni){
         dni = tuNuevoDni;    
     }
     
     public Persona(){
         
     }
     
     public Persona(String unTalle, String unColor, String unTipo){
         suRopa = new Ropa(unTalle, unColor, unTipo);
     }

     
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author CFP31-15
 */
public class Persona {
     private String nombre;
     private String apellido;
     private int edad;
     private int dni;
     protected Ropa suRopa;
    
     public String comoTeLlamas(){
         return nombre;
     }
     public void ahoraTeLlamas(String tuNuevoNombre){
         nombre = tuNuevoNombre;
     }    
     
     
     
     public String cualEsTuApellido(){
         return apellido;
     }
     public void ahoraTuApellidoEs (String tuNuevoApellido){
         apellido = tuNuevoApellido;
     }
     
     
     
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

}

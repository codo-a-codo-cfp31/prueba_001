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
     protected int dni;
     protected Ropa suRopa;
    
     public String comoTeLlamas(){//le pregunto como se llama y me retorna su nombre esto es un metodo
         return nombre;
     }
     
     public void ahoraTeLlamas(String tuNuevoNombre){//le asigno el nombre que yo deseo.
         nombre = tuNuevoNombre;
     }
     
     public String cualEsTuApellido(){
         return apellido;
     }
     
     public void ahoraTuApellido(String tuNuevoApellido){
         apellido = tuNuevoApellido;
     }
     
     public int cualEsTuEdad(){
         return edad;
     }
     
     public void ahoraTuEdadEs(int tuNuevaEdad){
         edad = tuNuevaEdad;
     }
     
     public int cualEsTuDNI(){
         return dni;
     }
     
     public void ahoraTuDNIEs(int tuNuevoDNI){
         dni = tuNuevoDNI;
     }
     // un contructor que no tiene parametros o argumentos
     public Persona(){
      suRopa = new Ropa("Ninguno","Blanco","camisa");
      //inicializo ropa por defecto en una persona
     }
     
     public Persona(String unTalle, String unColor, String unTipo){
     suRopa = new Ropa(unTalle,unColor , unTipo);
     // creo un constructor para ropa que contiene la persona.
     }

}     

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
     private String nombre = "luis";
     private String apellido;
     private int edad;
     private int dni;
     private Ropa suRopa;
    
     
     public Persona(){
         //Esta NO ES la responsabiliadd de esta class
         //Scanner unScanner = new Scanner(System.in);
         //nombre = unScanner.next();
     }
     
     public Persona(String unNombre, String unApellido){
         nombre = unNombre;
         apellido = unApellido;
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

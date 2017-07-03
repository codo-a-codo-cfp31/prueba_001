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
public class Persona implements IPersona {
    
    protected String nombre;
    protected String apellido;
    protected int edad;
    
    public Persona (String unNombre, String unApellido, int unEdad){
        nombre = unNombre;
        apellido = unApellido;
        edad = unEdad;               
    }
    
    
    
    public String comoTeLlamas(){
        return nombre;
    }
    
    public void ahoraTeLLamas(String tuNuevoNombre){
        nombre = tuNuevoNombre;
    }
        
    public String cualEsTuApellido (){
        return apellido;
    }    
    
    public void ahoraTuApellidoEs(String tuNuevoApellido){
        apellido = tuNuevoApellido;
    }
    
    public int cualEsTuEdad(){
        return edad;
    }   
    
    public void ahoraTuEdadEs(int unaEdad){
        edad = unaEdad;
    }
}


    
    
    

    
    
    
   
    
    

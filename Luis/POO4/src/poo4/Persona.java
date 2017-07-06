/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo4;


import java.util.*;/**
 *
 * @author cfp31-06
 */
public class Persona implements IPersona {
    
    protected String nombre;
    protected String apellido;
    
    public Persona (String unNombre, String unApellido){
        nombre = unNombre;
        apellido = unApellido;
        
    }
    
    
   
   
    public String comoTeLlamas(){
        return nombre;
    }
    
    public void ahoraTeLlamas(String tuNuevoNombre){
        nombre = tuNuevoNombre;
    }
        
    public String cualEsTuApellido (){
        return apellido;
    }    
    
    public void ahoraTuApellidoEs(String tuNuevoApellido){
        apellido = tuNuevoApellido;
    }
    
    

    
}

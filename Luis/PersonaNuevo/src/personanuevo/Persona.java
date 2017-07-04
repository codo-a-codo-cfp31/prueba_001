/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personanuevo;

/**
 *
 * @author Luis Vera
 */
public class Persona {
    
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int dni;
    protected Ropa suRopa;
    
    public Persona (String unNombre, String unApellido, int unaEdad){
        nombre = unNombre;
        apellido = unApellido;
        edad = unaEdad;               
    }
    
    public String comoTeLlamas (){
        return nombre;
    }
        
    public String cualEsTuApellido (){
        return apellido;
    }    
    
    public int cualEsTuEdad(){
        return edad;
    }
    //Constructor en blanco
    public Persona (){
        
    }
    
    
}

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
public class Carpintero extends Persona{
    
    
    public Carpintero(String unTalle){
        super(unTalle, "Mismo", "MismotipodeRopa");
    }
    
    public Carpintero(){
        //super("talle", "color", "lalao"); 
    }
    
    public Carpintero(String unNombre, String unApellido, int unEdad){
        super(unNombre, unApellido);
        edad = unEdad;
    }
    
}

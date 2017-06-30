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
public class Ropa {
    protected String talle;
    protected String color;
    protected String tipo;
    
    
    public Ropa(){
        talle = "untalle";
        color = "rojo";
        tipo = "lala";
    }
    
    public Ropa(String nuevotalle, String nuevocolor, String nuevotipo){
        talle = nuevotalle;
        color = nuevocolor;
        tipo = nuevotipo;
    }
    
    
    public String descripcionRopa() {
        
        return "La ropa es talle: " +  talle + " Color : " +  color;
        
    }
    
}

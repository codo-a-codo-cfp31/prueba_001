/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo4;
/**
 *
 * @AnalistaSistok
 */

public class Ropa {
    protected String talle;
   protected String color;
    protected String tipo;
     
     public Ropa(){
    talle = "untalle";
    color = "uncolor";
    tipo = "lala";
    }
     
//Constructor - constructor
    public Ropa (String talleRopa, String colorRopa, String tipoRopa){
        talle = talleRopa;
        color = colorRopa;
        tipo = tipoRopa;
    }
    
     public String cualEsTuRopa() {
    return "La ropa es talle: " +  talle + " Color : " +  color;}
}
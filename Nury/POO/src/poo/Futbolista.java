/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author CFP31-08
 */
public class Futbolista extends Persona {
    public Futbolista (String unNombre, String unApellido, int unEdad){
        super (unNombre, unApellido, unEdad);
        suRopa = new Ropa("lalea", "tallelalala", "lala");
    }
    
    public Futbolista(){
         super("M", "Azul", "camiseta");
     }
}
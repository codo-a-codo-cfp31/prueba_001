/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.objetos;
/**
 *
 * @author @AnalistaSistok #CFP31 #SEducA
 */
public class Futbolista extends Persona {
    
      public Futbolista (String unNombre, String unApellido, int unaEdad){
        super (unNombre,unApellido);  
         int edad = unaEdad;
    }
      
    public Futbolista (String talleRopa, String colorRopa, String tipoRopa){
        super (talleRopa,colorRopa,tipoRopa);  
        suRopa=new Ropa("L","Amariilla","Camiseta");
    }
    
    public Ropa cualEsTuRopa(){
    return suRopa;}
}    
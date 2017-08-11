/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.objetos;
/**
 *
 * @author @AnalistaSistok
 */

public class Carpintero extends Persona {
    //Se crea este constructor con los 3 párametros que creamos de persona y le asignamos los 
    //valores que necesitamos 
    //Los nombres de los STRINGS provienen de la clase Ropa talleRopa, colorRopa y tipoRopa
    //Se debe respetar el orden de los atributos para poder usarlos correctamete.
    
    public Carpintero(){
        //super("talle", "color", "lalao"); 
    }
    
    public Carpintero(String unTalle){
    super(unTalle,"Mismo","MismotipodeRopa");
    }
    
    public Carpintero(String unNombre, String unApellido, int unaEdad){
       super(unNombre, unApellido,unaEdad);
       edad=unaEdad;
      
    }
    
    public Carpintero(String talleRopa, String colorRopa, String tipoRopa ){
        //definir los valores en cada persona sirve para proteger los valores y que nos los pueda cambiar cualquiera
        super(talleRopa,colorRopa,tipoRopa);
    }
}
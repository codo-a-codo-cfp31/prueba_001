
package poo.objetos;

public class Carpintero extends Persona {
    
    //Se crea este constructor con los 3 árametros que creamos de persona y le asignamos los 
    //valores que necesitamos 
    //Los nombres de los STRINGS provienen de la clase Ropa talleRopa colorRopa tipoRopa
    //Se debe respetar el orden de los atributos para poder usarlos correctamete.
    public Carpintero(String talleRopa, String colorRopa, String tipoRopa ){
        
        //defiir los valores en cada persona sirve para proteger los valores y que nos los pueda cambiar cualquiera
        super(talleRopa,colorRopa,tipoRopa);
    }
    
    
    
}

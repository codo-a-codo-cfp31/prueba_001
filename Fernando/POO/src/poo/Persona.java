
package poo;

public class Persona {
     protected String nombre;
     protected String apellido;
     protected int edad;
     protected int dni;
     protected Ropa suRopa;
      
     public Persona(){
     }

     public Persona(String unNombre,String unApellido ){
     nombre = unNombre;
     apellido = unApellido;
         }
     
     public String comoTeLlamas(){
         return nombre;
     }
     
     public void ahoraTeLlamas(String tuNuevoNombre){
         nombre = tuNuevoNombre;
     }

     public String comoTeApellidas(){
         return apellido;
     }
     
     public void ahoraTeApellidas(String tuNuevoApelldo){
         nombre = tuNuevoApelldo;
     }
     
     public int cualEsTuEdad(){
         return edad;
     }
     
     public void ahoraTuEdadEs(int tuNuevaEdad){
         edad = tuNuevaEdad;
     }

     public int cualEsTuDni(){
         return dni;
     }
     
     public void ahoraTuDniEs(int tuNuevoDni){
         dni = tuNuevoDni;
     } 
     
}

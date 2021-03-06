/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo4;


/**
 *
 * @author CFP31-15
 */
public class Persona implements IPersona {
     protected String nombre;
     protected String apellido;
     protected Integer edad;
     protected int dni;
     protected Ropa suRopa;
     
     final static boolean print_ropa_description = false;
     
     public Persona(){
         //Esta NO ES la responsabiliadd de esta class
         //Scanner unScanner = new Scanner(System.in);
         //nombre = unScanner.next();
         suRopa = new Ropa();
     }
     
     public Persona(String unNombre, String unApellido){
         nombre = unNombre;
         apellido = unApellido;
          suRopa = new Ropa();
         
          if (print_ropa_description) {
              System.out.println(suRopa.descripcionRopa());
         }
        
     }
     
     public Persona(int nuevaEdad){
         edad = nuevaEdad;
         suRopa = new Ropa();
         
         if (print_ropa_description) {
              System.out.println(suRopa.descripcionRopa());
         }
        
     }
     
     public Persona(int nuevaEdad, int nuevoDNI){
         edad = nuevaEdad;
         dni = nuevoDNI;
     }
     
     public String comoTeLlamas(){
         return nombre;
     }
     
     public void ahoraTeLlamas(String tuNuevoNombre){
         nombre = tuNuevoNombre;
     }
     
     public String cualEsTuApellido(){
         return apellido;
     }
     
     public void ahoraTuApellidoEs(String tuNuevoApellido){
         apellido = tuNuevoApellido;
     }
     
     public int cualEsTuEdad(){
         return edad;
     }
     
     public String toString(){
         String numero = new String("asdad");
         String otro = "";
         return "Nombre: " + nombre + " y Apellido:  " + apellido + "edad " + edad;
     }
}

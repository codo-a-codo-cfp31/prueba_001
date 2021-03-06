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
public class Persona implements IPersona{
     protected String nombre="Bart";
     protected String apellido="Simspon";
     protected int edad=40;
     protected int dni;
     protected Ropa suRopa;
      
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
     }
     
      public Persona(String unNombre, String unApellido,int unaEdad){
         nombre = unNombre;
         apellido = unApellido;
         edad=unaEdad;
          suRopa = new Ropa();
     }
      
     //Creamos el constructor en persona para la ropa
     public Persona (String talleRopa, String colorRopa, String tipoRopa){
        suRopa = new Ropa (talleRopa, colorRopa, tipoRopa);            
     }
     
     public Persona(int nuevaEdad){
         edad = nuevaEdad;
         suRopa = new Ropa();
     }
     
     public Persona(int nuevaEdad, int nuevoDNI){
         edad = nuevaEdad;
         dni = nuevoDNI;
     }
    
     //Metodos: por cada uno de los datos que vamos a solicitar debemos crear un nuevo metodo para aa uno
     //NOMBRE
     public String comoTeLlamas(){
         return nombre;
     }
     
     public void ahoraTeLlamas(String tuNuevoNombre){
         nombre = tuNuevoNombre;
     }
     
     //APELLIDO
     public String cualEsTuApellido(){
         return apellido;
     }
     
     public void ahoraTuApellidoEs(String nuevoApellido ){
         apellido = nuevoApellido;
     }
     
     //EDAD
     public int cualEsTuEdad(){
         return edad;
     }
     public void tuEdad(int nuevaEdad ){
         edad = nuevaEdad;
     }
     
     //DNI
     public int cualEsTuDni(){
         return dni;
     }
     
     public void tuDni(int nuevoDni ){
         dni = nuevoDni;
     }
}
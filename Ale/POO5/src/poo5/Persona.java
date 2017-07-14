/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;


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
     
     final static boolean PRINT_ROPA_DESCRIPTION = false;
     
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
         
          if (PRINT_ROPA_DESCRIPTION) {
              System.out.println(suRopa.descripcionRopa());
         }
        
     }
     
     public Persona(int nuevaEdad){
         edad = nuevaEdad;
         suRopa = new Ropa();
         
         if (PRINT_ROPA_DESCRIPTION) {
              System.out.println(suRopa.descripcionRopa());
         }
        
     }
     
     public Persona(int nuevaEdad, int nuevoDNI){
         edad = nuevaEdad;
         dni = nuevoDNI;
     }
     
    /**
     *
     * @return
     */
     @Override
     final public String comoTeLlamas(){
         return nombre;
     }
     
    /**
     *asdakdadad
     * @param tuNuevoNombre
     */
     @Override
    public void ahoraTeLlamas(String tuNuevoNombre){
         nombre = tuNuevoNombre;
     }
     
    /**
     *
     * @return
     */
     @Override
    public String cualEsTuApellido(){
         return apellido;
     }
     
    /**
     *
     * @param tuNuevoApellido
     */
     @Override
    public void ahoraTuApellidoEs(String tuNuevoApellido){
         apellido = tuNuevoApellido;
     }
     
    /**
     *
     * @return
     */
     @Override
    public int cualEsTuEdad(){
         return edad;
     }
     
     @Override
     public String toString(){
         return "Nombre: " + nombre + " y Apellido:  " + apellido + "edad " + edad;
     }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.objetos;

/**
 *
 * @author ELSA.BENAviD00953
 */
public class POO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*************************************************************");
        System.out.println("-Extraterreste");
        ////////////////////////////////////////////////////////////////
        // Un extraterrestre
        IPersona et = new Extraterreste();
        System.out.println(et.comoTeLlamas() + " "+ et.cualEsTuApellido()+ "  "+ et.cualEsTuEdad());
      
        System.out.println("*************************************************************");
         System.out.println("-Persona");
        ////////////////////////////////////////////////////////////////
        // Una persona
        IPersona unaPersona = new Persona("Pirulo", "lala");        
        System.out.println(unaPersona.comoTeLlamas() + " "+ unaPersona.cualEsTuApellido()+ "  "+ unaPersona.cualEsTuEdad());
       
        System.out.println("*************************************************************");
         System.out.println("-Otra Persona");
        ////////////////////////////////////////////////////////////////
        // Otra persona
        IPersona otraPersona = new Persona();
        System.out.println(otraPersona.comoTeLlamas() + " "+ otraPersona.cualEsTuApellido()+ "  "+ otraPersona.cualEsTuEdad());
        
        System.out.println("*************************************************************");
         System.out.println("-Carpintero");
         /////////////////////////////////////////////////////////////////
        /// El carpintero
        IPersona unCarpintero = new Carpintero("Ruidoso", "Sarza", 34);
        System.out.println(unCarpintero.comoTeLlamas()+ " "+ unCarpintero.cualEsTuApellido() + " " + unCarpintero.cualEsTuEdad());
        System.out.println("*************************************************************");
    }
}

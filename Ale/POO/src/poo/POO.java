/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author CFP31-15
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////////
        // Otra persona
        Persona otraPErsona = new Persona();
        System.out.println(otraPErsona.comoTeLlamas() + " "+ otraPErsona.cualEsTuApellido()+ "  "+ otraPErsona.cualEsTuEdad());
        
        ////////////////////////////////////////////////////////////////
        // Una persona
        Persona unaPersona = new Persona("Pirulo", "lala");        
        System.out.println(unaPersona.comoTeLlamas() + " "+ unaPersona.cualEsTuApellido()+ "  "+ unaPersona.cualEsTuEdad());
       
        /////////////////////////////////////////////////////////////////
        /// El carpintero
        Carpintero unCarpintero = new Carpintero("Ruidoso", "Sarza", 34);
        System.out.println(unCarpintero.comoTeLlamas()+ " "+ unCarpintero.cualEsTuApellido() + " " + unCarpintero.cualEsTuEdad());
        
    }
    
}

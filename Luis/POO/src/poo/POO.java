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
        // TODO code application logic here
        
        Persona unaPersona = new Persona("Pirulo", "lala", 34);
        
        //unaPersona.ahoraTeLlamas("Pirulo");
        
        System.out.println(unaPersona.comoTeLlamas() + " "+ unaPersona.cualEsTuApellido());
        
        
        Carpintero unCarpintero = new Carpintero("Ruidoso", "Sarza", 34);
        
<<<<<<< HEAD
        unaPersona.ahoraTuEdadEs(25);
        
        System.out.println(unaPersona.cualEsTuEdad());
        
        unaPersona.ahoraTuDniEs(97000123);
        
        System.out.println(unaPersona.cualEsTuDni());
        
        
        System.out.println("");
        
        
        Carpintero unCarpintero = new Carpintero();
        
        unCarpintero.ahoraTeLlamas("Ruidoso");
        
        System.out.println(unCarpintero.comoTeLlamas());
        
        unCarpintero.ahoraTuApellidoEs("Romero");
        
        System.out.println(unCarpintero.cualEsTuApellido());
        
        unCarpintero.ahoraTuEdadEs(28);
        
        System.out.println(unCarpintero.cualEsTuEdad());
        
        unCarpintero.ahoraTuDniEs(23567489);
        
        System.out.println(unCarpintero.cualEsTuDni());
        
        System.out.println("");

        
        Persona unaPersonaConRopa = new Persona("talle", "cololala", "tipolalala");
        
        Futbolista unFutbolista = new Futbolista("luis", "vera", 28);
=======
        //unCarpintero.ahoraTeLlamas("Ruidoso");
>>>>>>> ebe6746fe1e00a4f11dce1835f5b364393d7180b
        
        System.out.println(unCarpintero.comoTeLlamas()+ " "+ unCarpintero.cualEsTuApellido());
        
    }
    
}

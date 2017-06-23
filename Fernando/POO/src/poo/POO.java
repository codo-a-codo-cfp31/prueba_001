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
        
        Persona otraPersona = new Persona();
        System.out.println(otraPersona.comoTeLlamas() + "  " + otraPersona.comoTeApellidas()+ " " +otraPersona.cualEsTuEdad());
        
        Persona unaPersona = new Persona();
        unaPersona.ahoraTeLlamas("Pirulo");
        System.out.println(unaPersona.comoTeLlamas());
        
        Carpintero unCarpintero = new Carpintero();
        unCarpintero.ahoraTeLlamas("Ruidoso");
        System.out.println("El carpintero es de Nombre: "+unCarpintero.comoTeLlamas());
        
        Futbolista unFutbolista = new Futbolista();
        unFutbolista.ahoraTuDniEs(22222222);
        System.out.println("Dni del futbolistas es: "+unFutbolista.cualEsTuDni());   
                
    }
}

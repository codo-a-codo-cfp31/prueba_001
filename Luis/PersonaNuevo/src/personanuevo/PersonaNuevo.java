/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personanuevo;

/**
 *
 * @author Luis Vera
 */
public class PersonaNuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona unaPersona = new Persona ("Luis", "Vera", 28);
        System.out.println(unaPersona.comoTeLlamas()+" "+ unaPersona.cualEsTuApellido()+" "+unaPersona.cualEsTuEdad());
        
        Futbolista unFutbolista = new Futbolista ("Pedro", "Hernandez", 26);
        System.out.println(unFutbolista.comoTeLlamas()+" "+unFutbolista.cualEsTuApellido()+" "+unFutbolista.cualEsTuEdad());
        
        Futbolista ropaFutbolista = new Futbolista ("M", "Verde", "Camiseta");
        System.out.println(ropaFutbolista.cualEsTuRopa());
        
       //Ropa ropaFutbolista = new Ropa ("M", "Verde", "Camiseta");
       //System.out.println(ropaFutbolista.cualEsTuRopa());
        
        
       
        // TODO code application logic here
    }
    
}

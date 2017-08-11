/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.objetos;
public class POO {
    /**
     *@author @AnalistaSistok args the command line arguments
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
        IPersona unaPersona = new Persona("Pirulo", "Lala",20);        
        System.out.println(unaPersona.comoTeLlamas() + " "+ unaPersona.cualEsTuApellido()+ "  "+ unaPersona.cualEsTuEdad());
        Ropa ropaPersona=new Ropa("M","Azul","Camisa");
        System.out.println(ropaPersona.cualEsTuRopa());
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
        Ropa ropaCarpintero=new Ropa("M","Azul","Camisa");
        System.out.println(ropaCarpintero.cualEsTuRopa());
        System.out.println("*************************************************************");
        
         System.out.println("*************************************************************");
         System.out.println("-Futbolista");
         /////////////////////////////////////////////////////////////////
        /// El futbolista
        IPersona unFutbolista=new Futbolista("Rodrigo","Mora",20);
        System.out.println(unFutbolista.comoTeLlamas()+ " "+ unFutbolista.cualEsTuApellido() + " " + unCarpintero.cualEsTuEdad());
        Ropa ropaFutbolista=new Ropa("M","Banda Roja","Camiseta");
        System.out.println(ropaFutbolista.cualEsTuRopa());
        System.out.println("*************************************************************");
    }
}  
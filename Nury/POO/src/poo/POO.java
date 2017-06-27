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
        
        Persona unaPersona = new Persona();
        
        unaPersona.ahoraTeLlamas("Pirulo");
        unaPersona.ahoraTuApellido("Lopez");
        unaPersona.ahoraTuEdadEs(27);
        unaPersona.ahoraTuDNIEs(123456);
        
        System.out.println("-----------------------");
        System.out.println(unaPersona.comoTeLlamas());
        System.out.println(unaPersona.cualEsTuApellido());
        System.out.println(unaPersona.cualEsTuEdad());
        System.out.println(unaPersona.cualEsTuDNI());
        System.out.println(unaPersona.suRopa.cualEsTuRopa());
        System.out.println("-----------------------");
        
        Carpintero unCarpintero = new Carpintero();//primero va el class o molde que cree para carpintero,
        //luego va el nombre de la variable y apartir de new carpintero cree el objeto.
        
        unCarpintero.ahoraTeLlamas("Ruidoso");
        unCarpintero.ahoraTuApellido("Perez");
        unCarpintero.ahoraTuEdadEs(13);
        unCarpintero.ahoraTuDNIEs(222222);
        
         System.out.println("-----------------------");
        System.out.println(unCarpintero.comoTeLlamas());
        System.out.println(unCarpintero.cualEsTuApellido()); 
        System.out.println(unCarpintero.cualEsTuEdad());
        System.out.println(unCarpintero.cualEsTuDNI());
        System.out.println(unCarpintero.suRopa.cualEsTuRopa());
        System.out.println("-----------------------");
         
        Futbolista unFutbolista = new Futbolista();
             
         unFutbolista.ahoraTeLlamas("Mauro");
         unFutbolista.ahoraTuApellido("Icardi");
         unFutbolista.ahoraTuEdadEs(24);
         unFutbolista.ahoraTuDNIEs(999999);
         
        System.out.println("-----------------------"); 
        System.out.println(unFutbolista.comoTeLlamas());
        System.out.println(unFutbolista.cualEsTuApellido());
        System.out.println(unFutbolista.cualEsTuEdad());
        System.out.println(unFutbolista.cualEsTuDNI());
        System.out.println(unFutbolista.suRopa.cualEsTuRopa());
        System.out.println("-----------------------");
       // asi podria imprmir los valores de esas variables pero era mejor imprimirlos desde el metodo que cree en ropa.
        //System.out.println("Su ropa es: "+unFutbolista.suRopa.talle+" "+ unFutbolista.suRopa.color+" "+ unFutbolista.suRopa.tipo);   }
    }

}    
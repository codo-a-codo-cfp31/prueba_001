/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;

/**
 *
 * @author AIRAM
 */
public class POO7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Juego unaLista=new Juego();
        PalabraAdivina unaPalabra= new PalabraAdivina();
        
        unaLista.Juego();
        
        unaLista.Aleatorio();
        
        unaLista.contarPalabra();
        
        unaLista.mostrarPalabra();
        
        unaPalabra.PalabraAdivina();
        
        unaPalabra.contarPalabra();
        
     
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;

import java.util.Scanner;

/**
 *
 * @author AIRAM
 */
public class PalabraAdivina extends Juego implements IPalabra{
    
    int intentos;
    String palabraIngresada="";
    Juego compara=new Juego();
    
    
    public void PalabraAdivina(){
        
        Scanner unScanner = new Scanner(System.in);
        System.out.println("Inserta una palabra");
        palabraIngresada = unScanner.next();
        
    }

    @Override
    public void contarPalabra() {
        
       compara.getPalabra();
        
       
        if (palabraIngresada.equalsIgnoreCase(Palabra))
                {
                    
                 System.out.println("Son iguales");
                }
        else
        {
            System.out.println("No son iguales");
        }
        
    }

    @Override
    public void mostrarPalabra() {
        
    }
    
}

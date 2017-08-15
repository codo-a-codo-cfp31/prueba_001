/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;

/**
 *
 * @author CFP31-10
 */
public class Controlador {
    protected Juego Juego;
    protected String LetraIngresada;
    
    public Controlador(){

    }
      
    public void Run(){        
        Juego ElJuego = new Juego();
        Palabra LaPalabra = new Palabra();
        System.out.println(LaPalabra.getPalabraElegida());
        System.out.println(LaPalabra.getLong());
        LaPalabra.recorrerYCompararLetras();
       
        
         }

}


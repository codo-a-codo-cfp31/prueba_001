/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;

import java.util.*;

/**
 *
 * @author CFP31-10
 */
public class Juego {

    protected Palabra LaPalabra;
    protected String dato;

    public Juego() {
        LaPalabra = new Palabra();

    }

    public Palabra ObtenerPalabra() {
        LaPalabra.getPalabraElegida();
        LaPalabra.getLong();
        LaPalabra.llenarListaDeLetras();
        do{     
             System.out.println(LaPalabra.PalabraOculta);
            Scanner unScanner = new Scanner(System.in);
            dato=unScanner.nextLine();
        LaPalabra.Ingresar(dato);
        LaPalabra.compararPalabraOculta();
       
        }while(!LaPalabra.LetraIngresada.equalsIgnoreCase("salir"));
        return LaPalabra;
    }
}
        
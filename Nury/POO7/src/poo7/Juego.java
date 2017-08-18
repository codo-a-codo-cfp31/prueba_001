/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.util.*;

/**
 *
 * @author CFP31-10
 */
public class Juego implements IKeyGameListener {

    protected Palabra LaPalabra;
    protected String dato;

    public Juego() {
        LaPalabra = new Palabra();

    }

    public Palabra ObtenerPalabra() {
        LaPalabra.getPalabraElegida();
        LaPalabra.getLong();
        LaPalabra.llenarListaDeLetras();
        do {
            System.out.println(LaPalabra.PalabraElegida);
            System.out.println(LaPalabra.PalabraOculta);
            Scanner unScanner = new Scanner(System.in);
            dato = unScanner.nextLine();
            LaPalabra.Ingresar(dato);
            LaPalabra.compararPalabraOculta();
            } while (!LaPalabra.LetraIngresada.equalsIgnoreCase("salir"));
        return LaPalabra;
    }

    public void seAcabo(){
        int cont=3;
        if (!LaPalabra.PalabraOculta.contains(dato)){
            cont=cont--;
            System.out.println("PERDISTE");
        }
         
    }
    
    @Override
    public void listen(Event event) {
        ActionEvent ae = (ActionEvent) event.target;
        dato = ae.getActionCommand();
        System.out.println("Llego a Game: " + dato);
        LaPalabra.Ingresar(dato);
        LaPalabra.compararPalabraOculta();
        System.out.println(LaPalabra.PalabraOculta);
    }
}

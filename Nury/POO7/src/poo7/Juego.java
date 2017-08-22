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

    public Juego() {
        LaPalabra = new Palabra();

    }

    public Palabra ObtenerPalabra() {
        LaPalabra.getPalabraElegida();
        LaPalabra.getLong();
        LaPalabra.llenarPalabraOculta();
        LaPalabra.compararPalabraOculta();
        return LaPalabra;
    }

    @Override
    public void listen(Event event) {
        ActionEvent ae = (ActionEvent) event.target;
        String caracter = ae.getActionCommand();
        System.out.println("Llego a Game: " + caracter );
    }
}

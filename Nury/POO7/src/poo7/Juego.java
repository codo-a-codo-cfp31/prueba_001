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
    protected int Vidas;

    public Juego() {
        LaPalabra = new Palabra();
        Vidas=6;

    }

    public void ComenzarJuego() {
        LaPalabra.getPalabraElegida();
        LaPalabra.getLong();
        LaPalabra.llenarListaDeLetras();
            System.out.println(LaPalabra.PalabraElegida);
            System.out.println(LaPalabra.PalabraOculta);
    }
    
    @Override
    public void listen(Event event) {
        ActionEvent ae = (ActionEvent) event.target;
        dato = ae.getActionCommand();
        System.out.println("Llego a Game: " + dato);
        if (!TerminoElJuego()) {
            LaPalabra.Ingresar(dato);
            LaPalabra.compararPalabraOculta();
            System.out.println(LaPalabra.PalabraOculta);
        }else{
           
        }
       if (!LaPalabra.PalabraOculta.contains(dato)) {
           --Vidas;//=Vidas-1;
        }

    }
  
    public boolean TerminoElJuego(){
        if (Vidas<=0){
        return true;
        }else{       
        return false;
        }
    }
    
    public String toString() {
        String lala = "";
        for (int i = 0; i < LaPalabra.Long; i++) {
            lala = lala + LaPalabra.PalabraOculta.get(i);
        }
        return lala;
    }
    
    public boolean Gano(){
        if (!LaPalabra.PalabraOculta.contains("-")){
            return true;
        }else{
        return false;
  
    }
    }
   

}

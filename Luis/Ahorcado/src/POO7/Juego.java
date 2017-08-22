/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO7;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.util.*;
import java.util.List;
/**
 *
 * @author Luis Vera
 */
public class Juego implements IKeyGameListener{
    
    protected Palabra laPalabraAleatoria;
    
        
public Juego(){
    


}

public final void ObtenerPalabra(){
    
    laPalabraAleatoria = new Palabra();
    laPalabraAleatoria.PalabraRandom(); //Este inicializa la variable "laPalabraAleatoria" porque dentro de este metodo se le dio valor a esta variable
    System.out.println(laPalabraAleatoria.getPalabraAleatoria());
    
    
    
}

    @Override
    public void listen(Event event) {
        ActionEvent ae = (ActionEvent)event.target;
        String datoNuevo = ae.getActionCommand();
        System.out.println("Llego a Game: " + ae.getActionCommand());
        
        laPalabraAleatoria.compararCaracter(datoNuevo);
    }

}


    


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
    protected String letraTeclado;
    
        
public Juego(){
    
    AdivinarCaracter();
    
}

public final void ObtenerPalabra(){
    
    laPalabraAleatoria = new Palabra(); 
}

    @Override
    public void listen(Event event) {
        ActionEvent ae = (ActionEvent)event.target;
        System.out.println("Llego a Game: " + ae.getActionCommand());
        letraTeclado = ae.getActionCommand();
    }
    
//comparar actioncommand con el substring de la palabra oculta 
final public void AdivinarCaracter(){
    Palabra CompararLetra = new Palabra();
    CompararLetra.compararCaracter(letraTeclado);
    System.out.println(letraTeclado);
    
}
    
public void ContadorDeOportunidades (){
    //for (int i = 0; i < ; i++) {
        
    //}
}
}


    


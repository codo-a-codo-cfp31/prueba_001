/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.awt.Event;
import java.awt.event.ActionEvent;

/**
 *
 * @author alejandro.medici
 */
public class Game implements IKeyGameListener {

    @Override
    public void listen(Event event) {
        ActionEvent ae = (ActionEvent)event.target;
        System.out.println("Llego a Game: " + ae.getActionCommand());
    }

   

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import calculadora.ICalculadora;
import java.awt.Event;

/**
 *
 * @author CFP31-15
 */
public class Controller implements IViewEventListener {

    protected MasterView main_view;
    protected ICalculadora conversor;

    public Controller() {
        main_view = new MasterView();
        main_view.setVisible(true);

        main_view.AddViewEvenListener(this);

        //new ConversorTemperatura();
    }

    public void Run() {
      
    }

    @Override
    public void listen(Event event) {
        
      
   
    }

}

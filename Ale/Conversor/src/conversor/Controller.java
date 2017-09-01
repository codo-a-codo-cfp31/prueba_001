/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.awt.Event;
import java.awt.event.ActionEvent;

/**
 *
 * @author CFP31-15
 */
public class Controller implements IViewEventListener{
    protected MasterView main_view;
    protected Conversor conversor;

    public Controller() {
        main_view = new MasterView();
        main_view.setVisible(true);
        
        main_view.AddViewEvenListener(this);
        
        conversor = new Conversor();      
    }
    
    
    public void Run(){
        
        conversor.setTemperature((float) 232.4, "C");
        
        float valorConvertido = conversor.getTemperature("k");
        
        System.out.println("El Valor " +  valorConvertido);
        
    }

    @Override
    public void listen(Event event) {
        
        ActionEvent ae = (ActionEvent) event.target;
        String queBoton = ae.getActionCommand();
        
        System.out.println(queBoton);
        
        String valorEntring = main_view.getjTextField1().getText();
        
        float valor = (float) Double.parseDouble(valorEntring);
        
        conversor.setTemperature(valor, "C");
        
        float valorConvertido = conversor.getTemperature("k");
        
       main_view.getjLabel1().setText("" +  valorConvertido);
        
        System.out.println(event);
    }
    
    
    
}

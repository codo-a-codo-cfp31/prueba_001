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
public class Controller implements IViewEventListener {
    protected MasterView main_view;
    protected Conversor conversor;

    public Controller() {
        main_view = new MasterView();
        main_view.setVisible(true);
        
        main_view.AddViewEvenListener(this);
        
        conversor = new Conversor();      
    }
    
    
    public void Run(){
        
        // conversor.setTemperature((float) 23.4, "C");
        
        float valorConvertido = conversor.getTemperature("k");
        
        System.out.println("El Valor " +  valorConvertido);
        
    }

    @Override
    public void Listen(Event event) {
        
        ActionEvent ae = (ActionEvent) event.target;
        
        String valorEntring = main_view.getjTextField1().getText();
        
        float valor = (float) Double.parseDouble(valorEntring);
        
        System.out.println(valorEntring);
        
        if (main_view.getjComboBox1().getModel().getSelectedItem().toString().equalsIgnoreCase("C"))
        {
        conversor.getTemperature(valorEntring);
            
        }

                
        conversor.setTemperature(valor, "C");
        
        float valorConvertido = conversor.getTemperature("k");

        System.out.println("El Valor es " + valorConvertido);
        
        main_view.getjLabel1().setText("" + valorConvertido);
        
        System.out.println(event);
    }
    
    
    
}

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
<<<<<<< HEAD
public class Controller implements IViewEventListener {
=======
public class Controller implements IViewEventListener{
>>>>>>> 55f60b11774fe592070d0ddd2777e5672422ae78
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
<<<<<<< HEAD
    public void Listen(Event event) {
        
        ActionEvent ae = (ActionEvent) event.target;
=======
    public void listen(Event event) {
        
        ActionEvent ae = (ActionEvent) event.target;
        String queBoton = ae.getActionCommand();
        
        System.out.println(queBoton);
>>>>>>> 55f60b11774fe592070d0ddd2777e5672422ae78
        
        String valorEntring = main_view.getjTextField1().getText();
        
        float valor = (float) Double.parseDouble(valorEntring);
        
<<<<<<< HEAD
        System.out.println(valorEntring);
        
        if (main_view.getjComboBox1().getModel().getSelectedItem().toString().equalsIgnoreCase("C"))
        {
        conversor.getTemperature(valorEntring);
            
        }

                
        conversor.setTemperature(valor, "C");
        
        float valorConvertido = conversor.getTemperature("k");

        System.out.println("El Valor es " + valorConvertido);
        
        main_view.getjLabel1().setText("" + valorConvertido);
=======
        conversor.setTemperature(valor, "C");
        
        float valorConvertido = conversor.getTemperature("k");
        
       main_view.getjLabel1().setText("" +  valorConvertido);
>>>>>>> 55f60b11774fe592070d0ddd2777e5672422ae78
        
        System.out.println(event);
    }
    
    
    
}

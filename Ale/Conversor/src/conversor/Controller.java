/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author CFP31-15
 */
public class Controller {
    protected MasterView main_view;
    protected Conversor conversor;

    public Controller() {
        main_view = new MasterView();
        main_view.setVisible(true);
        
        conversor = new Conversor();      
    }
    
    
    public void Run(){
        
        conversor.setTemperature((float) 232.4, "C");
        
        float valorConvertido = conversor.getTemperature("k");
        
        System.out.println("El Valor " +  valorConvertido);
        
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import calculadora.CalculadoraFactory;
import calculadora.ICalculadora;
import java.awt.Event;
import java.awt.event.ActionEvent;

/**
 *
 * @author CFP31-15
 */
public class Controller implements IViewEventListener {

    protected MasterView main_view;
    protected ICalculadora calculadora;

    public Controller() {
        main_view = new MasterView();
        main_view.setVisible(true);

        main_view.AddViewEvenListener(this);

        //new ConversorTemperatura();
    }

    public void Run() {
         calculadora = CalculadoraFactory.createCalculadora("cientifica");   
    }

    @Override
    public void listen(Event event) {
        ActionEvent ae = (ActionEvent)event.target;
        System.out.println("Tecla " + ae.getActionCommand());
        
        String tecla = ae.getActionCommand();
        String numero = main_view.getjTextField1().getText();
        Integer longitud = numero.length();
                      
        //Verifica si el string es un numero
        if(tecla.matches("\\d") || tecla.matches("[.]")) {
            if(longitud <= 10){
                if( tecla.matches("[.]") && numero.indexOf(".") == -1){
                    numero += tecla;
                }else if (!tecla.matches("[.]")){
                    numero += tecla;
                }
            }           
            main_view.getjTextField1().setText(numero);
        } 
        
        if(tecla.equals("C")){
                main_view.getjTextField1().setText("");
                longitud = 0;
        }
                
        
        if(tecla.matches("[-,+,X,/]")){
            calculadora.setElement1(Float.parseFloat(numero));
            calculadora.setOperator(tecla);
            main_view.getjTextField1().setText("");
            longitud = 0;            
        }
        
        if(tecla.equals("=")){
            calculadora.setElement2(Float.parseFloat(numero));
            calculadora.binaryOperation(calculadora.getElement1(), calculadora.getOperator(), calculadora.getElement2());           
            main_view.getjTextField1().setText(String.valueOf(calculadora.getResult()));            
        }
        
        //CIENTIFICA
        /*
        if(tecla.matches("[x²,√,10ˣ,sin,cos,tan]")){
            calculadora.setElement1(Float.parseFloat(numero));
            calculadora.setOperator(tecla);
            calculadora.UnaryOperation(calculadora.getElement1(), calculadora.getOperator());
            main_view.getjTextField1().setText(String.valueOf(calculadora.getResult()));
        } 
*/
    }
    
}

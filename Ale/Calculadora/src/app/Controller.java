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
         calculadora = CalculadoraFactory.createCalculadora("simple");
        //1- Operacion suma
        float elemento1 = (float)Math.random() * 10;
        float elemento2 = (float)Math.random() * 10;
        calculadora.binaryOperation(elemento1, "+", elemento2);
        System.out.println("El resultado (+) para los elementos es: " + calculadora.getResult());
        
        //2- Operacion resta
        elemento1 = (float)Math.random() * 10;
        elemento2 = (float)Math.random() * 10;
        calculadora.binaryOperation(elemento1, "-", elemento2);
        System.out.println("El resultado (-) para los elementos es: " + calculadora.getResult());
   
    }

    @Override
    public void listen(Event event) {
        ActionEvent ae = (ActionEvent)event.target;
        System.out.println("Tecla " + ae.getActionCommand());
      
        String tecla = ae.getActionCommand();
        
        //Verifica si el string es un numero
        if(tecla.matches("\\d") ) {
            
            String valorAString = main_view.getjTextField1().getText();
            Double valorA = Double.parseDouble(valorAString);

            System.out.println("Es numero");
        } else {
            
           
            
        }
    }

}

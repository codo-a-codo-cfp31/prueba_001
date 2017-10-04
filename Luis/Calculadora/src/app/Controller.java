/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import calculadora.*;
//import calculadora.CalculadoraSimple;
//import calculadora.ICalculadora;
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
        
        float elemento1 = (float)Math.random()*10;
        float elemento2 = (float)Math.random()*10;
        calculadora.binaryOperation(elemento1, "+", elemento2);
        System.out.println("El elemento 1 es " + elemento1);
        System.out.println("El elemento 2 es " + elemento2);
        System.out.println("El resultado de la suma es: " + calculadora.getResultado());
        
        elemento1 = (float)Math.random()*10;
        elemento2 = (float)Math.random()*10;
        calculadora.binaryOperation(elemento1, "-", elemento2);
        System.out.println("El elemento 1 es " + elemento1);
        System.out.println("El elemento 2 es " + elemento2);
        System.out.println("El resultado de la resta es: " + calculadora.getResultado());
        
        elemento1 = (float)Math.random()*10;
        elemento2 = (float)Math.random()*10;
        calculadora.binaryOperation(elemento1, "*", elemento2);
        System.out.println("El elemento 1 es " + elemento1);
        System.out.println("El elemento 2 es " + elemento2);
        System.out.println("El resultado de la multiplicacion es: " + calculadora.getResultado());
        
        elemento1 = (float)Math.random()*10;
        elemento2 = (float)Math.random()*10;
        calculadora.binaryOperation(elemento1, "/", elemento2);
        System.out.println("El elemento 1 es " + elemento1);
        System.out.println("El elemento 2 es " + elemento2);
        System.out.println("El resultado de la division es: " + calculadora.getResultado());
      
    }

    @Override
    public void listen(Event event) {
        ActionEvent ae = (ActionEvent)event.target;
        System.out.println("Tecla " + ae.getActionCommand());
    }

}

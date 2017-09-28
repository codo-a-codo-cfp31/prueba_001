/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoCalculadora;

import Calculadoras.CalculadoraFactory;
import Calculadoras.ICalculadora;
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
        //main_view.setVisible(true);

        main_view.AddViewEvenListener(this);

        //conversor = ConversorFactory.crearConversor("Temperatura");
    }

    public void Run() {
        
        calculadora = CalculadoraFactory.crearCalculadora("simple");
        float elemento1= (float)Math.random();
        float elemento2= (float)Math.random();
        calculadora.BinaryOperation(elemento1,"+",elemento2);
        System.out.println("a= "+elemento1);
        System.out.println("b= "+elemento2);
        System.out.println("el resultado de la suma es " + calculadora.Result());
        
        calculadora.BinaryOperation(elemento1,"-",elemento2);
        System.out.println("a= "+elemento1);
        System.out.println("b= "+elemento2);
        System.out.println("el resultado de la resta es " + calculadora.Result());
        
        calculadora.BinaryOperation(elemento1,"*",elemento2);
        System.out.println("a= "+elemento1);
        System.out.println("b= "+elemento2);
        System.out.println("el resultado de la multiplicacion es " + calculadora.Result());
        
        calculadora.BinaryOperation(elemento1,"/",0.0f);
        System.out.println("a= "+elemento1);
        System.out.println("b= "+elemento2);
        System.out.println("el resultado de la division es " + calculadora.Result());
        
    }
    
    @Override
    public void Listen(Event event) {

    }
}

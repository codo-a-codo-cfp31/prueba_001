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
        main_view.setVisible(true);

        main_view.AddViewEvenListener(this);

        //conversor = ConversorFactory.crearConversor("Temperatura");
    }

    public void Run() {

        calculadora = CalculadoraFactory.crearCalculadora("simple");
        /* float elemento1 = (float) Math.random() * 10;
        float elemento2 = (float) Math.random() * 10;
        calculadora.BinaryOperation(elemento1, "+", elemento2);
        System.out.println("a= " + elemento1);
        System.out.println("b= " + elemento2);
        System.out.println("el resultado de la suma es " + calculadora.getResult());

        calculadora.BinaryOperation(elemento1, "-", elemento2);
        System.out.println("el resultado de la resta es " + calculadora.getResult());

        calculadora.BinaryOperation(elemento1, "*", elemento2);

        System.out.println("el resultado de la multiplicacion es " + calculadora.getResult());

        calculadora.BinaryOperation(elemento1, "/", 0);
        System.out.println("el resultado de la division es " + calculadora.getResult());
         */
    }

    @Override
    public void Listen(Event event) {
        ActionEvent ae = (ActionEvent) event.target;
        System.out.println("Tecla " + ae.getActionCommand());

        String tecla = ae.getActionCommand();

        //verifica si esta la regular exprecion, en este caso si hay digitos
        if (tecla.matches("\\d")) {
            String elemento = main_view.getjTextField1().getText();
            if (elemento.length() < 12) {
                elemento = elemento + tecla;
            }

            main_view.getjTextField1().setText(elemento);
            //System.out.println("es numero");
        } else {
            if (tecla.equals("C")) {
                main_view.getjTextField1().setText("");
            }
            if (tecla.equals("CE")) {
                String elemento = main_view.getjTextField1().getText();
                int longitud = elemento.length();
                elemento = elemento.substring(0, longitud - 1);
                main_view.getjTextField1().setText(elemento);
            }
            if (tecla.equals("+")) {
                calculadora.setOp("+");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();

                    calculadora.setA((float) Double.parseDouble(elemento));
                    main_view.getjTextField1().setText("");
                }else{ 
                    main_view.getjTextField1().setText("");
                }
            }
            if (tecla.equals("-")) {

            }
            if (tecla.equals("=")) {
                String elemento=main_view.getjTextField1().getText();
             calculadora.setB((float) Double.parseDouble(elemento));

             calculadora.BinaryOperation(calculadora.getA(),calculadora.getOp(),calculadora.getB());
             main_view.getjTextField1().setText(calculadora.getResultString());
             calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
            }
        }
    }
}

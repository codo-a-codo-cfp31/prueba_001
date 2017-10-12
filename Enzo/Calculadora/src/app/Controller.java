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
        float elemento1 = (float) Math.random() * 10;
        float elemento2 = (float) Math.random() * 10;
        calculadora.binaryOperation(elemento1, "+", elemento2);
        System.out.println("El resultado (+) para los elementos es: " + calculadora.getResult());

        //2- Operacion resta
        elemento1 = (float) Math.random() * 10;
        elemento2 = (float) Math.random() * 10;
        calculadora.binaryOperation(elemento1, "-", elemento2);
        System.out.println("El resultado (-) para los elementos es: " + calculadora.getResult());

        //3- Operacion multiplicacion
        elemento1 = (float) Math.random() * 10;
        elemento2 = (float) Math.random() * 10;
        calculadora.binaryOperation(elemento1, "*", elemento2);
        System.out.println("El resultado (X) para los elementos es: " + calculadora.getResult());

        //2- Operacion division
        elemento1 = (float) Math.random() * 10;
        elemento2 = (float) Math.random() * 10;
        calculadora.binaryOperation(elemento1, "/", elemento2);
        System.out.println("El resultado (/) para los elementos es: " + calculadora.getResult());
    }

    @Override
    public void listen(Event event) {
        ActionEvent ae = (ActionEvent) event.target;
        System.out.println("Tecla " + ae.getActionCommand());

        String tecla = ae.getActionCommand();

        String numero = main_view.getjTextField1().getText();

        Integer longitud = numero.length();
        //Verifica si el string es un numero
        if (tecla.matches("\\d")) {
            if (longitud <= 10) {
                numero = numero + tecla;
            }
            main_view.getjTextField1().setText(numero);
            System.out.println("numero en display " + numero);
        } else {
            if (tecla.equals("C")) {
                main_view.getjTextField1().setText("");
                longitud = 0;
            } else if (tecla.equals("<X")) {
                numero = numero.substring(0, longitud - 1);
                main_view.getjTextField1().setText(numero);
            } else if (tecla.equals("+")) {
                Double valorNumerico = Double.parseDouble(numero);
                calculadora.setElement1(valorNumerico.floatValue());
                calculadora.setOperator("+");
                main_view.getjTextField1().setText("");
            } else if (tecla.equals("-")) {
                Double valorNumerico = Double.parseDouble(numero);
                calculadora.setElement1(valorNumerico.floatValue());
                calculadora.setOperator("-");
                main_view.getjTextField1().setText("");
            } else if (tecla.equals("X")) {
                Double valorNumerico = Double.parseDouble(numero);
                calculadora.setElement1(valorNumerico.floatValue());
                calculadora.setOperator("X");
                main_view.getjTextField1().setText("");
            } else if (tecla.equals("/")) {
                Double valorNumerico = Double.parseDouble(numero);
                calculadora.setElement1(valorNumerico.floatValue());
                calculadora.setOperator("/");
                main_view.getjTextField1().setText("");
            } else if (tecla.equals(".")) {
                if (longitud <= 10) {
                    numero = numero + tecla;
                }
                main_view.getjTextField1().setText(numero);
            } else if (tecla.equals("=")) {
                Double valorNumerico = Double.parseDouble(numero);
                calculadora.setElement2(valorNumerico.floatValue());
                calculadora.binaryOperation(calculadora.getElement1(), calculadora.getoperator(), valorNumerico.floatValue());
                float resultado = calculadora.getResult();
                main_view.getjTextField1().setText("" + resultado);
            }
        }

        if (longitud > 10) {
            main_view.getjLabel1().setText("Numero maximo alcanzado: " + longitud);
        } else {
            main_view.getjLabel1().setText("");
        }
    }
}
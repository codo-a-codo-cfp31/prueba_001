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
import java.awt.event.KeyEvent;
import java.math.*;

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
        
        ConversorListModel model_tipos = new ConversorListModel(CalculadoraFactory.getListaCalculadoras());
        main_view.getjComboBox3().setModel(model_tipos);

        /*calculadora = CalculadoraFactory.crearCalculadora("simple");

        float elemento1 = (float) Math.random() * 10;
        float elemento2 = (float) Math.random() * 10;

        //2- Operacion suma
        calculadora.BinaryOperation(elemento1, "+", elemento2);
        System.out.println("El resultado (+) para los elementos es: " + calculadora.getResultString());
        calculadora.BinaryOperation(elemento1, "-", elemento2);
        System.out.println("El resultado (-) para los elementos es: " + calculadora.getResultString());

        //3- Operacion raiz
        calculadora = CalculadoraFactory.crearCalculadora("cientifica");
        calculadora.UnaryOperation(elemento1, "pi");
        System.out.println("El resultado (raiz) para los elementos es: " + calculadora.getResultString());*/

    }

    @Override
    public void Listen(Event event) {
        String eventType = event.target.getClass().getCanonicalName();
        String tecla = "";
        if (eventType.equalsIgnoreCase("java.awt.event.ActionEvent")) {
            ActionEvent ae = (ActionEvent) event.target;
            tecla = ae.getActionCommand();
        } else if (eventType.equalsIgnoreCase("java.awt.event.KeyEvent")) {
            KeyEvent ke = (KeyEvent) event.target;
            tecla = "" + ke.getKeyChar();

        }
        System.out.println("Tecla " + tecla);
        

        //verifica si esta la regular exprecion, en este caso si hay digitos
        if ((tecla.matches("\\d")) || (tecla.equalsIgnoreCase("."))) {
            String elemento = main_view.getjTextField1().getText();
            if (elemento.length() < 12) {
                elemento = elemento + tecla;
            }

            main_view.getjTextField1().setText(elemento);
            //System.out.println("es numero");
        } else {
            if (tecla.equals("C")) {
                main_view.getjTextField1().setText("");
                calculadora.setA(0);
                calculadora.setB(0);
                calculadora.setOp("");
                calculadora.BinaryOperation(0, "x", 0);
            }

            if (tecla.equals("CE")) {
                String elemento = main_view.getjTextField1().getText();
                int longitud = elemento.length();

                int limiteLong = Math.max(0, longitud - 1);
                elemento = elemento.substring(0, limiteLong);

                if (!elemento.equals("")) {
                    calculadora.setA((float) Double.parseDouble(elemento));
                    //acá obtengo el operador que esta en uso y lo guardo en una variable 
                    String tempOperator = calculadora.getOp();
                    //aca fijo el operador suma para obtener el resultado
                    calculadora.BinaryOperation((float) Double.parseDouble(elemento), "+", 0.f);
                    // aca vuelco a setear el operador que estoy utilizando en realidad (y no es +)
                    calculadora.setOp(tempOperator);
                    /*aca sumo el valor de elemento mas cero que me queda el valor intacto
                    y elemento va a ser lo que sea que este en la pantalla.
                     */
                }
                main_view.getjTextField1().setText(elemento);
            }
            if (tecla.equals("+")) {

                calculadora.setOp("+");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();

                    calculadora.setA((float) Double.parseDouble(elemento));
                } else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
                }

                main_view.getjTextField1().setText("");

            }

            if (tecla.equals("-")) {

                calculadora.setOp("-");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();

                    calculadora.setA((float) Double.parseDouble(elemento));
                } else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
                }

                main_view.getjTextField1().setText("");

            }

            if (tecla.equals("x")) {

                calculadora.setOp("x");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();

                    calculadora.setA((float) Double.parseDouble(elemento));
                } else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
                }

                main_view.getjTextField1().setText("");

            }

            if (tecla.equals("/")) {

                calculadora.setOp("/");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();

                    calculadora.setA((float) Double.parseDouble(elemento));
                } else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
                }

                main_view.getjTextField1().setText("");

            }

            if (tecla.equals("=")) {
                String elemento = main_view.getjTextField1().getText();
                calculadora.setB((float) Double.parseDouble(elemento));

                calculadora.BinaryOperation(calculadora.getA(), calculadora.getOp(), calculadora.getB());
                main_view.getjTextField1().setText(calculadora.getResultString());

                calculadora.setOp("=");

            }
        }
    }
}

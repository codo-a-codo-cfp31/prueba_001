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
        
        ConversorListModel model = new ConversorListModel(CalculadoraFactory.getListCalcuadora());
        
        main_view.getjComboBox3().setModel(model);
    }

    @Override
    public void listen(Event event) {
        
        if ( event.target.getClass().getCanonicalName().equals("javax.swing.event.PopupMenuEvent")){
            return;
        }
        
        ActionEvent ae = (ActionEvent) event.target;
        System.out.println("Tecla " + ae.getActionCommand());

        String tecla = ae.getActionCommand();
        String numero = main_view.getjTextField1().getText();
        Integer longitud = numero.length();
        //Verifica si el string es un numero
<<<<<<< HEAD
        if(tecla.matches("\\d") ) {
            
            String valorAString = main_view.getjTextField1().getText();
            Double valorA = Double.parseDouble(valorAString);
=======
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
                numero = numero.substring(0, longitud-1);
                main_view.getjTextField1().setText(numero);
            } else if (tecla.equals("+")) {
                Double valorNumerico = Double.parseDouble(numero);
            }
        }
>>>>>>> 63237fe1ea58e4faa63731088d75ef3764d29176

        if (longitud > 10) {
            main_view.getjLabel1().setText("Numero maximo alcanzado: " + longitud);
        } else {
<<<<<<< HEAD
            
           
            
=======
            main_view.getjLabel1().setText("");
>>>>>>> 63237fe1ea58e4faa63731088d75ef3764d29176
        }
    }

}

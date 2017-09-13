/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import nuevoPackage.*;
import java.awt.Event;
import java.awt.event.ActionEvent;

/**
 *
 * @author CFP31-15
 */
public class Controller implements IViewEventListener {

    protected MasterView main_view;
    protected IConversor conversor;

    public Controller() {
        main_view = new MasterView();
        main_view.setVisible(true);

        main_view.AddViewEvenListener(this);

        //new ConversorTemperatura();
    }

    public void Run() {
        //1- prueba de conversion de temperatura
        conversor = ConversorFactory.crearConversor("temperatura");

        conversor.setValor(0.0f, "C");
        float valorNuevo = conversor.getValor("F");
        System.out.println("Unidades disponibles: " + conversor.getUnitList());
        System.out.println("El resultado 1 es: " + valorNuevo);

        //2- PRueba de conversion de distancia
        conversor = ConversorFactory.crearConversor("distancia");
        conversor.setValor(valorNuevo, "km");
          System.out.println("Unidades disponibles: " + conversor.getUnitList());
      
    }

    @Override
    public void listen(Event event) {

        ActionEvent ae = (ActionEvent) event.target;

        String valorEntring = main_view.getjTextField1().getText();

        float valor = (float) Double.parseDouble(valorEntring);

        System.out.println(valorEntring);

        if (main_view.getjComboBox1().getModel().getSelectedItem().toString().equalsIgnoreCase("C")) {
            if (main_view.getjComboBox2().getModel().getSelectedItem().toString().equalsIgnoreCase("C")) {
                main_view.getjLabel1().setText(valorEntring);
            }

        }

        if (main_view.getjComboBox1().getModel().getSelectedItem().toString().equalsIgnoreCase("C")) {
            if (main_view.getjComboBox2().getModel().getSelectedItem().toString().equalsIgnoreCase("K")) {
                conversor.setValor(valor, "C");
                float valorConvertido = conversor.getValor("K");
                String valorResultado = Double.toString(valorConvertido);
                main_view.getjLabel1().setText(valorResultado);
            } else {
                main_view.getjLabel1().setText(valorEntring);
            }

        }

        if (main_view.getjComboBox1().getModel().getSelectedItem().toString().equalsIgnoreCase("K")) {
            if (main_view.getjComboBox2().getModel().getSelectedItem().toString().equalsIgnoreCase("C")) {
                conversor.setValor(valor, "K");
                float valorConvertido = conversor.getValor("C");
                String valorResultado = Double.toString(valorConvertido);
                main_view.getjLabel1().setText(valorResultado);
            } else {
                main_view.getjLabel1().setText(valorEntring);
            }

        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import Conversores.*;
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

        //conversor = ConversorFactory.crearConversor("Temperatura");
    }

    public void Run() {
        //1
        conversor = ConversorFactory.crearConversor("Temperatura");
        conversor.setMedida(23,"C");
        float Resultado=conversor.getMedida("K");
        System.out.println(conversor.getUnitList());
        System.out.println("El resultado 1 es " + Resultado);

        
        //2
        conversor = ConversorFactory.crearConversor("Distancia");
        conversor.setMedida(23,"km");
        Resultado=conversor.getMedida("mi");
        System.out.println(conversor.getUnitList());
        System.out.println("El resultado 2 es " + Resultado);
        
        //3
        conversor = ConversorFactory.crearConversor("Peso");
        conversor.setMedida(23,"Kg");
        Resultado=conversor.getMedida("Lb");
        System.out.println(conversor.getUnitList());
        System.out.println("El resultado 3 es " + Resultado);
        
        //4
        conversor = ConversorFactory.crearConversor("Energia");
        conversor.setMedida(23,"J");
        Resultado=conversor.getMedida("kWh");
        System.out.println(conversor.getUnitList());
        System.out.println("El resultado 4 es " + Resultado);
        
        //5
        conversor = ConversorFactory.crearConversor("Datos");
        conversor.setMedida(23,"b");
        Resultado=conversor.getMedida("KB");
        System.out.println(conversor.getUnitList());
        System.out.println("El resultado 1 es " + Resultado);
        
    }

    @Override
    public void Listen(Event event) {

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
                conversor.setMedida(valor, "C");
                float valorConvertido = conversor.getMedida("K");
                String valorResultado = Double.toString(valorConvertido);
                main_view.getjLabel1().setText(valorResultado);
            } else {
                main_view.getjLabel1().setText(valorEntring);
            }

        }

        if (main_view.getjComboBox1().getModel().getSelectedItem().toString().equalsIgnoreCase("K")) {
            if (main_view.getjComboBox2().getModel().getSelectedItem().toString().equalsIgnoreCase("C")) {
                conversor.setMedida(valor, "K");
                float valorConvertido = conversor.getMedida("C");
                String valorResultado = Double.toString(valorConvertido);
                main_view.getjLabel1().setText(valorResultado);
            } else {
                main_view.getjLabel1().setText(valorEntring);
            }

        }

    }

}

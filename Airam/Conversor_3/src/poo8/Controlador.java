/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo8;

import java.awt.Event;
import java.awt.event.ActionEvent;

/**
 *
 * @author CFP31-09
 */
public class Controlador implements IViewEventListener {

    private ConversorDeEnergia conversor;
    protected JFramePOO8 main_view;

    public Controlador() {
        conversor = new ConversorDeEnergia();
        main_view = new JFramePOO8();
        main_view.setVisible(true);
        main_view.AddViewEventListener(this);

    }

    public void Run() {
        //conversor.setTemperatura((float) 1.0, "C");
        //float valorConvertido = conversor.getTemperatura("F");
        //System.out.println("El Valor " + valorConvertido);

    }
    @Override
    public void listen(Event event) {

        ActionEvent ae = (ActionEvent) event.target;
        String botonUnidad = ae.getActionCommand();

        String valorEntring = main_view.getjTextField1().getText();

        if (botonUnidad.equalsIgnoreCase("J")) {

            float valor = (float) Double.parseDouble(valorEntring);
            conversor.setenergia(valor, botonUnidad);
            float valorConvertido = conversor.getenergia("Kwh");

            System.out.println("Valor a C: " + valorConvertido);
            main_view.getjTextField2().setText("" + valorConvertido + "Kwh");
            System.out.println(botonUnidad);
            System.out.println(event);
        } else {
            float valor = (float) Double.parseDouble(valorEntring);
            conversor.setenergia(valor, botonUnidad);
            float valorConvertido = conversor.getenergia("J");

            System.out.println("Valor a C: " + valorConvertido);
            main_view.getjTextField2().setText("" + valorConvertido + "J");
            System.out.println(botonUnidad);
            System.out.println(event);
        }

    }
}

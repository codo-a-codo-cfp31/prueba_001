/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.awt.Event;
import java.awt.event.ActionEvent;

/**
 *
 * @author CFP31-15
 */
public class Controller implements IViewEventListener {

    protected MasterView main_view;
    protected ConversorDistancia conversor;

    public Controller() {
        main_view = new MasterView();
        main_view.setVisible(true);

        main_view.AddViewEvenListener(this);

        conversor = new ConversorDistancia();
    }

    public void Run() {

    }

    @Override
    public void Listen(Event event) {

        ActionEvent ae = (ActionEvent) event.target;

        String valorEntring = main_view.getjTextField1().getText();

        float valor = (float) Double.parseDouble(valorEntring);

        System.out.println(valorEntring);


        if (main_view.getjComboBox1().getModel().getSelectedItem().toString().equalsIgnoreCase("km")) {
            if (main_view.getjComboBox2().getModel().getSelectedItem().toString().equalsIgnoreCase("mi")) {
                conversor.setDistance(valor, "km");
                float valorConvertido = conversor.getDistance("mi");
                String valorResultado = Double.toString(valorConvertido);
                main_view.getjLabel1().setText(valorResultado);
            } else {
                main_view.getjLabel1().setText(valorEntring);
            }

        }

        if (main_view.getjComboBox1().getModel().getSelectedItem().toString().equalsIgnoreCase("mi")) {
            if (main_view.getjComboBox2().getModel().getSelectedItem().toString().equalsIgnoreCase("km")) {
                conversor.setDistance(valor, "mi");
                float valorConvertido = conversor.getDistance("km");
                String valorResultado = Double.toString(valorConvertido);
                main_view.getjLabel1().setText(valorResultado);
            } else {
                main_view.getjLabel1().setText(valorEntring);
            }

        }

    }

}

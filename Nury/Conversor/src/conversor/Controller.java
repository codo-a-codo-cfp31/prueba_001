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

        ConversorListModel modelConversores = new ConversorListModel(ConversorFactory.getListaConversores());
        main_view.getjComboBox3().setModel(modelConversores);
    }

    @Override
    public void Listen(Event event) {

        String tipoDeEvento = event.target.getClass().getCanonicalName();

        if (tipoDeEvento.equalsIgnoreCase("java.awt.event.ActionEvent")) {

            String valorAConvertirString = main_view.getjTextField1().getText();
            Double valorAConvertir = Double.parseDouble(valorAConvertirString);

            String unidadOrigen = (String) main_view.getjComboBox1().getModel().getSelectedItem();
            String unidadDestino = (String) main_view.getjComboBox2().getModel().getSelectedItem();

            conversor.setMedida(valorAConvertir.floatValue(), unidadOrigen);

            float valorConvertido = conversor.getMedida(unidadDestino);

            main_view.getjLabel1().setText("" + valorConvertido);

        } else {

            String tipo = (String) main_view.getjComboBox3().getModel().getSelectedItem();

            conversor = ConversorFactory.crearConversor(tipo);

            ConversorListModel movel1 = new ConversorListModel(conversor.getUnitList());

            main_view.getjComboBox1().setModel(movel1);

            ConversorListModel movel2 = new ConversorListModel(conversor.getUnitList());

            main_view.getjComboBox2().setModel(movel2);

        }
    }
}

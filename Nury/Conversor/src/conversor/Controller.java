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
        /*
        //1
        conversor = ConversorFactory.crearConversor("Temperatura");
        //ConversorListModel modelTemperatura = new ConversorListModel(conversor.getUnitList());
       // main_view.getjComboBox1().setModel(modelTemperatura);
        //main_view.getjComboBox2().setModel(modelTemperatura);

        conversor.setMedida(23,"C");
        float Resultado=conversor.getMedida("K");
        System.out.println(conversor.getUnitList());
        System.out.println("El resultado 1 es " + Resultado);
        
        
        //2
        conversor = ConversorFactory.crearConversor("Distancia");
        
        ConversorListModel modelDistancia = new ConversorListModel(conversor.getUnitList());
        main_view.getjComboBox1().setModel(modelDistancia);
        main_view.getjComboBox2().setModel(modelDistancia);
        
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
        */   
    }
    
    @Override
    public void Listen(Event event) {

        String tipoDeEvento = event.target.getClass().getCanonicalName();
        
        if(tipoDeEvento.equalsIgnoreCase("java.awt.event.ActionEvent")){
            
            String valorAConvertirString = main_view.getjTextField1().getText();
            Double valorAConvertir = Double.parseDouble(valorAConvertirString);
            
            String unidadOrigen = (String) main_view.getjComboBox1().getModel().getSelectedItem();
            String unidadDestino = (String) main_view.getjComboBox2().getModel().getSelectedItem();
            
            conversor.setMedida(valorAConvertir.floatValue(), unidadOrigen);
            
            float valorConvertido = conversor.getMedida(unidadDestino);
            
            main_view.getjLabel1().setText("" + valorConvertido);
        
        }else {
            
            String tipo = (String) main_view.getjComboBox3().getModel().getSelectedItem();
            
            conversor=ConversorFactory.crearConversor(tipo);
            
            ConversorListModel movel1 = new ConversorListModel(conversor.getUnitList());
            
            main_view.getjComboBox1().setModel(movel1);
            
            ConversorListModel movel2 = new ConversorListModel(conversor.getUnitList());
            
            main_view.getjComboBox2().setModel(movel2);
           
        }

        /*String valorEntring = main_view.getjTextField1().getText();

        float valor = (float) Double.parseDouble(valorEntring);

        System.out.println(valorEntring);

        if (main_view.getjComboBox1().getModel().getSelectedItem().toString().equalsIgnoreCase("C")) {
            if (main_view.getjComboBox2().getModel().getSelectedItem().toString().equalsIgnoreCase("C")) {
                main_view.getjLabel1().setText(valorEntring);
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

    }}
*/
    }
}

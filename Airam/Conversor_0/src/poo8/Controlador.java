/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo8;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import Conversores.*;
//import Conversores.IConversor;
//import Conversores.ConversorDeMasa;
import java.awt.Event;
import java.awt.event.ActionEvent;
import javax.swing.DefaultListSelectionModel;
import javax.swing.event.PopupMenuEvent;

/**
 *
 * @author CFP31-09
 */
public class Controlador implements IViewEventListener {

    protected IConversor conversor;
    protected JFramePOO8 main_view;
    //no pueden ser public porque se viola el principio de encapsulamiento
    

    public Controlador() {
        //conversor = new ConversorDeTemperatura();
        //conversor = new ConversorDeMasa();
       //**Fabrica no es un objeto
        main_view = new JFramePOO8();
        main_view.setVisible(true);
        main_view.AddViewEventListener(this);

    }

    public void Run() {
        ConversorListModel model_tipos = new ConversorListModel(FabricaConversores.getListaConversores());
        main_view.getjComboBox3().setModel(model_tipos);
        
        
        
        
       /* System.out.println("Las conversiones disponibles son= " +FabricaConversores.getListaConversores());
        //prueba 1 de conversion temperatura
        conversor= FabricaConversores.crearConversor("temperatura");
        
        ConversorListModel model_tipos = new ConversorListModel(FabricaConversores.getListaConversores());
        main_view.getjComboBox1().setModel(model_tipos);
        
        conversor.setValor((float) 1.0, "C");
        float valorConvertido = conversor.getValor("F");
        System.out.println("Unidades disponibles= " +conversor.getUnitList());
        System.out.println("El Valor de la conversion de temperatura es: " + valorConvertido);
        
        //prueba 1 de conversion distancia
        conversor= FabricaConversores.crearConversor("distancia");
        conversor.setValor((float) 1.0, "M");
        valorConvertido = conversor.getValor("Km");
        System.out.println("Unidades disponibles= " +conversor.getUnitList());
        System.out.println("El Valor de la conversion de distancia es: " + valorConvertido);
        
        conversor= FabricaConversores.crearConversor("masa");
        conversor.setValor((float) 1.0, "L");
        valorConvertido = conversor.getValor("Kg");
        System.out.println("Unidades disponibles= " +conversor.getUnitList());
        System.out.println("El Valor de la conversion de masa es: " + valorConvertido);
        
        conversor= FabricaConversores.crearConversor("energia");
        conversor.setValor((float) 1.0, "J");
        valorConvertido = conversor.getValor("Kwh");
        System.out.println("Unidades disponibles= " +conversor.getUnitList());
        System.out.println("El Valor de la conversion de energia es: " + valorConvertido);
        
        conversor= FabricaConversores.crearConversor("datos");
        conversor.setValor((float) 1.0, "B");
        valorConvertido = conversor.getValor("Kb");
        System.out.println("Unidades disponibles= " +conversor.getUnitList());
        System.out.println("El Valor de la conversion de datos es: " + valorConvertido);*/

    }
    @Override
    public void listen(Event event) {
        
        System.out.println("El evento viene de: "+event.target.getClass());
        
        String tipoDeEvento = event.target.getClass().getCanonicalName();
        
        if(tipoDeEvento.equalsIgnoreCase("java.awt.event.ActionEvent")){
            
        }
        
        else{
            PopupMenuEvent evento = (PopupManuEvent) event.target;
            System.out.println(""+evento);
                   
        }

<<<<<<< HEAD
=======
       String tipoDeEvento = event.target.getClass().getCanonicalName();
       
        if( tipoDeEvento.equalsIgnoreCase("java.awt.event.ActionEvent")) {
            ActionEvent ae = (ActionEvent) event.target;
            System.out.println("" + ae.getActionCommand());
            
            String valorAConvertirString = main_view.getjTextField1().getText();
            Double valorAConvertir = Double.parseDouble(valorAConvertirString);
            
            String unidadOrigen = (String)  main_view.getjComboBox1().getModel().getSelectedItem();
            String unidadDestingo = (String) main_view.getjComboBox2().getModel().getSelectedItem();
            
            
            conversor.setValor(valorAConvertir.floatValue(), unidadOrigen);
            
            float valorConvertido = conversor.getValor(unidadDestingo);
            
            main_view.getjTextField2().setText("" +  valorConvertido);
            
            
            
        } else {
            PopupMenuEvent evento = (PopupMenuEvent) event.target;
            String tipo = (String) main_view.getjComboBox3().getModel().getSelectedItem();
            System.out.println(""  +tipo );
            
            conversor = FabricaConversores.crearConversor(tipo);
            ConversorListModel nuevoModel = new ConversorListModel(conversor.getUnitList());

            main_view.getjComboBox1().setModel(nuevoModel);
            
             ConversorListModel nuevoModel2 = new ConversorListModel(conversor.getUnitList());

            main_view.getjComboBox2().setModel(nuevoModel2);
        
>>>>>>> 607f4361075f51c0ec6f6f2a475abf258cc30454
        /*ActionEvent ae = (ActionEvent) event.target;
        String botonUnidad = ae.getActionCommand();

        String valorEntring = main_view.getjTextField1().getText();

        if (botonUnidad.equalsIgnoreCase("C")) {

            float valor = (float) Double.parseDouble(valorEntring);
            conversor.setValor(valor, botonUnidad);
            float valorConvertido = conversor.getValor("F");

            System.out.println("Valor a C: " + valorConvertido);
            main_view.getjTextField2().setText("" + valorConvertido + "°F");
            System.out.println(botonUnidad);
            System.out.println(event);
        } else {
            float valor = (float) Double.parseDouble(valorEntring);
            conversor.setValor(valor, botonUnidad);
            float valorConvertido = conversor.getValor("C");

            System.out.println("Valor a C: " + valorConvertido);
            main_view.getjTextField2().setText("" + valorConvertido + "°C");
            System.out.println(botonUnidad);
<<<<<<< HEAD
            System.out.println(event);
        }*/
=======
            System.out.println(event);*/
        }
>>>>>>> 607f4361075f51c0ec6f6f2a475abf258cc30454

    }
}

/*
Paso 1
Crear IControldor y cambiar el nombre de los metodos a get y set valor
Paso 2
adjuntar los demas conversores y cambiarle los nombres del get y set
Paso 3
crear un packages y pasar la interfaz y los conversores con el fin de separar
Paso 4
Crear en el packages la clase fabrica que es un objeto que crea objetos, para llamarlos de forma dinamica

*/

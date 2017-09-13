/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo8;

import Conversores.*;
//import Conversores.IConversor;
//import Conversores.ConversorDeMasa;
import java.awt.Event;
import java.awt.event.ActionEvent;

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
        
        System.out.println("Las conversiones disponibles son= " +FabricaConversores.getListaConversores());
        //prueba 1 de conversion temperatura
        conversor= FabricaConversores.crearConversor("temperatura");
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
        System.out.println("El Valor de la conversion de datos es: " + valorConvertido);

    }
    @Override
    public void listen(Event event) {

        ActionEvent ae = (ActionEvent) event.target;
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
            System.out.println(event);
        }

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
Crear en el packages la clase fabrica que es con la que 

*/

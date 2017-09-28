/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import nuevoPackage.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import javax.swing.DefaultListSelectionModel;
import javax.swing.event.PopupMenuEvent;

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
        ConversorListModel model_tipos = new ConversorListModel(ConversorFactory.getListaConversores());
        main_view.getjComboBox3().setModel(model_tipos);
    

        
        //main_view.getjComboBox3()
        //1- prueba de conversion de temperatura
      /*  conversor = ConversorFactory.crearConversor("temperatura");
        conversor.setValor(0.0f, "C");
        float valorNuevo = conversor.getValor("F");
        System.out.println("Unidades disponibles: " + conversor.getUnitList());
        System.out.println("El resultado 1 es: " + valorNuevo);
*/
        //2- PRueba de conversion de distancia
        /*conversor = ConversorFactory.crearConversor("distancia");
        conversor.setValor(valorNuevo, "km");
        System.out.println("Unidades disponibles: " + conversor.getUnitList());
        ConversorListModel nuevoModel = new ConversorListModel(conversor.getUnitList());

        main_view.getjComboBox1().setModel(nuevoModel);
        main_view.getjComboBox2().setModel(nuevoModel);
*/
    }

    @Override
    public void listen(Event event) {
        
        //System.out.println("El evento viene de: " +  event.target.getClass().getCanonicalName());
        
        String tipoDeEvento = event.target.getClass().getCanonicalName();
        
        if( tipoDeEvento.equalsIgnoreCase("java.awt.event.ActionEvent")) {
            ActionEvent ae = (ActionEvent) event.target;
            System.out.println("" + ae.getActionCommand());
            
            String valorAConvertirString = main_view.getjTextField1().getText();
            Double valorAConvertir = Double.parseDouble(valorAConvertirString);
            
            String unidadOrigen = (String) main_view.getjComboBox1().getModel().getSelectedItem();
            String unidadDestingo = (String) main_view.getjComboBox2().getModel().getSelectedItem();
            
            
            conversor.setValor(valorAConvertir.floatValue(), unidadOrigen);
            
            float valorConvertido = conversor.getValor(unidadDestingo);
            
            main_view.getjLabel1().setText("" +  valorConvertido);
            
            
            
        } else {
            PopupMenuEvent evento = (PopupMenuEvent) event.target;
            String tipo = (String) main_view.getjComboBox3().getModel().getSelectedItem();
            System.out.println(""  +tipo );
            
            conversor = ConversorFactory.crearConversor(tipo);
            ConversorListModel nuevoModel = new ConversorListModel(conversor.getUnitList());

            main_view.getjComboBox1().setModel(nuevoModel);
            
             ConversorListModel nuevoModel2 = new ConversorListModel(conversor.getUnitList());

            main_view.getjComboBox2().setModel(nuevoModel2);
        }
   
    }

}

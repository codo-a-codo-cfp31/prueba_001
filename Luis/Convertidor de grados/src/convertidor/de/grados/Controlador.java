/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor.de.grados;

import Factory.*;

import java.awt.Event;
import java.awt.event.ActionEvent;

/**
 *
 * @author cfp31-06
 */
public class Controlador implements IViewEventListener {

     protected IConversor unConversor;
     protected Vista unaVista;
   

    public Controlador() {

        unaVista = new Vista();
        //unaVista.setVisible(true);
        unaVista.AddViewEventListener(this);

        
    }

    public void Run() {
        System.out.println("Las conversiones disponibles son= " +FabricaDeConversores.getListaConversores());
        unConversor = FabricaDeConversores.crearConversor("temperatura");
        unConversor.setValor((float) 1.0, "C");
        float valorConvertido = unConversor.getValor("C");
        System.out.println("Unidades disponibles= " +unConversor.getUnitList());
        System.out.println("El Valor de la conversion de temperatura es: " + valorConvertido+ "C");
        
        unConversor= FabricaDeConversores.crearConversor("masa");
        unConversor.setValor((float) 1.0, "Kg");
        valorConvertido = unConversor.getValor("Kg");
        System.out.println("Unidades disponibles= " +unConversor.getUnitList());
        System.out.println("El Valor de la conversion de masa es: " + valorConvertido+ "Kg");
       
    }

    @Override
    public void listen(Event event) {

        ActionEvent ae = (ActionEvent) event.target;
        String BotonPresionado = ae.getActionCommand();

        String unidadAConvertir = unaVista.getjTextField1().getText();

        if (BotonPresionado.equalsIgnoreCase("C")) {

            float valor = (float) Double.parseDouble(unidadAConvertir);
            unConversor.setValor(valor, BotonPresionado);

            float valorconvertido = unConversor.getValor("C");

            System.out.println("El valor convertido es " + valorconvertido);

            unaVista.getjTextField2().setText("" + valorconvertido);

            System.out.println(BotonPresionado);

        } else {

             float valor = (float) Double.parseDouble(unidadAConvertir);
            unConversor.setValor(valor, BotonPresionado);

            float valorconvertido = unConversor.getValor("F");

            System.out.println("El valor convertido es " + valorconvertido);

            unaVista.getjTextField2().setText("" + valorconvertido);

            System.out.println(BotonPresionado);
        }

    }

}

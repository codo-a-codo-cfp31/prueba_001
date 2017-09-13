/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor.de.grados;


import java.awt.Event;
import java.awt.event.ActionEvent;

/**
 *
 * @author cfp31-06
 */
public class Controlador implements IViewEventListener {

    protected Vista unaVista;
    protected Conversor unConversor;

    public Controlador() {

        unaVista = new Vista();
        unaVista.setVisible(true);
        unaVista.AddViewEventListener(this);

        unConversor = new Conversor();

    }

    public void Run() {
        /*unConversor.setUnidadDeTemperaturaEntrada("f");
        unConversor.setValorDeEntrada(33f);
        
        
        unConversor.Conversion();
        float valorconvertido = unConversor.getValorSalida();
        
        System.out.println("El valor convertido es "+ valorconvertido);*/
    }

    @Override
    public void listen(Event event) {

        ActionEvent ae = (ActionEvent) event.target;
        String BotonPresionado = ae.getActionCommand();

        String unidadAConvertir = unaVista.getjTextField1().getText();

        if (BotonPresionado.equalsIgnoreCase("C")) {

            float valor = (float) Double.parseDouble(unidadAConvertir);
            unConversor.setUnidadDeTemperaturaEntrada("F");

            unConversor.setValorDeEntrada(valor);
            unConversor.Conversion();
            float valorconvertido = unConversor.getValorSalida();

            System.out.println("El valor convertido es " + valorconvertido);

            unaVista.getjTextField2().setText("" + valorconvertido);

            System.out.println(BotonPresionado);

        } else {

            float valor = (float) Double.parseDouble(unidadAConvertir);
            unConversor.setUnidadDeTemperaturaEntrada("C");

            unConversor.setValorDeEntrada(valor);
            unConversor.Conversion();
            float valorconvertido = unConversor.getValorSalida();

            System.out.println("El valor convertido es " + valorconvertido);

            unaVista.getjTextField2().setText("" + valorconvertido);

            System.out.println(BotonPresionado);
        }

    }

}

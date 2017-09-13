/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CFP31-09
 */
public class FabricaConversores {

    public static IConversor crearConversor(String tipo) {

        //con el static no se necesita usar el new**mirar el controlador
        IConversor conversor = null;

        if (tipo.equalsIgnoreCase("temperatura")) {
            conversor = new ConversorDeTemperatura();
        } else if (tipo.equalsIgnoreCase("distancia")) {
            conversor = new ConversorDeDistancia();
        } else if (tipo.equalsIgnoreCase("masa")) {
            conversor = new ConversorDeMasa();
        } else if (tipo.equalsIgnoreCase("energia")) {
            conversor = new ConversorDeEnergia();
        } else if (tipo.equalsIgnoreCase("datos")) {
            conversor = new ConversorDeDatos();
        }

        return conversor;
    }
    
    public static List<String> getListaConversores(){
        List<String> lista= new ArrayList<>();
        lista.add("temperatura");
        lista.add("distancia");
        lista.add("energia");
        lista.add("masa");
        lista.add("datos");
        
        return lista;
    }
}
//La fabrica sabe que conversores tiene y los coversores las unidades**ir a IConversor
//hay que hacer un nuevo refractor para llevar la responsabildad de esos objetos sobre la vista
//

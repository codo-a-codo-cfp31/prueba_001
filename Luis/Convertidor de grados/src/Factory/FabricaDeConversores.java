/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Vera
 */
public class FabricaDeConversores {

    public static IConversor crearConversor(String tipo) {

        //con el static no se necesita usar el new**mirar el controlador
        IConversor conversor = null;

        if (tipo.equalsIgnoreCase("temperatura")) {
            conversor = new ConversorTemperatura();
        } else if (tipo.equalsIgnoreCase("masa")) {
            conversor = new ConversorKg();
        }

        return conversor;
    }

    public static List<String> getListaConversores() {
        List<String> lista = new ArrayList<>();
        lista.add("temperatura");
        lista.add("masa");

        return lista;
    }

}

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
 * @author CFP31-10
 */
public class ConversorFactory {
    //las factorys no tienen atributos y son static si solo quiero una.
    public static IConversor crearConversor(String tipo){
        
        IConversor conversor = null;
        
        if (tipo.equalsIgnoreCase("Temperatura")){
            conversor = new ConversorTemperatura();
        } else if (tipo.equalsIgnoreCase("Distancia")){
            conversor = new ConversorDistancia();
        } else if (tipo.equalsIgnoreCase("Peso")){
            conversor = new ConversorPeso();
        } else if (tipo.equalsIgnoreCase("Energia")){
            conversor = new ConversorEnergia();
        } else if (tipo.equalsIgnoreCase("Datos")){
            conversor = new ConversorDataSize();
        }
        return conversor;   
    }
    
    public static List<String> getListaConversores(){
        List<String> ListConversores= new ArrayList();
        
        ListConversores.add("Temperatura");
        ListConversores.add("Distancia");
        ListConversores.add("Peso");
        ListConversores.add("Energia");
        ListConversores.add("Datos");

                
        return ListConversores;
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoPackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CFP31-15
 */
public class ConversorFactory {
    
    public static IConversor crearConversor(String tipo){
        
        IConversor conversor = null;
        
        if ( tipo.equalsIgnoreCase("temperatura")) {
            conversor = new ConversorTemperatura();
        } else if (tipo.equalsIgnoreCase("distancia")) {
            conversor = new ConversorDistancia();
        } 
        
        return conversor;
    }
    
    public static List<String> getListaConversores(){
        List<String> lista = new ArrayList<>();
        
        lista.add("temperatura");
        lista.add("distancia");
        
        return lista;
    }
    
    
}

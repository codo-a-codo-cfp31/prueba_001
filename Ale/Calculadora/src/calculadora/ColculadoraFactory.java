/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CFP31-15
 */
public class ColculadoraFactory {
    
    public static ICalculadora createCalculadora(String tipo){
        
        ICalculadora conversor = null;
        
      if (tipo.equalsIgnoreCase("simple")) {
            conversor = new CalculdoraSimple();
        } 
        
        return conversor;
    }
    
    public static List<String> getListCalcuadora(){
        List<String> lista = new ArrayList<>();
        
        lista.add("simple");
        
        return lista;
    }
    
    
}

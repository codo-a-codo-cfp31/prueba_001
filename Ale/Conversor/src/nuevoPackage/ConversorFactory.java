/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoPackage;

/**
 *
 * @author CFP31-15
 */
public class ConversorFactory {
    
    public IConversor crearConversor(String tipo){
        
        IConversor conversor = null;
        
        if ( tipo.equalsIgnoreCase("temperatura")) {
            conversor = new ConversorTemperatura();
        } else if (tipo.equalsIgnoreCase("distancia")) {
            conversor = new ConversorDistancia();
        }
        
        return conversor;
    }
    
}

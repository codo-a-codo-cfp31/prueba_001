/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor.de.grados;

/**
 *
 * @author cfp31-06
 */
public class Controlador {
    
    protected Conversor unConversor;
    
    public Controlador(){
        
         unConversor = new Conversor();
        
    }
        
    public void Run(){
        unConversor.setUnidadDeTemperaturaEntrada("f");
        unConversor.setValorDeEntrada(33f);
        
        
        unConversor.Conversion();
        float valorconvertido = unConversor.getValorSalida();
        
        System.out.println("El valor convertido es "+ valorconvertido);
    }
    
    
}

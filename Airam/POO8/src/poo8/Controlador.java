/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo8;

/**
 *
 * @author CFP31-09
 */
public class Controlador {
    private Conversor conversor;
    
    public Controlador(){
       conversor = new Conversor(); 
      
    }
    
     public void Run(){
         conversor.setTemperatura((float) 230.8,"C");
         float valorConvertido=conversor.getTemperatura("F");
         System.out.println("El Valor " +valorConvertido);
         
         
         
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

/**
 *
 * @author cfp31-06
 */
public class Singleton {
    
    //Pasos para realizar un Singleton
    //1- Constructor privado
    //2- Metodo static (para construir una instancia)
    //3- Variable static para guardar la instancia creada
    
    private static Singleton instance = null;
    
    private  Singleton(){
    }    
        
    public static Singleton getInstancia(){
            
            if (instance == null){
                instance = new Singleton();
            }
            return instance;
        }
        
        
    
            
    
    
    
            
}

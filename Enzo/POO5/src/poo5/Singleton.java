/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;
/**
 *
 * @author @AnalistaSistok #CFP31 #SEducA
 */
public class Singleton {
    
    private static Singleton instance = null;
    
    private Singleton(){
        }
    
    /**
     *
     * @return
     */
    public static Singleton getInstance(){
        
        if ( instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
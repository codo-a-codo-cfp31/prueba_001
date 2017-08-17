/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO7;

/**
 *
 * @author Luis Vera
 */
public class Controlador {
    
    protected Vista unaVista;
    
    public Controlador(){
        
        unaVista = new Vista();
        unaVista.setVisible(true);   
    }
    
    public void Run(){
        
        Juego unJuego = new Juego();
        unJuego.ObtenerPalabra();       
    }
    
}

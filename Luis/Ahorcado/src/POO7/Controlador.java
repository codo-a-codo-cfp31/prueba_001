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
    protected Juego unJuego;
    
    public Controlador(){
        
        unaVista = new Vista();
        unaVista.setVisible(true);
        
        Keyboard teclado = new Keyboard();
        
        unaVista.getjPanel1().add(teclado);
        unJuego = new Juego();
        
        teclado.AddListener(unJuego);
    }
    
    public void Run(){
        
        
        unJuego.ObtenerPalabra();    
        
    }
    
}

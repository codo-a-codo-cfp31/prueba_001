/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;

/**
 *
 * @author CFP31-10
 */
public class Controlador {
    protected Juego Juego;
    protected Vista UnaVista;
    
    public Controlador(){
    Vista unaVista = new Vista();
    unaVista.setVisible(true);
    Keyboard teclado = new Keyboard();
    
    unaVista.getjPanel1().add(teclado);
    Juego = new Juego();
    
    teclado.AddListener(Juego);
            
    }
      
    public void Run(){        
        

       Juego.ObtenerPalabra();
       Juego.seAcabo();
        System.out.println(Juego.ObtenerPalabra().PalabraOculta);


      


      
         }

}


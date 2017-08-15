/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO7;
import java.util.*;
import java.util.List;
/**
 *
 * @author Luis Vera
 */
public class Juego {
    
    protected Palabra laPalabraAleatoria;
    


        
public Juego(){
    
    ObtenerPalabra();

}

public final void ObtenerPalabra(){
    
    
    laPalabraAleatoria = new Palabra();
    laPalabraAleatoria.PalabraRandom();
    System.out.println(laPalabraAleatoria.getPalabraAleatoria());
    
    //for (int i = 0; i < laPalabraAleatoria.length(); i++){
           
           //Character letras_de_palabra;
           //letras_de_palabra = PalabraAleatoria.charAt(i);
           //System.out.println(letras_de_palabra);
           
       // }
    
}

}


    

